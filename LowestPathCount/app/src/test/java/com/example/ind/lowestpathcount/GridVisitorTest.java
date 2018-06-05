package com.example.ind.lowestpathcount;

import com.example.ind.lowestpathcount.utils.GridUtils;
import com.example.ind.lowestpathcount.utils.GridVisitor;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GridVisitorTest {

    @Test
    public void getBestPathForGrid() {
        GridVisitor visitor = new GridVisitor(GridUtils.EXAMPLE_GRID_1);
        assertThat(visitor.getBestPathForGrid().isSuccessful(), equalTo(true));
    }
}

