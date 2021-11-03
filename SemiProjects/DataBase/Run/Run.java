package Run;

import Table.Table;

public class Run {
	public static void main(String args[]) {
		Table table = new Table();
		table.setTableName("가족"); // 이름정해주기

		String col = "이름/번호/나이/주소";
		String data = "김은호/010-4943/28/경기도 성남/";
		String data2 = "홍길동/010-1111/22/경기도 용인/";
		String data3 = "김유신/010-2222/30/경기도 광주/";
		table.setColumm(col);
		table.setRecRow(data);
		table.setRecRow(data2);
		table.setRecRow(data3);

		System.out.println(table.getTableName());
		System.out.println(table.getColumm());
		System.out.println("---------------");
		System.out.println(table.getRecRow().get(0));
		System.out.println(table.getRecRow().get(1));
		System.out.println(table.getRecRow().get(2));
	}
}
