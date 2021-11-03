package Run;

import Active.Action_acnt;
import Active.Action_crud;
import Active.Action_dbLoad;
import Database.Database;
import Table.Table;

public class Run {

	public static void main(String args[]) {
		Table table = new Table();
		Database db = new Database();

		table.setTableName("가족"); // 이름정해주기

		String col = "이름/번호/나이/주소";
		String data = "김은호/010-4943/28/경기도 성남/";
		String data2 = "홍길동/010-1111/22/경기도 용인/";
		String data3 = "김유신/010-2222/30/경기도 광주/";

		db.addTable(table);
		table.setColumm(col);
		table.setRecRow(data);
		table.setRecRow(data2);
		table.setRecRow(data3);

		Action_acnt.userCheck(db);
		Action_dbLoad.showTableList(db);
		Action_dbLoad.showCol(db);
		int num = Action_dbLoad.choiceTodo(db);
		if (num == -1) {
			db.addTable(Action_crud.createTable(db));
		}
		Action_dbLoad.showTableList(db);
//		Action_dbLoad.showRec(num, db);

	}

}
