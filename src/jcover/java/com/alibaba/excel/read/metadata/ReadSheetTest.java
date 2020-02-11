package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.ReadSheet
 *
 * @author Diffblue JCover
 */

public class ReadSheetTest {

    @Test(timeout=10000)
    public void copyBasicParameter1() {
        new ReadSheet().copyBasicParameter(new ReadSheet());
    }

    @Test(timeout=10000)
    public void copyBasicParameter2() {
        new ReadSheet(1).copyBasicParameter(new ReadSheet());
    }

    @Test(timeout=10000)
    public void copyBasicParameter3() {
        new ReadSheet(1, "/bin/bash").copyBasicParameter(new ReadSheet());
    }

    @Test(timeout=10000)
    public void copyBasicParameterOtherIsNull() {
        new ReadSheet().copyBasicParameter(null);
    }

    @Test(timeout=10000)
    public void getSheetNameReturnsNull() {
        assertThat(new ReadSheet().getSheetName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSheetNoReturnsNull() {
        assertThat(new ReadSheet().getSheetNo(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setSheetName() {
        ReadSheet readSheet = new ReadSheet();
        readSheet.setSheetName("/bin/bash");
        assertThat(readSheet.getSheetName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setSheetNoToOne() {
        ReadSheet readSheet = new ReadSheet();
        readSheet.setSheetNo(1);
        assertThat(readSheet.getSheetNo(), is(1));
    }
}
