package com.alibaba.excel.write.metadata.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.style.WriteCellStyle
 *
 * @author Diffblue Cover
 */

class WriteCellStyleTest {

    @Test
    void factory() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setBorderBottom(BorderStyle.NONE);
        writeCellStyle.setBorderLeft(BorderStyle.NONE);
        writeCellStyle.setBorderRight(BorderStyle.NONE);
        writeCellStyle.setBorderTop(BorderStyle.NONE);
        writeCellStyle.setBottomBorderColor((short) 1);
        writeCellStyle.setDataFormat((short) 1);
        writeCellStyle.setFillBackgroundColor((short) 1);
        writeCellStyle.setFillForegroundColor((short) 1);
        writeCellStyle.setFillPatternType(FillPatternType.NO_FILL);
        writeCellStyle.setHidden(false);
        writeCellStyle.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        writeCellStyle.setIndent((short) 1);
        writeCellStyle.setLeftBorderColor((short) 1);
        writeCellStyle.setLocked(false);
        writeCellStyle.setQuotePrefix(false);
        writeCellStyle.setRightBorderColor((short) 1);
        writeCellStyle.setRotation((short) 1);
        writeCellStyle.setShrinkToFit(false);
        writeCellStyle.setTopBorderColor((short) 1);
        writeCellStyle.setVerticalAlignment(VerticalAlignment.TOP);
        writeCellStyle.setWrapped(false);
        WriteFont writeFont = new WriteFont();
        writeFont.setBold(false);
        writeFont.setCharset(1);
        writeFont.setColor((short) 1);
        writeFont.setFontHeightInPoints((short) 1);
        writeFont.setFontName("Acme");
        writeFont.setItalic(false);
        writeFont.setStrikeout(false);
        writeFont.setTypeOffset((short) 1);
        writeFont.setUnderline((byte) 1);
        writeCellStyle.setWriteFont(writeFont);
        assertThat(writeCellStyle.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(writeCellStyle.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(writeCellStyle.getBorderRight(), is(BorderStyle.NONE));
        assertThat(writeCellStyle.getBorderTop(), is(BorderStyle.NONE));
        assertThat(writeCellStyle.getBottomBorderColor(), is((short) 1));
        assertThat(writeCellStyle.getDataFormat(), is((short) 1));
        assertThat(writeCellStyle.getFillBackgroundColor(), is((short) 1));
        assertThat(writeCellStyle.getFillForegroundColor(), is((short) 1));
        assertThat(writeCellStyle.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(writeCellStyle.getHidden(), is(false));
        assertThat(writeCellStyle.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(writeCellStyle.getIndent(), is((short) 1));
        assertThat(writeCellStyle.getLeftBorderColor(), is((short) 1));
        assertThat(writeCellStyle.getLocked(), is(false));
        assertThat(writeCellStyle.getQuotePrefix(), is(false));
        assertThat(writeCellStyle.getRightBorderColor(), is((short) 1));
        assertThat(writeCellStyle.getRotation(), is((short) 1));
        assertThat(writeCellStyle.getShrinkToFit(), is(false));
        assertThat(writeCellStyle.getTopBorderColor(), is((short) 1));
        assertThat(writeCellStyle.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(writeCellStyle.getWrapped(), is(false));
        assertThat(writeCellStyle.getWriteFont(), sameInstance(writeFont));
    }
}
