package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.Font
 *
 * @author Diffblue JCover
 */

public class FontTest {

    @Test(timeout=10000)
    public void getFontHeightInPointsReturnsZero() {
        assertThat(new Font().getFontHeightInPoints(), is((short)0));
    }

    @Test(timeout=10000)
    public void getFontNameReturnsNull() {
        assertThat(new Font().getFontName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isBoldReturnsFalse() {
        assertThat(new Font().isBold(), is(false));
    }

    @Test(timeout=10000)
    public void setBoldToFalse() {
        new Font().setBold(false);
    }

    @Test(timeout=10000)
    public void setFontHeightInPointsToOne() {
        Font font = new Font();
        font.setFontHeightInPoints((short)1);
        assertThat(font.getFontHeightInPoints(), is((short)1));
    }

    @Test(timeout=10000)
    public void setFontName() {
        Font font = new Font();
        font.setFontName("/bin/bash");
        assertThat(font.getFontName(), is("/bin/bash"));
    }
}
