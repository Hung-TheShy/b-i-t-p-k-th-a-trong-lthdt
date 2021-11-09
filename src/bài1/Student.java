
package bài1;

import java.util.Scanner;
public class Student extends Person {
    @Override
	public String toString() {
		return "Student : studentID: " + studentID + " , Name: "+ name + ", academicYear: " + academicYear;
	}
	
	public Student() {
		super();
	}

	public Student(String studentID, int academicYear) {
		super();
		this.studentID = studentID;
		this.academicYear = academicYear;
	}
	
	
	
	public Student(String name, char gender, int birthYear, String studentID, int academicYear) {
		super(name, gender, birthYear);
		this.academicYear = academicYear;
		this.studentID = studentID;
		
		
	}

	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}
	
	String studentID;
	int academicYear;
	
	public void setInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("nhập họ tên: ");
		this.setName(input.next());

		System.out.print("Nhập mã Sv: ");
		this.setStudentID(input.next());
		
		System.out.print("Nhập năm sinh: ");
		this.setBirthYear(input.nextInt());
		
		System.out.print("Nhập giới tính: ");
		this.setGender(input.next().charAt(0));
		
		System.out.print("Năm nhập học: ");
		this.setAcademicYear(input.nextInt());
		
		
	}
}
