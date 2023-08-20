import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Converter
{
    public static void convert()
    {
        //To create the frame.

        JFrame frame=new JFrame("CURRENCY CONVERTER");
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);

        //To create "From" and "To" Labels.
        JLabel label1=new JLabel("FROM:");
        label1.setBounds(40, 40, 60, 30);
        
        JLabel label2=new JLabel("TO:");
        label2.setBounds(350, 40, 60, 30);;
        
        //To create "Convert" Button
        JButton button1=new JButton("Convert");
        button1.setBounds(250, 200, 90, 20);

        //Creating the country list.
        String[] from={"Bangladeshi Taka","Brazilian Real","Chinese Yuan Renminbi","Euro","Great British Pound","Indian Rupee","Japanese Yen","Kuwaiti Dinar","South African Rand","US Dollar"};
        
        //Creating drop-down menu for "From Currency" 
        JComboBox comboBox1= new JComboBox(from);
        comboBox1.setBounds(40, 70, 200, 20);

        //Creating drop-down menu for "To Currency"
        JComboBox comboBox2= new JComboBox(from);
        comboBox2.setBounds(350, 70, 200, 20);

        //Creating text boxes for "Amount from" and "Amount To"
        JTextField textField1=new JTextField("0");
        textField1.setBounds(40, 110, 200, 20);

        JTextField textField2=new JTextField("0");
        textField2.setBounds(350, 110, 200, 20);

        //Creating the action to be performed when the "Convert" button is pressed.

        button1.addActionListener(new ActionListener() 
        {
            double in_Rupee; //To convert given amount in rupee
            double to_amount;
            public void actionPerformed(ActionEvent e)
            {
            String from_currency= (String) comboBox1.getSelectedItem();
            String to_currency= (String) comboBox2.getSelectedItem();
            
            double from_amount=Double.parseDouble(textField1.getText());
            
            if(from_currency==to_currency)
            {
                to_amount=from_amount;
            }
            
            else
            {
            
            //from currency selection actions.
            switch(from_currency)
            {
                case "Bangladeshi Taka":
                {
                    in_Rupee=from_amount*0.75155;
                    break;
                }

                case "Brazilian Real":
                {
                    in_Rupee=from_amount*16.7046;
                    break;
                }

                case "Chinese Yuan Renminbi":
                {
                    in_Rupee=from_amount*11.4297;
                    break;
                }

                case "Euro":
                {
                    in_Rupee=from_amount*90.3838;
                    break;
                }

                case "Great British Pound":
                {
                    in_Rupee=from_amount*105.851;
                    break;
                }

                case "Indian Rupee":
                {
                    in_Rupee=from_amount*1;
                    break;
                }

                case "Japanese Yen":
                {
                    in_Rupee=from_amount*0.57171;
                    break;
                }

                case "Kuwaiti Dinar":
                {
                    in_Rupee=from_amount*269.347;
                    break;
                }

                case "South African Rand":
                {
                    in_Rupee=from_amount*4.366;
                    break;
                }

                case "US Dollar":
                {
                    in_Rupee=from_amount*83.124;
                    break;
                }
            }

            //to currency action selection.
            switch(to_currency)
            {
            case "Bangladeshi Taka":
                {
                    to_amount=in_Rupee*1.3023;
                    break;
                }

                case "Brazilian Real":
                {
                    to_amount=in_Rupee*0.05981;
                    break;
                }

                case "Chinese Yuan Renminbi":
                {
                    to_amount=in_Rupee*1.3023;
                    break;
                }

                case "Euro":
                {
                    to_amount=in_Rupee*0.01106;
                    break;
                }

                case "Great British Pound":
                {
                    to_amount=in_Rupee*0.00944;
                    break;
                }

                case "Indian Rupee":
                {
                    to_amount=in_Rupee*1;
                    break;
                }

                case "Japanese Yen":
                {
                    to_amount=in_Rupee*1.74869;
                    break;
                }

                case "Kuwaiti Dinar":
                {
                    to_amount=in_Rupee*0.0037;
                    break;
                }

                case "South African Rand":
                {
                    to_amount=in_Rupee*0.22887;
                    break;
                }

                case "US Dollar":
                {
                    to_amount=in_Rupee*0.01203;
                    break;
                }
            }

        }
            //Converting the amount from double to a String
            String converted=String.valueOf(to_amount);
            //Storing the converted string amount in Text Field of to Amount.
            textField2.setText(converted);
            }

        });

        

        frame.add(label1);
        frame.add(label2);
        frame.add(button1);
        frame.add(comboBox1);
        frame.add(comboBox2);
        frame.add(textField1);
        frame.add(textField2);

    }

    public static void main(String[] args) 
    {
        convert();
    }
}