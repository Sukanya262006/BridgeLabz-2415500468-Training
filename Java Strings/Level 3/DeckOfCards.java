import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String r : ranks) {
            for (String s : suits) {
                deck[idx++] = r + " of " + s;
            }
        }
        return deck;
    }

    public static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int nCards, int players) {
        if (nCards * players > deck.length) return null;
        String[][] out = new String[players][nCards];
        int idx = 0;
        for (int p = 0; p < players; p++) {
            for (int c = 0; c < nCards; c++) {
                out[p][c] = deck[idx++];
            }
        }
        return out;
    }

    public static void printPlayers(String[][] playersCards) {
        for (int p = 0; p < playersCards.length; p++) {
            System.out.println("Player " + (p+1) + ":");
            for (int c = 0; c < playersCards[p].length; c++) {
                System.out.println("  " + playersCards[p][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffle(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int nCards = sc.nextInt();
        String[][] dealt = distribute(deck, nCards, players);
        if (dealt == null) {
            System.out.println("Cannot distribute " + (nCards*players) + " cards from deck of " + deck.length);
        } else {
            printPlayers(dealt);
        }
        sc.close();
    }
}
