package pojo;

public class Country{
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}
