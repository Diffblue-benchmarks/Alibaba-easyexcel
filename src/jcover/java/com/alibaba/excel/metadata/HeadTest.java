package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.metadata.property.ColumnWidthProperty;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Head
 *
 * @author Diffblue JCover
 */

public class HeadTest {

    @Test(timeout=10000)
    public void constructor() {
        List<String> headNameList = new ArrayList<String>();
        ((ArrayList<String>)headNameList).add("Smith");
        Head head = new Head(1, "/bin/bash", headNameList, false, false);
        assertThat(head.getColumnIndex(), is(1));
        assertThat(head.getColumnWidthProperty(), is(nullValue()));
        assertThat(head.getFieldName(), is("/bin/bash"));
        assertThat(head.getForceIndex(), is(false));
        assertThat(head.getForceName(), is(false));
        assertThat(head.getHeadNameList(), sameInstance(headNameList));
    }

    @Test(timeout=10000)
    public void getColumnIndexReturnsOne() {
        assertThat(new Head(1, "bar", new ArrayList<String>(), false, false).getColumnIndex(), is(1));
    }

    @Test(timeout=10000)
    public void getColumnWidthPropertyReturnsNull() {
        assertThat(new Head(1, "bar", new ArrayList<String>(), false, false).getColumnWidthProperty(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFieldNameReturnsBar() {
        assertThat(new Head(1, "bar", new ArrayList<String>(), false, false).getFieldName(), is("bar"));
    }

    @Test(timeout=10000)
    public void getForceIndexReturnsFalse() {
        assertThat(new Head(1, "bar", new ArrayList<String>(), false, false).getForceIndex(), is(false));
    }

    @Test(timeout=10000)
    public void getForceNameReturnsFalse() {
        assertThat(new Head(1, "bar", new ArrayList<String>(), false, false).getForceName(), is(false));
    }

    @Test(timeout=10000)
    public void getHeadNameList() {
        List<String> headNameList = new ArrayList<String>();
        assertThat(new Head(1, "bar", headNameList, false, false).getHeadNameList(), sameInstance(headNameList));
    }

    @Test(timeout=10000)
    public void setColumnIndexToOne() {
        Head head = new Head(0, "/bin/bash", new ArrayList<String>(), false, false);
        head.setColumnIndex(1);
        assertThat(head.getColumnIndex(), is(1));
    }

    @Test(timeout=10000)
    public void setColumnWidthProperty() {
        Head head = new Head(1, "bar", new ArrayList<String>(), false, false);
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        head.setColumnWidthProperty(columnWidthProperty);
        assertThat(head.getColumnWidthProperty(), sameInstance(columnWidthProperty));
    }

    @Test(timeout=10000)
    public void setFieldName() {
        Head head = new Head(1, "bar", new ArrayList<String>(), false, false);
        head.setFieldName("/bin/bash");
        assertThat(head.getFieldName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setForceIndexToFalse() {
        Head head = new Head(1, "/bin/bash", new ArrayList<String>(), true, false);
        head.setForceIndex(false);
        assertThat(head.getForceIndex(), is(false));
    }

    @Test(timeout=10000)
    public void setForceNameToFalse() {
        Head head = new Head(1, "/bin/bash", new ArrayList<String>(), false, true);
        head.setForceName(false);
        assertThat(head.getForceName(), is(false));
    }

    @Test(timeout=10000)
    public void setHeadNameList1() {
        Head head = new Head(1, "bar", new ArrayList<String>(), false, false);
        List<String> headNameList = new ArrayList<String>();
        head.setHeadNameList(headNameList);
        assertThat(head.getHeadNameList(), sameInstance(headNameList));
    }

    @Test(timeout=10000)
    public void setHeadNameList2() {
        Head head = new Head(1, "/bin/bash", null, false, false);
        List<String> headNameList = new ArrayList<String>();
        head.setHeadNameList(headNameList);
        assertThat(head.getHeadNameList(), sameInstance(headNameList));
    }
}
