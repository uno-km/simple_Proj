package Active;

import java.util.Scanner;

import Database.Database;

public class Action_acnt {
	static Scanner sc = new Scanner(System.in);

	public static void userCheck(Database db) {
		while (true) {
			System.out.println("id를 입력해주세요, 종료를 원하면 q");
			String id = sc.nextLine();
			if (id.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			System.out.println("pw를 입력해주세요, 종료를 원하면 q");
			String pw = sc.nextLine();
			if (id.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			if (id.equals(db.getId()) && pw.equals(db.getId())) {
				break;
			}
			System.out.println("해당 계정이 없습니다. id, pw를 확인해주세요.");

		}
	}
}
