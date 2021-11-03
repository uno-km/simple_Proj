package Run;

import Table.Table;
import UnoLibrary.data;

public class Run {
	public static void main(String args[]) {
		Table table = new Table();
		table.setTableName("가족"); // 이름정해주기

		data.parseCol("이름/번호/나이/주소");

		table.setColumm(data.parseCol("이름/번호/나이/주소"));
		System.out.println(table.getColumm());
		data d = new data();
	}
}
