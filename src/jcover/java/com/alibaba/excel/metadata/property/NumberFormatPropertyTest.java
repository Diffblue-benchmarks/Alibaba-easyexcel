package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.format.NumberFormat;

import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.NumberFormatProperty
 *
 * @author Diffblue Cover
 */

class NumberFormatPropertyTest {

    @Test
    void factory() {
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("yyyy-MM-dd");
        numberFormatProperty.setRoundingMode(RoundingMode.UP);
        assertThat(numberFormatProperty.getFormat(), is("yyyy-MM-dd"));
        assertThat(numberFormatProperty.getRoundingMode(), is(RoundingMode.UP));
    }

    @Test
    void build() {
        NumberFormat numberFormat = mock(NumberFormat.class);
        when(numberFormat.roundingMode())
            .thenReturn(RoundingMode.UP);
        when(numberFormat.value())
            .thenReturn("value");
        NumberFormatProperty result = NumberFormatProperty.build(numberFormat);
        assertThat(result.getFormat(), is("value"));
        assertThat(result.getRoundingMode(), is(RoundingMode.UP));
    }

    @Test
    void buildReturnsNull() {
        assertThat(NumberFormatProperty.build(null), is(nullValue()));
    }
}
