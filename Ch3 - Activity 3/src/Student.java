//Tripp 1/28 - Ch.3 Activity 3
public class Student {
	private int id;
	private int hours;
	private int points;
	private double gpa;

//Constructor
	public Student() {
		setId(9999);
		setPoints(12);
		setHours(3);
	}
	
//Properties
	public double calcGpa() {
		gpa = (double)points / (double)hours;
		return gpa;
	}
	public int getId() {
		return id;
	}
	public int getHours() {
		return hours;
	}
	public int getPoints() {
		return points;
	}
	public void setId(int idNum) {
		id = idNum;
	}
	public void setHours(int hrs) {
		hours = hrs;
	}
	public void setPoints(int pts) {
		points = pts;
	}

}
