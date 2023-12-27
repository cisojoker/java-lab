import java.util.*;
class complex{
    private double real;
    private double imaginary;
    
    public complex(double r,double im){
        real=r;
        imaginary=im;
    }
    public complex add(complex x){
        double t1=this.real+x.real;
        double t=this.imaginary+x.imaginary;
        return new complex(t1,t);
    }
      public complex sub(complex x){
        double t1=this.real-x.real;
        double t=this.imaginary-x.imaginary;
        return new complex(t1,t);
    }
    public void increment(){
        this.real++;
        this.imaginary++;
    }
     public void decrement(){
        this.real--;
        this.imaginary--;
    }
    
    public boolean isEqual(complex x){
        return this.real==x.real && this.imaginary==x.imaginary;
    }
    public void display(){
        System.out.println("complex number is");
        System.out.println(this.real+"+i"+this.imaginary);
        System.out.println();
    }
}
    
public class Encapsulation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of first Complex Number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        System.out.print("Enter the real and imaginary part of second Complex Number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        
        complex c1=new complex(r1,i1);
        complex c2=new complex(r2,i2);
          
        System.out.println("The two complex numbers are: ");
        c1.display();
        c2.display();
        System.out.println("The addition: ");
        complex c3=c1.add(c2);
        c3.display();
        System.out.println("The subtraction: ");
        complex c4=c1.sub(c2);
        c4.display();
        System.out.println("The equality: ");
        boolean flag=c1.isEqual(c2);
        if(flag==true)System.out.println("equal");
        else System.out.println("not equal");
        System.out.println("The Incrementation first number is: ");
        c1.increment();
        c1.display();
       System.out.println("The Decrementation second number is: ");
        c2.decrement();
        c2.display();
    }
}
      
