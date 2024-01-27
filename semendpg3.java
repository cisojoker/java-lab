import java.util.*;
class complex{
    private double real;
    private double imaginary;
    
    complex(double r,double i){
        real=r;
        imaginary=i;
    }
    
    public complex add(complex x){
        double re=this.real+x.real;
        double im=this.imaginary+x.imaginary;
        return new complex(re,im);
    }
      public complex sub(complex x){
        double re=this.real-x.real;
        double im=this.imaginary-x.imaginary;
        return new complex(re,im);
    }
    public boolean compare(complex x){
        return this.real==x.real && this.imaginary==x.imaginary;
    }
     public void increment(){
        this.real++;
        this.imaginary++;
    }
     public void decrement(){
        this.real--;
        this.imaginary--;
    }
    public void display(){
        System.out.println("complex number is");
        System.out.println(this.real+"+"+this.imaginary+"i");
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of first Complex Number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        System.out.print("Enter the real and imaginary part of second Complex Number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        
        complex a=new complex(r1,i1);
        complex b=new complex(r2,i2);
        System.out.println("The two complex numbers are: ");
        a.display();
        b.display();
        System.out.println("The addition: ");
        complex res1=a.add(b);
        res1.display();
        System.out.println("The subtraction: ");
        complex res2=a.sub(b);
        res2.display();
        System.out.println("checking for equality: ");
        if(a.compare(b)==true){
            System.out.println("both complex number are equal");
        }else{
            System.out.println("not equal");
        }
        
        System.out.println("The Incrementation first number is: ");
        a.increment();
        a.display();
       System.out.println("The Decrementation second number is: ");
        b.decrement();
        b.display();
    }
}
