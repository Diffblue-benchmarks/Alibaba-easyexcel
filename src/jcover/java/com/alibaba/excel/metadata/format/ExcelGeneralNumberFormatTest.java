package com.alibaba.excel.metadata.format;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.text.FieldPosition;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.format.ExcelGeneralNumberFormat
 *
 * @author Diffblue Cover
 */

class ExcelGeneralNumberFormatTest {

    @Test
    void formatNumberIsOne() {
        StringBuffer toAppendTo = new StringBuffer("foo");
        FieldPosition pos = new FieldPosition(1);
        assertThat(new ExcelGeneralNumberFormat(new Locale("en"), true).format(1, toAppendTo, pos), sameInstance(toAppendTo));
        assertThat(toAppendTo.toString(), is("foo1"));
        assertThat(pos.getBeginIndex(), is(4));
        assertThat(pos.getEndIndex(), is(4));
    }

    @Test
    void formatNumberIsZero() {
        StringBuffer toAppendTo = new StringBuffer("foo");
        FieldPosition pos = new FieldPosition(1);
        assertThat(new ExcelGeneralNumberFormat(new Locale("en"), false).format(0, toAppendTo, pos), sameInstance(toAppendTo));
        assertThat(toAppendTo.toString(), is("foo0"));
        assertThat(pos.getBeginIndex(), is(4));
        assertThat(pos.getEndIndex(), is(4));
    }

    @Test
    void format() {
        assertThat(new ExcelGeneralNumberFormat(new Locale("en"), false).format(1), is("1"));
    }
}
