public class Principal {

    public static void main(String[] args) {
        Arbol miPino = new Arbol();
        miPino.agregarNodo(new Nodo(13));
        miPino.agregarNodo(new Nodo(10));
        miPino.agregarNodo(new Nodo(18));
        miPino.agregarNodo(new Nodo(2));
        miPino.agregarNodo(new Nodo(11));
        miPino.agregarNodo(new Nodo(17));
        miPino.agregarNodo(new Nodo(20));
        
        System.out.println("POST ORDER");
        miPino.imprimePostOrder();
        System.out.println("");
        System.out.println("PRE ORDER");
        miPino.imprimePreOrder();
         System.out.println("");
        System.out.println("IN ORDER");
        miPino.imprimeInOrder();
    }
    
    
    
}
