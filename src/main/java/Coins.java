public enum Coins {
    NICKEL(0.05),
    DIME(0.10),
    QUARTER(0.25),
    DOLLAR(1.00);
    private final double  value;

    Coins(double  value) {
        this.value = value;
    }
    public double  getValue() { //UPDATED
        return this.value; //UPDATED
    }

}

