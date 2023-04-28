import java.util.Scanner;

public class QuadraticEquationSolver {
    public void solver(int a,int b, int c) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
         double s = input.nextDouble();

        System.out.print("Enter b: ");
        double d = input.nextDouble();

        System.out.print("Enter c: ");
        double f = input.nextDouble();

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
}
