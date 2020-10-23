package com.alibaba.excel.write.style.column;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy
 *
 * @author Diffblue Cover
 */

class LongestMatchColumnWidthStyleStrategyTest {

    @Test
    void uniqueValueReturnsColumnWidthStyleStrategy() {
        assertThat(new LongestMatchColumnWidthStyleStrategy().uniqueValue(), is("ColumnWidthStyleStrategy"));
    }
}
