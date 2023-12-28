import java.util.*;
public class Main 
{
    public void compare(String s1, String s2)
    {
       if(s1.compareTo(s2)==0)System.out.println("equal");
       else System.out.println("not equal");
    }
    public void compare(String s1, String s2, int n)
    {
        int flag = 0;
        for(int i=0; i<n; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                flag = 1;
        }
        if (flag == 0)
            System.out.println("The 2 strings are same upto "+n+" characters");
        else
            System.out.println("The 2 strings are not same upto "+n+" characters");            
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Main obj1 = new Main();
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        obj1.compare(s1,s2);
        System.out.print("Enter the number of characters to compare: ");
        int n = sc.nextInt();
        obj1.compare(s1,s2,n);
        sc.close();
    }
}
