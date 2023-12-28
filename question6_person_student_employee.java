import java.util.*;
class person{
    public String name,gender;
    public int age;
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        name=sc.nextLine();
        System.out.println("enter the gender");
        gender=sc.nextLine();
        System.out.println("enter the age");
        age=sc.nextInt();
    }
    public void display(){
    }
}
class employee extends person{
    public String eid;
    public int salary;
    public void edata(){
        Scanner sc=new Scanner(System.in);
        getdata();
        System.out.println("enter the eid");
        eid=sc.nextLine();
        System.out.println("enter the salary");
        salary=sc.nextInt();
    }
    public void display(){
        System.out.println("enter the name: "+name);
        System.out.println("enter the genger: "+gender);
        System.out.println("enter the age: "+age);
        System.out.println("enter the eid: "+eid);
        System.out.println("enter the salary: "+salary);
        System.out.println();
    }
}
class student extends person{
    public String rno;
    public int clas;
    public void sdata(){
        Scanner sc=new Scanner(System.in);
        getdata();
        System.out.println("enter the rno");
        rno=sc.nextLine();
        System.out.println("enter the clas");
        clas=sc.nextInt();
    }
    public void display(){
        System.out.println("enter the name: "+name);
        System.out.println("enter the genger: "+gender);
        System.out.println("enter the age: "+age);
        System.out.println("enter the eid: "+rno);
        System.out.println("enter the salary: "+clas);
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        employee[] e=new employee[5];
        student[] s=new student[5];
        System.out.println("enter the employees details");
        for(int i=0;i<5;i++){
            e[i]=new employee();
            e[i].edata();
        }
        System.out.println("enter the student details");
         for(int i=0;i<5;i++){
            s[i]=new student();
            s[i].sdata();
        }
        System.out.println(" employees details");
          for(int i=0;i<5;i++){
            e[i].display();
        }
        System.out.println(" student details");
          for(int i=0;i<5;i++){
            s[i].display();
        }
    }
}
