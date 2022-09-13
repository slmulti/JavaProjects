package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor prompts user to entre students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
//        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);


    }

    //Generate an id
    private void setStudentID(){
        //grade year plus id
        id++;
        this.studentID = gradeYear + "" +id;

    }

    //enrol in courses

    public void enrol(){
        //get inside a loop, user hit Q
        do {
            System.out.print("Enter course to enrol (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n- " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
//        System.out.println("=======================");
//        System.out.println("Enrolled in: " + courses);
//        System.out.println("=======================");
//        System.out.println("Tuition Balance: " + tuitionBalance);

    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: £"+tuitionBalance);
    }

    // pay tuition

    public void patTuition(){
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of £"+payment);
        viewBalance();
    }

    //show status

    public String toString(){
        return "=======================" +
                "\nName: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\n=======================" +
                "\nCourses Enrolled: " + courses +
                "\n=======================" +
                "\nBalance: £" + tuitionBalance +
                "\n=======================" +
                "\n=======================";
    }


}
