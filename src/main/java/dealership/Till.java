package dealership;

public class Till {

    private int cash;


    public Till(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void addCash( int amount){
        cash += amount;
    }

    public void removeCash(int amount){
        cash -= amount;
    }
}
