package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Table
 *
 * @author Diffblue Cover
 */

class TableTest {

    @Test
    void factory() {
        Table table = new Table(1);
        table.setClazz(BaseRowModel.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        table.setHead(head);
        table.setTableNo(1);
        TableStyle tableStyle = mock(TableStyle.class);
        table.setTableStyle(tableStyle);
        assertThat((Class<BaseRowModel>) table.getClazz(), equalTo((Class) BaseRowModel.class));
        assertThat(table.getHead().size(), is(1));
        assertThat(table.getHead().get(0), sameInstance(list));
        assertThat(table.getTableNo(), is(1));
        assertThat(table.getTableStyle(), sameInstance(tableStyle));
    }
}
