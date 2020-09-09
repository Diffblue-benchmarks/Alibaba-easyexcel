package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.FontProperty;
import com.alibaba.excel.metadata.property.LoopMergeProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import com.alibaba.excel.metadata.property.StyleProperty;
import com.alibaba.excel.write.metadata.style.WriteFont;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelDataConvertException
 *
 * @author Diffblue Cover
 */

class ExcelDataConvertExceptionTest {

    @Test
    void factory1() {
        CellData cellData1 = new CellData();
        cellData1.setBooleanValue(false);
        cellData1.setData(new Object());
        cellData1.setDataFormat(1);
        cellData1.setDataFormatString("yyyy-MM-dd");
        cellData1.setFormula(false);
        cellData1.setFormulaValue("value");
        byte[] imageValue2 = new byte[] { 1 };
        cellData1.setImageValue(imageValue2);
        cellData1.setNumberValue(BigDecimal.valueOf(1L));
        cellData1.setStringValue("foo");
        cellData1.setType(CellDataTypeEnum.STRING);
        cellData1.setColumnIndex(1);
        cellData1.setRowIndex(1);
        ExcelContentProperty excelContentProperty1 =
             new ExcelContentProperty();
        excelContentProperty1.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        excelContentProperty1.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head1 = new Head(1, "data", headNameList1, false, false);
        head1.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        head1.setColumnWidthProperty(columnWidthProperty1);
        FontProperty contentFontProperty1 = new FontProperty();
        contentFontProperty1.setBold(false);
        contentFontProperty1.setCharset(1);
        contentFontProperty1.setColor((short) 1);
        contentFontProperty1.setFontHeightInPoints((short) 1);
        contentFontProperty1.setFontName("Acme");
        contentFontProperty1.setItalic(false);
        contentFontProperty1.setStrikeout(false);
        contentFontProperty1.setTypeOffset((short) 1);
        contentFontProperty1.setUnderline((byte) 1);
        head1.setContentFontProperty(contentFontProperty1);
        StyleProperty contentStyleProperty1 = new StyleProperty();
        contentStyleProperty1.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty1.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty1.setBorderRight(BorderStyle.NONE);
        contentStyleProperty1.setBorderTop(BorderStyle.NONE);
        contentStyleProperty1.setBottomBorderColor((short) 1);
        contentStyleProperty1.setDataFormat((short) 1);
        contentStyleProperty1.setFillBackgroundColor((short) 1);
        contentStyleProperty1.setFillForegroundColor((short) 1);
        contentStyleProperty1.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty1.setHidden(false);
        contentStyleProperty1.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty1.setIndent((short) 1);
        contentStyleProperty1.setLeftBorderColor((short) 1);
        contentStyleProperty1.setLocked(false);
        contentStyleProperty1.setQuotePrefix(false);
        contentStyleProperty1.setRightBorderColor((short) 1);
        contentStyleProperty1.setRotation((short) 1);
        contentStyleProperty1.setShrinkToFit(false);
        contentStyleProperty1.setTopBorderColor((short) 1);
        contentStyleProperty1.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty1.setWrapped(false);
        contentStyleProperty1.setWriteFont(new WriteFont());
        head1.setContentStyleProperty(contentStyleProperty1);
        head1.setFieldName("data");
        head1.setForceIndex(false);
        head1.setForceName(false);
        FontProperty headFontProperty1 = new FontProperty();
        headFontProperty1.setBold(false);
        headFontProperty1.setCharset(1);
        headFontProperty1.setColor((short) 1);
        headFontProperty1.setFontHeightInPoints((short) 1);
        headFontProperty1.setFontName("Acme");
        headFontProperty1.setItalic(false);
        headFontProperty1.setStrikeout(false);
        headFontProperty1.setTypeOffset((short) 1);
        headFontProperty1.setUnderline((byte) 1);
        head1.setHeadFontProperty(headFontProperty1);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head1.setHeadNameList(headNameList2);
        StyleProperty headStyleProperty1 = new StyleProperty();
        headStyleProperty1.setBorderBottom(BorderStyle.NONE);
        headStyleProperty1.setBorderLeft(BorderStyle.NONE);
        headStyleProperty1.setBorderRight(BorderStyle.NONE);
        headStyleProperty1.setBorderTop(BorderStyle.NONE);
        headStyleProperty1.setBottomBorderColor((short) 1);
        headStyleProperty1.setDataFormat((short) 1);
        headStyleProperty1.setFillBackgroundColor((short) 1);
        headStyleProperty1.setFillForegroundColor((short) 1);
        headStyleProperty1.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty1.setHidden(false);
        headStyleProperty1.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty1.setIndent((short) 1);
        headStyleProperty1.setLeftBorderColor((short) 1);
        headStyleProperty1.setLocked(false);
        headStyleProperty1.setQuotePrefix(false);
        headStyleProperty1.setRightBorderColor((short) 1);
        headStyleProperty1.setRotation((short) 1);
        headStyleProperty1.setShrinkToFit(false);
        headStyleProperty1.setTopBorderColor((short) 1);
        headStyleProperty1.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty1.setWrapped(false);
        headStyleProperty1.setWriteFont(new WriteFont());
        head1.setHeadStyleProperty(headStyleProperty1);
        LoopMergeProperty loopMergeProperty1 = new LoopMergeProperty(1, 1);
        loopMergeProperty1.setColumnExtend(1);
        loopMergeProperty1.setEachRow(1);
        head1.setLoopMergeProperty(loopMergeProperty1);
        excelContentProperty1.setHead(head1);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        excelContentProperty1.setNumberFormatProperty(numberFormatProperty1);
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException(1, 1, cellData1, excelContentProperty1, "an error has happened");
        CellData cellData2 = new CellData();
        cellData2.setBooleanValue(false);
        cellData2.setData(new Object());
        cellData2.setDataFormat(1);
        cellData2.setDataFormatString("yyyy-MM-dd");
        cellData2.setFormula(false);
        cellData2.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        cellData2.setImageValue(imageValue4);
        cellData2.setNumberValue(BigDecimal.valueOf(1L));
        cellData2.setStringValue("foo");
        cellData2.setType(CellDataTypeEnum.STRING);
        cellData2.setColumnIndex(1);
        cellData2.setRowIndex(1);
        excelDataConvertException.setCellData(cellData2);
        excelDataConvertException.setColumnIndex(1);
        ExcelContentProperty excelContentProperty2 =
             new ExcelContentProperty();
        excelContentProperty2.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty2 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty2.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty2.setUse1904windowing(false);
        excelContentProperty2.setDateTimeFormatProperty(dateTimeFormatProperty2);
        ArrayList<String> headNameList3 = new ArrayList<String>();
        headNameList3.add("Smith");
        Head head2 = new Head(1, "data", headNameList3, false, false);
        head2.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty2 = new ColumnWidthProperty(1);
        columnWidthProperty2.setWidth(1);
        head2.setColumnWidthProperty(columnWidthProperty2);
        FontProperty contentFontProperty2 = new FontProperty();
        contentFontProperty2.setBold(false);
        contentFontProperty2.setCharset(1);
        contentFontProperty2.setColor((short) 1);
        contentFontProperty2.setFontHeightInPoints((short) 1);
        contentFontProperty2.setFontName("Acme");
        contentFontProperty2.setItalic(false);
        contentFontProperty2.setStrikeout(false);
        contentFontProperty2.setTypeOffset((short) 1);
        contentFontProperty2.setUnderline((byte) 1);
        head2.setContentFontProperty(contentFontProperty2);
        StyleProperty contentStyleProperty2 = new StyleProperty();
        contentStyleProperty2.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty2.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty2.setBorderRight(BorderStyle.NONE);
        contentStyleProperty2.setBorderTop(BorderStyle.NONE);
        contentStyleProperty2.setBottomBorderColor((short) 1);
        contentStyleProperty2.setDataFormat((short) 1);
        contentStyleProperty2.setFillBackgroundColor((short) 1);
        contentStyleProperty2.setFillForegroundColor((short) 1);
        contentStyleProperty2.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty2.setHidden(false);
        contentStyleProperty2.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty2.setIndent((short) 1);
        contentStyleProperty2.setLeftBorderColor((short) 1);
        contentStyleProperty2.setLocked(false);
        contentStyleProperty2.setQuotePrefix(false);
        contentStyleProperty2.setRightBorderColor((short) 1);
        contentStyleProperty2.setRotation((short) 1);
        contentStyleProperty2.setShrinkToFit(false);
        contentStyleProperty2.setTopBorderColor((short) 1);
        contentStyleProperty2.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty2.setWrapped(false);
        contentStyleProperty2.setWriteFont(new WriteFont());
        head2.setContentStyleProperty(contentStyleProperty2);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        FontProperty headFontProperty2 = new FontProperty();
        headFontProperty2.setBold(false);
        headFontProperty2.setCharset(1);
        headFontProperty2.setColor((short) 1);
        headFontProperty2.setFontHeightInPoints((short) 1);
        headFontProperty2.setFontName("Acme");
        headFontProperty2.setItalic(false);
        headFontProperty2.setStrikeout(false);
        headFontProperty2.setTypeOffset((short) 1);
        headFontProperty2.setUnderline((byte) 1);
        head2.setHeadFontProperty(headFontProperty2);
        ArrayList<String> headNameList4 = new ArrayList<String>();
        headNameList4.add("Smith");
        head2.setHeadNameList(headNameList4);
        StyleProperty headStyleProperty2 = new StyleProperty();
        headStyleProperty2.setBorderBottom(BorderStyle.NONE);
        headStyleProperty2.setBorderLeft(BorderStyle.NONE);
        headStyleProperty2.setBorderRight(BorderStyle.NONE);
        headStyleProperty2.setBorderTop(BorderStyle.NONE);
        headStyleProperty2.setBottomBorderColor((short) 1);
        headStyleProperty2.setDataFormat((short) 1);
        headStyleProperty2.setFillBackgroundColor((short) 1);
        headStyleProperty2.setFillForegroundColor((short) 1);
        headStyleProperty2.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty2.setHidden(false);
        headStyleProperty2.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty2.setIndent((short) 1);
        headStyleProperty2.setLeftBorderColor((short) 1);
        headStyleProperty2.setLocked(false);
        headStyleProperty2.setQuotePrefix(false);
        headStyleProperty2.setRightBorderColor((short) 1);
        headStyleProperty2.setRotation((short) 1);
        headStyleProperty2.setShrinkToFit(false);
        headStyleProperty2.setTopBorderColor((short) 1);
        headStyleProperty2.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty2.setWrapped(false);
        headStyleProperty2.setWriteFont(new WriteFont());
        head2.setHeadStyleProperty(headStyleProperty2);
        LoopMergeProperty loopMergeProperty2 = new LoopMergeProperty(1, 1);
        loopMergeProperty2.setColumnExtend(1);
        loopMergeProperty2.setEachRow(1);
        head2.setLoopMergeProperty(loopMergeProperty2);
        excelContentProperty2.setHead(head2);
        NumberFormatProperty numberFormatProperty2 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty2.setFormat("yyyy-MM-dd");
        numberFormatProperty2.setRoundingMode(RoundingMode.UP);
        excelContentProperty2.setNumberFormatProperty(numberFormatProperty2);
        excelDataConvertException.setExcelContentProperty(excelContentProperty2);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getCellData(), sameInstance(cellData2));
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty2));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        CellData cellData1 = new CellData();
        cellData1.setBooleanValue(false);
        cellData1.setData(new Object());
        cellData1.setDataFormat(1);
        cellData1.setDataFormatString("yyyy-MM-dd");
        cellData1.setFormula(false);
        cellData1.setFormulaValue("value");
        byte[] imageValue2 = new byte[] { 1 };
        cellData1.setImageValue(imageValue2);
        cellData1.setNumberValue(BigDecimal.valueOf(1L));
        cellData1.setStringValue("foo");
        cellData1.setType(CellDataTypeEnum.STRING);
        cellData1.setColumnIndex(1);
        cellData1.setRowIndex(1);
        ExcelContentProperty excelContentProperty1 =
             new ExcelContentProperty();
        excelContentProperty1.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty1 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty1.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty1.setUse1904windowing(false);
        excelContentProperty1.setDateTimeFormatProperty(dateTimeFormatProperty1);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head1 = new Head(1, "data", headNameList1, false, false);
        head1.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty1 = new ColumnWidthProperty(1);
        columnWidthProperty1.setWidth(1);
        head1.setColumnWidthProperty(columnWidthProperty1);
        FontProperty contentFontProperty1 = new FontProperty();
        contentFontProperty1.setBold(false);
        contentFontProperty1.setCharset(1);
        contentFontProperty1.setColor((short) 1);
        contentFontProperty1.setFontHeightInPoints((short) 1);
        contentFontProperty1.setFontName("Acme");
        contentFontProperty1.setItalic(false);
        contentFontProperty1.setStrikeout(false);
        contentFontProperty1.setTypeOffset((short) 1);
        contentFontProperty1.setUnderline((byte) 1);
        head1.setContentFontProperty(contentFontProperty1);
        StyleProperty contentStyleProperty1 = new StyleProperty();
        contentStyleProperty1.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty1.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty1.setBorderRight(BorderStyle.NONE);
        contentStyleProperty1.setBorderTop(BorderStyle.NONE);
        contentStyleProperty1.setBottomBorderColor((short) 1);
        contentStyleProperty1.setDataFormat((short) 1);
        contentStyleProperty1.setFillBackgroundColor((short) 1);
        contentStyleProperty1.setFillForegroundColor((short) 1);
        contentStyleProperty1.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty1.setHidden(false);
        contentStyleProperty1.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty1.setIndent((short) 1);
        contentStyleProperty1.setLeftBorderColor((short) 1);
        contentStyleProperty1.setLocked(false);
        contentStyleProperty1.setQuotePrefix(false);
        contentStyleProperty1.setRightBorderColor((short) 1);
        contentStyleProperty1.setRotation((short) 1);
        contentStyleProperty1.setShrinkToFit(false);
        contentStyleProperty1.setTopBorderColor((short) 1);
        contentStyleProperty1.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty1.setWrapped(false);
        contentStyleProperty1.setWriteFont(new WriteFont());
        head1.setContentStyleProperty(contentStyleProperty1);
        head1.setFieldName("data");
        head1.setForceIndex(false);
        head1.setForceName(false);
        FontProperty headFontProperty1 = new FontProperty();
        headFontProperty1.setBold(false);
        headFontProperty1.setCharset(1);
        headFontProperty1.setColor((short) 1);
        headFontProperty1.setFontHeightInPoints((short) 1);
        headFontProperty1.setFontName("Acme");
        headFontProperty1.setItalic(false);
        headFontProperty1.setStrikeout(false);
        headFontProperty1.setTypeOffset((short) 1);
        headFontProperty1.setUnderline((byte) 1);
        head1.setHeadFontProperty(headFontProperty1);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head1.setHeadNameList(headNameList2);
        StyleProperty headStyleProperty1 = new StyleProperty();
        headStyleProperty1.setBorderBottom(BorderStyle.NONE);
        headStyleProperty1.setBorderLeft(BorderStyle.NONE);
        headStyleProperty1.setBorderRight(BorderStyle.NONE);
        headStyleProperty1.setBorderTop(BorderStyle.NONE);
        headStyleProperty1.setBottomBorderColor((short) 1);
        headStyleProperty1.setDataFormat((short) 1);
        headStyleProperty1.setFillBackgroundColor((short) 1);
        headStyleProperty1.setFillForegroundColor((short) 1);
        headStyleProperty1.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty1.setHidden(false);
        headStyleProperty1.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty1.setIndent((short) 1);
        headStyleProperty1.setLeftBorderColor((short) 1);
        headStyleProperty1.setLocked(false);
        headStyleProperty1.setQuotePrefix(false);
        headStyleProperty1.setRightBorderColor((short) 1);
        headStyleProperty1.setRotation((short) 1);
        headStyleProperty1.setShrinkToFit(false);
        headStyleProperty1.setTopBorderColor((short) 1);
        headStyleProperty1.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty1.setWrapped(false);
        headStyleProperty1.setWriteFont(new WriteFont());
        head1.setHeadStyleProperty(headStyleProperty1);
        LoopMergeProperty loopMergeProperty1 = new LoopMergeProperty(1, 1);
        loopMergeProperty1.setColumnExtend(1);
        loopMergeProperty1.setEachRow(1);
        head1.setLoopMergeProperty(loopMergeProperty1);
        excelContentProperty1.setHead(head1);
        NumberFormatProperty numberFormatProperty1 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty1.setFormat("yyyy-MM-dd");
        numberFormatProperty1.setRoundingMode(RoundingMode.UP);
        excelContentProperty1.setNumberFormatProperty(numberFormatProperty1);
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelDataConvertException excelDataConvertException =
             new ExcelDataConvertException(1, 1, cellData1, excelContentProperty1, "an error has happened", cause);
        CellData cellData2 = new CellData();
        cellData2.setBooleanValue(false);
        cellData2.setData(new Object());
        cellData2.setDataFormat(1);
        cellData2.setDataFormatString("yyyy-MM-dd");
        cellData2.setFormula(false);
        cellData2.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        cellData2.setImageValue(imageValue4);
        cellData2.setNumberValue(BigDecimal.valueOf(1L));
        cellData2.setStringValue("foo");
        cellData2.setType(CellDataTypeEnum.STRING);
        cellData2.setColumnIndex(1);
        cellData2.setRowIndex(1);
        excelDataConvertException.setCellData(cellData2);
        excelDataConvertException.setColumnIndex(1);
        ExcelContentProperty excelContentProperty2 =
             new ExcelContentProperty();
        excelContentProperty2.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty2 =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty2.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty2.setUse1904windowing(false);
        excelContentProperty2.setDateTimeFormatProperty(dateTimeFormatProperty2);
        ArrayList<String> headNameList3 = new ArrayList<String>();
        headNameList3.add("Smith");
        Head head2 = new Head(1, "data", headNameList3, false, false);
        head2.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty2 = new ColumnWidthProperty(1);
        columnWidthProperty2.setWidth(1);
        head2.setColumnWidthProperty(columnWidthProperty2);
        FontProperty contentFontProperty2 = new FontProperty();
        contentFontProperty2.setBold(false);
        contentFontProperty2.setCharset(1);
        contentFontProperty2.setColor((short) 1);
        contentFontProperty2.setFontHeightInPoints((short) 1);
        contentFontProperty2.setFontName("Acme");
        contentFontProperty2.setItalic(false);
        contentFontProperty2.setStrikeout(false);
        contentFontProperty2.setTypeOffset((short) 1);
        contentFontProperty2.setUnderline((byte) 1);
        head2.setContentFontProperty(contentFontProperty2);
        StyleProperty contentStyleProperty2 = new StyleProperty();
        contentStyleProperty2.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty2.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty2.setBorderRight(BorderStyle.NONE);
        contentStyleProperty2.setBorderTop(BorderStyle.NONE);
        contentStyleProperty2.setBottomBorderColor((short) 1);
        contentStyleProperty2.setDataFormat((short) 1);
        contentStyleProperty2.setFillBackgroundColor((short) 1);
        contentStyleProperty2.setFillForegroundColor((short) 1);
        contentStyleProperty2.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty2.setHidden(false);
        contentStyleProperty2.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty2.setIndent((short) 1);
        contentStyleProperty2.setLeftBorderColor((short) 1);
        contentStyleProperty2.setLocked(false);
        contentStyleProperty2.setQuotePrefix(false);
        contentStyleProperty2.setRightBorderColor((short) 1);
        contentStyleProperty2.setRotation((short) 1);
        contentStyleProperty2.setShrinkToFit(false);
        contentStyleProperty2.setTopBorderColor((short) 1);
        contentStyleProperty2.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty2.setWrapped(false);
        contentStyleProperty2.setWriteFont(new WriteFont());
        head2.setContentStyleProperty(contentStyleProperty2);
        head2.setFieldName("data");
        head2.setForceIndex(false);
        head2.setForceName(false);
        FontProperty headFontProperty2 = new FontProperty();
        headFontProperty2.setBold(false);
        headFontProperty2.setCharset(1);
        headFontProperty2.setColor((short) 1);
        headFontProperty2.setFontHeightInPoints((short) 1);
        headFontProperty2.setFontName("Acme");
        headFontProperty2.setItalic(false);
        headFontProperty2.setStrikeout(false);
        headFontProperty2.setTypeOffset((short) 1);
        headFontProperty2.setUnderline((byte) 1);
        head2.setHeadFontProperty(headFontProperty2);
        ArrayList<String> headNameList4 = new ArrayList<String>();
        headNameList4.add("Smith");
        head2.setHeadNameList(headNameList4);
        StyleProperty headStyleProperty2 = new StyleProperty();
        headStyleProperty2.setBorderBottom(BorderStyle.NONE);
        headStyleProperty2.setBorderLeft(BorderStyle.NONE);
        headStyleProperty2.setBorderRight(BorderStyle.NONE);
        headStyleProperty2.setBorderTop(BorderStyle.NONE);
        headStyleProperty2.setBottomBorderColor((short) 1);
        headStyleProperty2.setDataFormat((short) 1);
        headStyleProperty2.setFillBackgroundColor((short) 1);
        headStyleProperty2.setFillForegroundColor((short) 1);
        headStyleProperty2.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty2.setHidden(false);
        headStyleProperty2.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty2.setIndent((short) 1);
        headStyleProperty2.setLeftBorderColor((short) 1);
        headStyleProperty2.setLocked(false);
        headStyleProperty2.setQuotePrefix(false);
        headStyleProperty2.setRightBorderColor((short) 1);
        headStyleProperty2.setRotation((short) 1);
        headStyleProperty2.setShrinkToFit(false);
        headStyleProperty2.setTopBorderColor((short) 1);
        headStyleProperty2.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty2.setWrapped(false);
        headStyleProperty2.setWriteFont(new WriteFont());
        head2.setHeadStyleProperty(headStyleProperty2);
        LoopMergeProperty loopMergeProperty2 = new LoopMergeProperty(1, 1);
        loopMergeProperty2.setColumnExtend(1);
        loopMergeProperty2.setEachRow(1);
        head2.setLoopMergeProperty(loopMergeProperty2);
        excelContentProperty2.setHead(head2);
        NumberFormatProperty numberFormatProperty2 =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty2.setFormat("yyyy-MM-dd");
        numberFormatProperty2.setRoundingMode(RoundingMode.UP);
        excelContentProperty2.setNumberFormatProperty(numberFormatProperty2);
        excelDataConvertException.setExcelContentProperty(excelContentProperty2);
        excelDataConvertException.setRowIndex(1);
        assertThat(excelDataConvertException.getCellData(), sameInstance(cellData2));
        assertThat(excelDataConvertException.getColumnIndex(), is(1));
        assertThat(excelDataConvertException.getExcelContentProperty(), sameInstance(excelContentProperty2));
        assertThat(excelDataConvertException.getRowIndex(), is(1));
        assertThat(excelDataConvertException.getCause().getCause(), is(nullValue()));
        assertThat(excelDataConvertException.getCause().getMessage(), is(nullValue()));
        assertThat(excelDataConvertException.getMessage(), is("an error has happened"));
    }
}
