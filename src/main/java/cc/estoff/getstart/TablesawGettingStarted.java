package cc.estoff.getstart;

import tech.tablesaw.api.DoubleColumn;

/**
 * Tablesaw Getting Started
 *
 */
public class TablesawGettingStarted {
    public static void columns() {
        double[] numbers = {1, 2, 3, 4, 5};
        DoubleColumn nc = DoubleColumn.create("nc", numbers);
        System.out.println(nc.print());
    }
}
