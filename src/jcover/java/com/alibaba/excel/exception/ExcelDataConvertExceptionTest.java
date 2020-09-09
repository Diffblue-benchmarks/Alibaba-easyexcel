package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.RoundingMode;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelDataConvertException
 *
 * @author Diffblue Cover
 */

class ExcelDataConvertExceptionTest {

    @Test
    void factory() {
        CellData cellData1 = new CellData();
        cellData1.setBooleanValue(false);
        cellData1.setData(new Object());
        cellData1.setDataFormat(1);
        cellData1.setDataFormatString("yyyy-MM-dd");
        cellData1.setFormula(false);
        cellData1.setFormulaValue("value");
        byte[] imageValue2 = new byte[] { 1 };
        cellData1.setImageValue(imageValue2);
        cellData1.setStringValue("foo");
        cellData1.setType(CellDataTypeEnum.STRING);
        cellData1.setColumnIndex(1);
        cellData1.setRowIndex(1);
        ExcelContentProperty excelContentProperty1 =
             new ExcelContentProperty();
        excelContentProperty1.setConverter(new AutoConverter());
        excelContentProperty1.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        excelContentProperty1.setHead(new Head(1, "data", new ArrayList<String>(), false, false));
        excelContentProperty1.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException(1, 1, cellData1, excelContentProperty1, "jpg");
        CellData cellData3 = new CellData();
        cellData3.setBooleanValue(false);
        cellData3.setData(new Object());
        cellData3.setDataFormat(1);
        cellData3.setDataFormatString("yyyy-MM-dd");
        cellData3.setFormula(false);
        cellData3.setFormulaValue("value");
        byte[] imageValue6 = new byte[] { 1 };
        cellData3.setImageValue(imageValue6);
        cellData3.setStringValue("foo");
        cellData3.setType(CellDataTypeEnum.STRING);
        cellData3.setColumnIndex(1);
        cellData3.setRowIndex(1);
        excelDataConvertException.setCellData(cellData3);
        excelDataConvertException.setColumnIndex(1);
        ExcelContentProperty excelContentProperty3 =
             new ExcelContentProperty();
        excelContentProperty3.setConverter(new AutoConverter());
        excelContentProperty3.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        excelContentProperty3.setHead(new Head(1, "data", new ArrayList<String>(), false, false));
        excelContentProperty3.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));
        excelDataConvertException.setExcelContentProperty(excelContentProperty3);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getCellData(), sameInstance(cellData3));
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty3));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("jpg"));
    }
}
