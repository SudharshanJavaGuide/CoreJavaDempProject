package com.yadav;

import java.util.*;

public class Student {
	
	public int studentId;
	public String studentName;
	public String studentAddress;
	
	
	
	public Student(int studentId, String studentName, String studentAddress) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public static String welcomeMessage(String name) {
		return "Welcome To Incedo Family Mr."+name;
	}
	public static String greetMessage(String user) {
		return "Good After Noon Mr."+user;
	}



	public static List<Student>  displayStudentList(){
		System.out.println("**Display Student List()***");
		List<Student> listOfStudent=new ArrayList<Student>();
		Student s1=new Student(101,"Sudha","Kadapa");
		Student s2=new Student(102,"Indra","Chittoor");
		Student s3=new Student(103,"Naveen","Hyderabad");
		Student s4=new Student(104,"Narendra","Bangalore");
		Student s5=new Student(105,"Pradeep","Chennai");
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);
		return listOfStudent;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}



	public static void main(String[] args) {
		List<Student> displayStudentList = displayStudentList();
		System.out.println("****Student List****");
		//System.out.println(displayStudentList);
		displayStudentList.forEach(s->System.out.println(s));
		welcomeMessage("Nandyala Sudharshan Yadav");
	}
}
