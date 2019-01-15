package Aufgabe3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3
{
    public static void main(String[] args)
    {
        try {
            if(checkEmail()){
                System.out.println("Die eingegebene Adresse ist gültig");
            } else {
                System.out.println("Die Eingabe ist keine gültige Adresse");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static boolean checkEmail() throws Exception {
        String email = JOptionPane.showInputDialog("Bitte geben Sie Ihre Email ein!");

        Pattern pattern  = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}$");
        Matcher m = pattern.matcher(email);

        return m.find();
    }
}

