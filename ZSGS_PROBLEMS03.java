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

   final class FinalClass {
    void display() {
        System.out.println("Inside final class");
    }
}

class Demo {
    final int number = 10;

    final void show() {
        System.out.println("Final Method Number = " + number);
    }
}

class FinalKeywordShortDemo {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.display();

        Demo obj2 = new Demo();
        obj2.show();
    }
}
 

//26 TwoSortedArray

   class MergeAndRepeatArray {
    public static void main(String[] args) {
      int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
      int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
      int[] merged = new int[arr1.length + arr2.length];
      int i = 0, j = 0, index = 0;
       System.out.print("Repeated elements: ");
        boolean first = true;
      while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
        if (index == 0 || merged[index - 1] != arr1[i]) {
          merged[index++] = arr1[i];
    }
         i++;
     } 
        else if (arr1[i] > arr2[j]) {
            if (index == 0 || merged[index - 1] != arr2[j]) {
              merged[index++] = arr2[j];
    }
            j++;
        } 
        else {
           if (!first) System.out.print(", ");
            System.out.print(arr1[i]);
             first = false;
             
           if (index == 0 || merged[index - 1] != arr1[i]) {
              merged[index++] = arr1[i];
        }
             i++;
             j++;
    }
     }
        while (i < arr1.length) {
            if (index == 0 || merged[index - 1] != arr1[i]) {
               merged[index++] = arr1[i];
     }
            i++;
        }

        while (j < arr2.length) {
            if (index == 0 || merged[index - 1] != arr2[j]) {
              merged[index++] = arr2[j];
    }
            j++;
        }

        int[] newArray = Arrays.copyOf(merged, index);
        System.out.println("\n Merged Array: " + Arrays.toString(newArray));
    }
}



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