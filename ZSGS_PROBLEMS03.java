import java.util.Arrays;
import java.util.Scanner;
 //ZSGS_PROBLEMS03
 public class ZSGS_PROBLEMS03{
    public static void main(String[] args){
   System.out.print("Question 21 to 30 problems.");
    }
}

//21.EvaluteSum01
  class EvaluteSum01{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the x value is:");
    int x=sc.nextInt();
    int result= ++x*2+3*-x;
    System.out.print(result);
    }
}
//22.EvaluteSum02
class EvaluteSum02{
    public static void main(String[] args){
        int y=10;
        int z=++y*(y++ +5);
        System.out.print(z);
    }
}

//24.EvaluteSum03
class EvaluteSum03{
public static void main(String[] args){
    int x=5;
    int resultx1= ++x - x++ + -x;
    System.out.print(resultx1);
}
}

//25.FinalKeyword

//class FinalKeyword{
   // public static void main(String[] args){
    //    final int x=10; 
     //   x=4;
      // System.out.println(x);
  //  }
//} 

//26 TwoSortedArray

// class TwoSortedArray{
//     public static void main(String[] args){
//     int[] array1={2,4,5,6,7,8,9,10,13};
//     int[] array2={2,3,4,5,6,7,8,9,11,15};
//     int[] array3= new int[array1.length+array2.length];

//     for(int i=0;i<array1.length-1;i++){
//         array3[i++]=array1[i];
//     }
//     for(int i=0;i<array2.length-1;i++){
//         array3[i++]=array2[i];
//     }
//     System.out.println(Arrays.toString(array3));
// }
// }


//27MultidimensionalArray
  class MutidimensionalArray{
    public static void main(String[] args){
    int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
    int n=arr.length;
     for(int i=0; i<n; i++){
     for(int j=i; j<n; j++){
      int temp=arr[i][j];
      arr[i][j]=arr[j][i];
      arr[j][i]=temp;
     }
    }
    System.out.print("transpose maitax.");
    for(int i=0;i<n;i++){
     for(int j=0; j<n/2; j++){
      int temp=arr[i][j];
      arr[i][j]=arr[i][n-1-j];
     arr[i][n-1-j]=temp;
     }
    }
    System.out.print("Rotated matrix 90 degrees.");
    for(int i=0; i<n; i++){
    System.out.print(Arrays.toString(arr[i]));
    }
    
    }
}

//28.Arraysorted

class Arraysorted{
public static void main(String[] args){
    int[]arr={2,1,3,7,5,6,4};
    int n=arr.length;
    Arrays.sort(arr);
    int[]result= new int[n];
    int i=0;
    int end=n-1;
    int start=0;
    while(start <= end){
        if(i<n){
        result[i++]=arr[start++];
        }
        if(i<n){
        result[i++]=arr[end--];
        }
    
System.out.println("Arrays.sorted:" + Arrays.toString(result));
        }

}
}

//29.FactorialReverseNumber
class FactorialReverseNumber{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number.");
    int num=sc.nextInt();
    int fact=1;
    for(int i=1; i<num; i++){
        fact=fact*i;
    int temp=fact;
    int reverse=0;
    while(temp>0){
        int digit=temp%10;
        reverse=reverse*10+digit;
        temp=temp/10;
    }
    System.out.println(reverse);
}
    }
}

//30.EvenPosition
class EvenPosition{
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6};
    int sum=0;
    for(int i=0; i<arr.length; i+=2){
     sum = sum+arr[i];
    }
    System.out.print(sum);
}
}