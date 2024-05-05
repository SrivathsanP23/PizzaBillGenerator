public class Pizza {
    protected int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPack = 20;
    protected boolean isExtraCheeseAdded = false;
    protected boolean isExtraToppingsAdded = false;
    protected boolean isOptedForTakeAway = false;

    protected int basePizzaPrice;

    /*
     *  Base pizza = 300
     *   Toppings = 150
     *   Cheese = 100
     * Take away = 20
     * */
    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    // Protected accessor methods
    protected void increasePrice(int amount) {
        this.price += amount;
    }

    protected void setIsExtraCheeseAdded(boolean isExtraCheeseAdded) {
        this.isExtraCheeseAdded = isExtraCheeseAdded;
    }

    protected void setIsExtraToppingsAdded(boolean isExtraToppingsAdded) {
        this.isExtraToppingsAdded = isExtraToppingsAdded;
    }

    protected void setIsOptedForTakeAway(boolean isOptedForTakeAway) {
        this.isOptedForTakeAway = isOptedForTakeAway;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void Takeaway() {
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void GetBill() {
        String bill = "";
        System.out.println("Pizza Price: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese added :" + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added : " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away: " + backPack + "\n";
        }
        bill += "Bill : " + this.price + "\n";
        System.out.println(bill);
    }

    public static void main(String[] args) {

    }
}

