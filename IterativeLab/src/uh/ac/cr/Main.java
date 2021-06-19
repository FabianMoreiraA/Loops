package uh.ac.cr;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //TODO- Create a new class and call it IterativeControl.

        //Do the next operation on the new class created.

        //1- Todo. Ask user how many time he wants to print hello world on screen.
            //1.1- Todo. Print Hello world as many times as user defined. Use a while structure.
            //1.2- Todo. Print Hello world as many times as user defined. Use a for structure.

        //2- Todo Print hello world and ask the user if he wants to print hello again using a Do while structure.

        //3- Todo ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.

        //Do all the code needed for the previous items on the class created. Use main just to call the methods.

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces quiere saludar al Mundo entero?"));


        InteractiveControl interac = new InteractiveControl();

            interac.mientras(n1);
            interac.para(n1);

        int n2 = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere Saludar al mundo usando Do While? 1.SI 2.NO"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas veces?"));
            if (n2 == 1){
                interac.make(n3);
            }
            else{
                System.out.println("Gracias");
            }
    }
}
