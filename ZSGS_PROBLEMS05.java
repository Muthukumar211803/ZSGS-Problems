import java.util.Scanner;
 
public class ZSGS_PROBLEMS05{
    public static void main(String[] args){
   System.out.print("Question 41 to 50 problems.");
    }
}

//41.PyramidPattern1
 class PyramidPattern1{
    public static void main(String[] args){
        int n=9;
        for(int i=1;i<=n; i++){
         for(int j=n; j>=i; j--){
         System.out.print(" ");
         }
         for(int j=1; j<=i; j++){
            System.out.print(i+" ");
         }
         System.out.println();
        }
    }
}

//42 PyramidPattern2
 class PyramidPattern2{
    public static void main(String[] args) {
        int n=9;
        for(int i=1; i<=n; i++){
          for(int j=n; j>=i; j--){
            System.out.print(" ");
          }
         for(int j=1; j<=i;j++){
         System.out.print(j+" ");
         }
         System.out.println();
        }
    }
}

//43 PyramidPattern3
class PyramidPattern3{
    public static void main(String[] args) {
        int n=9;
      for(int i=1; i<=n; i++){
        for(int j=n; j>=i; j--){
         System.out.print(" ");
        }
        for(int j=1;j<=i; j++){
        System.out.print(" *");
        }
        System.out.println();
    }
}
}

//44 Alphabitpattern1
class Alphabitpattern1{
    public static void main(String[] args) {
       char ch='A';
       for(int i=1; i<=5;i++){
        for(int j=5; j>=i; j--){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
    }
            System.out.println();
         ch++;
    
      }
        ch='D';
      for(int i=4; i>=1; i--){
        for(int j=5; j>=i+1; j--){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
        System.out.print(ch + " ");
        }
        System.out.println();
        ch--;

        }
    }
}

//Alphabatpattern2
class Alphabatpattern2{
    public static void main(String[] args) {
        char ch='A';
        for(int i=1; i<=3; i++){
            for(int j=3; j>=i; j--){
            System.out.print(" ");
         }
            for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
        }
        System.out.println();
        ch++;
    }
         ch='B';
      for(int i=2; i>=1; i--){
        for(int j=3; j>=i; j--){
            System.out.print(" ");
        }
        for(int j=1;j<=i; j++){
        System.out.print(ch+" ");
        }
        System.out.println();
        ch--;
    }
}
}
  
//45 StringOddlength
class StringOddlegth{
    public static void main(String[] args) {
        String input = "12345"; 
        int length = input.length();
        int mid = 5; 

         for (int i = 0; i < length; i++) {
          for (int j = 0; j < length; j++) {
            if (j == mid - i || j == mid + i) {
             System.out.print(input.charAt(j));
        } 
           else {
             System.out.print(" ");
         }
        }
          System.out.println();
        }
    }
}
 
//46 OddNumberRange
  class OddNumberRange{
    public static void main(String[] args){
        int start = 2;
        int end = 15;
         System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i < end; i++) {
          if (i % 2 != 0) {
             System.out.print(i + " ");
            }
        }
    }
}

//47 LetterCharactor

   class LetterCharactor1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char end = sc.next().charAt(0);

        if (end < 'A' || end > 'Z') {
            System.out.println("Please enter a valid uppercase letter (A-Z).");
            return;
        }

        System.out.println("Letters from A to " + end + ":");
        for (char ch = 'A'; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
    }
}

 class LetterCharactor2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char end = sc.next().charAt(0);

        if (end < 'A' || end > 'Z') {
            System.out.println("Please enter a valid uppercase letter (A-Z).");
            return;
        }

        System.out.println("Letters from A to " + end + ":");
        for (char ch = 'A'; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
    }
}

//48 SumReverseNumber
 class SumReverseNumber1{
     public static void main(String[] args) {
      int num=12345;
      int reverseNumber=reverseNumber(num);
      int sum=num+reverseNumber;
       System.out.println(num+"+" + reverseNumber+ "=" +sum);
     }
     public static int reverseNumber(int num){
        int reversed=0;
        while(num>0){
            reversed=reversed*10+num%10;
            num=num/10;
        } 
        return  reversed;     
    }
}
    
class SumReverseNumber2{
     public static void main(String[] args) {
      int num=543;
      int reverseNumber=reverseNumber(num);
      int sum=num+reverseNumber;
       System.out.println(num+"+" + reverseNumber+ "=" +sum);
     }
     public static int reverseNumber(int num){
        int reversed=0;
        while(num>0){
            reversed=reversed*10+num%10;
            num=num/10;
        } 
        return  reversed;     
    }
}

//49 RecurisionReverse
  class RecurisionReverse1{
    public static void main(String[] args){
        String input="one,two,three";
        String[] words=input.split(",");
        String reversed=reverse(words,0);
        System.out.println("Reversed output:"+ reversed);

    }
     public static String reverse(String[]words,int index){
        if(index==words.length-1){
            return words[index];
        }
        return reverse(words,index+1)+","+ words[index];
    }
}

class RecurisionReverse2{
    public static void main(String[] args){
        String input="i ,love, india";
        String[] words=input.split(",");
        String reversed=reverse(words,0);
        System.out.println("Reversed output:"+ reversed);

    }
     public static String reverse(String[]words,int index){
        if(index==words.length-1){
            return words[index];
        }
        return reverse(words,index+1)+","+ words[index];
    }
}

//50 NumberToWords
  public class ShortNumberToWords {
    static String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                             "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", 
                            "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberToWords(n));
    }

    static String numberToWords(int n) {
        if (n == 0) return "Zero";

        StringBuilder sb = new StringBuilder();

        if (n >= 100) {
            sb.append(units[n / 100]).append(" Hundred");
            if (n % 100 != 0) sb.append(" and ");
        }

        n %= 100;

        if (n >= 10 && n < 20) {
            sb.append(teens[n - 10]);
        } 
        else {
            if (n >= 20) sb.append(tens[n / 10]);
            if (n % 10 != 0) {
              if (n >= 20) sb.append(" ");
               sb.append(units[n % 10]);
        }
    }

        return sb.toString();
    }
}



    



    



   



