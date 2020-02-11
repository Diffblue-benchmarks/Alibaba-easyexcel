package com.alibaba.excel.write.style.column;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.metadata.Head;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.column.SimpleColumnWidthStyleStrategy
 *
 * @author Diffblue JCover
 */

public class SimpleColumnWidthStyleStrategyTest {

    @Test(timeout=10000)
    public void columnWidthReturnsOne() {
        assertThat(new SimpleColumnWidthStyleStrategy(1).columnWidth(new Head(1, "/bin/bash", new ArrayList<String>(), false, false)), is(1));
    }

    @Test(timeout=10000)
    public void uniqueValueReturnsColumnWidthStyleStrategy() {
        assertThat(new SimpleColumnWidthStyleStrategy(1).uniqueValue(), is("ColumnWidthStyleStrategy"));
    }
}
