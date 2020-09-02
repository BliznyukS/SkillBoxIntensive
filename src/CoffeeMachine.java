public class CoffeeMachine {
    private int[] drinkPrices;
    private String[] drinkNames;

    public CoffeeMachine(int[] drinkPrices, String[] drinkNames) {
        this.drinkNames = drinkNames;
        this.drinkPrices = drinkPrices;

    }

    public void checkPrices(int moneyAmount) {
        boolean canBuyAnything = false;

        for (int i = 0; i < drinkPrices.length; i++) {
            if (drinkPrices[i] <= moneyAmount) {
                System.out.println("You could buy : " + drinkNames[i]);
                canBuyAnything = true;
            } else {
                System.out.println("Not enough " + (drinkPrices[i] - moneyAmount) + "$  for " + drinkNames[i]);
            }
        }

        if (canBuyAnything == false) {
            System.out.println("Not enough money");
        }
    }
}
