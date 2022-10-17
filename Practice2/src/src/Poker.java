import java.util.*;

public class Poker {
    public static void dealerAndrey() {
        String[] cards = new String[36];
        cards[0] = "p6";
        cards[1] = "p7";
        cards[2] = "p8";
        cards[3] = "p9";
        cards[4] = "p10";
        cards[5] = "pv";
        cards[6] = "pq";
        cards[7] = "pk";
        cards[8] = "pt";
        cards[9] = "k6";
        cards[10] = "k7";
        cards[11] = "k8";
        cards[12] = "k9";
        cards[13] = "k10";
        cards[14] = "kv";
        cards[15] = "kq";
        cards[16] = "kk";
        cards[17] = "kt";
        cards[18] = "b6";
        cards[19] = "b7";
        cards[20] = "b8";
        cards[21] = "b9";
        cards[22] = "b10";
        cards[23] = "bv";
        cards[24] = "bq";
        cards[25] = "bk";
        cards[26] = "bt";
        cards[27] = "w6";
        cards[28] = "w7";
        cards[29] = "w8";
        cards[30] = "w9";
        cards[31] = "w10";
        cards[32] = "wv";
        cards[33] = "wq";
        cards[34] = "wk";
        cards[35] = "wt";
        List<String> cardes = new ArrayList<String>(Arrays.asList(cards));
        Scanner scanner = new Scanner(System.in);
        int kolvo = scanner.nextInt();
        int k=35;
        if (kolvo > 7) {
            System.out.println("Too much students");
        }
        for (int i = 0; i < kolvo; i++) {
            System.out.println("Player "+(i+1));
            for (int j = 0; j < 5; j++) {
                Random random = new Random();
                int card = random.nextInt(k);
                System.out.println("card " + cards[card]);
                cardes.remove(card);
                k=k-1;
            }
        }
    }
    public static void main(String[] args) {
        dealerAndrey();
    }
}
