package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.write.metadata.style.WriteFont;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.StyleProperty
 *
 * @author Diffblue Cover
 */

class StylePropertyTest {

    @Test
    void factory() {
        StyleProperty styleProperty = new StyleProperty();
        styleProperty.setBorderBottom(BorderStyle.NONE);
        styleProperty.setBorderLeft(BorderStyle.NONE);
        styleProperty.setBorderRight(BorderStyle.NONE);
        styleProperty.setBorderTop(BorderStyle.NONE);
        styleProperty.setBottomBorderColor((short) 1);
        styleProperty.setDataFormat((short) 1);
        styleProperty.setFillBackgroundColor((short) 1);
        styleProperty.setFillForegroundColor((short) 1);
        styleProperty.setFillPatternType(FillPatternType.NO_FILL);
        styleProperty.setHidden(false);
        styleProperty.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        styleProperty.setIndent((short) 1);
        styleProperty.setLeftBorderColor((short) 1);
        styleProperty.setLocked(false);
        styleProperty.setQuotePrefix(false);
        styleProperty.setRightBorderColor((short) 1);
        styleProperty.setRotation((short) 1);
        styleProperty.setShrinkToFit(false);
        styleProperty.setTopBorderColor((short) 1);
        styleProperty.setVerticalAlignment(VerticalAlignment.TOP);
        styleProperty.setWrapped(false);
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
        styleProperty.setWriteFont(writeFont);
        assertThat(styleProperty.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(styleProperty.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(styleProperty.getBorderRight(), is(BorderStyle.NONE));
        assertThat(styleProperty.getBorderTop(), is(BorderStyle.NONE));
        assertThat(styleProperty.getBottomBorderColor(), is((short) 1));
        assertThat(styleProperty.getDataFormat(), is((short) 1));
        assertThat(styleProperty.getFillBackgroundColor(), is((short) 1));
        assertThat(styleProperty.getFillForegroundColor(), is((short) 1));
        assertThat(styleProperty.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(styleProperty.getHidden(), is(false));
        assertThat(styleProperty.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(styleProperty.getIndent(), is((short) 1));
        assertThat(styleProperty.getLeftBorderColor(), is((short) 1));
        assertThat(styleProperty.getLocked(), is(false));
        assertThat(styleProperty.getQuotePrefix(), is(false));
        assertThat(styleProperty.getRightBorderColor(), is((short) 1));
        assertThat(styleProperty.getRotation(), is((short) 1));
        assertThat(styleProperty.getShrinkToFit(), is(false));
        assertThat(styleProperty.getTopBorderColor(), is((short) 1));
        assertThat(styleProperty.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(styleProperty.getWrapped(), is(false));
        assertThat(styleProperty.getWriteFont(), sameInstance(writeFont));
    }

    @Test
    void build() {
        assertThat(StyleProperty.build((com.alibaba.excel.annotation.write.style.ContentStyle) null), is(nullValue()));
        assertThat(StyleProperty.build((com.alibaba.excel.annotation.write.style.HeadStyle) null), is(nullValue()));
    }
}
