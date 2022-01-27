import java.util.Scanner;

public class Chords {
    String[] halfTone = {"c", "cis", "d", "dis", "e", "f", "fis", "g", "gis", "a", "ais", "h", "c"};
    String[] tones = {"c", "d", "e", "f", "g", "a", "h", "c2"};
    int equivalent = 0;
    int input = 0;
    String[] result = new String[3];
    Scanner sc = new Scanner(System.in);

    public void getTone() {
            printInfo();
            checkEquality();
        }

        public String getDur() {
        result[0] = halfTone[equivalent];

         if(equivalent + 4 >= 0 && equivalent + 4 < tones.length) {
             result[1] = halfTone[equivalent + 4];
         }
            else {
              result[1] = halfTone[equivalent-8];
        }
        if (equivalent + 7 >= 0 && equivalent + 7 < tones.length) {
            result[2] = halfTone[equivalent + 7];
        }
            else {
            result[2] = halfTone[equivalent - 5];
        }
        return result[0] + " " + result[1] + " " + result[2];
        }

        public String getMoll() {
        result[0] = halfTone[equivalent];

            if(equivalent + 3 >= 0 ||  equivalent + 3 < tones.length) {
                result[1] = halfTone[equivalent + 3];
            }
            else {
            result[1] = halfTone[equivalent - 9];
             }

            if(equivalent + 7 >= 0 ||  equivalent + 7 < tones.length) {
                result[2] = halfTone[equivalent + 7];
            }
            else {
            result[2] = halfTone[equivalent - 5];
        }
        return result[0] + " " + result[1] + " " + result[2];
        }

    private void printInfo() {
        System.out.println("Choose the tone: ");
        for (int i = 0; i < tones.length; i++) {
            System.out.println(i + ". " + tones[i]);
        }
    }

    private void checkEquality() {
        try {
            input = sc.nextInt();
            for (int i = 0; i < halfTone.length; i++) {
                if (tones[input].equals(halfTone[i])) {
                    equivalent = i;
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
