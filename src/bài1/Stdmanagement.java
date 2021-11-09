
package bài1;

import java.util.ArrayList;
import java.util.Scanner;
public class Stdmanagement {
    ArrayList<Student> listStudents;
	
	public static ArrayList<Student> findByBirthYear(ArrayList<Student> listStudents){
		ArrayList<Student> result = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập năm sinh cần tìm:");
		int namSinh = input.nextInt();
		for (Student o: listStudents) {
			if(o.getBirthYear() == namSinh) {
				result.add(o);
			}
		}
		
		return result;
	}
	
	public static ArrayList<Student> findByName(ArrayList<Student> listStudents){
		ArrayList<Student> result = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập tên cần tìm :");
		String ten = input.next();
		
		for (Student o: listStudents) {
			if(o.getName().equals(ten)) {
				result.add(o);
			}
		}
		
		return result;
	}
	
	public static void Show(ArrayList<Student> students) {
		for (Student o: students) {
			System.out.println(o.toString());
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập số sinh viên");
		int n = input.nextInt();
		Stdmanagement list = new Stdmanagement();
		list.listStudents = new ArrayList<Student>();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ": ");
			Student s = new Student();
			s.setInfo();
			list.listStudents.add(s);
		}
// hiện thị thông tin
		Show(list.listStudents);
		ArrayList<Student> resultByBirthYear = findByBirthYear(list.listStudents);
		System.out.print("Danh sách sinh viên có cùng năm sinh cần tìm là: ");
		Show(resultByBirthYear);
		ArrayList<Student> resultByName = findByName(list.listStudents);
		System.out.print("Danh sách sinh viên có tên càn tìm là: ");
		Show(resultByName);
	}
}
