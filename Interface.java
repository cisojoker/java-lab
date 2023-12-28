import java.util.*;
interface compute{
    double convert(double val);
}
class gbconvert implements compute{
    public double convert(double val){
        return (val/1000000);
    }
}
class euroconvert implements compute{
    public double convert(double val){
        return val*90.00;
    }
}
class Main{
    public static void main(String[] args){
        compute c1=new gbconvert();
        compute c2=new euroconvert();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value you want to conver to gb");
        double a=sc.nextDouble();
        double b=c1.convert(a);
        System.out.println(a+" value in gb is "+b);
        
       System.out.println("enter the value you want to conver to euro");
        double aa=sc.nextDouble();
        double bb=c2.convert(aa);
        System.out.println(aa+" value in euro is "+bb);
        sc.close();
    }
}
