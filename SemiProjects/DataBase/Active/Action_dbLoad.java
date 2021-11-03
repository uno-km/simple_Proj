package Active;

import java.util.ArrayList;
import java.util.Scanner;

import Database.Database;
import UnoLibrary.Unotools;

public class Action_dbLoad {
	static Scanner sc = new Scanner(System.in);

	static public void showTableList(Database db) {

		System.out.println("--------------------------------------");
		for (int i = 0; i < db.getTables().size(); i++) {
			System.out.println("| " + (i + 1) + ". " + db.getTables().get(i).getTableName());
		}
		System.out.println("--------------------------------------");
	}

	static public void showCol(Database db) {
		for (int i = 0; i < db.getTables().get(0).getColumm().size(); i++) {
			System.out.print("----------");
		}
		System.out.println();
		for (int i = 0; i < db.getTables().get(0).getColumm().size(); i++) {
			System.out.print("|");
			System.out.printf("%8s", db.getTables().get(0).getColumm().get(i));
		}
		System.out.print("|");
		System.out.println();
		for (int i = 0; i < db.getTables().get(0).getColumm().size(); i++) {
			System.out.print("----------");
		}
		System.out.println();

	}

	static public void showRec(int num, Database db) {
		showCol(db);
		for (int i = 0; i < db.getTables().get(num).getColumm().size(); i++) {
			System.out.print("----------");
		}
		System.out.println();
		for (int i = 0; i < db.getTables().get(num).getRecRow().size(); i++) {
			for (int j = 0; j < db.getTables().get(num).getColumm().size(); j++) {
				System.out.print("|");
				System.out.printf("%8s", db.getTables().get(num).getRecRow().get(i).get(j));
			}
			System.out.print("|");
			System.out.println();
			for (int j = 0; j < db.getTables().get(num).getColumm().size(); j++) {
				System.out.print("----------");
			}
			System.out.println();
		}

	}

	static public int choiceTodo(Database db) {
		System.out.println("해당 테이블을 보려면 해당번호를, 생성은 n, 종료는 q를 입력하세요");
		while (true) {
			int num = 0;
			ArrayList<Integer> dbnumArr = new ArrayList<>();
			for (int i = 0; i < db.getTables().size(); i++) {
				dbnumArr.add(i);
			}
			String input = sc.nextLine();

			Unotools.close(input);
			if (input.equalsIgnoreCase("n")) {
				return num = -1;
			}

			try {
				if (dbnumArr.contains(Integer.valueOf(input) - 1)) {
					for (int i = 0; i < dbnumArr.size(); i++) {
						num++;
						if (dbnumArr.get(i) == Integer.valueOf(input) - 1) {
							return num - 1;
						}
					}
				} else {
					System.out.println("잘못입력하셨습니다. 테이블을 보려면 해당번호를, 생성은 n, 종료는 q를 입력하세요");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("잘못입력하셨습니다. 테이블을 보려면 해당번호를, 생성은 n, 종료는 q를 입력하세요");
			}
		}
	}

}
