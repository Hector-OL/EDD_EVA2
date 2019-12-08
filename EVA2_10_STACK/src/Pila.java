

import java.util.logging.Level;        //PUSH AÑADIR EL NODO EN LA CIMA
import java.util.logging.Logger;        // POP QUITAR (LEER) el nodo en la cima
                                        //PEEK

public class Pila {
    private Nodo inicio;
    private Nodo fin;
    
    public Pila() {
        this.inicio = null;
        this.inicio = null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTÁ VACÍA
    public boolean isEmpty(){
        if(inicio==null)
            return true;
        else
            return false;
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTÁ VACÍA
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
        //IMPRIMIR LISTA
    public void print(){
        Nodo temp = inicio;
        while (temp!=null){
            System.out.print(temp.getValor()+" - ");
            temp= temp.getSiguiente();
        }
        System.out.println("");
    }
    //CONTAR LISTA
    public int size(){
        int iCont = 0;
        Nodo temp = inicio;
        while (temp!=null){
            iCont++;
            temp= temp.getSiguiente();
        }
        return iCont;
        
    }
    public void addAtBeginning(Nodo nuevo){
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    public void insertAt(int pos, Nodo nuevo){
        //movernos hasta la pos - 1
       int iTama = size();
       if((pos<0)||(pos>=iTama)){
           try {
               throw new Exception("La posición es inválida");
           } catch (Exception ex) {
               Logger.getLogger(Pila.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
           else{
                   if(pos==0){
                   addAtBeginning(nuevo);
                   }else{
                   int iCont = 0;
                   Nodo temp= inicio;
                   while(iCont<(pos -1)){
                   temp = temp.getSiguiente();
                   iCont ++;
                   }
                   nuevo.setSiguiente(temp.getSiguiente());
                   temp.setSiguiente(nuevo);
                   }
                   }
    }
    public void clear(){
        inicio = null;
        fin = null;
    } 
    public void deleteAt(int pos){
        //OMITIMOS LA VERIFICACION
        //BORRAR LA PRIMERA
        int iTama = size();
        if(isEmpty()){
            try {
                throw new Exception("La lista está vacía");
            } catch (Exception ex) {
                Logger.getLogger(Pila.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if((pos<0)||(pos>=iTama)){
           try {
               throw new Exception("La posición es inválida");
           } catch (Exception ex) {
               Logger.getLogger(Pila.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        if(iTama == 1){ //SOLO HAY UNO)
            clear();
        }else{ //MUCHOS NODOS
            if (pos == 0){ //
                inicio = inicio.getSiguiente();
            }else{
                int iCont = 0;
                   Nodo temp= inicio;
                   while(iCont<(pos -1)){
                   temp = temp.getSiguiente();
                   iCont ++;
            }
                   temp.setSiguiente(temp.getSiguiente().getSiguiente());
                   if(pos == (iTama - 1)){
                       fin = temp;
                   }
            }
        }
    }
    public int findAt(int pos){
        //VERIFICAR
        int iCont = 0;
        Nodo temp= inicio;
         while(iCont<(pos -1)){
          temp = temp.getSiguiente();
           iCont ++;
         }
         return temp.getValor();
    }
    //La cima es el inicio de la lista
    //Agregar nodo en la cima
    public void push(Nodo nuevo){
        addAtBeginning(nuevo); 
    }
    public int peek(){
            return findAt(0);
    }
    //Lee y quita el nodo en la cima
    public int pop(){
        int iResu = findAt(0);
        deleteAt(0);
        return iResu;
    }
}



