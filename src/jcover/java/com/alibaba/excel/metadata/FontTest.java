package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Font
 *
 * @author Diffblue Cover
 */

class FontTest {

    @Test
    void factory() {
        Font font = new Font();
        font.setBold(false);
        font.setFontHeightInPoints((short) 1);
        font.setFontName("Acme");
        assertThat(font.getFontHeightInPoints(), is((short) 1));
        assertThat(font.getFontName(), is("Acme"));
        assertThat(font.isBold(), is(false));
    }
}
