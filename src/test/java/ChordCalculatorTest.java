import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ChordCalculatorTest {

    @Test
    public void shouldPrintScaleChords() {
        String[] cliArgs = {"c", "d", "e", "f", "g", "a", "b"};
        ChordCalculator.main(cliArgs);
    }

}
