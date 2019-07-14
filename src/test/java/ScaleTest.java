import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class ScaleTest {

    @Test
    public void calcCuatriadChords() {
        Note c = new Note("c", 64);
        Note d = new Note("d", 65);
        Note e = new Note("e", 66);
        Note f = new Note("f", 67);
        Note g = new Note("g", 68);
        Note a = new Note("a", 69);
        Note b = new Note("b", 70);
        ArrayList<Note> listOfNotes = new ArrayList<Note>();
        listOfNotes.add(c);
        listOfNotes.add(d);
        listOfNotes.add(e);
        listOfNotes.add(f);
        listOfNotes.add(g);
        listOfNotes.add(a);
        listOfNotes.add(b);
        Scale cMayor = new Scale(listOfNotes);

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade1 = scaleChords.get(0);

        assert(grade1.getRoot().getName() == "c");
        assert(grade1.getThird().getName() == "e");
        assert(grade1.getFifth().getName() == "g");
        assert(grade1.getSeventh().getName() == "b");
    }

}
