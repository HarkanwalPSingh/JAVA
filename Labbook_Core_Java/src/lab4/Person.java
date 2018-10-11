package lab4;

public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(){
		super();
	}
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
