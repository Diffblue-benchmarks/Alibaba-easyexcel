package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.format.DateTimeFormat;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.DateTimeFormatProperty
 *
 * @author Diffblue JCover
 */

public class DateTimeFormatPropertyTest {

    @Test(timeout=10000)
    public void build() {
        DateTimeFormat dateTimeFormat = mock(DateTimeFormat.class);
        when(dateTimeFormat.use1904windowing())
            .thenReturn(false);
        when(dateTimeFormat.value())
            .thenReturn("foo");
        DateTimeFormatProperty result = DateTimeFormatProperty.build(dateTimeFormat);
        assertThat(result.getFormat(), is("foo"));
        assertThat(result.getUse1904windowing(), is(false));
    }

    @Test(timeout=10000)
    public void buildReturnsNull() {
        assertThat(DateTimeFormatProperty.build(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setFormat() {
        new DateTimeFormatProperty("yyyy-MM-dd", false).setFormat("yyyy-MM-dd");
    }

    @Test(timeout=10000)
    public void setUse1904windowingToFalse() {
        new DateTimeFormatProperty("yyyy-MM-dd", false).setUse1904windowing(false);
    }
}
