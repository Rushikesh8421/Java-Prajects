// package program_1a;

import java.util.Scanner;

public class Studentmain {

    public static void main(String[] args) {
        Student[] str = new Student[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:\n");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            str[i] = new Student();
            str[i].getInput(i);
        }

        System.out.println("Student Information\n");
        System.out.println("Name" + "\t\t" + "USN" + "\t\t" + "Branch" + "\t\t" + "Phone\n");

        for (int i = 0; i < n; i++) {
            str[i].print();
        }

    }

}
