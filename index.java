package com.electricity.billing.system;

import java.util.Scanner;
import javax.swing.JFrame;


public class index extends JFrame{

    public static long customerid;
    public static String cusstr;
    public static long meterid;
    public static String metstr;
    public static long newmeterid;
    public static String c_firstname;
    public static String newcfirstname;
    public static String c_lastname;
    public static String newclastname;
    public static String address;
    public static String newaddress;
    public static long mobile;
    public static String mostr;
    public static long newmobile;
    public static double unit;
    public static double c_unit;
    public static double p_unit;
    public static int c_month;
    public static double amount;
    public static double rate=4.62;
    public static double fixchaerge=140;


    static Scanner sc = new Scanner(System.in);

    //Main Method
    public static void main(String[] args) {

        System.out.println("Welcome To Electricity Billing System");
        System.out.println("\nVEDANT PATEL - IU2141230207");
        System.out.println("VIDHI PATEL - IU2141230209");


        System.out.println("\n1 - Log In As Customer");
        System.out.println("2 - Log In As Admin");
        int login = Integer.parseInt(sc.nextLine());

        if (login == 1) {
            customer();
        } else if (login == 2) {
            admin();
        } else {
            System.out.println("Enter Valid Input....");
        }
    }



    //Customer Penal Login
    public static void customer(){
        System.out.println("1 - View Bill");
        int inputc1=Integer.parseInt(sc.nextLine());

        if(inputc1 == 1) {
            optionc1();
        }
        else if (inputc1==2) {
            System.out.println("Please Run Code 2nd Time......");
        }
    }
    //Customer View Bill Method
    public static void optionc1(){
        System.out.println("Enter Customer ID: ");
        entercusid();

        System.out.println("Enter Month(IN INTEGER): ");
        c_month = Integer.parseInt(sc.nextLine());

        viewbill c1 = new viewbill(customerid, c_month);
        print p1= new print();
        p1.print();

    }
    //Customer Print Bill Method




    ///Admin Panel Login
    public static void admin(){
        System.out.println("Welcome Admin");
        System.out.println("1 - Enter New Customer Details");
        System.out.println("2 - Update Customer Details");
        System.out.println("3 - Enter Unit IN Database");
        int inputa1=Integer.parseInt(sc.nextLine());

        if(inputa1==1){
            optiona1();
        }
        else if (inputa1==2) {
            optiona2();
        }
        else if (inputa1==3) {
            optiona3();

        }
        else {
            System.out.println("Enter Valid Input.......");
            System.out.println("Please Select Option :");
            System.out.println("1 - For Admin Panel");
            System.out.println("2 - For Home Page");

            int inputa2 =Integer.parseInt((sc.nextLine()));

            if(inputa2==1){
                admin();
            }
            else if (inputa2==2){
                System.out.println("Please Run Code 2nd Type......");
            }
        }
    }
    //Admin New Customer Method
    public static void optiona1(){
        System.out.println("\n Enter All Details :");

        System.out.println("Customer ID: ");
        entercusid();
        System.out.println("Meter ID: ");
        entermetid();
        System.out.println("First Name: ");
        c_firstname=sc.nextLine();
        System.out.println("Last Name: ");
        c_lastname=sc.nextLine();
        System.out.println("Address: ");
        address=sc.nextLine();
        System.out.println("Mobile No.: ");
        entermono();
        newcustomer a1 = new newcustomer(customerid, meterid, c_firstname, c_lastname, address, mobile);

        System.out.println("1 - For Repeat Entry");
        System.out.println("2 - For Admin Penal");
        System.out.println("3 - For Customer Penal");
        int inputa11=Integer.parseInt(sc.nextLine());

        if (inputa11==1){
            optiona1();
        }
        else if (inputa11==2) {
            admin();
        }
        else if (inputa11==3){
            customer();
        } else{
            System.out.println("Invalid Input........");
            admin();
        }
    }
    //Admin Edit Customer Method
    public static void optiona2(){
        System.out.println("Enter Your Customer ID: ");
        customerid=Long.parseLong(sc.nextLine());

        System.out.println("Please Conform Your Details: ");

        viewdetails v2 = new viewdetails(customerid);
        updatedetails u1 =new updatedetails(customerid);

        System.out.println("1 - For Repeat Edit");
        System.out.println("2 - For Admin Penal");
        System.out.println("3 - For Customer Penal");
        int inputa11=Integer.parseInt(sc.nextLine());

        if (inputa11==1){
            optiona2();
        }
        else if (inputa11==2) {
            admin();
        }
        else if (inputa11==3){
            customer();
        } else{
            System.out.println("Invalid Input........");
            admin();
        }
    }
    //Admin Store Unit JDBC
    public static void optiona3(){
        System.out.println("Enter Customer ID: ");
        entercusid();
        storeunitjdbc s1 =new storeunitjdbc(customerid);

        System.out.println("1 - For Repeat Enter");
        System.out.println("2 - For Admin Penal");
        System.out.println("3 - For Customer Penal");
        int inputa11=Integer.parseInt(sc.nextLine());

        if (inputa11==1){
            optiona3();
        }
        else if (inputa11==2) {
            admin();
        }
        else if (inputa11==3){
            customer();
        } else{
            System.out.println("Invalid Input........");
            admin();
        }
    }




    //Enter CustomerID Condition
    public static void entercusid(){
        cusstr=sc.nextLine();
        if(cusstr.length()==6){
            customerid=Long.parseLong(cusstr);
        }
        else{
            System.out.println("Enter Invalid ID.... Please Enter 6 Digit ID");
            System.out.println("Enter Customer ID : ");
            entercusid();
        }
    }
    //Enter MeterID Condition
    public static void entermetid(){
        metstr=sc.nextLine();
        if(metstr.length()==4){
            meterid=Long.parseLong(metstr);
        }
        else{
            System.out.println("Enter Invalid ID.... Please Enter 4 Digit ID");
            System.out.println("Enter Meter ID : ");
            entermetid();
        }
    }
    //Enter MobileNO Condition
    public static void entermono(){
        mostr=sc.nextLine();
        if(mostr.length()==10){
            mobile=Long.parseLong(mostr);
        }
        else{
            System.out.println("Enter Invalid ID.... Please Enter 10 Digit MOBILE NO.");
            System.out.println("Enter Mobile No. : ");
            entermono();
        }


    }



}






