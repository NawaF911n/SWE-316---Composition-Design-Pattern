
public abstract class Folder {
	private String name;
	private String size;
	
	public Folder(String name, String size) {
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
