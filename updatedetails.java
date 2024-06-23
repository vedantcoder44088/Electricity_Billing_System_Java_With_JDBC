package com.electricity.billing.system;

import java.sql.ResultSet;

public class updatedetails extends index{
    updatedetails(long customerid){

        System.out.println(" : Select Number For Edit Details : ");
        System.out.println("1 - Meter Id");
        System.out.println("2 - First Name");
        System.out.println("3 - Last Name");
        System.out.println("4 - Address");
        System.out.println("5 - Mobile No.");
        int inputa12=Integer.parseInt(sc.nextLine());

        String q= "select * from customer where customerid = '" + customerid + "'";
        try {
            con c2 = new con();
            ResultSet rs = c2.s.executeQuery(q);
            while(rs.next()){
                meterid=rs.getInt(2);
                c_firstname=rs.getString(3);
                c_lastname=rs.getString(4);
                address=rs.getString(5);
                mobile=rs.getLong(6);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //Update MeterID
        if(inputa12==1){
            enternewmeterid();
            try {
                con c3 = new con();
                c3.s.executeUpdate("UPDATE customer SET meterid='" + newmeterid + "' WHERE customerid='" + customerid + "'");

            } catch (Exception e){
                e.printStackTrace();
            }
        }
        //Update FirstName
        else if (inputa12==2) {
            //firstname
            System.out.println("Enter New Firstname: ");
            newcfirstname=sc.nextLine();
            try {
                con c3 = new con();
                c3.s.executeUpdate("UPDATE customer SET c_firstname='" + newcfirstname + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        //Update LastName
        else if (inputa12==3) {
            //lastname
            System.out.println("Enter New Lastname: ");
            newclastname=sc.nextLine();
            try {
                con c3 = new con();
                con.s.executeUpdate("UPDATE customer SET c_lastname ='" + newclastname + "'WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        //Update Address
        else if (inputa12==4) {
            //Address
            System.out.println("Enter New Address: ");
            newaddress=sc.nextLine();
            try {
                con c3 = new con();
                c3.s.executeUpdate("UPDATE customer SET address ='" + newaddress + "' WHERE customerid= '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }


        }
        //Update MobileNo
        else if (inputa12==5) {
            enternewmobile();
            try {
                con c3 = new con();
                c3.s.executeUpdate("UPDATE customer SET mobile ='" + newmobile + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Enter Invalid Input.....");
        }
    }

    //New MobileNO Condition
    public static void enternewmobile(){
        System.out.println("Enter New Mobile No. : ");
        mostr=sc.nextLine();
        if(mostr.length()==10){
            newmobile=Long.parseLong(mostr);
        }
        else{
            System.out.println("Enter Invalid ID.... Please Enter 10 Digit MOBILE NO.");
            System.out.println("Enter New Mobile No. : ");
            enternewmobile();
        }
    }

    //New MeterID Condition
    public static void enternewmeterid(){
        System.out.println("Enter New Meter ID: ");
        metstr=sc.nextLine();
        if(metstr.length()==4){
            newmeterid=Long.parseLong(metstr);
        }
        else{
            System.out.println("Enter Invalid ID.... Please Enter 4 Digit MOBILE NO.");
            System.out.println("Enter New Meter ID : ");
            enternewmobile();
        }
    }

}
