package com.electricity.billing.system;

public class newcustomer extends index {

    newcustomer(long customerid, long meterid, String c_firstname, String c_lastname, String address, long mobile) {
        String q = "INSERT INTO customer (customerid, meterid, firstname, lastname, address, mobile) VALUES ("
                + customerid + ", "
                + meterid + ", '"
                + c_firstname + "', '"
                + c_lastname + "', '"
                + address + "', "
                + mobile + ")";
        try {
            con c1 = new con();
            c1.s.executeUpdate(q);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
