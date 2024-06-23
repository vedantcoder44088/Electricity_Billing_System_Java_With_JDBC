package com.electricity.billing.system;

public class enterdetails extends index{
    public void entercustmerid(String cusstr){
        this.cusstr=cusstr;
        try{
            cusstr=sc.nextLine();
            if(cusstr.length()!=5){
                throw new Exception("Enter Invalid ID.. Enter 5 Digit ID...");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
