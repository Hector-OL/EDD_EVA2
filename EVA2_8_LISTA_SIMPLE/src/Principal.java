public class Principal {

    public static void main(String[] args) {
       Lista miLista = new Lista();
        miLista.add(new Nodo(4)); //2
        miLista.add(new Nodo(5));//3
        miLista.add(new Nodo(7));//4
        miLista.add(new Nodo(9));//5
        miLista.add(new Nodo(1));//6
        miLista.add(new Nodo(2));//7
        miLista.addAtBeginning(new Nodo(99999));//1
        miLista.insertAt(0, new Nodo(66666));//0
        miLista.print();
        boolean vacia = miLista.isEmpty();
        if(vacia)
            System.out.println("LISTA VACIA");
        else
            System.out.println("LISTA CON NODOS");
        miLista.deleteAt(4);
            miLista.print();
            try {
            miLista.add(new Nodo(200));
            miLista.print();
            miLista.deleteAt(7);
            miLista.print();
            miLista.add(new Nodo(300));
            miLista.print();
        } catch (Exception e) {
        }
       /*int[] millon = new int[1000000];
        for (int i = 0; i < millon.length; i++) {
            millon[i]=(int)(Math.random()*1000);*/
       // for (int i = 0; i < 1000000; i++) {
            //miLista.add(new Nodo((int)(Math.random()*1000)));
        //}
        System.out.println("Cantidad = "+ miLista.size());
        System.out.println("El valor #3 es "+miLista.findAt(3));
    }
    }
    

