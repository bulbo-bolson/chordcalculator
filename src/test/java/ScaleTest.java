import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ScaleTest {

    private Scale cMayor;

    @Before
    public void init() {
        Note c = new Note("C", 64);
        Note d = new Note("D", 65);
        Note e = new Note("E", 66);
        Note f = new Note("F", 67);
        Note g = new Note("G", 68);
        Note a = new Note("A", 69);
        Note b = new Note("B", 70);
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

        assertEquals("C",  grade1.getRoot().getName());
        assertEquals("E", grade1.getThird().getName());
        assertEquals("G", grade1.getFifth().getName());
        assertEquals("B", grade1.getSeventh().getName());
    }

    @Test
    public void calcGrade2Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(1);

        assertEquals("D",  grade2.getRoot().getName());
        assertEquals("F", grade2.getThird().getName());
        assertEquals("A", grade2.getFifth().getName());
        assertEquals("C", grade2.getSeventh().getName());
    }

    @Test
    public void calcGrade3Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(2);

        assertEquals("E",  grade2.getRoot().getName());
        assertEquals("G", grade2.getThird().getName());
        assertEquals("B", grade2.getFifth().getName());
        assertEquals("D", grade2.getSeventh().getName());
    }

    @Test
    public void calcGrade4Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(3);

        assertEquals("F",  grade2.getRoot().getName());
        assertEquals("A", grade2.getThird().getName());
        assertEquals("C", grade2.getFifth().getName());
        assertEquals("E", grade2.getSeventh().getName());
    }

    @Test
    public void calcGrade5Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(4);

        assertEquals("G",  grade2.getRoot().getName());
        assertEquals("B", grade2.getThird().getName());
        assertEquals("D", grade2.getFifth().getName());
        assertEquals("F", grade2.getSeventh().getName());
    }

    @Test
    public void calcGrade6Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(5);

        assertEquals("A",  grade2.getRoot().getName());
        assertEquals("C", grade2.getThird().getName());
        assertEquals("E", grade2.getFifth().getName());
        assertEquals("G", grade2.getSeventh().getName());
    }

    @Test
    public void calcGrade7Chords() {

        ArrayList<CuatriadChord> scaleChords = cMayor.calcCuatriadChords();
        CuatriadChord grade2 = scaleChords.get(6);

        assertEquals("B",  grade2.getRoot().getName());
        assertEquals("D", grade2.getThird().getName());
        assertEquals("F", grade2.getFifth().getName());
        assertEquals("A", grade2.getSeventh().getName());
    }
}
