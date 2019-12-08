public class Principal {


    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " +calculaFactorial(5));
    }
    public static int calculaFactorial(int iVal){
        System.out.println("Inicio " + iVal);
        //Si iVal == 0 Debemos detener la recursividad
        if(iVal == 0){
            System.out.println("Fin");
            return 1;
        }else{
            return iVal * calculaFactorial(iVal - 1);
        }
    }
    
}
