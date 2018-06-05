package com.example.ind.lowestpathcount;

import com.example.ind.lowestpathcount.utils.Grid;
import com.example.ind.lowestpathcount.utils.GridVisitor;
import com.example.ind.lowestpathcount.utils.PathState;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SampleMatrixTest {

    public static final Grid EXAMPLE_GRID_1 = new Grid(new int[][]{
            {3, 4, 1, 2, 8, 6},
            {6, 1, 8, 2, 7, 4},
            {5, 9, 3, 9, 9, 5},
            {8, 4, 1, 3, 2, 6},
            {3, 7, 2, 8, 6, 4}
    });

    @Test
    public void goneThroughAllPathsOfGrid() {
        GridVisitor visitor = new GridVisitor(EXAMPLE_GRID_1);
        PathState bestPath = visitor.getBestPathForGrid();

        String goneThroughAllPaths = "";
        if (visitor.getBestPathForGrid().isSuccessful()) {
            goneThroughAllPaths = "Yes";
        } else {
            goneThroughAllPaths = "No";
        }
        assertThat(goneThroughAllPaths, equalTo("Yes"));
    }

    @Test
    public void getTotalCostOfGrid() {
        GridVisitor visitor = new GridVisitor(EXAMPLE_GRID_1);
        PathState bestPath = visitor.getBestPathForGrid();
        assertThat(bestPath.getTotalCost(), equalTo(16));
    }

    @Test
    public void bestPathOfGrid() {
        GridVisitor visitor = new GridVisitor(EXAMPLE_GRID_1);
        PathState bestPath = visitor.getBestPathForGrid();
        System.out.println("bestPathOfGrid : "+formatPath(bestPath));
        assertThat(formatPath(bestPath), equalTo("1 2 3 4 4 5"));
    }

    private String formatPath(PathState path) {
        StringBuilder builder = new StringBuilder();
        List<Integer> rows = path.getRowsTraversed();

        for (int i = 0; i < rows.size(); i++) {
            builder.append(rows.get(i));
            if (i < rows.size() - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}

