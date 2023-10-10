package miniproject;

import java.util.Scanner;

public class StudentMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("====================================================================");
		System.out.println("============= Student Management System =============================");
		System.out.println("====================================================================");
		String ch;
		StudentApp app=new StudentApp();
		do
		{
		
		System.out.println("\t\t 1)View Student Information\r\n"
				+ "\t\t 2)Insert student info by student id.\r\n"
				+ "\t\t 3)view all student information By Id.\r\n"
				+ "\t\t 4)Update student information by id.\r\n"
				+ "\t\t 5)delete student information by id.\r\n"
				+ "\t\t 6)delete all student information.");
		System.out.println("====================================================================");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:	app.viewAllStudentInfo();
				break;
		case 2:	app.addStudentInfo();
		break;
		case 3:	app.viewStudentInfoById();
		break;
		case 4:	app.updateStudentById();
		break;
		case 5:	app.deleteAllStudentInfo();
		break;
		case 6:	app.deleteStudentById();
		break;
	    default:System.out.println("Wrong choice!!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		 ch=sc.next();
		}
		while(ch.equals("Y")||ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");
	
		System.out.println("====================================================================");


	}

}
