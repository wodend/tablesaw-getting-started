package cc.estoff.getstart;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;


/**
 * Unit test Tablesaw Getting Started.
 */
public class TablesawGettingStartedTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    TablesawGettingStarted testClass = new TablesawGettingStarted();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    /**
     * columns() should print a named column with some numbers.
     */
    @Test
    public void testTablesawGettingStartedMain() {
        testClass.columns();
        String ncString = "Column: nc\n1\n2\n3\n4\n5\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }
}
