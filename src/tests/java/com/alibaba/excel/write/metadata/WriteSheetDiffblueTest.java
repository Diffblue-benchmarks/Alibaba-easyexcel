package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.metadata.TableStyle;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteSheet
 *
 * @author Diffblue JCover
 */

public class WriteSheetDiffblueTest {

    @Test(timeout=10000)
    public void getColumnWidthMapReturnsEmpty() {
        WriteSheet writeSheet = new WriteSheet();
        Map<Integer, Integer> result = writeSheet.getColumnWidthMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(writeSheet.getColumnWidthMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getSheetNameReturnsNull() {
        assertThat(new WriteSheet().getSheetName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSheetNoReturnsNull() {
        assertThat(new WriteSheet().getSheetNo(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTableStyleReturnsNull() {
        assertThat(new WriteSheet().getTableStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setColumnWidthMapToEmpty() {
        WriteSheet writeSheet = new WriteSheet();
        Map<Integer, Integer> columnWidthMap = new HashMap<Integer, Integer>();
        writeSheet.setColumnWidthMap(columnWidthMap);
        assertThat(writeSheet.getColumnWidthMap(), sameInstance(columnWidthMap));
    }

    @Test(timeout=10000)
    public void setSheetName() {
        WriteSheet writeSheet = new WriteSheet();
        writeSheet.setSheetName("/bin/bash");
        assertThat(writeSheet.getSheetName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setSheetNoToOne() {
        WriteSheet writeSheet = new WriteSheet();
        writeSheet.setSheetNo(1);
        assertThat(writeSheet.getSheetNo(), is(1));
    }

    @Test(timeout=10000)
    public void setTableStyle() {
        WriteSheet writeSheet = new WriteSheet();
        TableStyle tableStyle = new TableStyle();
        writeSheet.setTableStyle(tableStyle);
        assertThat(writeSheet.getTableStyle(), sameInstance(tableStyle));
    }
}
