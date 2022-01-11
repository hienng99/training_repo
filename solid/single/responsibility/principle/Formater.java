package solid.single.responsibility.principle;

public class Formater {

	public static String formatText(Student student) {
		return "Name: " + student.getName() + ", name: " + student.getAge();
	}
	
	public static String formatHtml(Student student) {
		return "<span>" + student.getName() + " " + student.getAge() + "</span>";
	}
}
