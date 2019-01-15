package Aufgabe2;

import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {

        while (true)
        {
            try
            {
                String eingabe1 = JOptionPane.showInputDialog("Bitte geben Sie einen Wert ein");

                //Fordert den Nutzer auf etwas einzugeben

                if (eingabe1.matches("\\d"))
                // \\d sind die Ziffern 0-9
                {
                    throw new Exception();
                } else
                    //Andernfalls also wenn die Eingabe keine Zahl zwischen 0-9 war kommt er else Block
                {
                    System.out.println(eingabe1 + " ist ein ungültiger Wert");
                }
            }
            catch (Exception e)
            {
                System.out.println("Diese Eingabe war gültig, das Programm wird nun beendet");
                break;
            }
        }

    }
}
