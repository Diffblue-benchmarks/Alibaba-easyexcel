package com.alibaba.excel.write.style.row;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.apache.poi.ss.usermodel.Row;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

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

    @Test
    void setHeadColumnHeight() {
        Row row = mock(Row.class);
        new SimpleRowHeightStyleStrategy((short) 1, (short) 1).setHeadColumnHeight(row, 1);
        Mockito.verify(row).setHeightInPoints(ArgumentMatchers.eq((Float) 1.0f));
    }

    @Test
    void setContentColumnHeight() {
        Row row = mock(Row.class);
        new SimpleRowHeightStyleStrategy((short) 1, (short) 1).setContentColumnHeight(row, 1);
        Mockito.verify(row).setHeightInPoints(ArgumentMatchers.eq((Float) 1.0f));
    }
}
