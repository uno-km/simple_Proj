package Run;

import Active.Action_acnt;
import Active.Action_crud;
import Active.Action_dbLoad;
import Active.Set_defaultTable;
import Database.Database;

public class Run {
	public static void main(String args[]) {

		Database db = new Database();
		db.addTable(Set_defaultTable.setDefaultTable());
		Action_acnt.userCheck(db);
		while (true) {
			Action_dbLoad.showTableList(db);
			Action_dbLoad.showCol(db);
			int num = Action_dbLoad.choiceTodo(db);
			if (num == -1) {
				db.addTable(Action_crud.createTable(db));
			}
			Action_dbLoad.showTableList(db);
		}
//		Action_dbLoad.showRec(num, db);

	}

}
