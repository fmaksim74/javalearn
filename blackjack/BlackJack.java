import java.lang.Integer;
import java.io.Console;
import java.io.IOException;
import java.util.*;

public class BlackJack {
    enum Leaders {USER, COMPUTER};
    private static Leaders leader = Leaders.COMPUTER;
    private static final String[] wellcomeText = {"Wellcome to The Black Jack game in Russia known as 21 or Ochko!",
                                                  "...rules description...",
                                                  "Lets start a new game!"};

    private  static Leaders playLeading() {
        return (int) Math.round(Math.random() * 10) > 5 ? Leaders.USER : Leaders.COMPUTER;
    }

    public static void main(String[] args) throws IOException {
        for (String s : wellcomeText) {
            System.out.println(s);
        }
        char c = '\u0000';
        do {
            leader = playLeading();
            System.out.println("The Leader for this play is " + leader);
            c = (char) System.in.read();
            try {
                System.in.skip(1);
            } catch (IOException e) {}
        } while (c != 'Q' && c != 'q');
        System.out.println("By until the next game! Good luck!");
    }
}
