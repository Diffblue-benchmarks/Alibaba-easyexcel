package com.alibaba.excel.write.style.row;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.row.SimpleRowHeightStyleStrategy
 *
 * @author Diffblue Cover
 */

class SimpleRowHeightStyleStrategyTest {

    @Test
    void uniqueValueReturnsRowHighStyleStrategy() {
        assertThat(new SimpleRowHeightStyleStrategy((short) 1, (short) 1).uniqueValue(), is("RowHighStyleStrategy"));
    }
}
