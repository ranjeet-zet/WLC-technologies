import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int breads = 15;
        int vegPattice = 3;
        int nonVegPattice = 2;
        int tikkiPattice = 1;
        int priceVegBurger = 100;
        int priceNonVegBurger = 125;
        int priceTikkiBurger = 112;

        int maxProfit = getMaxProfit(breads, vegPattice, nonVegPattice, tikkiPattice,
                priceVegBurger, priceNonVegBurger, priceTikkiBurger);

        System.out.println("Maximum Possible Profit: " + maxProfit);
    }

    public static int getMaxProfit(int breads, int vegPattice, int nonVegPattice, int tikkiPattice,
                                   int priceVegBurger, int priceNonVegBurger, int priceTikkiBurger) {
        int[] dp = new int[breads + 1];

        for (int i = 1; i <= breads; i++) {
            int maxProfit = dp[i - 1] + priceVegBurger * Math.min(i / 2, vegPattice);
            maxProfit = Math.max(maxProfit, dp[i - 1] + priceNonVegBurger * Math.min(i / 2, nonVegPattice));
            maxProfit = Math.max(maxProfit, dp[i - 1] + priceTikkiBurger * Math.min(i / 2, tikkiPattice));
            dp[i] = maxProfit;
        }

        return dp[breads];
    

    }
}
