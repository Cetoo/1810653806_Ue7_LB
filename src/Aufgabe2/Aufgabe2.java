package Aufgabe2;

import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        while (true)
        {
            try
            //try fürht meine eigentliche Anweisung aus
            {
                int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein."));

                JOptionPane.showMessageDialog(null, "Danke für die Eingabe. Ihre Eingabe lautet: " + eingabe);
                break;
                //wird abgebrochen wenn eine Zahl eingegeben wurde

            }
            catch (NumberFormatException e)
              //Falls eine Methode oder Anweisung aus dem try Block fehlschlägt wird sie mit dem catch Block abgefangen
              // In den () Klammern eines catch Blockes gebe ich an auf welchen Fehler oder Ausnahmesituation reagiert werden soll
              // Ein Catch Block lässt sich somit verwenden um den Nutzer eine Fehlermeldung auszugeben anstatt dass, das System einfach abstürtzt

            {
                JOptionPane.showMessageDialog(null, "Das war keine Zahl. Bitte geben Sie eine Zahl ein.");
            }
        }
    }
}
