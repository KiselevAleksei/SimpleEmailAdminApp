package emailapp;

import java.util.Scanner;


public class EmailApp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String f_name = s.next();
        System.out.println("Enter Last Name:");
        String l_name = s.next();

        // Creating a new employee (i.e. an object of the Email class)
        Email em1 = new Email(f_name, l_name);
        int choice = -1;
        do {
            System.out.println("\n**********\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
                    + "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Store data in file\n6.Show from file\n7.Exit");

            String input = s.next();
            try {
                choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        em1.getInfo();
                        break;
                    case 2:
                        em1.setPassword();
                        break;
                    case 3:
                        em1.setMailCapacity();
                        break;
                    case 4:
                        em1.altEmail();
                        break;
                    case 5:
                        em1.saveFile();
                        break;
                    case 6:
                        em1.readFile();
                        break;
                    case 7:
                        System.out.println("\nTHANKS!!!");
                        break;
                    default:
                        System.out.println("INVALID CHOICE! ENTER AGAIN!");
                }
            } catch (Exception e) {
                System.out.println("Not valid input. Select numbers ");
            }
        } while (choice != 7);

    }

}