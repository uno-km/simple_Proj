package Active;

import Table.Table;

public class Set_defaultTable {
	static public Table setDefaultTable() {
		Table table = new Table();
		table.setTableName("가족"); // 이름정해주기
		table.setColumm("이름/번호/나이/주소");
		table.setRecRow("김은호/010-4943/28/경기도 성남/");
		table.setRecRow("홍길동/010-1111/22/경기도 용인/");
		table.setRecRow("김유신/010-2222/30/경기도 광주/");
		table.setRecRow("유재석/010-3333/20/경기도 하남/");
		return table;
	}
	
}
