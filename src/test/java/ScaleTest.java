import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ScaleTest {

    private Scale cMayor;

    @Before
    public void init() {
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
        cMayor = new Scale(listOfNotes);
    }

    @Test
    public void calcGrade1Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade1 = scaleChords.get(0);

        assertEquals("c",  grade1.getRoot().getName());
        assertEquals("e", grade1.getThird().getName());
        assertEquals("g", grade1.getFifth().getName());
        assertEquals("b", grade1.getSeventh().getName());
    }

    @Test
    public void calcGrade2Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(1);

        assertEquals("d",  grade2.getRoot().getName());
        assertEquals("f", grade2.getThird().getName());
        assertEquals("a", grade2.getFifth().getName());
        assertEquals("c", grade2.getSeventh().getName());
    }

}
