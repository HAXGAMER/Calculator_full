package Math_Done_Better;
import java.util.*;
public class Math_Done_Better {
    public void addition(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    public void subtraction(int a, int b){
        int c = a-b;
        System.out.println(c);
    }
    public void division_remainder(int a, int b){
        int c = a%b;
        System.out.println("Remainder ="+c);
    }
    public void division_quotient(double a, double b){
        double c = a/b;
        System.out.println("Quotient ="+c);
    }
    public void Multiply(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
    public void Power(int a, int b){
        int c = (int) Math.pow(a,b);
    }
    public void Under_Root(double a){
        double c = Math.sqrt(a);
        System.out.println(c);
    }
    public void Quadratic_Solver(double a,double b ,double c){
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
    public void Herons_formula(int a,int b,int c){
        int s = (a+b+c)/2;
        int area = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);

    }


    public void getRight_angle(double b, double h) {
        double area = (double) 1/2*b*h;
        System.out.println(area);
    }
    public void getEquilateral_triangle(int a){
        Scanner s = new Scanner(System.in);
        double area = Math.sqrt(3)*a*a/4;
        System.out.println(area);
        System.out.println("Did they ask for height");
        System.out.println("1.Yes 2.No");
        int i = s.nextInt();
        switch (i){
            case 1:
                double h = Math.sqrt(3)*a/2;
                System.out.println("Ok then its"+   h);
                break;
            case 2 :
                System.out.println("Exiting..");
                break;
            default:
                System.out.println("No right input given Exiting..");
        }

    }
    public void pytha( int b, int p){


        int h = (int) Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));

        System.out.println("The length of the hypotenuse (side h) is: " + h);

    }
    public void Simple_Interest(double p, double r, double t){


                double compoundInterest = p * Math.pow(1 + (r / 100), t) - p;
                int amount = (int) (compoundInterest+ p);

                System.out.println("Compound interest = " + compoundInterest);
        System.out.println("The amount is " +amount);



    }
    public void Recring_Deposits(int p,int n,int r){
        System.out.println("Note: Enter the time in months or the Answer may not be correct");
        int I = p*n*(n+1)*r/2400;
        int sol = p*n+I;
        System.out.println(sol);
        System.out.println("Interest =" +I);
    }
}
