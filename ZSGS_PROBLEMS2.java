//11 VowalConsonantCheck

import java.util.Scanner;

class VowalConsonantCheck{

    public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
     System.out.print("Enter the character. ");
     char ch = sc.next().charAt(0);
     if(ch>='a' && ch<='z'){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            System.out.println(ch + "is a Vowal value.");
        }
        else{
            System.out.println(ch + "is a consonant value.");
        }
    }
        else{
        System.out.println("Enter the alphabet character.");
        }
    }
}

//12.largest Number
 class LargestNumber{
    public static int findfourvalue(int a,int b,int c,int d){
        int max = a;
        if(b>max){
        max=b;
        }
        if(c>max){
        max=c;
        }
        if(d>max){
        max=d;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth number: ");
        int d = sc.nextInt();
        int largest = findfourvalue(a, b, c, d);
        System.out.println("Largest Number: "+largest);
        }
}

//14.Positive and Negative
class PositiveandNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();

    if(number>0){
        System.out.print(number +"is a positive.");
    }
    else if(number<0){
        System.out.print(number + "is a Negative.");
    }
    else{
        System.out.print(number + "is a zero.");
    }
}
}

//15.AlphabatOrNot
 



        