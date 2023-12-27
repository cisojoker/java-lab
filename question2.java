import java.util.*;
class empdetails{
    public String name,eid,dept,desi;
    public int age,salary;
    
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        name=sc.nextLine();
        System.out.println("enter the eid");
        eid=sc.nextLine();
        System.out.println("enter the dept");
        dept=sc.nextLine();
        System.out.println("enter the desi");
        desi=sc.nextLine();
        System.out.println("enter the age");
        age=sc.nextInt();
        System.out.println("enter the salary");
        salary=sc.nextInt();
    }
    public void display(){
         System.out.println(" name: "+name);
          System.out.println(" eid: "+eid);
           System.out.println(" dept: "+dept);
            System.out.println(" desi: "+desi);
             System.out.println(" age: "+age);
              System.out.println(" salary: "+salary);
    }
}
public class Main{
    public static void main(String[] args){
    empdetails[] emp=new empdetails[5];
    for(int i=0;i<5;i++){
        emp[i]=new empdetails();
        emp[i].getdata();
    }
    System.out.println("Detail of employee are::");
    for(int i=0;i<5;i++){
        emp[i].display();
        System.out.println();
    }int sum=0;
    for(int i=0;i<5;i++){
        if(emp[i].dept.compareTo("sales")==0){
            sum+=emp[i].salary;
        }
    }
    System.out.println("salary sales"+sum);
    int index=0;int maxi=0;
    for(int i=0;i<5;i++){
        if(emp[i].desi.compareTo("manager")==0 && emp[i].dept.compareTo("purchase")==0){
            if(maxi<emp[i].salary){
                index=i;
                maxi=emp[i].salary;
            }
        }
    }
    if(maxi==0)System.out.println("does'nt exist");
    else {
    System.out.println("highest paid manager of purchaase department");
    emp[index].display();
    }
  }
}
