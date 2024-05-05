import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for pizza type
        System.out.println("Is the pizza vegetarian? (yes/no):");
        String isVegetarianInput = sc.nextLine();
        boolean isVegetarian = isVegetarianInput.equalsIgnoreCase("yes");

        // Create Pizza object based on user input
        Pizza pizza = new Pizza(isVegetarian);

        // Prompt user for pizza type again if they didn't input 'Pizza' or 'Deluxe Pizza'
        String pizzaType;
        do {
            System.out.println("Pizza or Deluxe Pizza:");
            pizzaType = sc.nextLine();
        } while (!pizzaType.equalsIgnoreCase("Pizza") && !pizzaType.equalsIgnoreCase("Deluxe Pizza"));

        // Prompt user for extra toppings
        System.out.println("Do you want extra toppings to be added? (yes/no):");
        String ans2 = sc.nextLine();

        System.out.println("Do you want extra cheese to be added? (yes/no):");
        String ans3 = sc.nextLine();

        System.out.println("Take away? (yes/no):");
        String ans4 = sc.nextLine();
        // Add extra toppings based on user input
        if (ans2.equalsIgnoreCase("yes")) {
            if (pizzaType.equalsIgnoreCase("Pizza")) {
                pizza.addExtraToppings();

            }

        }
        if (ans3.equalsIgnoreCase("yes")) {
                if (pizzaType.equalsIgnoreCase("Pizza")) {
                    pizza.addExtraCheese();
                }

        }

            // Display bill based on pizza type
        if (pizzaType.equalsIgnoreCase("Pizza")) {
                if (ans4.equalsIgnoreCase("yes")) {
                    pizza.Takeaway();
                }
            }


        if (pizzaType.equalsIgnoreCase("deluxe pizza")) {
                DeluxePizza dp = new DeluxePizza(isVegetarian);
                if (ans4.equalsIgnoreCase("yes")) {
                    dp.Takeaway();
                }

        }
        if (pizzaType.equalsIgnoreCase("Pizza")) {
                pizza.GetBill();
            } else if (pizzaType.equalsIgnoreCase("Deluxe Pizza")) {
                DeluxePizza dp = new DeluxePizza(isVegetarian);
                dp.GetBill();
        }



    }
}
