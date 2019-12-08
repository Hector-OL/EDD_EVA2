public class Principal {

    public static void main(String[] args) {
    
        MiQueue miQueue = new MiQueue();
        miQueue.add(new Nodo (100));
        miQueue.add(new Nodo (200));
        miQueue.add(new Nodo (300));
        miQueue.add(new Nodo (400));
        System.out.println(miQueue.leer());
        miQueue.quitar();
        System.out.println(miQueue.leer());
        miQueue.quitar();
        System.out.println(miQueue.leer());
        miQueue.quitar();
        System.out.println(miQueue.leer());
        miQueue.quitar();
    }
    
}
