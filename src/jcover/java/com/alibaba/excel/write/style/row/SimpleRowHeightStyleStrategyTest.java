package com.alibaba.excel.write.style.row;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.row.SimpleRowHeightStyleStrategy
 *
 * @author Diffblue JCover
 */

public class SimpleRowHeightStyleStrategyTest {

    @Test(timeout=10000)
    public void setContentColumnHeight1() {
        Row row = mock(Row.class);
        new SimpleRowHeightStyleStrategy((short)0, (short)1).setContentColumnHeight(row, 1);
    }

    @Test(timeout=10000)
    public void setContentColumnHeight2() {
        Row row = mock(Row.class);
        new SimpleRowHeightStyleStrategy((short)1, null).setContentColumnHeight(row, 1);
    }

    @Test(timeout=10000)
    public void setHeadColumnHeight1() {
        Row row = mock(Row.class);
        new SimpleRowHeightStyleStrategy(null, (short)1).setHeadColumnHeight(row, 1);
    }

    @Test(timeout=10000)
    public void setHeadColumnHeight2() {
        Row row = mock(Row.class);
        new SimpleRowHeightStyleStrategy((short)0, (short)1).setHeadColumnHeight(row, 1);
    }

    @Test(timeout=10000)
    public void uniqueValueReturnsRowHighStyleStrategy() {
        assertThat(new SimpleRowHeightStyleStrategy((short)1, (short)1).uniqueValue(), is("RowHighStyleStrategy"));
    }
}
