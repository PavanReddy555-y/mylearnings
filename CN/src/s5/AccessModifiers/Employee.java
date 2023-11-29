package s5.AccessModifiers;

public class Employee {
	
	private String name;
	private String location;
	private String designatio;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignatio() {
		return designatio;
	}
	public void setDesignatio(String designatio) {
		this.designatio = designatio;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", designatio=" + designatio + "]";
	}

	
}
