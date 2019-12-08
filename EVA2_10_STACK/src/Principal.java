public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Pila miPila = new Pila();
        miPila.push(new Nodo(100));
        miPila.push(new Nodo(200));
        miPila.push(new Nodo(300));
        miPila.push(new Nodo(400));
        
        miPila.print();
        System.out.println("Cima de la pila " + miPila.peek());
        
        System.out.println("Cima de la pila " + miPila.pop());
        miPila.print();
    }
    
}
