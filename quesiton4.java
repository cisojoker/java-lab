import java.util.*;
class bank{
    public String name,acno;
    public double bal,intamt,intrate,year;
    public void getdata(){
        System.out.println("enter the name");
        Scanner sc =new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("enter the acno");
        acno=sc.nextLine();
        System.out.println("enter the bal");
        bal=sc.nextDouble();
        System.out.println("enter the year");
        year=sc.nextDouble();
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("acno: "+acno);
        System.out.println("bal: "+bal);
        System.out.println("year: "+year);
    }
    public void interest(){
        intrate=0;
        intamt=0;
    }
}
class sbi extends bank{
    public void interest(){
        intrate=0.05;
        intamt=bal*intrate;
        System.out.println("intrate"+intrate);
        System.out.println("intamt: "+intamt);
    }
}
class citi extends bank{
    public void interest(){
        intrate=0.09;
        intamt=bal*intrate;
        System.out.println("intrate"+intrate);
        System.out.println("intamt: "+intamt);
    }
}
class canara extends bank{
    public void interest(){
        intrate=0.06;
        intamt=bal*intrate;
        System.out.println("intrate"+intrate);
        System.out.println("intamt: "+intamt);
    }
}
public class Main{
public static void main(String[] args){
    
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter the number of persons");
        n=sc.nextInt();
        sbi[] b1=new sbi[n];
        citi[] b2=new citi[n];
        canara[] b3=new canara[n];
        System.out.println("Enter the detail for sbi customer");
        for(int i=0;i<n;i++){
            b1[i]=new sbi();
            b1[i].getdata();
            b1[i].display();
            b1[i].interest();
        }
        System.out.println("Enter the detail for citi customer");
        for(int i=0;i<n;i++){
            b2[i]=new citi();
            b2[i].getdata();
            b2[i].display();
            b2[i].interest();
        }
        System.out.println("Enter the detail for canara customer");
        for(int i=0;i<n;i++){
            b3[i]=new canara();
            b3[i].getdata();
            b3[i].display();
            b3[i].interest();
        }
        System.out.println("enter the year for finding the highest earner in sbi bank ");
            int y=sc.nextInt();
            double maxi=-1;
            int index=0;
            for(int i=0;i<n;i++){
                if(b1[i].year==y){
                    if(b1[i].intamt>maxi){
                        maxi=b1[i].intamt;
                        index=i;
                    }
                }
            }
            if(maxi==-1){
                System.out.println("no one there");
            }
           else{ System.out.println("Details are:");
            b1[index].display();
            b1[index].interest();
           }
    }
}
