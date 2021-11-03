package Run;

import Table.Table;
import UnoLibrary.data;

public class Run {
	public static void main(String args[]) {
		Table table = new Table();
		table.setTableName("가족"); // 이름정해주기

		String col = "이름/번호/나이/주소";
		String data = "김은호/010-4943/28/경기도 성남/";
		table.setRecRow(col, data);
		System.out.println(table.getRecRow());
		data d = new data();
	}
}
