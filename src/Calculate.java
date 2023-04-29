

import Calculator_maker.*;
import java.util.Scanner;
import java.util.*;

public class Calculate {
    public void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

    public void sub(int a, int b) {
        int c = a -b;
        System.out.println(c);
    }
    public void divi(int a, int b){
        int c= a/b;
        System.out.println(c);
    }
    public void mul(int a,int b){
        int c= a*b;
        System.out.println(c);
    }
    public void power(int a,int b){
        int c = (int) Math.pow(a,b);
        System.out.println(c);
    }
    public void squrt(double a){
        double c = Math.sqrt(a);
        System.out.println(c);
    }


    public void solver(double a, double b, double c) {
        Scanner s = new Scanner(System.in);



        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
    public void rd(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the principal");
        int a= s.nextInt();
        System.out.println("Enter the amount of months");
        int b= s.nextInt();
        System.out.println("Enter the amount of Rate");
        int c = s.nextInt();


        int Interest = a*b*(b+1)*c/2400;
        int sol =a*b+Interest;
        System.out.println("the Solution is "+  sol);

    }
    public void Gst(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value of the good:");
        int Gst = s.nextInt();
        System.out.println("Enter the rate :");
        int r = s.nextInt();
        System.out.println("What tpe of gst it is ");
        System.out.println("1.Igst");
        System.out.println("2.Cgst");
        System.out.println("3.Sgst");
        int q = s.nextInt();
        switch (q){
            case 1:
                int Sol = Gst*r/100+Gst;
                System.out.println("The Final Rate is "+Sol);
                break;
            case 2:
                r=r/2;
                int Sol2 = Gst*r/100+Gst;
                System.out.println("The Final Rate is "+Sol2);
                break;
            case 3:
                r=r/2;
                int Sol3 = Gst*r/100+Gst;
                System.out.println("The Final Rate is "+Sol3);
                break;
        }



    }


    public void choice(){
        Scanner s = new Scanner(System.in);
        System.out.println("Hello Welcome to The Grade Selector of the calculator ");
        System.out.println("Enter What grade Maths you want to do");

        System.out.println("1. 10th Grade Maths");
        int i = s.nextInt();
        switch (i) {
            case 1:
                System.out.println("Welcome to Grade 10 Maths Section");
                Grade_10();
                break;
            default:
                System.out.println("Check the number again");
        }



        }






    public void dis() {

        System.out.println("Select");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multipication");
        System.out.println("5.Power");
        System.out.println("6.Square Root");
        System.out.println("7.Quadratic Equation");
        System.out.println("8.Recring deposit");
        System.out.println("9.Gst");


    }

    public void Grade_10() {
        Scanner s = new Scanner(System.in);
        dis();
        int o = s.nextInt();
        
        switch (o) {
            case 1:
                System.out.println("Welcome The Numbers you want to Addition");
                System.out.println("Enter a:");
                int x = s.nextInt();
                System.out.println("Enter b:");
                int y = s.nextInt();

               sum(x, y);
                break;

            case 2:
                System.out.println("Welcome Enter the numbers you want to subtract");
                int a = s.nextInt();
                int b = s.nextInt();
                sub(a, b);
                break;
            case 3:
                System.out.println("Welcome Enter the number you want to divide");
                int f = s.nextInt();
                int e = s.nextInt();
                divi(f,e);
                break;
            case 4 :
                System.out.println("Welcome Enter the number you want to Multiply");
                int g =s.nextInt();
                int h =s.nextInt();
                mul(g,h);
                break;
            case 5 :
                System.out.println("Welcome Enter the numbers you want to Power");
                System.out.println("Enter Base:");
                int j=s.nextInt();
                System.out.println("Enter Power:");
                int l=s.nextInt();
                power(j,l);
                break;
            case 6 :
                System.out.println("Welcome Enter the number you want to Root");
                System.out.println("Enter Number :");
                double n= s.nextDouble();
                squrt(n);
                break;
            case 7:
                System.out.println("Welcome to quadratic equation");
                System.out.println("Enter a,b,c eg; ax^2 + bx + c= 0");

                System.out.print("Enter a: ");
                double p = s.nextDouble();

                System.out.print("Enter b: ");
                double d = s.nextDouble();

                System.out.print("Enter c: ");
                double r  = s.nextDouble();
                solver(p,d,r);

                break;
            case 8:
                rd();
                break;
            case 9:
                Gst();
                break;
            default:
                System.out.println("Check the number again");
                break;


        }
    }

    public static void main(String[] args) {
        Calculate ob = new Calculate();
        ob.choice();
    }
}
