// package program_1a;

import java.util.Scanner;

public class Student {

    String Name;
    long phone;
    String USN;
    String Branch;

    Scanner scan = new Scanner(System.in);

    public void getInput(int x) {
        System.out.println("Enter the value for Name, USN, Branch, phone: \n");

        Name = scan.nextLine();
        USN = scan.nextLine();
        Branch = scan.nextLine();
        phone = scan.nextLong();
    }

    public void print() {
        System.out.println(Name + "\t\t" + USN + "\t\t" + Branch + "\t\t" + phone + "\n");
    }

}
