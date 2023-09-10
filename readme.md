# Coffee Machine Simulator

A Java console application that simulates a coffee machine. This program allows users to buy coffee, fill ingredients, take money, and view the current status of the coffee machine. It supports multiple coffee types with different ingredient requirements and prices.

## Technologies Used

- **Java**: The project is implemented in Java, a versatile and widely-used programming language.

## Features

- Buy Coffee: Users can choose from Espresso, Latte, and Cappuccino. The program checks for ingredient availability and deducts money from the machine.

- Fill Ingredients: Users can add water, milk, and coffee beans to the machine.

- Take Money: The program allows the maintenance staff to collect money from the machine's money box.

- Show Ingredients: Users can check the current levels of water, milk, coffee beans, and the amount of money in the machine.

- Add Money: Users can add money to the machine for future coffee purchases.

## Object-Oriented Programming (OOP)

- The project is designed using object-oriented programming principles.
- The `CoffeeMachine` class represents the coffee machine and encapsulates its state and operations.
- The `CoffeeType` enum defines different coffee types as objects with properties.
- Methods and data are organized into classes to improve code modularity and readability.

## Data Structures

- **HashMap**: A `HashMap` is used to map coffee types to their properties, allowing for efficient lookup of coffee type details.
- **Enum**: The `CoffeeType` enum is used to define and represent different coffee types, encapsulating their properties.

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

