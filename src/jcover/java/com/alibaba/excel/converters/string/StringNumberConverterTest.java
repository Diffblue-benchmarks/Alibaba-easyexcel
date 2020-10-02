package com.alibaba.excel.converters.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.string.StringNumberConverter
 *
 * @author Diffblue Cover
 */

class StringNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsString() {
        assertThat(new StringNumberConverter().supportJavaTypeKey(), equalTo((Class) String.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new StringNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaData1() {
        CellData<String> cellData = new CellData<String>();
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));
        assertThat(new StringNumberConverter().convertToJavaData(cellData, contentProperty, new GlobalConfiguration()), is("yyyy-MM-dd1"));
    }

    @Test
    void convertToJavaData2() {
        CellData<String> cellData = new CellData<String>();
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        assertThat(new StringNumberConverter().convertToJavaData(cellData, contentProperty, new GlobalConfiguration()), is("1900-01-01"));
    }

    @Test
    void convertToJavaDataContentPropertyIsNull() {
        CellData<String> cellData = new CellData<String>();
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        assertThat(new StringNumberConverter().convertToJavaData(cellData, (ExcelContentProperty) null, new GlobalConfiguration()), is("1900-01-01"));
    }
}
