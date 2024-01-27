import java.util.*;
public class Main{
    
    public void compare(String s1,String s2){
        if(s1.compareTo(s2)==1)System.out.println("equal");
        else System.out.println("not equal");
    }
    public void compare(String s1,String s2,int n){
        int flag=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                flag=1;
                break;
            }
        }
        if(flag==0){
             System.out.println("The 2 strings are same upto "+n+" characters");
        }
        else{
            System.out.println("The 2 strings are not same upto "+n+" characters"); 
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main ob = new Main();
        System.out.println("enter the first string");
        String a=sc.nextLine();
        System.out.println("enter the second string");
        String b=sc.nextLine();
        ob.compare(a,b);
        System.out.print("Enter the number of characters to compare: ");
        int n = sc.nextInt();
        ob.compare(a,b,n);

    }
}
