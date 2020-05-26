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

    public void arrayOperations() {
        DoubleColumn nc2 = this.nc.multiply(4);
        System.out.println(nc2.print());
    }

    public void selectionFilter() {
        DoubleColumn filteredPositive = nc.where(nc.isLessThan(3)
                                                   .and(nc.isPositive()));
        System.out.println(filteredPositive.print());
    }
}
