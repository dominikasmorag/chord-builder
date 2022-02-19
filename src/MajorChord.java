public class MajorChord implements Chord {
    private final int input;

    MajorChord(int userInput) {
        this.input = userInput - 1;
    }

    @Override
    public String[] createChord() {
        return buildChord();
    }

    private String[] buildChord() {
        String prime = semiTones[input];
        String majorThird = semiTones[input + 4];
        String fifth = semiTones[input + 7];
        return new String[]{prime, majorThird, fifth};
    }

}
