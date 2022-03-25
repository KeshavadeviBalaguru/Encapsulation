package com.java;

import java.util.Scanner;

class Student{
	 int Sid;
	 String StudentName;
	 double StudentFees;
	 int Studentage;
	 
	 void accept()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Student id:");
		 Sid=s.nextInt();
		 System.out.println("Enter StudentName: ");
		 StudentName=s.nextLine();
		 s.nextLine();
		 System.out.println("Enter StudentFees:");
		 StudentFees=s.nextDouble();
		 System.out.println("Enter Studentage:");
		 Studentage=s.nextInt();
	 }
	void display()
	{
	 System.out.println("Student ID: "+Sid );
	 System.out.println("StudentName: "+StudentName);
	 System.out.println("Student Fees: "+StudentFees);
	 System.out.println("Student Age: "+Studentage);
	}
}
public class Encapsulation {
public static void main(String[] args) {
	Student st=new Student();
	st.accept();st.display();;
	
}
}
