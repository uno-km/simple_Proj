package Database;

import java.util.ArrayList;

import Table.Table;

public class Database {

	private String id = "user";
	private String pw = "user";
	private ArrayList<Table> tables = new ArrayList<Table>();

	public ArrayList<Table> getTables() {
		return tables;
	}

	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
