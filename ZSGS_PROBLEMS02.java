import java.util.Scanner;

//ZSGS_PROBLEMS02
 public class ZSGS_PROBLEMS02{
    public static void main(String[] args){
   System.out.print("Question 11 to 20 problems.");
    }
}
//11 VowalConsonant
 class VowalConsonant{
    
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
 
class AlphabatOrNot{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character.");
    char ch= sc.next().charAt(0);
    if(Character.isLetter(ch)){
        System.out.println(ch+ "is a Alphabat.");
    }
    else{
        System.out.println(ch+"is a NotAlphabat.");
    }
}
}
 
//16.NaturalNumber

class NaturalNumber{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number.");
int n = sc.nextInt();
int sum =0;
for(int i=0; i<=n; i++){
 sum= sum+i;
}
System.out.print("Sum =" +sum);
 int mindigit=9;
 int temp =sum;
 while(temp>0){
    int digit= temp%10;
    if(digit < mindigit){
        mindigit= digit;
    }
    temp=temp/10;
    System.out.println("Smallest digit is the sum =" +mindigit);
}
}
}

//17 conditional operator

class ConditionalOperator{
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number to check Even or Odd.");
   int number= sc.nextInt();
   if(number%2==0){
    System.out.print("Number is Even.");
   }
   else{
    System.out.print("Number is Odd.");
   }
   System.out.print("Enter the  value a is:");
   int a =sc.nextInt();
   System.out.print("Enter the value b is:");
   int b =sc.nextInt();
    int max = (a>b)? a:b;
    System.out.println("Maximum of" +max);
}
}
//18.concentric circle
class ConcentricCircle{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the lager value of  R is:");
     double R =sc.nextDouble();
     System.out.print("Enter the smaller value of r is: ");
     double r = sc.nextDouble();
     if(R<=r){
        System.out.println("Enter the large value greaterthen is smaller value.");
     }
     else{
        double area = Math.PI*(R*R-r*r);
        System.out.println("Area of the space between the circle:"+ area);
    }
}
}

//19.EvaluateDifference
class EvaluateDifference{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the value a is:");
    int a = sc.nextInt();
    System.out.print("Enter the value b is:");
    int b = sc.nextInt();
    int result1 = ++a+--b;
    int result2 = a-- % b++;
    int result3 =a*=b+=5;
    int x =69>>>2;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(x);
    }
}

//20.Evaluate1

class Evaluate1{
    public static void main(String[] args){
    int a=28;
     a+=++a + ++a + -a + a--;
    System.out.print("the final a is" +a);
    }
}



     






        