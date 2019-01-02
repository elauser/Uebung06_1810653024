import javax.swing.*;
import java.util.Random;

public class Aufgabe2 {
    public static void main(String[]args){
        Random zufall = new Random();
        System.out.println(zufall);
        Integer[] list1 = new Integer[Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Länge des Arrays ein"))];
        for(int i = 0; i < list1.length; i++) list1[i] = zufall.nextInt(1000);
        for(int i = list1.length -1 ; i >= 0; i--){
            System.out.println(list1[i]);
        }
    }
}

