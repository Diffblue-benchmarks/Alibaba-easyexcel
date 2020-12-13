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
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.FontProperty;
import com.alibaba.excel.metadata.property.LoopMergeProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import com.alibaba.excel.metadata.property.StyleProperty;
import com.alibaba.excel.write.metadata.holder.WriteHolder;
import com.alibaba.excel.write.metadata.style.WriteFont;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Locale;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
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
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        WriteHolder currentWriteHolder = mock(WriteHolder.class);
        when(currentWriteHolder.globalConfiguration())
            .thenReturn(globalConfiguration);
        Cell cell = mock(Cell.class);
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        CellData<String> cellData = new CellData<String>();
        cellData.setBooleanValue(false);
        cellData.setData("something");
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        cellData.setImageValue(new byte[] { 49, 50, 51 });
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
        DateTimeFormatProperty dateTimeFormatProperty =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty.setUse1904windowing(false);
        excelContentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head = new Head(1, "data", headNameList1, false, false);
        head.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        columnWidthProperty.setWidth(1);
        head.setColumnWidthProperty(columnWidthProperty);
        FontProperty contentFontProperty = new FontProperty();
        contentFontProperty.setBold(false);
        contentFontProperty.setCharset(1);
        contentFontProperty.setColor((short) 1);
        contentFontProperty.setFontHeightInPoints((short) 1);
        contentFontProperty.setFontName("Acme");
        contentFontProperty.setItalic(false);
        contentFontProperty.setStrikeout(false);
        contentFontProperty.setTypeOffset((short) 1);
        contentFontProperty.setUnderline((byte) 1);
        head.setContentFontProperty(contentFontProperty);
        StyleProperty contentStyleProperty = new StyleProperty();
        contentStyleProperty.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty.setBorderRight(BorderStyle.NONE);
        contentStyleProperty.setBorderTop(BorderStyle.NONE);
        contentStyleProperty.setBottomBorderColor((short) 1);
        contentStyleProperty.setDataFormat((short) 1);
        contentStyleProperty.setFillBackgroundColor((short) 1);
        contentStyleProperty.setFillForegroundColor((short) 1);
        contentStyleProperty.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty.setHidden(false);
        contentStyleProperty.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty.setIndent((short) 1);
        contentStyleProperty.setLeftBorderColor((short) 1);
        contentStyleProperty.setLocked(false);
        contentStyleProperty.setQuotePrefix(false);
        contentStyleProperty.setRightBorderColor((short) 1);
        contentStyleProperty.setRotation((short) 1);
        contentStyleProperty.setShrinkToFit(false);
        contentStyleProperty.setTopBorderColor((short) 1);
        contentStyleProperty.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty.setWrapped(false);
        contentStyleProperty.setWriteFont(new WriteFont());
        head.setContentStyleProperty(contentStyleProperty);
        head.setFieldName("data");
        head.setForceIndex(false);
        head.setForceName(false);
        FontProperty headFontProperty = new FontProperty();
        headFontProperty.setBold(false);
        headFontProperty.setCharset(1);
        headFontProperty.setColor((short) 1);
        headFontProperty.setFontHeightInPoints((short) 1);
        headFontProperty.setFontName("Acme");
        headFontProperty.setItalic(false);
        headFontProperty.setStrikeout(false);
        headFontProperty.setTypeOffset((short) 1);
        headFontProperty.setUnderline((byte) 1);
        head.setHeadFontProperty(headFontProperty);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head.setHeadNameList(headNameList2);
        StyleProperty headStyleProperty = new StyleProperty();
        headStyleProperty.setBorderBottom(BorderStyle.NONE);
        headStyleProperty.setBorderLeft(BorderStyle.NONE);
        headStyleProperty.setBorderRight(BorderStyle.NONE);
        headStyleProperty.setBorderTop(BorderStyle.NONE);
        headStyleProperty.setBottomBorderColor((short) 1);
        headStyleProperty.setDataFormat((short) 1);
        headStyleProperty.setFillBackgroundColor((short) 1);
        headStyleProperty.setFillForegroundColor((short) 1);
        headStyleProperty.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty.setHidden(false);
        headStyleProperty.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty.setIndent((short) 1);
        headStyleProperty.setLeftBorderColor((short) 1);
        headStyleProperty.setLocked(false);
        headStyleProperty.setQuotePrefix(false);
        headStyleProperty.setRightBorderColor((short) 1);
        headStyleProperty.setRotation((short) 1);
        headStyleProperty.setShrinkToFit(false);
        headStyleProperty.setTopBorderColor((short) 1);
        headStyleProperty.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty.setWrapped(false);
        headStyleProperty.setWriteFont(new WriteFont());
        head.setHeadStyleProperty(headStyleProperty);
        LoopMergeProperty loopMergeProperty = new LoopMergeProperty(1, 1);
        loopMergeProperty.setColumnExtend(1);
        loopMergeProperty.setEachRow(1);
        head.setLoopMergeProperty(loopMergeProperty);
        excelContentProperty.setHead(head);
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("yyyy-MM-dd");
        numberFormatProperty.setRoundingMode(RoundingMode.UP);
        excelContentProperty.setNumberFormatProperty(numberFormatProperty);

        // act
        CellData result =
             new ExcelWriteAddExecutor(writeContext).convert(currentWriteHolder, String.class, cell, new Object(), excelContentProperty);

        // assert
        assertThat(result.getBooleanValue(), is(false));
        assertThat((String) result.getData(), is("something"));
        assertThat(result.getDataFormat(), is(1));
        assertThat(result.getDataFormatString(), is("yyyy-MM-dd"));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is("value"));
        assertArrayEquals(new byte[] { 49, 50, 51 }, result.getImageValue());
        assertThat(result.getNumberValue(), sameInstance(numberValue7));
        assertThat(result.getStringValue(), is("foo"));
        assertThat(result.getType(), is(CellDataTypeEnum.STRING));
        assertThat(result.getColumnIndex(), is(1));
        assertThat(result.getRowIndex(), is(1));
    }
}
