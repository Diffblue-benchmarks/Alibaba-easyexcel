package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.metadata.style.WriteFont;

import java.math.RoundingMode;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ExcelContentProperty
 *
 * @author Diffblue Cover
 */

class ExcelContentPropertyTest {

    @Test
    void factory() {
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        excelContentProperty.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty.setUse1904windowing(false);
        excelContentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);
        Head head = new Head(1, "data", new ArrayList<String>(), false, false);
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
        WriteFont writeFont1 = new WriteFont();
        writeFont1.setBold(false);
        writeFont1.setCharset(1);
        writeFont1.setColor((short) 1);
        writeFont1.setFontHeightInPoints((short) 1);
        writeFont1.setFontName("Acme");
        writeFont1.setItalic(false);
        writeFont1.setStrikeout(false);
        writeFont1.setTypeOffset((short) 1);
        writeFont1.setUnderline((byte) 1);
        contentStyleProperty.setWriteFont(writeFont1);
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
        head.setHeadNameList(new ArrayList<String>());
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
        WriteFont writeFont2 = new WriteFont();
        writeFont2.setBold(false);
        writeFont2.setCharset(1);
        writeFont2.setColor((short) 1);
        writeFont2.setFontHeightInPoints((short) 1);
        writeFont2.setFontName("Acme");
        writeFont2.setItalic(false);
        writeFont2.setStrikeout(false);
        writeFont2.setTypeOffset((short) 1);
        writeFont2.setUnderline((byte) 1);
        headStyleProperty.setWriteFont(writeFont2);
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
        assertThat(excelContentProperty.getDateTimeFormatProperty(), sameInstance(dateTimeFormatProperty));
        assertThat(excelContentProperty.getField(), is(nullValue()));
        assertThat(excelContentProperty.getHead(), sameInstance(head));
        assertThat(excelContentProperty.getNumberFormatProperty(), sameInstance(numberFormatProperty));
    }
}
