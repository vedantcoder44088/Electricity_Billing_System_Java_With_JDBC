package com.electricity.billing.system;

import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class viewbill extends index {
    viewbill(long customerid, int c_month) {

        if (c_month == 1) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(18);
                    c_unit = rs.getDouble(7);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 2) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(7);
                    c_unit = rs.getDouble(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 3) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(8);
                    c_unit = rs.getDouble(9);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 4) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(9);
                    c_unit = rs.getDouble(10);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 5) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(10);
                    c_unit = rs.getDouble(11);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 6) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(11);
                    c_unit = rs.getDouble(12);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 7) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(12);
                    c_unit = rs.getDouble(13);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 8) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(13);
                    c_unit = rs.getDouble(14);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 9) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(14);
                    c_unit = rs.getDouble(15);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 10) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(15);
                    c_unit = rs.getDouble(16);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 11) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(16);
                    c_unit = rs.getDouble(17);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (c_month == 12) {
            try {
                con c8 = new con();
                ResultSet rs = c8.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
                while (rs.next()) {
                    p_unit = rs.getDouble(17);
                    c_unit = rs.getDouble(18);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Invalid Input..........");
            optionc1();
        }

        //calculate unit
        unit = c_unit - p_unit;

        //calculate amount
        amount = (rate * unit) + fixchaerge;

        try{
            con c6=new con();
            ResultSet rs = c6.s.executeQuery("select * from customer where customerid = '" + customerid + "'");
            while(rs.next()){
            meterid=rs.getLong(2);
            c_firstname=rs.getString(3);
            c_lastname=rs.getString(4);
            address=rs.getString(5);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class print extends index{
        void print() {

            setBounds(100, 100, 500,500);

            JTextArea textArea = new JTextArea();
            textArea.setBounds(30,30,270,400);
            textArea.setEditable(false);
            add(textArea);

            textArea.append("*************************************\n"+
                            "           ELCTRICITY BILL           \n"+
                            "*************************************\n");
            textArea.append("Customer ID :"+customerid+
                        "\nFirstname :"+c_firstname+
                        "\nLastname :"+c_lastname+
                        "\nAddress :"+address+
                        "\nMeter ID :"+meterid+
                        "\n**********************************"+
                        "\nCurrent Month :"+c_month+
                        "\nTotal Units Consumed :"+unit+
                        "\nPayable Amount :"+amount);



            JButton toPrint = new JButton("Print");
            toPrint.setBounds(350, 40,100, 50);
            add(toPrint);
            toPrint.addActionListener(new ActionListener()
            {

                @Override
                public void actionPerformed(ActionEvent evt) {
                    try {
                        textArea.print();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            });

            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);

        }
    }





