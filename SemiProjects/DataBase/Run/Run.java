package Run;

import Active.Action_acnt;
import Active.Action_crud;
import Active.Action_dbLoad;
import Active.Set_defaultTable;
import Database.Database;

public class Run {

	public static void main(String args[]) {
		Database db = new Database();
		db.addTable(Set_defaultTable.setDefaultTable()); // 기본값생성
		Action_acnt.userCheck(db); // 로그인
		while (true) {
			Action_dbLoad.showTableList(db); // db계정내의 테이블 출력
			int num = Action_dbLoad.choiceTodo(db); // 동작 입력
			if (num != -1) { // 구별
				Action_dbLoad.showRec(num, db); // 해당 번호의 테이블 출력
			}
			else {
				db.addTable(Action_crud.createTable(db)); // 테이블 새로 생성
			}
		}
	}
}
