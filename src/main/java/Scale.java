import java.util.ArrayList;

public class Scale {
    ArrayList<Note> notes;

    public Scale(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public ArrayList<CuatriadChord> calcCuatriadChords() {
        ArrayList<CuatriadChord> chordList = new ArrayList<CuatriadChord>();
        int counter = 0;
        for (Note n : notes) {
            Note root = notes.get(counter);
            counter = nextChordNoteIndex(counter);
            Note third = notes.get(counter);
            counter = nextChordNoteIndex(counter);
            Note fifth = notes.get(counter);
            counter = nextChordNoteIndex(counter);
            Note seventh = notes.get(counter);
            CuatriadChord chord = new CuatriadChord(root, third, fifth, seventh);
            chordList.add(chord);
            counter = nextChordNoteIndex(counter);
        }
        return chordList;
    }

    private int nextChordNoteIndex(int currentIndex) {
        int nextIndex;
        // last note of scale, we have to reset the counter
        if ((currentIndex + 1) == notes.size()) {
            nextIndex = 2;
        // last but one note of scale, we have to reset the counter
        } else if ((currentIndex + 2) == notes.size()) {
            nextIndex = 1;
        }
        // still inside the boundary
        else {
            nextIndex = currentIndex + 2;
        }
        return nextIndex;
    }

    private int nextScaleNoteIndex(int currentIndex) {
        int nextIndex;
        // last note of scale, we have to reset the counter
        if ((currentIndex + 1) == notes.size()) {
            // to the se
            nextIndex = 0;
        // still inside the boundary
        } else {
            nextIndex = currentIndex + 1;
        }
        return nextIndex;
    }

}
