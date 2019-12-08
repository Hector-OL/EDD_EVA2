
import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        LinkedList<String> lListaEnLa = new LinkedList<String>();
        lListaEnLa.add("Hola");
        lListaEnLa.add(" ");
        lListaEnLa.add("mundo");
        lListaEnLa.add(" ");
        lListaEnLa.add("cruel");
        lListaEnLa.add("!!!");
        lListaEnLa.addFirst("XXXXX");
        System.out.println(lListaEnLa);
        for (String string : lListaEnLa) {
            System.out.print(string + " - "); 
        }
        System.out.println("");
        System.out.println(lListaEnLa.size());
        lListaEnLa.remove(3);
        System.out.println(lListaEnLa);
        
    }
    
}
class Algo{
    
}