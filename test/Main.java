package com.example.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<helper> ll = new LinkedList<>();
    public static void main(String[] args) {
        contacts c = new contacts("", 0);
        c.createContacts();
        tester();
    }

    private static void tester() {

        helper h1 = new helper(9234343);
        helper h2 = new helper(5436544);
        helper h3 = new helper(8342784);
        helper h4 = new helper(6324243);
        helper h5 = new helper(9277482);


        add(h1);
        add(h2);
        add(h3);
        add(h4);
        add(h5);


        System.out.println("Missed call button pressed!!");
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("The missed call list currently is ");
            System.out.println(ll);
            System.out.println("Enter 1)To get list of missed calls\n 2)To go to next missed call\n 3)To delete the missedcall\n 4)To exit\n");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println(ll);
                    break;

                case 2:
                    Iterator<helper> i = ll.iterator();
                    int quit;
                    while (i.hasNext()) {
                        System.out.println("Enter 1 to go to next missed call 2 to quit");
                        quit = sc.nextInt();
                        sc.nextLine();
                        if (quit == 2)
                            break;
                        System.out.println(i.next());

                    }
                    break;

                case 3:
                    System.out.println("The missed call list currently is ");
                    System.out.println(ll);
                    System.out.println("Enter the missed call you want to delete");
                    int num = sc.nextInt();
                    num--;
                    sc.nextLine();

                    ll.remove(num);
                    System.out.println("Updated list is :");
                    System.out.println(ll);
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void add(helper h){
        if(ll.size() == 10){
            ll.remove(0);
        }
        ll.add(h);
    }

}
