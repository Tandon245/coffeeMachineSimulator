public enum CoffeeType {
    ESPRESSO(4, 250, 0, 16),
    LATTE(7, 350, 75, 20),
    CAPPUCCINO(6, 200, 100, 12);
    public final int price;
    public final int waterNeeded;
    public final int milkNeeded;
    public final int beansNeeded;
    CoffeeType(int price, int waterNeeded, int milkNeeded, int beansNeeded) {
        this.price = price;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.beansNeeded = beansNeeded;
    }


}
