import java.util.*;
public class Main{
    public static void rootquad(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a,b,c values:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double D=(b*b)-(4*a*c);
        
        if(D==0){
            double root=-b/(2*a);
            System.out.println("roots:");
            System.out.println(root);
            System.out.println(root);
        }
        else if(D>0){
            double root1=(-b+Math.sqrt(D))/(2*a);
            double root2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("roots:");
            System.out.println(root1);
            System.out.println(root2);
        }
        else{
            double real=-b/(2*a);
            double imag=(Math.sqrt(-D))/(2*a);
            System.out.println("roots:");
            System.out.println(real+"+"+imag+"i");
            System.out.println(real+"-"+imag+"i");
        }
    }
    public static void matrixmul(){
        int[] array1={1,2,3,4,5,6};
        int[] array2={6,5,4,3,2,1};
        int[] result=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            result[i]=array1[i]*array2[i];
            System.out.println(result[i]);
        }
    }
    public static void sorr(){
        int[] arr={6,9,5,2,3,4,6};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
          for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        matrixmul();
        sorr();
        rootquad();
    }
}

///maodification 
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
