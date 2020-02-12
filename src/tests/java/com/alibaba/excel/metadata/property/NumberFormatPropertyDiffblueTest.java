package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.format.NumberFormat;

import java.math.RoundingMode;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.NumberFormatProperty
 *
 * @author Diffblue JCover
 */

public class NumberFormatPropertyDiffblueTest {

    @Test(timeout=10000)
    public void build() {
        NumberFormat numberFormat = mock(NumberFormat.class);
        when(numberFormat.roundingMode())
            .thenReturn(RoundingMode.UP);
        when(numberFormat.value())
            .thenReturn("foo");
        NumberFormatProperty result = NumberFormatProperty.build(numberFormat);
        assertThat(result.getFormat(), is("foo"));
        assertThat(result.getRoundingMode(), is(RoundingMode.UP));
    }

    @Test(timeout=10000)
    public void buildReturnsNull() {
        assertThat(NumberFormatProperty.build(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setFormat() {
        new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP).setFormat("yyyy-MM-dd");
    }

    @Test(timeout=10000)
    public void setRoundingModeToUP() {
        new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP).setRoundingMode(RoundingMode.UP);
    }
}
