package solid.single.responsibility.principle;

public class Student1 {

	private String name;
	private int age;
		
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getInforText() {
		return "Name: " + this.name + ", age: " + this.age;
	}
	
	public String getInforHtml() {
		return "<span>" + this.name + " " + this.age + "</span>";
	}
		
}
