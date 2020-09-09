package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.format.DateTimeFormat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.DateTimeFormatProperty
 *
 * @author Diffblue Cover
 */

class DateTimeFormatPropertyTest {

    @Test
    void factory() {
        DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty.setUse1904windowing(false);
        assertThat(dateTimeFormatProperty.getFormat(), is("yyyy-MM-dd"));
        assertThat(dateTimeFormatProperty.getUse1904windowing(), is(false));
    }

    @Test
    void build() {
        DateTimeFormat dateTimeFormat = mock(DateTimeFormat.class);
        when(dateTimeFormat.use1904windowing())
            .thenReturn(false);
        when(dateTimeFormat.value())
            .thenReturn("foo");
        DateTimeFormatProperty result = DateTimeFormatProperty.build(dateTimeFormat);
        assertThat(result.getFormat(), is("foo"));
        assertThat(result.getUse1904windowing(), is(false));
    }

    @Test
    void buildReturnsNull() {
        assertThat(DateTimeFormatProperty.build(null), is(nullValue()));
    }
}
