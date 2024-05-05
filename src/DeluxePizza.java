public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean veg) {
        super(veg);
        // Add extra cheese and toppings
        addExtraCheese();
        addExtraToppings();
        // Calculate the bill immediately
        Takeaway();

    }

    @Override
    public void addExtraCheese() {
        // Increase the price of extra cheese for deluxe pizza
        increasePrice(200);
        setIsExtraCheeseAdded(true);
    }

    @Override
    public void addExtraToppings() {
        // Increase the price of extra toppings for deluxe pizza
        increasePrice(250);
        setIsExtraToppingsAdded(true);
    }

    @Override
    public void Takeaway() {
        increasePrice(40);
        setIsOptedForTakeAway(true);
    }

    @java.lang.Override
    public void GetBill() {
        String bill = "";
        System.out.println("Pizza Price: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese added: " + 200 + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added: " + 250 + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away: " + 40 + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
