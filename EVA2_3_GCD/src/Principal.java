public class Principal {


    public static void main(String[] args) {
        GCD(48, 180);
        
        System.out.println(maxDiv(48,180));
    }
    
    public static int maxDiv(int iVal, int iVal2){
        System.out.println(iVal+" "+" / "+iVal2);
        if (iVal2==0){
            return iVal;
        }else{
            int iResi = iVal%iVal2;
            return maxDiv(iVal2,iResi);
        }
    }
    
    public static void GCD(int iVal, int iVal2){
        if(iVal2==0){
            System.out.println(iVal);
        }else{
            GCD(iVal2, iVal % iVal2);
        }
    }
}
