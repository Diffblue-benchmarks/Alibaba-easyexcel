package com.alibaba.excel.write.metadata.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.metadata.property.FontProperty;
import com.alibaba.excel.metadata.property.StyleProperty;

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

    @Test
    void build1() {

        // arrange
        StyleProperty styleProperty = new StyleProperty();
        styleProperty.setBorderBottom(BorderStyle.NONE);
        styleProperty.setBorderLeft(BorderStyle.NONE);
        styleProperty.setBorderRight(BorderStyle.NONE);
        styleProperty.setBorderTop(BorderStyle.NONE);
        styleProperty.setBottomBorderColor((short) -1);
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
        FontProperty fontProperty = new FontProperty();
        fontProperty.setBold(false);
        fontProperty.setCharset(1);
        fontProperty.setColor((short) 1);
        fontProperty.setFontHeightInPoints((short) 1);
        fontProperty.setFontName("Acme");
        fontProperty.setItalic(false);
        fontProperty.setStrikeout(false);
        fontProperty.setTypeOffset((short) 1);
        fontProperty.setUnderline((byte) 1);

        // act
        WriteCellStyle result = WriteCellStyle.build(styleProperty, fontProperty);

        // assert
        assertThat(result.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(result.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(result.getBorderRight(), is(BorderStyle.NONE));
        assertThat(result.getBorderTop(), is(BorderStyle.NONE));
        assertThat(result.getBottomBorderColor(), is(nullValue()));
        assertThat(result.getDataFormat(), is((short) 1));
        assertThat(result.getFillBackgroundColor(), is((short) 1));
        assertThat(result.getFillForegroundColor(), is((short) 1));
        assertThat(result.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(result.getHidden(), is(false));
        assertThat(result.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(result.getIndent(), is((short) 1));
        assertThat(result.getLeftBorderColor(), is((short) 1));
        assertThat(result.getLocked(), is(false));
        assertThat(result.getQuotePrefix(), is(false));
        assertThat(result.getRightBorderColor(), is((short) 1));
        assertThat(result.getRotation(), is((short) 1));
        assertThat(result.getShrinkToFit(), is(false));
        assertThat(result.getTopBorderColor(), is((short) 1));
        assertThat(result.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(result.getWrapped(), is(false));
        assertThat(result.getWriteFont().getBold(), is(false));
        assertThat(result.getWriteFont().getCharset(), is(1));
        assertThat(result.getWriteFont().getColor(), is((short) 1));
        assertThat(result.getWriteFont().getFontHeightInPoints(), is((short) 1));
        assertThat(result.getWriteFont().getFontName(), is("Acme"));
        assertThat(result.getWriteFont().getItalic(), is(false));
        assertThat(result.getWriteFont().getStrikeout(), is(false));
        assertThat(result.getWriteFont().getTypeOffset(), is((short) 1));
        assertThat(result.getWriteFont().getUnderline(), is((byte) 1));
    }

    @Test
    void build2() {

        // arrange
        StyleProperty styleProperty = new StyleProperty();
        styleProperty.setBorderBottom(BorderStyle.NONE);
        styleProperty.setBorderLeft(BorderStyle.NONE);
        styleProperty.setBorderRight(BorderStyle.NONE);
        styleProperty.setBorderTop(BorderStyle.NONE);
        styleProperty.setBottomBorderColor((short) 1);
        styleProperty.setDataFormat((short) -1);
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
        FontProperty fontProperty = new FontProperty();
        fontProperty.setBold(false);
        fontProperty.setCharset(1);
        fontProperty.setColor((short) 1);
        fontProperty.setFontHeightInPoints((short) 1);
        fontProperty.setFontName("Acme");
        fontProperty.setItalic(false);
        fontProperty.setStrikeout(false);
        fontProperty.setTypeOffset((short) 1);
        fontProperty.setUnderline((byte) 1);

        // act
        WriteCellStyle result = WriteCellStyle.build(styleProperty, fontProperty);

        // assert
        assertThat(result.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(result.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(result.getBorderRight(), is(BorderStyle.NONE));
        assertThat(result.getBorderTop(), is(BorderStyle.NONE));
        assertThat(result.getBottomBorderColor(), is((short) 1));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getFillBackgroundColor(), is((short) 1));
        assertThat(result.getFillForegroundColor(), is((short) 1));
        assertThat(result.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(result.getHidden(), is(false));
        assertThat(result.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(result.getIndent(), is((short) 1));
        assertThat(result.getLeftBorderColor(), is((short) 1));
        assertThat(result.getLocked(), is(false));
        assertThat(result.getQuotePrefix(), is(false));
        assertThat(result.getRightBorderColor(), is((short) 1));
        assertThat(result.getRotation(), is((short) 1));
        assertThat(result.getShrinkToFit(), is(false));
        assertThat(result.getTopBorderColor(), is((short) 1));
        assertThat(result.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(result.getWrapped(), is(false));
        assertThat(result.getWriteFont().getBold(), is(false));
        assertThat(result.getWriteFont().getCharset(), is(1));
        assertThat(result.getWriteFont().getColor(), is((short) 1));
        assertThat(result.getWriteFont().getFontHeightInPoints(), is((short) 1));
        assertThat(result.getWriteFont().getFontName(), is("Acme"));
        assertThat(result.getWriteFont().getItalic(), is(false));
        assertThat(result.getWriteFont().getStrikeout(), is(false));
        assertThat(result.getWriteFont().getTypeOffset(), is((short) 1));
        assertThat(result.getWriteFont().getUnderline(), is((byte) 1));
    }

    @Test
    void build3() {

        // arrange
        StyleProperty styleProperty = new StyleProperty();
        styleProperty.setBorderBottom(BorderStyle.NONE);
        styleProperty.setBorderLeft(BorderStyle.NONE);
        styleProperty.setBorderRight(BorderStyle.NONE);
        styleProperty.setBorderTop(BorderStyle.NONE);
        styleProperty.setBottomBorderColor((short) 1);
        styleProperty.setDataFormat((short) 1);
        styleProperty.setFillBackgroundColor((short) -1);
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
        FontProperty fontProperty = new FontProperty();
        fontProperty.setBold(false);
        fontProperty.setCharset(1);
        fontProperty.setColor((short) 1);
        fontProperty.setFontHeightInPoints((short) 1);
        fontProperty.setFontName("Acme");
        fontProperty.setItalic(false);
        fontProperty.setStrikeout(false);
        fontProperty.setTypeOffset((short) 1);
        fontProperty.setUnderline((byte) 1);

        // act
        WriteCellStyle result = WriteCellStyle.build(styleProperty, fontProperty);

        // assert
        assertThat(result.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(result.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(result.getBorderRight(), is(BorderStyle.NONE));
        assertThat(result.getBorderTop(), is(BorderStyle.NONE));
        assertThat(result.getBottomBorderColor(), is((short) 1));
        assertThat(result.getDataFormat(), is((short) 1));
        assertThat(result.getFillBackgroundColor(), is(nullValue()));
        assertThat(result.getFillForegroundColor(), is((short) 1));
        assertThat(result.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(result.getHidden(), is(false));
        assertThat(result.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(result.getIndent(), is((short) 1));
        assertThat(result.getLeftBorderColor(), is((short) 1));
        assertThat(result.getLocked(), is(false));
        assertThat(result.getQuotePrefix(), is(false));
        assertThat(result.getRightBorderColor(), is((short) 1));
        assertThat(result.getRotation(), is((short) 1));
        assertThat(result.getShrinkToFit(), is(false));
        assertThat(result.getTopBorderColor(), is((short) 1));
        assertThat(result.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(result.getWrapped(), is(false));
        assertThat(result.getWriteFont().getBold(), is(false));
        assertThat(result.getWriteFont().getCharset(), is(1));
        assertThat(result.getWriteFont().getColor(), is((short) 1));
        assertThat(result.getWriteFont().getFontHeightInPoints(), is((short) 1));
        assertThat(result.getWriteFont().getFontName(), is("Acme"));
        assertThat(result.getWriteFont().getItalic(), is(false));
        assertThat(result.getWriteFont().getStrikeout(), is(false));
        assertThat(result.getWriteFont().getTypeOffset(), is((short) 1));
        assertThat(result.getWriteFont().getUnderline(), is((byte) 1));
    }

    @Test
    void build4() {

        // arrange
        StyleProperty styleProperty = new StyleProperty();
        styleProperty.setBorderBottom(BorderStyle.NONE);
        styleProperty.setBorderLeft(BorderStyle.NONE);
        styleProperty.setBorderRight(BorderStyle.NONE);
        styleProperty.setBorderTop(BorderStyle.NONE);
        styleProperty.setBottomBorderColor((short) 1);
        styleProperty.setDataFormat((short) 1);
        styleProperty.setFillBackgroundColor((short) 1);
        styleProperty.setFillForegroundColor((short) -1);
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
        FontProperty fontProperty = new FontProperty();
        fontProperty.setBold(false);
        fontProperty.setCharset(1);
        fontProperty.setColor((short) 1);
        fontProperty.setFontHeightInPoints((short) 1);
        fontProperty.setFontName("Acme");
        fontProperty.setItalic(false);
        fontProperty.setStrikeout(false);
        fontProperty.setTypeOffset((short) 1);
        fontProperty.setUnderline((byte) 1);

        // act
        WriteCellStyle result = WriteCellStyle.build(styleProperty, fontProperty);

        // assert
        assertThat(result.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(result.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(result.getBorderRight(), is(BorderStyle.NONE));
        assertThat(result.getBorderTop(), is(BorderStyle.NONE));
        assertThat(result.getBottomBorderColor(), is((short) 1));
        assertThat(result.getDataFormat(), is((short) 1));
        assertThat(result.getFillBackgroundColor(), is((short) 1));
        assertThat(result.getFillForegroundColor(), is(nullValue()));
        assertThat(result.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(result.getHidden(), is(false));
        assertThat(result.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(result.getIndent(), is((short) 1));
        assertThat(result.getLeftBorderColor(), is((short) 1));
        assertThat(result.getLocked(), is(false));
        assertThat(result.getQuotePrefix(), is(false));
        assertThat(result.getRightBorderColor(), is((short) 1));
        assertThat(result.getRotation(), is((short) 1));
        assertThat(result.getShrinkToFit(), is(false));
        assertThat(result.getTopBorderColor(), is((short) 1));
        assertThat(result.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(result.getWrapped(), is(false));
        assertThat(result.getWriteFont().getBold(), is(false));
        assertThat(result.getWriteFont().getCharset(), is(1));
        assertThat(result.getWriteFont().getColor(), is((short) 1));
        assertThat(result.getWriteFont().getFontHeightInPoints(), is((short) 1));
        assertThat(result.getWriteFont().getFontName(), is("Acme"));
        assertThat(result.getWriteFont().getItalic(), is(false));
        assertThat(result.getWriteFont().getStrikeout(), is(false));
        assertThat(result.getWriteFont().getTypeOffset(), is((short) 1));
        assertThat(result.getWriteFont().getUnderline(), is((byte) 1));
    }

    @Test
    void build5() {

        // arrange
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
        styleProperty.setHidden(true);
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
        FontProperty fontProperty = new FontProperty();
        fontProperty.setBold(false);
        fontProperty.setCharset(1);
        fontProperty.setColor((short) 1);
        fontProperty.setFontHeightInPoints((short) 1);
        fontProperty.setFontName("Acme");
        fontProperty.setItalic(false);
        fontProperty.setStrikeout(false);
        fontProperty.setTypeOffset((short) 1);
        fontProperty.setUnderline((byte) 1);

        // act
        WriteCellStyle result = WriteCellStyle.build(styleProperty, fontProperty);

        // assert
        assertThat(result.getBorderBottom(), is(BorderStyle.NONE));
        assertThat(result.getBorderLeft(), is(BorderStyle.NONE));
        assertThat(result.getBorderRight(), is(BorderStyle.NONE));
        assertThat(result.getBorderTop(), is(BorderStyle.NONE));
        assertThat(result.getBottomBorderColor(), is((short) 1));
        assertThat(result.getDataFormat(), is((short) 1));
        assertThat(result.getFillBackgroundColor(), is((short) 1));
        assertThat(result.getFillForegroundColor(), is((short) 1));
        assertThat(result.getFillPatternType(), is(FillPatternType.NO_FILL));
        assertThat(result.getHidden(), is(true));
        assertThat(result.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
        assertThat(result.getIndent(), is((short) 1));
        assertThat(result.getLeftBorderColor(), is((short) 1));
        assertThat(result.getLocked(), is(false));
        assertThat(result.getQuotePrefix(), is(false));
        assertThat(result.getRightBorderColor(), is((short) 1));
        assertThat(result.getRotation(), is((short) 1));
        assertThat(result.getShrinkToFit(), is(false));
        assertThat(result.getTopBorderColor(), is((short) 1));
        assertThat(result.getVerticalAlignment(), is(VerticalAlignment.TOP));
        assertThat(result.getWrapped(), is(false));
        assertThat(result.getWriteFont().getBold(), is(false));
        assertThat(result.getWriteFont().getCharset(), is(1));
        assertThat(result.getWriteFont().getColor(), is((short) 1));
        assertThat(result.getWriteFont().getFontHeightInPoints(), is((short) 1));
        assertThat(result.getWriteFont().getFontName(), is("Acme"));
        assertThat(result.getWriteFont().getItalic(), is(false));
        assertThat(result.getWriteFont().getStrikeout(), is(false));
        assertThat(result.getWriteFont().getTypeOffset(), is((short) 1));
        assertThat(result.getWriteFont().getUnderline(), is((byte) 1));
    }

    @Test
    void buildStylePropertyIsNull() {

        // arrange
        FontProperty fontProperty = new FontProperty();
        fontProperty.setBold(false);
        fontProperty.setCharset(1);
        fontProperty.setColor((short) 1);
        fontProperty.setFontHeightInPoints((short) 1);
        fontProperty.setFontName("Acme");
        fontProperty.setItalic(false);
        fontProperty.setStrikeout(false);
        fontProperty.setTypeOffset((short) 1);
        fontProperty.setUnderline((byte) 1);

        // act
        WriteCellStyle result = WriteCellStyle.build(null, fontProperty);

        // assert
        assertThat(result.getBorderBottom(), is(nullValue()));
        assertThat(result.getBorderLeft(), is(nullValue()));
        assertThat(result.getBorderRight(), is(nullValue()));
        assertThat(result.getBorderTop(), is(nullValue()));
        assertThat(result.getBottomBorderColor(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getFillBackgroundColor(), is(nullValue()));
        assertThat(result.getFillForegroundColor(), is(nullValue()));
        assertThat(result.getFillPatternType(), is(nullValue()));
        assertThat(result.getHidden(), is(nullValue()));
        assertThat(result.getHorizontalAlignment(), is(nullValue()));
        assertThat(result.getIndent(), is(nullValue()));
        assertThat(result.getLeftBorderColor(), is(nullValue()));
        assertThat(result.getLocked(), is(nullValue()));
        assertThat(result.getQuotePrefix(), is(nullValue()));
        assertThat(result.getRightBorderColor(), is(nullValue()));
        assertThat(result.getRotation(), is(nullValue()));
        assertThat(result.getShrinkToFit(), is(nullValue()));
        assertThat(result.getTopBorderColor(), is(nullValue()));
        assertThat(result.getVerticalAlignment(), is(nullValue()));
        assertThat(result.getWrapped(), is(nullValue()));
        assertThat(result.getWriteFont().getBold(), is(false));
        assertThat(result.getWriteFont().getCharset(), is(1));
        assertThat(result.getWriteFont().getColor(), is((short) 1));
        assertThat(result.getWriteFont().getFontHeightInPoints(), is((short) 1));
        assertThat(result.getWriteFont().getFontName(), is("Acme"));
        assertThat(result.getWriteFont().getItalic(), is(false));
        assertThat(result.getWriteFont().getStrikeout(), is(false));
        assertThat(result.getWriteFont().getTypeOffset(), is((short) 1));
        assertThat(result.getWriteFont().getUnderline(), is((byte) 1));
    }
}
