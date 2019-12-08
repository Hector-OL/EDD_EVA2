public class Arbol {
    private Nodo root;

    public Arbol(){
        root = null;
    }
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){ //ARBOL VACÍO
            root = nuevo;
        }else{
            if(nuevo.getValor() > actual.getValor()){ //MAYOR --> DERECHA
                if(actual.getDer() == null){ //VACÍO, HAY ESPACIO
                    actual.setDer(nuevo);
                }else{ //UPS, YA HAY UN NODO
                    agregarNodoRec(actual.getDer(), nuevo);
                }
            }else if(nuevo.getValor() < actual.getValor()){ //MENOR --> IZQUIERDA
                if(actual.getIzq()== null){
                    actual.setIzq(nuevo);
                }else{ //UPS, YA HAY UN NODO
                    agregarNodoRec(actual.getIzq(), nuevo);
                }
            }else{ //EL VALOR YA EXISTE
                System.out.println("UPS! YA EXISTE EL VALOR");
            }
        }
    }
    public void imprimePostOrder(){
        postOrder(root);
    }
    public void imprimePreOrder(){
        preOrder(root);
    }
    public void imprimeInOrder(){
        inOrder(root);
    }
    
    private void postOrder(Nodo actual){
        if(actual != null){
        //LEER IZQ
        postOrder(actual.getIzq());
        //LEER DER
        postOrder(actual.getDer());
        //IMPRIMIR
        System.out.print(actual.getValor()+" - ");
        }
    }
    private void preOrder(Nodo actual){
        if(actual != null){
        //IMPRIMIR
        System.out.print(actual.getValor()+" - ");        
        //LEER IZQ
        preOrder(actual.getIzq());
        //LEER DER
        preOrder(actual.getDer());
       
        }
    }
    private void inOrder(Nodo actual){
        if(actual != null){
        //LEER IZQ
        inOrder(actual.getIzq());
        //IMPRIMIR
        System.out.print(actual.getValor()+" - ");
        //LEER DER
        inOrder(actual.getDer());
       
        }
    }
}
