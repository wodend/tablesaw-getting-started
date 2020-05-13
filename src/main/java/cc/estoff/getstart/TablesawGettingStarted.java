package cc.estoff.getstart;

import tech.tablesaw.api.DoubleColumn;

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
}
