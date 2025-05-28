import java.util.Scanner;

//01.Binary,Octal,Hexadecimal value

public class ZSGS_PROBLEMS{
 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number:");
int number =sc.nextInt();
if(number<0){
    System.out.print(" It is a Negative value.");
    return ;
}
 int temp = number;
 String binary = "";
 while(temp>0){
    int remainder=temp%2;
    binary = remainder+binary;
    temp = temp/2;
  
 }
 System.out.println("Binary: "+ binary);

  temp = number;
 String octal = "";
 while(temp>0){
    int remainder = temp%8;
    octal = remainder+octal;
    temp=temp/8;
}
System.out.println("Octal: "+ octal);
temp = number;
String hex="";
char[] hexs="0123456789ABCDEF".toCharArray();

while(temp>0){
    int remainder=temp%16;
    hex = hexs[remainder]+hex;
    temp = temp/16;
}
System.out.println("Hex: "+hex);
 }


}

//02.SquareCircumference

class SquareCircumference{
 public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value length of the side. ");

    int side = sc.nextInt();

    int circumference = 4*side;

    System.out.println("Circumference: " + circumference );
 }
}

//03.rectangleCircumference

class rectanglecircumference {
 public static int calculatecircumference(int length,int width){
 
 return 2*(length + width);
}

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the length of the rectangle. ");
 int length = sc.nextInt();

 System.out.println("Enter the width of the rectangle. ");
 int width = sc.nextInt();

 int circumference = calculatecircumference(length,width);

 System.out.println("Circumference of the rectangle: " + circumference);
}
}

//04.CylinderCircumference

class Cylindercircumference{

public static double calculatecircumference(double radius){

return 2 * Math.PI* radius;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the radius of the Cylinder. ");

double radius = sc.nextInt();

double circumference = calculatecircumference(radius);

System.out.println("Circumference of the Cylinder: " + circumference);
    
}
}

//05 Addition and Division

class AddisionandDivision{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of value: ");

    int number = sc.nextInt();
    for(int i=1;i<=5;i++){
     System.out.println(i+ "+" +number+ "=" +(i+number));
    }
    for(int i=1; i<=5; i++){
    System.out.println(i+ "/" +number+ "=" +(i/number));
}
    }
}

//06 ASCll value

class Ascvalue{
    public static void main(String[] args){
    System.out.print("UpperCase value. ");
    for(char ch='A'; ch<='Z'; ch++){
        System.out.println(ch+ ":" +(int)ch);
    }
    System.out.print("lowercase value. ");
    for(char ch='a'; ch<='z'; ch++){
    System.out.println(ch+ ":" +(int)ch);
    }
}
}

//07 Quotient and Remainder

class QuotientandRemainder{
    public static void calculatevalue(int devident,int divisor){

        int Quotient=devident/divisor;
        int Remainder=devident%divisor;
        System.out.println("Quotient :" + Quotient);
        System.out.println("Remainder :" + Remainder);

    }
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number is devident. ");
     int divident =sc.nextInt();
     System.out.println("Enter the number is divisor. ");
     int divisor =sc.nextInt();
     
     calculatevalue(divident,divisor);
    }
}

//09 Swep Two numbers
class Sweptwonumbers{
    public static void main(String[] args) {
    int a =10;
    int b =20;
    System.out.println("Before swep: a=" +a+ ", b=" +b );
    int temp = a;
    a=b;
    b = temp;
    System.out.println("After swep:a=" +a+ ", b=" +b);
    
}
}

//10 EvenOddCheck
class EvenOddCheck{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc.nextInt();

    if(number%2==0){
        System.out.println( number +  "is even.");
    }
    else{
        System.out.println( number  + "is odd.");
    }
}
}



















        
    



    




    




