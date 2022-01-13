package datatypeandtypecasting;

public class Main {

	public static void main(String[] args) {
		
		//Widening casting
		int intNum = 9;
		double doubleNum = intNum;
		System.out.println(intNum);
		System.out.println(doubleNum);
		
		//Narrowing casting
		float floatNum = 50f;
		byte byteNum = (byte) floatNum;
		System.out.println(floatNum);
		System.out.println(byteNum);
		
		//Autoboxing
		int num1 = 1;
		Integer num2 = new Integer(num1);
		Integer num3 = 2;
		
		//Unboxing
		Integer num4 = new Integer(4);
		int num5 = num4;
		
		//Upcasting
		Person teacher = new Teacher();
		teacher.eat();
		//teacher.teach();
		
		//Downcasting
		Person myPerson = new Person();
		Teacher myTeacher = (Teacher) myPerson;
		
		myTeacher.eat();
		myTeacher.teach();
		
	}

}
