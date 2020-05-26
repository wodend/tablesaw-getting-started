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
    public void testColumns() {
        testClass.columns();
        String ncString = "Column: nc\n1\n2\n3\n4\n5\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }

    /**
     * arrayOperations() should print a named column with some numbers.
     */
    @Test
    public void testArrayOperations() {
        testClass.arrayOperations();
        String ncString = "Column: nc * 4.0\n4\n8\n12\n16\n20\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }

    /**
     * selectionFilter() should print a named column with some numbers less
     * than 3, and which are all positive.
     */
    @Test
    public void testSelectionFilter() {
        testClass.selectionFilter();
        String ncString = "Column: nc\n1\n2\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }

    /**
     * selectionIndexRows() should print a named column with the numbers from
     * nc in rows 0 and 2.
     */
    @Test
    public void testSelectionIndexRows() {
        testClass.selectionIndexRows();
        String ncString = "Column: nc\n1\n3\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }

    /**
     * selectionIndexRange() should print a named column with the numbers from
     * nc in rows 1 through 3.
     */
    @Test
    public void testSelectionIndexRange() {
        testClass.selectionIndexRange();
        String ncString = "Column: nc\n2\n3\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }

    /**
     * selectionOtherCol() should print a named column with the numbers
     * corresponding to indicies from filtering another column.
     */
    @Test
    public void testSelectionOtherCol() {
        testClass.selectionOtherCol();
        String ncString = "Column: nc\n1\n4\n\n";
        Assert.assertEquals(ncString, outContent.toString());
    }
}
