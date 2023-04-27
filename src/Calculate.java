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

    public void dis() {
        System.out.println("Welcome to the calculator...");
        System.out.println("Start by entering what you want to do");
        System.out.println("Select");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multipication");


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

        }
    }

    public static void main(String[] args) {
        Calculate ob = new Calculate();
        ob.dis();
        ob.simimain();
    }
}
