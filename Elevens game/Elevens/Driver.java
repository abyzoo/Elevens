import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Elevens game = new Elevens();
        System.out.println("Running Elevens:");
        do {
            System.out.println(game.getBoard());

            if (!game.isOver()) {
                String[] moves = in.nextLine().split(" ");
                game.processMoves(moves);
            }
        } while(!game.isOver());

        System.out.println(game.getBoard());

        if(game.didWin())
            System.out.println("Winner, Winner Chicken Dinner");
        else
            System.out.println("Lost as a goose in a snowstorm");


    }
}
