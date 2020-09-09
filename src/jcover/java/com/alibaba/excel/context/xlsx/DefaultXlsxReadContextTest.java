package com.alibaba.excel.context.xlsx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.context.xlsx.DefaultXlsxReadContext
 *
 * @author Diffblue Cover
 */

class DefaultXlsxReadContextTest {

    @Test
    void xlsxReadSheetHolderReturnsNull() {
        assertThat(new DefaultXlsxReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS).xlsxReadSheetHolder(), is(nullValue()));
    }

    @Test
    void getCustom() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        assertThat(new DefaultXlsxReadContext(readWorkbook, ExcelTypeEnum.XLS).getCustom(), sameInstance(customObject));
    }
}
