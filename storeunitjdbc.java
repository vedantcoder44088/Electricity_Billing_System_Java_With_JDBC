package com.electricity.billing.system;

public class storeunitjdbc extends index{
    storeunitjdbc(long customerid){
        System.out.println("Enter Current Reading: ");
        c_unit=Double.parseDouble(sc.nextLine());
        System.out.println("Enter Current Month: ");
        c_month=Integer.parseInt(sc.nextLine());


        if(c_month==1){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m1 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==2){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m2 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==3){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m3 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==4){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m4 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==5){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m5 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==6){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m6 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==7){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m7 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==8){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m8 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==9){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m9 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==10){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m10 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==11){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m11 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(c_month==12){
            try {
                con c9 = new con();
                c9.s.executeUpdate("UPDATE customer SET m12 = '" + c_unit + "' WHERE customerid = '" + customerid + "'");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
