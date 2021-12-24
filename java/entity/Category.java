package entity;

public class Category {
	private String id;
	private String category;
	
	public Category() {
		
	}
	public Category(String id, String category) {
		this.id = id;
		this.category = category;
	}
	
	public String getId() {
		return id;
	}
	public String getCategory() {
		return category;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
