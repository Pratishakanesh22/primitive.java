import java.util.*;

public class primitive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            try{
            Long x = sc.nextLong();
System.out.println(" x + cant be fitted anywher :" );
if( x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE ){
    System.out.println("*btye");
}
if( x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
    System.out.println(" *short");
}
if(x>=Integer.MIN_VALUE && x>=Integer.MAX_VALUE){
System.out.println("*integer");
}
if(x>=Long.MAX_VALUE && x<=Long.MIN_VALUE ){
    System.out.println("*long");
}
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
            }

        

    
