public class Principal {

    public static void main(String[] args) {
        System.out.println(Fibi(8));
    }
    public static int Fibi(int iPos){
  if(iPos==0){
      return 0;
  }else if(iPos==1){
      return 1;
  }else{
      return Fibi(iPos-1) + Fibi(iPos-2);
  }
    
    }
}
