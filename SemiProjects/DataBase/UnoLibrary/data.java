package UnoLibrary;

import java.util.ArrayList;

public class data {
	static public ArrayList<String> parseCol(String input) {
		String[] strArr = input.split("/");
		ArrayList<String> col = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			col.add(strArr[i]);
		}
		return col;
	}
}
