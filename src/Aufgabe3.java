import javax.swing.*;
import java.util.Random;
public class Aufgabe3 {
    public static void main(String[]args){
        Random zufall = new Random();
        Integer[] list1 = new Integer[100];
        for(int i = 0; i < list1.length; i++){
            list1[i] = zufall.nextInt();
        }
        while(true) {
            int stelle = Integer.parseInt(JOptionPane.showInputDialog("Welche Stelle wollen Sie ändern?"));
            String accept = JOptionPane.showInputDialog("Der aktuelle Wert ist " + list1[stelle] + " wollen Sie Ihn Änder? Y or N");
            if (accept.equals("Y")) {
                try {
                    list1[stelle] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die neue Zahl ein"));
                }
                catch(Exception e){
                    break;
                }
            }
        }
    }
}
