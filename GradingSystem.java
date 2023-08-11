
import java.util.*;

public class GradingSystem {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        double math, phy, chem;
        double total = 0, average;

        System.out.println("Grading system --> ");
        System.out.println("              Marks              |    Grade         ");
        System.out.println("            greater than 90      |      A           ");
        System.out.println("            70 <= 90             |      B           ");
        System.out.println("            60 <= 70             |      C           ");
        System.out.println("            50 <= 60             |      D           ");
        System.out.println("            less than 50         |      F           ");

        System.out.println("Enter Marks of Mathematics :- ");
        math = sc.nextInt();
        System.out.println("Enter Marks of Physics :- ");
        phy = sc.nextInt();
        System.out.println("Enter Marks of Chemistry :- ");
        chem = sc.nextInt();

        total = math + phy + chem;

        average = total / 3;

        System.out.println("The Percentage obtained by Student is :-   " + average);

        System.out.println("The student Grade is: ");
        if (average >= 90) {
            System.out.print("A");

        } else if (average < 90 && average >= 70) {
            System.out.print("B");

        } else if (average < 70 && average >= 60) {
            System.out.print("C");

        } else if (average < 60 && average >= 50) {
            System.out.print("D");

        } else {
            System.out.print("F");
        }
    }
}