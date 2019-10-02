import static org.junit.Assert.*;
import org.junit.Test;

public class NoteTest {

    @Test
    public void instantiationTest() {
        Note a1 = new Note("a", 23);
        assert(a1.getName() == "a");
        assert(a1.getPitch() == 23);
    }

}