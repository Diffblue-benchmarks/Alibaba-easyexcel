package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.write.style.ColumnWidth;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ColumnWidthProperty
 *
 * @author Diffblue Cover
 */

class ColumnWidthPropertyTest {

    @Test
    void factory() {
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        columnWidthProperty.setWidth(1);
        assertThat(columnWidthProperty.getWidth(), is(1));
    }

    @Test
    void build1() {
        assertThat(ColumnWidthProperty.build(null), is(nullValue()));
    }

    @Test
    void build2() {
        ColumnWidth columnWidth = mock(ColumnWidth.class);
        when(columnWidth.value())
            .thenReturn(1)
            .thenReturn(0);
        assertThat(ColumnWidthProperty.build(columnWidth).getWidth(), is(0));
    }

    @Test
    void build3() {
        ColumnWidth columnWidth = mock(ColumnWidth.class);
        when(columnWidth.value())
            .thenReturn(-1);
        assertThat(ColumnWidthProperty.build(columnWidth), is(nullValue()));
    }
}
