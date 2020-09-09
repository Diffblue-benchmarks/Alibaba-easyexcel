package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.write.style.ContentLoopMerge;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.LoopMergeProperty
 *
 * @author Diffblue Cover
 */

class LoopMergePropertyTest {

    @Test
    void factory() {
        LoopMergeProperty loopMergeProperty = new LoopMergeProperty(-1, 0);
        loopMergeProperty.setColumnExtend(1);
        loopMergeProperty.setEachRow(1);
        assertThat(loopMergeProperty.getColumnExtend(), is(1));
        assertThat(loopMergeProperty.getEachRow(), is(1));
    }

    @Test
    void build() {
        ContentLoopMerge contentLoopMerge = mock(ContentLoopMerge.class);
        when(contentLoopMerge.columnExtend())
            .thenReturn(0);
        when(contentLoopMerge.eachRow())
            .thenReturn(1);
        LoopMergeProperty result = LoopMergeProperty.build(contentLoopMerge);
        assertThat(result.getColumnExtend(), is(0));
        assertThat(result.getEachRow(), is(1));
    }

    @Test
    void buildReturnsNull() {
        assertThat(LoopMergeProperty.build(null), is(nullValue()));
    }
}
