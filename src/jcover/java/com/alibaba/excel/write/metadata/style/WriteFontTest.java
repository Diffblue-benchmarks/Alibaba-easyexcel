package com.alibaba.excel.write.metadata.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.style.WriteFont
 *
 * @author Diffblue Cover
 */

class WriteFontTest {

    @Test
    void factory() {
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
        assertThat(writeFont.getBold(), is(false));
        assertThat(writeFont.getCharset(), is(1));
        assertThat(writeFont.getColor(), is((short) 1));
        assertThat(writeFont.getFontHeightInPoints(), is((short) 1));
        assertThat(writeFont.getFontName(), is("Acme"));
        assertThat(writeFont.getItalic(), is(false));
        assertThat(writeFont.getStrikeout(), is(false));
        assertThat(writeFont.getTypeOffset(), is((short) 1));
        assertThat(writeFont.getUnderline(), is((byte) 1));
    }
}
