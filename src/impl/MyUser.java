package impl;


public class MyUser {
	
	private String id;
	private String name;
	private String language = "";
	private double cred_score = 0.5;
	private String toString = "";
	
	
	public MyUser(String id, String screenName) {
		this.setId(id);
		name = screenName;
	}
	
	public void addLanguage(String lanuage) {
		this.language = language;
	}
	
	public void addCredibility(double cred_score) {
		this.cred_score = cred_score;
	}
	
	
	public void setNameVisible() {
		toString = name;
	}
	
	
	public String getName() {
		return name;
	}
	

	@Override
	public String toString() {
		return toString;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
