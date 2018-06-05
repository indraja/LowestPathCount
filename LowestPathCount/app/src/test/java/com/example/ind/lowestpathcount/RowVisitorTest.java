package com.example.ind.lowestpathcount;

import com.example.ind.lowestpathcount.utils.Grid;
import com.example.ind.lowestpathcount.utils.PathStateCollector;
import com.example.ind.lowestpathcount.utils.RowVisitor;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RowVisitorTest {

    private static final Grid EXAMPLE_GRID_1 = new Grid(new int[][]{
            { 3, 4, 1, 2, 8, 6 }
    });

    @Test
    public void getBestPathForRow() {
        RowVisitor visitor = new RowVisitor(1, EXAMPLE_GRID_1, new PathStateCollector());
        assertThat(visitor.getBestPathForRow().isSuccessful(), equalTo(true));
    }
}

