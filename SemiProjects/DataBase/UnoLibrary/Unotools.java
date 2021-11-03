package UnoLibrary;

import java.util.ArrayList;

public class Unotools {
	static public ArrayList<String> parseCol(String input) {
		String[] strArr = input.split("/");
		ArrayList<String> col = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			col.add(strArr[i]);
		}
		return col;
	}

	static public void close(String q) {
		if (q.equalsIgnoreCase("q")) {
			System.out.println("프로그램을 정상적으로 종료합니다.");
			System.exit(0);
		}
	}

}
