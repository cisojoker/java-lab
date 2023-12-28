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
    public static void mergesort(int[] array1){
        if(array1.length==1)return;
        int mid=array1.length/2;
        int[] left=new int[mid];
        int[] right=new int[array1.length-mid];
        
        System.arraycopy(array1,0,left,0,mid);
        System.arraycopy(array1,mid,right,0,array1.length-mid);
        
        mergesort(left);
        mergesort(right);
        merge(array1,left,right);
    }
    public static void merge(int[] array,int[] left,int[] right){
        int i=0;int j=0;int k=0;
        while(i<left.length &&j<right.length ){
            if(left[i]>right[j]){
                array[k++]=right[j++];
            }
            else{
                array[k++]=left[i++];
            }
        }
        while(i<left.length){
            array[k++]=left[i++];
        }
        while(j<right.length){
            array[k++]=right[j++];
        }
    }
    public static void sorr(){
        
        int[] array1 = {2,4,3,1 };
        //  for(int i=0;i<array1.length;i++){
        //   System.out.println(array1[i]+" ");
        // }
        // int n=array1.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(array1[j+1]<array1[j]){
        //               int temp = array1[j];
        //             array1[j] = array1[j + 1];
        //             array1[j + 1] = temp;
        //         }
        //     }
        // }
        mergesort(array1);
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
