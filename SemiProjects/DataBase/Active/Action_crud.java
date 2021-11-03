package Active;

import java.util.Scanner;

import Database.Database;
import Table.Table;
import UnoLibrary.Unotools;

public class Action_crud {
	static Scanner sc = new Scanner(System.in);

	static public Table createTable(Database db) {
		Table table = new Table();
		System.out.println("테이블을 생성합니다. 이름을 입력해주세요, 종료는 q");
		String input = sc.nextLine();

		Unotools.close(input);
		table.setTableName(input);

		System.out.println("테이블이름은 " + table.getTableName() + "입니다. 컬럼을 입력해주세요, 종료는 q요");
		input = sc.nextLine();
		table.setColumm(input);

		System.out.println("컬럼이 생성되었습니다. 데이터를 입력해주세요, 입력종료는 b");
		while (true) {
			input = sc.nextLine();
			if (input.equalsIgnoreCase("b")) {
				return table;
			}
			table.setRecRow(input);
		}
	}
}
