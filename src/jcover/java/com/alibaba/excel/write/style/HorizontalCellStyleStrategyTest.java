package com.alibaba.excel.write.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.style.HorizontalCellStyleStrategy
 *
 * @author Diffblue Cover
 */

class HorizontalCellStyleStrategyTest {

    @Test
    void factory() {
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        headWriteCellStyle.setBorderBottom(BorderStyle.NONE);
        headWriteCellStyle.setBorderLeft(BorderStyle.NONE);
        headWriteCellStyle.setBorderRight(BorderStyle.NONE);
        headWriteCellStyle.setBorderTop(BorderStyle.NONE);
        headWriteCellStyle.setBottomBorderColor((short) 1);
        headWriteCellStyle.setDataFormat((short) 1);
        headWriteCellStyle.setFillBackgroundColor((short) 1);
        headWriteCellStyle.setFillForegroundColor((short) 1);
        headWriteCellStyle.setFillPatternType(FillPatternType.NO_FILL);
        headWriteCellStyle.setHidden(false);
        headWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headWriteCellStyle.setIndent((short) 1);
        headWriteCellStyle.setLeftBorderColor((short) 1);
        headWriteCellStyle.setLocked(false);
        headWriteCellStyle.setQuotePrefix(false);
        headWriteCellStyle.setRightBorderColor((short) 1);
        headWriteCellStyle.setRotation((short) 1);
        headWriteCellStyle.setShrinkToFit(false);
        headWriteCellStyle.setTopBorderColor((short) 1);
        headWriteCellStyle.setVerticalAlignment(VerticalAlignment.TOP);
        headWriteCellStyle.setWrapped(false);
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
        headWriteCellStyle.setWriteFont(writeFont2);
        // pojo HorizontalCellStyleStrategy
    }

    @Test
    void uniqueValueReturnsCellStyleStrategy() {
        assertThat(new HorizontalCellStyleStrategy(new WriteCellStyle(), new WriteCellStyle()).uniqueValue(), is("CellStyleStrategy"));
    }
}
