package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        //Ask how many students we want to add
        System.out.print("Enter number of new Students to enrol: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create N number of new students
        for(int n=0; n< numOfStudents; n++){
            students[n] = new Student();
            students[n].enrol();
            students[n].patTuition();
            System.out.println(students[n].toString());
        }

    }
}
