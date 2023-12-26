import java.util.*;
public class Main
{
    public static void area(){
        double l,b;
        Scanner sc=new Scanner(System.in);
                System.out.println("enter the length and breadth ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("area is :"+(l*b));
    }
    public static void mularray(){
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] result=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            result[i]=array1[i]*array2[i];
        }
        for(int i=0;i<array2.length;i++){
            System.out.println(result[i]);
        }

    }
    public static void sorr(){
        
        int[] array1 = {2,4,3,1 };
         for(int i=0;i<array1.length;i++){
           System.out.println(array1[i]+" ");
        }
        int n=array1.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array1[j+1]<array1[j]){
                      int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array in ascending order" +"\n");
           for(int i=0;i<array1.length;i++){
           System.out.print(array1[i]+" ");
        }
         System.out.print("\n sorted array in descendingorder" +"\n");
           for(int i=array1.length-1;i>=0;i--){
           System.out.print(array1[i]+" ");
        }
    }
	public static void main(String[] args) {
	  area();
	  mularray();
	  sorr();
	}
}
