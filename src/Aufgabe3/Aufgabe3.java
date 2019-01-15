package Aufgabe3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3
{
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Um den Newsletter zu abonieren geben Sie bitte Ihre E-Mail Adresse ein.");

        try
        {
            checkEmail(eingabe);
            JOptionPane.showMessageDialog(null, "Ihre E-Mail Adresse ist gültig. Sie erhalten nun die neuesten News auf folgende Adresse: " + eingabe);
        }
        catch (Exception e)
        //hier ist die neu erstelle exception
        {
            JOptionPane.showMessageDialog(null, "Tut uns leid dies war keine gültige E-Mail Adresse.");
        }
    }

    private static void checkEmail(String s) throws Exception
    {
        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}$");
        Matcher m = pattern.matcher(s);

        if(!m.find())
            //wenn es NICHT findet dann erstelle eine neue Exception
        {
            throw new Exception();
        }

    }
}

