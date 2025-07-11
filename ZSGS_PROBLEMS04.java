import java.util.Arrays;

public class ZSGS_PROBLEMS04{
    public static void main(String[] args){
   System.out.print("Question 31 to 40 problems.");
    }
}

//31.Oddposition
class OddPosition{
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6};
    int sum=0;
    for(int i=1; i<arr.length; i+=2){
     sum = sum+arr[i];
    }
    System.out.print(sum);
}
}

//32.SecondLargestNumber
class SecondLargestNumber{
    public static void main(String[] args){
    int[] num = {1,3,5,12,8,6,2};
     int max1, max2;
     if (num[0] > num[1]) {
        max1 = num[0];
        max2 = num[1];
    } 
     else {
       max1 = num[1];
       max2 = num[0];
    }
     for (int i = 2; i < num.length; i++) {
      if (num[i] > max1) {
       max2 = max1;
       max1 = num[i];
    }     
    else if (num[i] > max2 && num[i] < max1) {
     max2 = num[i];
    }
    }
    System.out.println("Second Largest Element in an Array: " + max2);
    }
}

//33.SecondSmallestNumber
class SecondSmallestNumber{
 public static void main(String[] args){
  int[] num = {1,3,5,12,8,6,2};
     int min1, min2;
     if (num[0] < num[1]) {
        min1 = num[0];
        min2 = num[1];
    } 
     else {
       min1 = num[1];
       min2 = num[0];
    }
     for (int i = 2; i < num.length; i++) {
      if (num[i] < min1) {
       min2 = min1;
       min1 = num[i];
    }     
    else if (num[i] < min2 && num[i] > min1) {
     min2 = num[i];
    }
    }
    System.out.println("Second Smallest Element in an Array: " + min2);
    }
}  

//34.PresentNumber
 class PresentNumber{
    public static void main(String[] args){
    int[] arr={1,2,8,9,4,7};
    System.out.println("PresentNumber:"+arr.length);
    }
}

//35.AnotherArray
 class AnotherArray{
    public static void main(String[] args) {
     int[] arr1={0,1,2,3,4};
     int[] arr2= new int[arr1.length];

     for(int i=0;i<arr1.length;i++){
        arr2[i]=arr1[i];
     }

     System.out.println(Arrays.toString(arr2));
    }
}

//36 FrequencyElement
class FrequencyElement {
public static void main(String[] args) {
     int[] arr = {1, 3, 1, 2, 3, 4};
     int visited = -1;
    for (int i = 0; i < arr.length; i++) {
     if (arr[i] == visited) {
     continue;
 }
     int count = 1;
    for (int j = i + 1; j < arr.length; j++) {
     if (arr[i] == arr[j]) {
     count++;
      arr[j] = visited; 
}
 }
    System.out.println(arr[i] + " -> " + count);
    }
}
}


//37.ReverseNumber
class ReverseNumber{
  public static int reverseNum(int n){
   int reverse=0;
   while(n!=0){
    int mod=n%10;
     reverse=reverse*10+mod;
     n=n/10;
}
  return reverse;
}
public static void main(String[] args) {
    System.out.println(reverseNum(12345));
}
}

//38 DeleteArray
class DeleteArray{
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int deletevalue=4;
    int indexTodelete=-1;
    for(int i=0;i<arr.length;i++){
    if(arr[i]==deletevalue){
        indexTodelete=i;
        break;
    }
}
    if(indexTodelete!=-1){
        for(int i=indexTodelete; i<arr.length-1;i++){
        arr[i]=arr[i+1];
     }
     System.out.print("Arrays to delete"+deletevalue);
     for(int i=0;i<arr.length-1;i++){
        System.out.println(arr[i]+"");
     }
     
    }
}
}

//39 AverageArray
class AverageArray{
    public static void main(String[] args){
   int[] arr={10,20,30,40,50,60};
   int sum=0;
   for(int i=0; i<arr.length; i++){
    sum=sum+arr[i];
   }
   double average=(double) sum/arr.length;
   System.out.println("Average" +average);
}
}

//40 InverseArray
class InverseArray{
    public static void main(String[] args) {
     int[] arr={2,4,6,8,10};
     int[] inverse=new int[arr.length];
     for(int i=0; i<arr.length; i++){
        inverse[i]=arr[arr.length-1-i];
    }
    System.out.println(Arrays.toString(inverse));
}
}





