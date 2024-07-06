// Quincy Yarbrough
// 6/23/2024

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String fName;
        String lName;
        int bDay;
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Regestration Form");
        System.out.print("Enter first name: ");
        fName =sc.nextLine();
        System.out.print("Enter last name: ");
        lName = sc.nextLine();
        System.out.print("Enter year of birth: ");
        String input = sc.nextLine();
        bDay = Integer.parseInt(input);
        System.out.println("Welcome " + fName + " " + lName + "!");
        System.out.println("Your regestration is complete.");
        System.out.println("Your temporary password is: " + fName + "*" + bDay);
    }
}