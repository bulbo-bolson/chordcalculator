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
        nextIndex = nextScaleNoteIndex(currentIndex);
        nextIndex = nextScaleNoteIndex(nextIndex);
        return nextIndex;
    }

    private int nextScaleNoteIndex(int currentNoteIndex) {
        int nextNoteIndex;
        // last note of scale
        if ((currentNoteIndex + 1) == notes.size()) {
            // we have to reset the counter
            nextNoteIndex = 0;
        } else {
            // still inside boundary
            nextNoteIndex = currentNoteIndex + 1;
        }
        return nextNoteIndex;
    }

}
