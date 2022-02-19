import java.util.Arrays;
import java.util.Scanner;

public class ChordMenu {

    public String showChords() {
        return chooseChord();
    }

    private static String chooseChord() throws NullPointerException {
        String[] chord;
        String type = "";
        String tone = "";
        Scanner scanner = new Scanner(System.in);
        String s;

                do {
                System.out.println("which type of chord do u want to build: ");
                System.out.println("1. Major Chord");
                System.out.println("2. Minor Chord");
                System.out.println("3. Power Chord");
                    try {
                        type = scanner.next();
                        if (type.equals("exit")) {
                            break;
                        }
                        if (Integer.parseInt(type) > 3) {
                            throw new IllegalArgumentException("nope");
                        }
                        System.out.println("Choose semi tone: ");
                        for (int i = 0; i <= Chord.semiTones.length / 2; i++) {
                            System.out.println(i + 1 + ". " + Chord.semiTones[i]);
                        }

                        tone = scanner.next();

                        if(tone.equals("exit")) {
                            break;
                        }

                        if (Integer.parseInt(tone) > 13) {
                            throw new IllegalArgumentException("max. chord is C");
                        }

                        if (type.equals("1")) {
                            Chord c = new MajorChord(Integer.parseInt(tone));
                            chord = c.createChord();
                            s = Arrays.toString(chord);
                            System.out.println(s);
                        }

                        if (type.equals("2")) {
                            Chord c = new MinorChord(Integer.parseInt(tone));
                            chord = c.createChord();
                            s = Arrays.toString(chord);
                            System.out.println(s);
                        }

                    } catch(NullPointerException | IllegalArgumentException  ex) {
                        ex.printStackTrace();
                    }

                } while(!type.equals("exit") || !tone.equals("exit"));

                return null;
    }
}

