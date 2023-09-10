import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Options");
                System.out.println("1. Buy Coffee");
                System.out.println("2. Fill Ingredients");
                System.out.println("3. Take Money");
                System.out.println("4. Show Ingredients");
                System.out.println("5. Add Money");
                System.out.println("6. Show Money");
                System.out.println("7. Exit");
                System.out.println("Enter Your Choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        System.out.println("Enter coffee type (espresso/latte/cappuccino): ");
                        String coffeeType = sc.nextLine().toLowerCase();
                        coffeeMachine.buyCoffee(coffeeType);
                        break;
                    case 2:
                        System.out.println("Enter amount of water to add (ml): ");
                        int water = sc.nextInt();
                        System.out.print("Enter amount of milk to add (ml): ");
                        int milk = sc.nextInt();
                        System.out.print("Enter amount of coffee beans to add (grams): ");
                        int beans = sc.nextInt();
                        coffeeMachine.fillIngredients(water, milk, beans);
                        break;
                    case 3:
                        coffeeMachine.takeMoney();
                        break;
                    case 4:
                        coffeeMachine.showIngredients();
                        break;
                    case 5:
                        System.out.print("Enter amount of money to add: $");
                        int addedMoney = sc.nextInt();
                        coffeeMachine.addMoney(addedMoney);
                        break;
                    case 6:
                        coffeeMachine.showMoney();
                        break;
                    case 7:
                        System.out.println("Exiting Coffee Machine Simulator.");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
                System.out.println("=====================================================================");

            }

        }catch (Exception e){
            System.out.println("Please Enter a Valid Input");
        }
    }
}