package com.electricity.billing.system;

import java.sql.ResultSet;

public class viewdetails extends index{

    viewdetails(long customerid){
        String q= "select * from customer where customerid = '" + customerid + "'";
        try {
            con c2 = new con();
            ResultSet rs = c2.s.executeQuery(q);
            while(rs.next()){
                System.out.println("Meter Id: "+rs.getInt(2));
                System.out.println("First Name: "+rs.getString(3));
                System.out.println("Last Name: "+rs.getString(4));
                System.out.println("Address: "+rs.getString(5));
                System.out.println("Mobile No.: "+rs.getLong(6));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
