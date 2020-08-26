package com.alibaba.excel.write.style.column;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.metadata.Head;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.column.SimpleColumnWidthStyleStrategy
 *
 * @author Diffblue Cover
 */

class SimpleColumnWidthStyleStrategyTest {

    @Test
    void columnWidthReturnsOne() {
        assertThat(new SimpleColumnWidthStyleStrategy(1).columnWidth(new Head(1, "data", new ArrayList<String>(), false, false)), is(1));
    }

    @Test
    void uniqueValueReturnsColumnWidthStyleStrategy() {
        assertThat(new SimpleColumnWidthStyleStrategy(1).uniqueValue(), is("ColumnWidthStyleStrategy"));
    }
}
