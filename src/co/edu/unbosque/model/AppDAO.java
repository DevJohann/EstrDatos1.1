package co.edu.unbosque.model;

public interface AppDAO {
	void add(String element);

	String search();

	void modify(int index, String newValue);

	void delete(String target);

}
