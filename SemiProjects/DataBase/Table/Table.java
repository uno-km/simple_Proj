package Table;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Table {
	private String tableName = "";
	private ArrayList<String> columm = new ArrayList<String>();
	private LinkedHashMap<String, String> recRow = new LinkedHashMap<String, String>();

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ArrayList<String> getColumm() {
		return columm;
	}

	public void setColumm(ArrayList<String> columm) {
		this.columm = columm;
	}

	public LinkedHashMap<String, String> getRecRow() {
		return recRow;
	}

	public void setRecRow(LinkedHashMap<String, String> recRow) {
		this.recRow = recRow;
	}
}
