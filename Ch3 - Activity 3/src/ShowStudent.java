//Tripp 1/28 - Ch.3 Activity 3
public class ShowStudent {

	public static void main(String[] args) {
		Student first = new Student();
		Student second = new Student();
		first.setId(123);
		first.setHours(4);
		first.setPoints(12);
//Output - Student 1
		System.out.println("Id: "+first.getId());
		System.out.println("Hours: "+first.getHours());
		System.out.println("Points: "+first.getPoints());
		System.out.println("GPA: "+first.calcGpa());
//Output - Student 2
		System.out.println("---------------------");
		System.out.println("Id: "+second.getId());
		System.out.println("Hours: "+second.getHours());
		System.out.println("Points: "+second.getPoints());
		System.out.println("GPA: "+second.calcGpa());
	}

}
