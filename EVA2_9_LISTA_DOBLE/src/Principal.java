public class Principal {
    
    public static void main(String[] args) {
    ListaDoble miLista = new ListaDoble();
    
    miLista.add(new Nodo (100)); //3   
    miLista.add(new Nodo (200)); //SE ELIMINA   
    miLista.add(new Nodo (300)); //4   
    miLista.add(new Nodo (400)); //5   
    miLista.print();
    
    boolean vacia = miLista.isEmpty();
    
    if(vacia){
            System.out.println("LISTA VACIA");
    }else{
            System.out.println("LISTA CON NODOS");
            miLista.printBackwards();
            miLista.addAtBeginning(new Nodo (111)); //1
            miLista.print();
            miLista.addAtBeginning(new Nodo (112)); //0
            miLista.print();
            miLista.insertAt(2, new Nodo(66666));   //2
            miLista.print();
            miLista.deleteAt(4);
            miLista.print();
    
    
            System.out.print("El valor de la posicion #3 es: ");
            System.out.println(miLista.findAt(3));
    
            System.out.print("El tamaño de la lista es de: ");
            System.out.println(miLista.size());
    }
    }
}
