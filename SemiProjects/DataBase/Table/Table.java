package Table;

import java.util.ArrayList;
import UnoLibrary.Unotools;

public class Table {
	private String tableName = "";
	private ArrayList<String> columm = new ArrayList<String>();
	private ArrayList<ArrayList<String>> recRow = new ArrayList<ArrayList<String>>();

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ArrayList<String> getColumm() {
		return columm;
	}

	public void setColumm(String col) {
		this.columm = Unotools.parseCol(col);
	}

	public void setColumm(ArrayList<String> columm) {
		this.columm = columm;
	}

	public ArrayList<ArrayList<String>> getRecRow() {
		return recRow;
	}

	public void setRecRow(String rec) {
		this.recRow.add(Unotools.parseCol(rec));
	}

	public void setRecRow(ArrayList<ArrayList<String>> recRow) {
		this.recRow = recRow;
	}
}
