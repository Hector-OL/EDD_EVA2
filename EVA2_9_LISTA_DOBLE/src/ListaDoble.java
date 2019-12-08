
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble() {
        this.inicio = null;
        this.inicio = null;
    }
    public boolean isEmpty(){
        if(inicio==null)
            return true;
        else
            return false;
    }
    //AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //LISTA VACIA
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo); //HACIA ADELANTE
            nuevo.setPrevio(fin); //HACIA ATRAS
            fin=nuevo;
            
            
        }
    }
    public void print(){
        Nodo temp = inicio;
        while (temp!=null){
            System.out.print(temp.getValor()+" - ");
            temp= temp.getSiguiente();
        }
        System.out.println("");
    }
    public void printBackwards(){
        Nodo temp = fin;
        while (temp!=null){
            System.out.print(temp.getValor()+" - ");
            temp= temp.getPrevio();
        }
        System.out.println("");
    }
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
    
    public void clear(){
        inicio = null;
        fin = null;
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
    
    public void insertAt(int pos, Nodo nuevo){
        //movernos hasta la pos - 1
       int iTama = size();
       if((pos<0)||(pos>=iTama)){
           try {
               throw new Exception("La posición es inválida");
           } catch (Exception ex) {
               Logger.getLogger(ListaDoble.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void deleteAt(int pos){
        //OMITIMOS LA VERIFICACION
        //BORRAR LA PRIMERA
        int iTama = size();
        if(isEmpty()){
            try {
                throw new Exception("La lista está vacía");
            } catch (Exception ex) {
                Logger.getLogger(ListaDoble.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if((pos<0)||(pos>=iTama)){
           try {
               throw new Exception("La posición es inválida");
           } catch (Exception ex) {
               Logger.getLogger(ListaDoble.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
    
}
