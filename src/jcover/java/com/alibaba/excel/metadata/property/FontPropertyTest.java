package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.FontProperty
 *
 * @author Diffblue Cover
 */

class FontPropertyTest {

    @Test
    void factory() {
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
        assertThat(fontProperty.getBold(), is(false));
        assertThat(fontProperty.getCharset(), is(1));
        assertThat(fontProperty.getColor(), is((short) 1));
        assertThat(fontProperty.getFontHeightInPoints(), is((short) 1));
        assertThat(fontProperty.getFontName(), is("Acme"));
        assertThat(fontProperty.getItalic(), is(false));
        assertThat(fontProperty.getStrikeout(), is(false));
        assertThat(fontProperty.getTypeOffset(), is((short) 1));
        assertThat(fontProperty.getUnderline(), is((byte) 1));
    }

    @Test
    void build() {
        assertThat(FontProperty.build((com.alibaba.excel.annotation.write.style.ContentFontStyle) null), is(nullValue()));
        assertThat(FontProperty.build((com.alibaba.excel.annotation.write.style.HeadFontStyle) null), is(nullValue()));
    }
}
