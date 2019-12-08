package eva2_1_recursividad;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EVA2_1_RECURSIVIDAD {

    public static void main(String[] args) {
        Scanner sInput = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int iVal = sInput.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        System.out.println("");
        forFalso(iVal);
        System.out.println("");
        forFalso2(1, iVal);
    }
    public static void forFalso(int iVal){
        System.out.print(iVal + " - ");
        if (iVal>1)
        forFalso(iVal - 1);
        
    }
    public static void forFalso2 (int Uno, int iVal){
        System.out.print(Uno + " - ");
        if (Uno < iVal)
            forFalso2(Uno + 1, iVal);
        
    }
    
}
