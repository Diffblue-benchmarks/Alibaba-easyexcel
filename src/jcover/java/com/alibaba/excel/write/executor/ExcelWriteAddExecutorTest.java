package com.alibaba.excel.write.executor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.write.metadata.holder.WriteHolder;

import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.write.executor.ExcelWriteAddExecutor
 *
 * @author Diffblue Cover
 */

class ExcelWriteAddExecutorTest {

    @Test
    void convertClazzIsString() throws Exception {

        // arrange
        WriteContext writeContext = mock(WriteContext.class);
        WriteHolder currentWriteHolder = mock(WriteHolder.class);
        when(currentWriteHolder.globalConfiguration())
            .thenReturn(new GlobalConfiguration());
        Cell cell = mock(Cell.class);
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        CellData cellData = new CellData<String>();
        cellData.setBooleanValue(false);
        Object data12 = new Object();
        cellData.setData(data12);
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        byte[] imageValue8 = new byte[] { 1 };
        cellData.setImageValue(imageValue8);
        BigDecimal numberValue7 = BigDecimal.valueOf(1L);
        cellData.setNumberValue(numberValue7);
        cellData.setStringValue("foo");
        cellData.setType(CellDataTypeEnum.STRING);
        cellData.setColumnIndex(1);
        cellData.setRowIndex(1);
        @SuppressWarnings("unchecked")
        Converter<String> converter = mock(Converter.class);
        when(converter.convertToExcelData(Mockito.<String>any(), Mockito.<ExcelContentProperty>any(), Mockito.<GlobalConfiguration>any()))
            .thenReturn(cellData);
        excelContentProperty.setConverter(converter);

        // act
        CellData result =
             new ExcelWriteAddExecutor(writeContext).convert(currentWriteHolder, String.class, cell, new Object(), excelContentProperty);

        // assert
        assertThat(result.getBooleanValue(), is(false));
        assertThat(result.getData(), sameInstance(data12));
        assertThat(result.getDataFormat(), is(1));
        assertThat(result.getDataFormatString(), is("yyyy-MM-dd"));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is("value"));
        assertArrayEquals(new byte[] { 1 }, result.getImageValue());
        assertThat(result.getNumberValue(), sameInstance(numberValue7));
        assertThat(result.getStringValue(), is("foo"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(1));
        assertThat(result.getRowIndex(), is(1));
    }
}
