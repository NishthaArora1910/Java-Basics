
// Hotel Menu System
import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        System.out.println("Hotel Menu --> ");
        Scanner sc = new Scanner(System.in);

        double total = 0;

        while (true) {
            System.out.println("Press 1 For Tea          -- Rs 25");
            System.out.println("Press 2 for Coffee       -- Rs 30");
            System.out.println("Press 3 Pizza            -- Rs 200");
            System.out.println("Press 4 Burger           -- Rs 65");
            System.out.println("Press 5 Momos(6 pieces)  -- Rs 150 ");
            System.out.println("Press 6 Veg Noodles      -- Rs 175");
            System.out.println("Press 7 to Exit");
            System.out.print("Enter your choice :");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("You have Ordered Tea");
                    System.out.println("-------------------------------------");
                    total = total + 25;
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("You have Ordered Coffee");
                    System.out.println("-------------------------------------");
                    total = total + 30;
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("You have Ordered Pizza");
                    System.out.println("-------------------------------------");
                    total = total + 200;
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("You have Ordered Burger");
                    System.out.println("-------------------------------------");
                    total = total + 65;
                    break;
                case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("You have Ordered Momosa(6 pieces)");
                    System.out.println("-------------------------------------");
                    total = total + 150;
                    break;
                case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("You have Ordered Veg Noodles");
                    System.out.println("-------------------------------------");
                    total = total + 175;
                    break;
                case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("Thanks for Selecting ");
                    System.out.println("-------------------------------------");
                    System.exit(0);
            }
            System.out.println("-------------------------------------");
            System.out.println("Your total bill is : " + total);
            System.out.println("-------------------------------------");
        }

    }
}