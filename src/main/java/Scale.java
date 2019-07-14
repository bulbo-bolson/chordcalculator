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
            Note third = notes.get(counter + 2);
            Note fifth = notes.get(counter + 4);
            Note seventh = notes.get(counter + 6);
            CuatriadChord chord = new CuatriadChord(root, third, fifth, seventh);
            chordList.add(chord);
            //counter++;
        }
        return chordList;
    }
}
