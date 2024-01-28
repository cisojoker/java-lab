import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter the numerator");
            int num=sc.nextInt();
            System.out.println("enter the denominator");
            int den=sc.nextInt();
            if(num<0 ||den<=0){
                throw new ArithmeticException("negative number or division by 0");
            }
            double res=num/den;
            System.out.println("result is :"+res);
        }
        catch(ArithmeticException a){
            System.out.println("Exception: "+a.getMessage());
        }
        catch(Exception e){
            System.out.println("invalid input message");
        }
    }
}
