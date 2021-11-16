package Table;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import UnoLibrary.Unotools;

public class Table {
	private String tableName = "";
	private ArrayList<String> columm = new ArrayList<String>();
	private ArrayList<ArrayList<String>> recRow = new ArrayList<ArrayList<String>>();
	private ArrayList<LinkedHashMap<ArrayList<String>, String>> recRowTest = new ArrayList<LinkedHashMap<ArrayList<String>, String>>();

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

	/*
	 * 21.11.12 CRUD 기능을 구현하기위해 자료구조를 일부 수정이 필요하여 추가함
	 */
	public ArrayList<LinkedHashMap<ArrayList<String>, String>> getRecRowTest() {
		return recRowTest;
	}

	public void setRecRowTest(ArrayList<LinkedHashMap<ArrayList<String>, String>> recRowTest) {
		this.recRowTest = recRowTest;
	}

	public void addRecRowTest(ArrayList<LinkedHashMap<ArrayList<String>, String>> recRowTest) {
		
		
		this.recRowTest = recRowTest;
	}
}
