package main.java.inheritance;

public class ChainRestaurant extends Restaurant {
    private String chainName;

    public ChainRestaurant(String chainName, String locationName, int stars, String price) {
        super(locationName, stars, price);
        this.chainName = chainName;
    }

    public String getChainName() {
        return chainName;
    }

    @Override
    public String toString() {
        return "ChainRestaurant{" +
                "chainName='" + chainName + '\'' +
                "} " + super.toString();
    }
}

