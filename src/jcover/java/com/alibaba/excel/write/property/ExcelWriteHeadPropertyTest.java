package com.alibaba.excel.write.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.metadata.property.RowHeightProperty;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.property.ExcelWriteHeadProperty
 *
 * @author Diffblue JCover
 */

public class ExcelWriteHeadPropertyTest {

    @Test(timeout=10000)
    public void getContentRowHeightPropertyReturnsNull() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).getContentRowHeightProperty(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHeadRowHeightPropertyReturnsNull() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).getHeadRowHeightProperty(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void hasHead1() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHead2() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), true).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHeadReturnsFalse() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelWriteHeadProperty(holder, null, new ArrayList<java.util.List<String>>(), true).hasHead(), is(false));
    }

    @Test(timeout=10000)
    public void headCellRangeList1() {
        Holder holder = mock(Holder.class);
        assertTrue(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).headCellRangeList().isEmpty());
    }

    @Test(timeout=10000)
    public void headCellRangeList2() {
        Holder holder = mock(Holder.class);
        assertTrue(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), true).headCellRangeList().isEmpty());
    }

    @Test(timeout=10000)
    public void setContentRowHeightProperty() {
        Holder holder = mock(Holder.class);
        ExcelWriteHeadProperty excelWriteHeadProperty = new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        RowHeightProperty contentRowHeightProperty = new RowHeightProperty((short)1);
        excelWriteHeadProperty.setContentRowHeightProperty(contentRowHeightProperty);
        assertThat(excelWriteHeadProperty.getContentRowHeightProperty(), sameInstance(contentRowHeightProperty));
    }

    @Test(timeout=10000)
    public void setHeadRowHeightProperty() {
        Holder holder = mock(Holder.class);
        ExcelWriteHeadProperty excelWriteHeadProperty = new ExcelWriteHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        RowHeightProperty headRowHeightProperty = new RowHeightProperty((short)1);
        excelWriteHeadProperty.setHeadRowHeightProperty(headRowHeightProperty);
        assertThat(excelWriteHeadProperty.getHeadRowHeightProperty(), sameInstance(headRowHeightProperty));
    }
}
