package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelDataConvertException
 *
 * @author Diffblue JCover
 */

public class ExcelDataConvertExceptionDiffblueTest {

    @Test(timeout=10000)
    public void getColumnIndexReturnsOne() {
        assertThat(new ExcelDataConvertException(1, 1, new ExcelContentProperty(), "jpg").getColumnIndex(), is(1));
    }

    @Test(timeout=10000)
    public void getExcelContentProperty() {
        ExcelContentProperty excelContentProperty1 = new ExcelContentProperty();
        assertThat(new ExcelDataConvertException(1, 1, excelContentProperty1, "jpg").getExcelContentProperty(), sameInstance(excelContentProperty1));
    }

    @Test(timeout=10000)
    public void getRowIndexReturnsOne() {
        assertThat(new ExcelDataConvertException(1, 1, new ExcelContentProperty(), "jpg").getRowIndex(), is(1));
    }

    @Test(timeout=10000)
    public void setColumnIndexToOne() {
        new ExcelDataConvertException(1, 1, new ExcelContentProperty(), "jpg").setColumnIndex(1);
    }

    @Test(timeout=10000)
    public void setExcelContentProperty() {
        ExcelDataConvertException excelDataConvertException = new ExcelDataConvertException(1, 1, new ExcelContentProperty(), "jpg");
        ExcelContentProperty excelContentProperty2 = new ExcelContentProperty();
        excelDataConvertException.setExcelContentProperty(excelContentProperty2);
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty2));
    }

    @Test(timeout=10000)
    public void setRowIndexToOne() {
        new ExcelDataConvertException(1, 1, new ExcelContentProperty(), "jpg").setRowIndex(1);
    }
}
