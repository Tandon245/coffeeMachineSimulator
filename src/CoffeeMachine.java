public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int money;

    public CoffeeMachine() {
        this.water = 0;
        this.milk = 0;
        this.beans = 0;
        this.money = 0;
    }

    public void fillIngredients(int water, int milk, int beans) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    private boolean hasIngredients(CoffeeType coffeeType) {
        return water >= coffeeType.waterNeeded &&
                milk >= coffeeType.milkNeeded &&
                beans >= coffeeType.beansNeeded;

    }

    public boolean hasMoney(CoffeeType coffeeType) {
        return money >= coffeeType.price;
    }

    public void takeMoney() {
        if (money == 0) {
            System.out.println("No funds");
        } else {
            System.out.println("$" + money + " debited from your account");
            this.money = 0;
        }
    }

    public void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee Beans: " + beans + " grams");
    }


    public void showMoney() {
        System.out.println("Your Balance: $" + money);
    }

    private void dispenseCoffee(CoffeeType coffeeType) {
        System.out.println("Dispensing coffee: " + coffeeType.name());
        this.money -= coffeeType.price;
        this.water -= coffeeType.waterNeeded;
        this.milk -= coffeeType.milkNeeded;
        this.beans -= coffeeType.beansNeeded;
    }

    double totalBill = 0;

    public void buyCoffee(String type) {
        try {
            CoffeeType coffeeType = CoffeeType.valueOf(type.toUpperCase());
            if (hasIngredients(coffeeType) && hasMoney(coffeeType)) {
                dispenseCoffee(coffeeType);
                totalBill += coffeeType.price;  // Add the cost to the total bill
            } else {
                if (hasMoney(coffeeType)) {
                    System.out.println("Not enough ingredients to make " + type + " coffee.");
                } else {
                    System.out.println("Not Enough Money to Buy " + type + " coffee.");
                }

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid coffee type: " + type);
        }
    }


}
