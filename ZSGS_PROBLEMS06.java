 import java.util.ArrayList;
import java.util.Arrays;
   import java.util.Collections;
import java.util.Scanner;

public class ZSGS_PROBLEMS06{
    public static void main(String[] args){
   System.out.print("Question 51 to 60 problems.");
    }
}


//51 DescendingToAscending
  class DescendingToAscending01{
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        int n = arr.length;
        int oddSize = (n + 1) / 2;
        int evenSize = n / 2;
        int[] odd = new int[oddSize];
        int[] even = new int[evenSize];

        int o = 0, e = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) odd[o++] = arr[i];
            else even[e++] = arr[i];
        }

        Arrays.sort(odd);        
        Arrays.sort(even);             

        o = oddSize - 1;    
        e = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (i % 2 == 0) ? odd[o--] : even[e++];
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }
}

class DescendingToAscending02{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int oddSize = (n + 1) / 2;
        int evenSize = n / 2;
        int[] odd = new int[oddSize];
        int[] even = new int[evenSize];

        int o = 0, e = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) odd[o++] = arr[i];
            else even[e++] = arr[i];
        }

        Arrays.sort(odd);        
        Arrays.sort(even);             

        o = oddSize - 1;    
        e = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = (i % 2 == 0) ? odd[o--] : even[e++];
        }

        System.out.println("Output: " + Arrays.toString(arr));
    }
}

//52 StarPattern
 class StarPattern{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        if (i == 0 || i == n - 1){
         System.out.print("    "); 
    for (int j = 0; j < n; j++) {
         System.out.print("*");
    }
    }  
       else if (i == 1) {
        System.out.print("    "); 
        System.out.print("*");
    }  
       else {
        System.out.print("  "); 
        System.out.print("*");
    }
        System.out.println();
     }
    }
}

//53 PyramidNumber
 class PyramidNumber{
    public static void main(String[] args){
        int n = 4;
        int num =1; 
        for (int i = 1; i <= n; i++) {
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++){
         System.out.print( " "+num);
         num++;
        
    }
        System.out.println();
        }
    }
}

//54OddLength
class OddLength{
    public static void main(String[] args){
        String num = "12345";
        int n=num.length();

        for (int i=0; i < n; i++) {
         for (int j=0; j < n; j++) {
        if (j==i|| j==n-1 - i) {
          System.out.print(num.charAt(j));
    }   
        else {
           System.out.print(" ");
    }
    }
        System.out.println();
     }
    }
}

 //55FollowingPattern
 class FollowingPattern{
    public static void main(String[] args){
        int n=4;
        int size=2*n-1;

        for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
          int top=i;
          int bottom=size-1-i;
          int left=j;
          int right=size-1-j;
          int min=top;
            if(bottom<min) min=bottom;
            else if(left<min) min=left;
             else if(right<min) min=right;
               System.out.print(n-min);
    }
             System.out.println();
        }
    }
}
    
 

//56SubString
 class SubString{
    public static void main(String[] args){
    char[] string={'A','B','C'};
    int n=string.length;
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            for(int k=i; k<=j; k++){
            System.out.print(string[k]);
    }
    System.out.println();
}
    }
}
 }

 //57MismatchedArray
 class MismatchedArray{
     public static void main(String[] args){
     char[] arr1={'a','b','c','d','e','f','g','h','i'};
     char[] arr2={'a','b','d','e','e','g','g','i','i'};

     System.out.print("Mismatched Elements:");
     for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            System.out.print(arr1[i]+"");
        }
    }
}
 }

//58 NumberOfDigits
  class NumberOfDigits {
    public static void main(String[] args) {
        int[] num1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] num2 = {7, 8, 4, 6, 2, 1, 9, 9, 7}; 
        ArrayList<Integer> result = new ArrayList<>();
        int i = num1.length - 1;
        int j = num2.length - 1;
        int carry = 0;
     while (i >= 0 || j >= 0 || carry != 0) {
        int digit1 = (i >= 0) ? num1[i] : 0;
         int digit2 = (j >= 0) ? num2[j] : 0;
          int sum = digit1 + digit2 + carry;
           result.add(sum % 10);
           carry = sum / 10;
            i--;
            j--;
        }

        Collections.reverse(result);
        for (int digit : result) {
            System.out.print(digit);
        }
    }
}

//59FormatProblem
  
class FormatProblem{
    public static void main(String[] args) {
        int rows = 2; 
        int cols = 2; 
      for (int i = 0; i < rows; i++) {
         System.out.print("+");
      for (int j = 0; j < cols; j++) {
         System.out.print("===+");
    }
         System.out.println();
       for (int r = 0; r < 3; r++) {
          System.out.print("|");
       for (int j = 0; j < cols; j++) {
           System.out.print("   |");
    }
           System.out.println();
    }
}
          System.out.print("+");
        for (int j = 0; j < cols; j++) {
            System.out.print("===+");
    }
          System.out.println();
    }
}


//60SavaSubString
class SaveSubString {
    public static void searchSubstring(char[][] grid, String target) {
      int rows = grid.length;
      int cols = grid[0].length;
        for (int i=0;i<rows;i++) {
         for (int j=0;j<cols;j++) {
        if (j+target.length() <= cols) {
            boolean found = true;
        for (int k=0; k<target.length();k++) {
         if (grid[i][j + k] != target.charAt(k)) {
             found = false;
            break;
        }
    }
         if (found) {
            System.out.println("<" + i + "," + j + ">");
            System.out.println("<" + i + "," + (j + target.length() - 1) + ">");
     }
     }
         if (i+target.length() <= rows) {
            boolean found = true;
         for (int k = 0; k < target.length(); k++) {
            if (grid[i + k][j] != target.charAt(k)) {
               found = false;
               break;
     }
    }
      if (found) {
        System.out.println("<" + i + "," + j + ">");
         System.out.println("<" + (i + target.length() - 1) + "," + j + ">");
     }
     }
     }
    }
    }

    public static void main(String[] args) {
      char[][] grid = {{'W', 'E', 'L', 'C', 'O', 'M', 'E', 'T', 'O', 'Z', 'O', 'H', 'O', 'C', 'O', 'R', 'P', 'O', 'R', 'A', 'T', 'I', 'O', 'N'}
        };
        String target = "TOO";
        searchSubstring(grid, target);
    }
}
   