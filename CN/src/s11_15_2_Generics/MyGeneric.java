package s11_15_2_Generics;

public class MyGeneric<T> {
	
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "name=" + name ;
	}

	public static<T> boolean isEqual(String name1 , String name2)
	{
		return name1.equals(name2);
	}
	
}
