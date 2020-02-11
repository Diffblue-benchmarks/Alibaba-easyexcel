package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Table
 *
 * @author Diffblue JCover
 */

public class TableTest {

    @Test(timeout=10000)
    public void getClazzReturnsNull() {
        assertThat(new Table(1).getClazz(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHeadReturnsNull() {
        assertThat(new Table(1).getHead(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTableNo() {
        assertThat(new Table(1).getTableNo(), is(1));
        assertThat(new Table(0).getTableNo(), is(0));
    }

    @Test(timeout=10000)
    public void getTableStyleReturnsNull() {
        assertThat(new Table(1).getTableStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setClazzToBaseRowModel() {
        Table table = new Table(1);
        table.setClazz(BaseRowModel.class);
        assertThat((Class<BaseRowModel>)table.getClazz(), equalTo((Class)BaseRowModel.class));
    }

    @Test(timeout=10000)
    public void setHeadToEmpty() {
        Table table = new Table(1);
        List<List<String>> head = new ArrayList<List<String>>();
        table.setHead(head);
        assertThat(table.getHead(), sameInstance(head));
    }

    @Test(timeout=10000)
    public void setTableNoToOne() {
        new Table(1).setTableNo(1);
    }

    @Test(timeout=10000)
    public void setTableStyle() {
        Table table = new Table(1);
        TableStyle tableStyle = new TableStyle();
        table.setTableStyle(tableStyle);
        assertThat(table.getTableStyle(), sameInstance(tableStyle));
    }
}
