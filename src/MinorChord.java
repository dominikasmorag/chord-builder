public class MinorChord implements Chord {
    private final int input;

    MinorChord(int userInput) {
        this.input = userInput - 1;
    }

    @Override
    public String[] createChord() {
        return buildChord();
    }

    private String[] buildChord() {
        String prime = semiTones[input];
        String minorThird = semiTones[input + 3];
        String fifth = semiTones[input + 7];
        return new String[]{prime, minorThird, fifth};
    }

}
