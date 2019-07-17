import java.util.ArrayList;
import java.util.Arrays;

public class ChordCalculator {
    Scale scale;

    public ChordCalculator(Scale scale) {
        this.scale = scale;
    }

    public static void main(String args[]) {
        ArrayList<Note> scaleNotes = new ArrayList<Note>();
        for (String arg : args) {
            Note note = new Note(arg);
            scaleNotes.add(note);
        }
        Scale scale = new Scale(scaleNotes);
        ArrayList<CuatriadChord> generatedChords = scale.calcCuatriadChords();
        System.out.println(generatedChords);
    }

}
