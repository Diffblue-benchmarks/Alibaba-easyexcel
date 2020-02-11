package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.RowHeightProperty
 *
 * @author Diffblue JCover
 */

public class RowHeightPropertyTest {

//    @Test(timeout=10000)
//    public void build1() {
//        ContentRowHeight contentRowHeight = mock(ContentRowHeight.class);
//        when(contentRowHeight.value())
//            .thenReturn(-1);  <-- no suitable method found for thenReturn(int)
//        assertThat(RowHeightProperty.build(contentRowHeight), is(nullValue()));
//    }
//
//    @Test(timeout=10000)
//    public void build2() {
//        ContentRowHeight contentRowHeight = mock(ContentRowHeight.class);
//        when(contentRowHeight.value())
//            .thenReturn(0)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        assertThat(RowHeightProperty.build(contentRowHeight).getHeight(), is((short)1));
//    }
//
//    @Test(timeout=10000)
//    public void build3() {
//        HeadRowHeight headRowHeight = mock(HeadRowHeight.class);
//        when(headRowHeight.value())
//            .thenReturn(-1);  <-- no suitable method found for thenReturn(int)
//        assertThat(RowHeightProperty.build(headRowHeight), is(nullValue()));
//    }
//
//    @Test(timeout=10000)
//    public void build4() {
//        HeadRowHeight headRowHeight = mock(HeadRowHeight.class);
//        when(headRowHeight.value())
//            .thenReturn(0)  <-- no suitable method found for thenReturn(int)
//            .thenReturn(1);
//        assertThat(RowHeightProperty.build(headRowHeight).getHeight(), is((short)1));
//    }
//
    @Test(timeout=10000)
    public void build5() {
        assertThat(RowHeightProperty.build((ContentRowHeight)null), is(nullValue()));
        assertThat(RowHeightProperty.build((HeadRowHeight)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setHeightToOne() {
        new RowHeightProperty((short)1).setHeight((short)1);
    }
}
