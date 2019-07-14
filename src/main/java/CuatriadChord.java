public class CuatriadChord extends Chord {
    private Note root;
    private Note third;
    private Note fifth;
    private Note seventh;

    public CuatriadChord(Note root, Note third, Note fifth, Note seventh) {
        this.root = root;
        this.third = third;
        this.fifth = fifth;
        this.seventh = seventh;
    }

    public Note getRoot() {
        return this.root;
    }

    public Note getThird() {
        return this.third;
    }

    public Note getFifth() {
        return this.fifth;
    }

    public Note getSeventh() {
        return this.seventh;
    }
}
