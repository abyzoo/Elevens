import java.util.ArrayList;

public class Board {

    private Card[][] board;
    public static final int SIZE = 3;

    /**
     * Constructs a new board
     */
    public Board() {
        board = new Card[SIZE][SIZE];
    }

    /**
     * Sets a spot on the board with a given value.
     */
    public void set(int r, int c, Card card) {
        board[r][c] = card;
    }

    /**
     * Returns a list of all the cards on the board
     */
    public ArrayList<Card> getAllCards() {
        ArrayList<Card> cards = new ArrayList<>();

        for(int r = 0; r < SIZE; r++) {
            for(int c = 0; c < SIZE; c++) {
                cards.add(board[r][c]);
            }
        }

        return cards;
    }

    /**
     * Returns true if the board contains a given card
     */
    public boolean contains(Card c) {
        return getAllCards().contains(c);
    }

    /**
     * Replaces the first occurrence of oldCard with newCard
     */
    public void replace(Card oldCard, Card newCard) {
        for(int r = 0; r < SIZE; r++) {
            for(int c = 0; c < SIZE; c++) {
                if (board[r][c].equals(oldCard)) {
                    board[r][c] = newCard;
                    return;
                }
            }
        }

    }

    /**
     * Returns a string representation of the board
     */
    public String toString() {

        String s = "";

        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                s += board[r][c] + " ";
            }

            if(r != board.length-1)
                s += "\n";
        }

        return s;
    }

}
