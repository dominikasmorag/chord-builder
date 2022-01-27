import java.util.Scanner;

public class CheckChords {

    public static void main(String[] args) {

        Chords example1 = new Chords();
        example1.getTone();
        Scanner sc = new Scanner(System.in);
        String result;

        System.out.println("Which type of chord would you like to build?\n1. Dur\n2. Moll ");

        try {
            int x = sc.nextInt();
            if (x == 1) {
                result = example1.getDur();
                System.out.println(result);
            }
            if (x == 2) {
                result = example1.getMoll();
                System.out.println(result);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}




