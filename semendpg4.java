import java.util.*;
 class person{
   public String name,gender;
   public int age;
    void pdata(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the name:");
        name=sc.nextLine();
        System.out.println("enter the gender:");
        gender=sc.nextLine();
        System.out.println("enter the age:");
        age=sc.nextInt();
    }
    void print(){}
}
class employee extends person{
    public String eid;
    public int salary;
    void edata(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the employee details:");
        pdata();
        System.out.println("enter the eid:");
        eid=sc.nextLine();
        System.out.println("enter the salary:");
        salary=sc.nextInt();
    }
    void print(){
        System.out.println("employee details are:");
        System.out.println("name"+name);
        System.out.println("gender"+gender);
        System.out.println("age"+age);
        System.out.println("eid"+eid);
        System.out.println("salary"+salary);
        System.out.println();
    }
}
class students extends person{
    public int rollno;
    public int marks;
    void sdata(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the students details:");
        pdata();
        System.out.println("enter the rollno:");
        rollno=sc.nextInt();
        System.out.println("enter the marks:");
        marks=sc.nextInt();
    }
    void print(){
        System.out.println("student details are:");
        System.out.println("name"+name);
        System.out.println("gender"+gender);
        System.out.println("age"+age);
        System.out.println("roll"+rollno);
        System.out.println("marks"+marks);
        System.out.println();
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number of employee and students");
        num=sc.nextInt();
        employee[] e=new employee[num];
        students[] s=new students[num];
        for(int i=0;i<num;i++){
            e[i]=new employee();e[i].edata();
            s[i]=new students();s[i].sdata();
        }
        System.out.println("details of employee:");
        for(int i=0;i<num;i++){
            e[i].print();
        }
        System.out.println("details of students:");
        for(int i=0;i<num;i++){
            s[i].print();
        }
        
    }
}
