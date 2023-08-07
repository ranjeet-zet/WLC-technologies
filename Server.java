import java.util.*;

public class Main {
    public static void main(String[] args) {
        int servers = 2;
        int[] load = {10, 60, 50, 15, 80};
        for (int minuteLoad : load) {
            if (minuteLoad < 50) {
                servers = Math.max(1, servers / 2);
            } else {
                servers = 2 * servers + 1;
            }
        }

        System.out.println(servers);
    }
}
