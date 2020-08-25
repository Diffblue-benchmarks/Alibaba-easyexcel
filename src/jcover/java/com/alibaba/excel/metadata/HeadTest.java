package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.metadata.property.ColumnWidthProperty;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Head
 *
 * @author Diffblue Cover
 */

class HeadTest {

    @Test
    void factory1() {
        Head head = new Head(1, "data", null, false, false);
        head.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        columnWidthProperty.setWidth(1);
        head.setColumnWidthProperty(columnWidthProperty);
        head.setFieldName("data");
        head.setForceIndex(false);
        head.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head.setHeadNameList(headNameList2);
        assertThat(head.getColumnIndex(), is(1));
        assertThat(head.getColumnWidthProperty(), sameInstance(columnWidthProperty));
        assertThat(head.getFieldName(), is("data"));
        assertThat(head.getForceIndex(), is(false));
        assertThat(head.getForceName(), is(false));
        assertThat(head.getHeadNameList(), hasSize(1));
        assertThat(head.getHeadNameList().get(0), is("Smith"));
    }

    @Test
    void factory2() {
        Head head = new Head(1, "data", new ArrayList<String>(), false, false);
        head.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        columnWidthProperty.setWidth(1);
        head.setColumnWidthProperty(columnWidthProperty);
        head.setFieldName("data");
        head.setForceIndex(false);
        head.setForceName(false);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head.setHeadNameList(headNameList2);
        assertThat(head.getColumnIndex(), is(1));
        assertThat(head.getColumnWidthProperty(), sameInstance(columnWidthProperty));
        assertThat(head.getFieldName(), is("data"));
        assertThat(head.getForceIndex(), is(false));
        assertThat(head.getForceName(), is(false));
        assertThat(head.getHeadNameList(), hasSize(1));
        assertThat(head.getHeadNameList().get(0), is("Smith"));
    }
}
