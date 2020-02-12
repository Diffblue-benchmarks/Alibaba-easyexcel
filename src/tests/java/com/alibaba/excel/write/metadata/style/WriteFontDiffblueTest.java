package com.alibaba.excel.write.metadata.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.style.WriteFont
 *
 * @author Diffblue JCover
 */

public class WriteFontDiffblueTest {

    @Test(timeout=10000)
    public void getBoldReturnsNull() {
        assertThat(new WriteFont().getBold(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCharsetReturnsNull() {
        assertThat(new WriteFont().getCharset(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getColorReturnsNull() {
        assertThat(new WriteFont().getColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFontHeightInPointsReturnsNull() {
        assertThat(new WriteFont().getFontHeightInPoints(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFontNameReturnsNull() {
        assertThat(new WriteFont().getFontName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getItalicReturnsNull() {
        assertThat(new WriteFont().getItalic(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStrikeoutReturnsNull() {
        assertThat(new WriteFont().getStrikeout(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeOffsetReturnsNull() {
        assertThat(new WriteFont().getTypeOffset(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUnderlineReturnsNull() {
        assertThat(new WriteFont().getUnderline(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setBoldToFalse() {
        WriteFont writeFont = new WriteFont();
        writeFont.setBold(false);
        assertThat(writeFont.getBold(), is(false));
    }

    @Test(timeout=10000)
    public void setCharsetToOne() {
        WriteFont writeFont = new WriteFont();
        writeFont.setCharset(1);
        assertThat(writeFont.getCharset(), is(1));
    }

    @Test(timeout=10000)
    public void setColorToOne() {
        WriteFont writeFont = new WriteFont();
        writeFont.setColor((short)1);
        assertThat(writeFont.getColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setFontHeightInPointsToOne() {
        WriteFont writeFont = new WriteFont();
        writeFont.setFontHeightInPoints((short)1);
        assertThat(writeFont.getFontHeightInPoints(), is((short)1));
    }

    @Test(timeout=10000)
    public void setFontName() {
        WriteFont writeFont = new WriteFont();
        writeFont.setFontName("/bin/bash");
        assertThat(writeFont.getFontName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setItalicToFalse() {
        WriteFont writeFont = new WriteFont();
        writeFont.setItalic(false);
        assertThat(writeFont.getItalic(), is(false));
    }

    @Test(timeout=10000)
    public void setStrikeoutToFalse() {
        WriteFont writeFont = new WriteFont();
        writeFont.setStrikeout(false);
        assertThat(writeFont.getStrikeout(), is(false));
    }

    @Test(timeout=10000)
    public void setTypeOffsetToOne() {
        WriteFont writeFont = new WriteFont();
        writeFont.setTypeOffset((short)1);
        assertThat(writeFont.getTypeOffset(), is((short)1));
    }

    @Test(timeout=10000)
    public void setUnderlineToOne() {
        WriteFont writeFont = new WriteFont();
        writeFont.setUnderline((byte)1);
        assertThat(writeFont.getUnderline(), is((byte)1));
    }
}
