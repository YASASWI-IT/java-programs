import java.util.Scanner;
public class QuadraticRoots {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Input coefficients
System.out.print("Enter value of a: ");
double a = sc.nextDouble();
System.out.print("Enter value of b: ");
double b = sc.nextDouble();
System.out.print("Enter value of c: ");
double c = sc.nextDouble();
// Calculate discriminant
double d = b * b - 4 * a * c;
if (d > 0) {
// Two real and distinct roots
double root1 = (-b + Math.sqrt(d)) / (2 * a);
double root2 = (-b - Math.sqrt(d)) / (2 * a);
System.out.println("Roots are real and different.");
System.out.println("Root 1 = " + root1);
System.out.println("Root 2 = " + root2);
} else if (d == 0) {
// Two real and equal roots
double root = -b / (2 * a);
System.out.println("Roots are real and equal.");
System.out.println("Root = " + root);
} else {
// Complex roots
double realPart = -b / (2 * a);

double imagPart = Math.sqrt(-d) / (2 * a);
System.out.println("Roots are complex and different.");
System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
}
sc.close();
}
}