import java.util.Scanner;
public class MethodsBonus {
    public static void main(String[] args) {
        // GLOBAL VARS
        Scanner scan = new Scanner(System.in);
        String build_table = "";
        String item_name = "";
        int item_quantity = 0;
        double item_price = 0;

        // Show the menu to the user with at least 3 options: Sale, Print receipt and Exit
        System.out.println("1) Sale");
        System.out.println("2) Print");
        System.out.println("3) Exit");
        System.out.println();


        // Ask the user to select and option
        int option = option();

        while (option != 3) {
            if (option == 1) {
                // SALE
                // On the sale option, ask for the item's name, how many and the price.
                System.out.println("Input item name: ");
                item_name = scan.nextLine();
//                scan.nextLine();
                System.out.println("Input # of item(s): ");
                item_quantity = scan.nextInt();
//                scan.nextLine();
                System.out.println("Input price of item: $");
//                scan.nextLine();
                item_price = scan.nextDouble();


                option = option();
                scan.nextLine();


            } else if (option == 2) {
                // PRINT
                // global var
                build_table += print(item_name, item_quantity, item_price);
                System.out.println(build_table);

                option = option();

            }
        } if (option == 3) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Enter a valid option: ");
        }

    }
    public static String print(String item_name, int item_quantity, double item_price){
        String build_table = "";
        //         Titles
        System.out.printf("%10s", "Name | ");
        System.out.printf(" %-5s", "Quantity |");
        System.out.printf(" %-10s", "Price");
        // header border
        System.out.println();
        System.out.printf("%10s", "------ | ");
        System.out.printf(" %-5s", "-------- |");
        System.out.printf(" %-10s", "-----");
        System.out.println();
        System.out.printf("%10s", build_table += item_name + "| " + item_quantity + "| " + item_price + "\n");

        return build_table;
    }
    public static int option() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Option: ");
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }
}
