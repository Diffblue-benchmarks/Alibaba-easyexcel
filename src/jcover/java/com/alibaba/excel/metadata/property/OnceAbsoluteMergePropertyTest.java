package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.write.style.OnceAbsoluteMerge;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.OnceAbsoluteMergeProperty
 *
 * @author Diffblue Cover
 */

class OnceAbsoluteMergePropertyTest {

    @Test
    void factory() {
        OnceAbsoluteMergeProperty onceAbsoluteMergeProperty =
             new OnceAbsoluteMergeProperty(-1, 0, 1, 1);
        onceAbsoluteMergeProperty.setFirstColumnIndex(1);
        onceAbsoluteMergeProperty.setFirstRowIndex(1);
        onceAbsoluteMergeProperty.setLastColumnIndex(1);
        onceAbsoluteMergeProperty.setLastRowIndex(1);
        assertThat(onceAbsoluteMergeProperty.getFirstColumnIndex(), is(1));
        assertThat(onceAbsoluteMergeProperty.getFirstRowIndex(), is(1));
        assertThat(onceAbsoluteMergeProperty.getLastColumnIndex(), is(1));
        assertThat(onceAbsoluteMergeProperty.getLastRowIndex(), is(1));
    }

    @Test
    void build() {
        OnceAbsoluteMerge onceAbsoluteMerge = mock(OnceAbsoluteMerge.class);
        when(onceAbsoluteMerge.firstColumnIndex())
            .thenReturn(0);
        when(onceAbsoluteMerge.firstRowIndex())
            .thenReturn(1);
        when(onceAbsoluteMerge.lastColumnIndex())
            .thenReturn(-1);
        when(onceAbsoluteMerge.lastRowIndex())
            .thenReturn(1);
        OnceAbsoluteMergeProperty result =
             OnceAbsoluteMergeProperty.build(onceAbsoluteMerge);
        assertThat(result.getFirstColumnIndex(), is(0));
        assertThat(result.getFirstRowIndex(), is(1));
        assertThat(result.getLastColumnIndex(), is(-1));
        assertThat(result.getLastRowIndex(), is(1));
    }

    @Test
    void buildReturnsNull() {
        assertThat(OnceAbsoluteMergeProperty.build(null), is(nullValue()));
    }
}
