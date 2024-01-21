class StudentTest {

	int rNum;
	String studName;
	int m1;
	int m2;
	int totMarks;
	
	void setStud(int rNum, int m1, int m2, String studName ){
		this.rNum = rNum;
		this.studName = studName;
		this.m1 = m1;
		this.m2 = m2;
	}
	void calTotal() {
		this.totMarks = m1 + m2;
		System.out.println("Total Marks = "+totMarks);
	}
	void displayDetail() {
		System.out.println(rNum+studName+totMarks);
	}
	
}

public class Student{
	public static void main(String[] args){
		StudentTest s = new StudentTest();
		s.setStud(1, 50, 50, "HS");
		s.calTotal();
		s.displayDetail();
	}
}