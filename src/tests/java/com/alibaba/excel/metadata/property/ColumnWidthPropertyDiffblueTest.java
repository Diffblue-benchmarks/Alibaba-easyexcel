package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.write.style.ColumnWidth;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ColumnWidthProperty
 *
 * @author Diffblue JCover
 */

public class ColumnWidthPropertyDiffblueTest {

    @Test(timeout=10000)
    public void build1() {
        assertThat(ColumnWidthProperty.build(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void build2() {
        ColumnWidth columnWidth = mock(ColumnWidth.class);
        when(columnWidth.value())
            .thenReturn(-1);
        assertThat(ColumnWidthProperty.build(columnWidth), is(nullValue()));
    }

    @Test(timeout=10000)
    public void build3() {
        ColumnWidth columnWidth = mock(ColumnWidth.class);
        when(columnWidth.value())
            .thenReturn(0)
            .thenReturn(1);
        assertThat(ColumnWidthProperty.build(columnWidth).getWidth(), is(1));
    }

    @Test(timeout=10000)
    public void setWidthToOne() {
        new ColumnWidthProperty(1).setWidth(1);
    }
}
