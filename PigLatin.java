// To run Pigs.java

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What would you like to be translated into Pig Latin?");
        String translateThis = s.nextLine();

        Pigs Wilbur = new Pigs(translateThis);
        Wilbur.translatePrint();

    }

}
