package co.edu.unbosque.model;

import java.util.ArrayList;

public class AppDTO implements AppDAO {

	private ArrayList<String> mainDB = new ArrayList<String>();

	public AppDTO() {

	}

	@Override
	public void add(String element) {
		mainDB.add(element);
	}

	@Override
	public String search() {
		String returnableData = "";
		int index = 1;
		for (String x : mainDB) {
			returnableData += index + "." + x + "\n";
			index++;
		}
		return returnableData;
	}

	@Override
	public void modify(int index, String newValue) {
		mainDB.set(index, newValue);
	}

	@Override
	public void delete(String target) {
		mainDB.remove(Integer.parseInt(target) - 1);
	}

	public ArrayList<String> getMainDB() {
		return mainDB;
	}

	public void setMainDB(ArrayList<String> mainDB) {
		this.mainDB = mainDB;
	}

}
