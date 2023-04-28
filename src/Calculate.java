import java.sql.SQLOutput;
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
    public void quad(int a,int b,int c){
        double x = Math.pow(b,2)-4*a*c;
        double f = -b + Math.sqrt(x)/2*a;
        double f2= -b - Math.sqrt(x)/2*a;
        System.out.println(f);
        System.out.println(f2);
    }

    public void dis() {
        System.out.println("Welcome to the calculator...");
        System.out.println("Start by entering what you want to do");
        System.out.println("Select");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multipication");
        System.out.println("5.Power");
        System.out.println("6.Square Root");
        System.out.println("7.quadratic Equation");


    }

    public void simimain() {
        Scanner s = new Scanner(System.in);
        int o = s.nextInt();
        switch (o) {
            case 1:
                System.out.println("Welcome The Numbers you want to Addition");
                int x = s.nextInt();
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
                int j=s.nextInt();
                int l=s.nextInt();
                power(j,l);
                break;
            case 6 :
                System.out.println("Welcome Enter the number you want to Root");
                double n= s.nextDouble();
                squrt(n);
                break;
            case 7:
                System.out.println("Welcome to quadratic equation");
                System.out.println("Enter a,b,c eg; ax^2 + bx + c= 0");
                int v = s.nextInt();
                int z = s.nextInt();
                int q= s.nextInt();
                quad(v,z,q);
            default:
                System.out.println("Check the number again");


        }
    }

    public static void main(String[] args) {
        Calculate ob = new Calculate();
        ob.dis();
        ob.simimain();
    }
}
