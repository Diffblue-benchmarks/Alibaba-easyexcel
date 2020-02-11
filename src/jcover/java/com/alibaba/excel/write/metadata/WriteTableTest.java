package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.metadata.TableStyle;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteTable
 *
 * @author Diffblue JCover
 */

public class WriteTableTest {

    @Test(timeout=10000)
    public void getTableNoReturnsNull() {
        assertThat(new WriteTable().getTableNo(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTableStyleReturnsNull() {
        assertThat(new WriteTable().getTableStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTableNoToOne() {
        WriteTable writeTable = new WriteTable();
        writeTable.setTableNo(1);
        assertThat(writeTable.getTableNo(), is(1));
    }

    @Test(timeout=10000)
    public void setTableStyle() {
        WriteTable writeTable = new WriteTable();
        TableStyle tableStyle = new TableStyle();
        writeTable.setTableStyle(tableStyle);
        assertThat(writeTable.getTableStyle(), sameInstance(tableStyle));
    }
}
