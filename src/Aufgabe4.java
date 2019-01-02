import javax.swing.*;
import java.util.ArrayList;

public class Aufgabe4 {
    public static void main (String[]args){
        JOptionPane.showMessageDialog(null, "Geben Sie ihre besten 5 Freunde ein");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add(JOptionPane.showInputDialog("Ihr freund nr 1"));
        list1.add(JOptionPane.showInputDialog("Ihr freund nr 2"));
        list1.add(JOptionPane.showInputDialog("Ihr freund nr 3"));
        list1.add(JOptionPane.showInputDialog("Ihr freund nr 4"));
        list1.add(JOptionPane.showInputDialog("Ihr freund nr 5"));

        for(int i = 0; i <5; i++){
            System.out.print(list1.get(i).toString() + " ");
        }
    }
}
