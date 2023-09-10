# Coffee Machine Simulator

A Java console application that simulates a coffee machine. This program allows users to buy coffee, fill ingredients, take money, and view the current status of the coffee machine. It supports multiple coffee types with different ingredient requirements and prices.

## Features

- Buy Coffee: Users can choose from Espresso, Latte, and Cappuccino. The program checks for ingredient availability and deducts money from the machine.

- Fill Ingredients: Users can add water, milk, and coffee beans to the machine.

- Take Money: The program allows the maintenance staff to collect money from the machine's money box.

- Show Ingredients: Users can check the current levels of water, milk, coffee beans, and the amount of money in the machine.

- Add Money: Users can add money to the machine for future coffee purchases.

## Usage

1. Clone the repository to your local machine.

2. Compile the Java code using your preferred Java compiler.

3. Run the program by executing the `Main` class.

4. Follow the on-screen prompts to interact with the Coffee Machine Simulator.

## Coffee Types

- Espresso:
  - Price: $4/cup
  - Water Needed: 250 ml/cup
  - Milk Needed: 0 ml/cup
  - Coffee Beans Needed: 16 grams/cup

- Latte:
  - Price: $7/cup
  - Water Needed: 350 ml/cup
  - Milk Needed: 75 ml/cup
  - Coffee Beans Needed: 20 grams/cup

- Cappuccino:
  - Price: $6/cup
  - Water Needed: 200 ml/cup
  - Milk Needed: 100 ml/cup
  - Coffee Beans Needed: 12 grams/cup

## Example Usage

```shell
Options:
1. Buy Coffee
2. Fill Ingredients
3. Take Money
4. Show Ingredients
5. Add Money
6. Exit
Enter your choice: 1
Enter coffee type (espresso/latte/cappuccino): latte
Dispensing coffee: LATTE

Options:
1. Buy Coffee
2. Fill Ingredients
3. Take Money
4. Show Ingredients
5. Add Money
6. Exit
Enter your choice: 3
Taking money from the machine: $7

...

## Acknowledgments

'This project was inspired by the need for a simple coffee machine simulation.'
'Thanks to the Java programming community for valuable resources and support.'
