package cc.estoff.getstart;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.selection.Selection;

/**
 * Tablesaw Getting Started
 *
 */
public class TablesawGettingStarted {
    double[] numbers = {1, 2, 3, 4, 5};
    DoubleColumn nc = DoubleColumn.create("nc", numbers);

    public void columns() {
        System.out.println(this.nc.print());
    }

    public void arrayOperations() {
        DoubleColumn nc2 = this.nc.multiply(4);
        System.out.println(nc2.print());
    }

    public void selectionFilter() {
        DoubleColumn filteredPositive = nc.where(nc.isLessThan(3)
                                                   .and(nc.isPositive()));
        System.out.println(filteredPositive.print());
    }

    public void selectionIndexRows() {
        DoubleColumn withRows = nc.where(Selection.with(0, 2));
        System.out.println(withRows.print());
    }

    public void selectionIndexRange() {
        DoubleColumn withRowRange = nc.where(Selection.withRange(1, 3));
        System.out.println(withRowRange.print());
    }

    public void selectionOtherCol() {
        String[] stringArray = new String[] {"foo", "bar", "baz", "foobar"};
        StringColumn sc = StringColumn.create("sc", stringArray);
        DoubleColumn result = nc.where(sc.startsWith("foo"));
        System.out.println(result.print());
    }
}
