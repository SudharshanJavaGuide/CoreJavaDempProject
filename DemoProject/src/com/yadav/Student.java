package com.yadav;

import java.util.*;

public class Student {
	public static String place="Hyd";
	public int studentId=101;
	public String studentName="Sudharshan";
	public String studentAddress="kadapa";
	/*
    public Student(int studentId,String studentName,String studentAddress) {
    	this.studentId=studentId;
    	this.studentName=studentName;
    	this.studentAddress=studentAddress;
    }
    */
    {
    	studentId=110;
    	studentName="Harsha";
    	studentAddress="Chennai";
    }
    

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}


	public static void main(String[] args) {
		//Student s= new Student(105,"Sudha","Chittoor");
		//System.out.println(s);
		//System.out.println(s.studentId+"-"+s.studentName);
		//System.out.println("Student ID:"+s.studentId);
		//System.out.println(studentId);
		Student s=new Student();
		System.out.println(place);
		System.out.println("Place Of Student :"+Student.place);
		System.out.println(s.studentId+" "+s.studentName+" "+s.studentAddress);
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("please enter student id");
		int sid=s.nextInt();
		System.out.println("please enter student number");
		int number=s.nextInt();
		System.out.println("please enter student name");
		String name=s.next();
		System.out.println("please enter student mothername");
		String fname=s.next();
		System.out.println("please enter student fathername");
		String mname=s.nextLine();
		System.out.println("studentname:"+name);
		System.out.println("studentid:"+sid);
		System.out.println("studentnumber:"+number);
		System.out.println("student mothername:"+mname);
		System.out.println("student fathername:"+fname);
		*/
	}
}
