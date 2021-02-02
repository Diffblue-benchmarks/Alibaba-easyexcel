package com.alibaba.excel.metadata.format;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anEmptyMap;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.text.AttributedCharacterIterator;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.format.ExcelGeneralNumberFormat
 *
 * @author Diffblue Cover
 */

class ExcelGeneralNumberFormatTest {

    @Test
    void formatToCharacterIterator1() {
        AttributedCharacterIterator result =
             new ExcelGeneralNumberFormat(new Locale("en"), false).formatToCharacterIterator(1);
        assertThat(result.getAllAttributeKeys(), empty());
        assertThat(result.getAttributes(), anEmptyMap());
        assertThat(result.getRunLimit(), is(1));
        assertThat(result.getRunStart(), is(0));
    }

    @Test
    void formatToCharacterIterator2() {
        AttributedCharacterIterator result =
             new ExcelGeneralNumberFormat(new Locale("en"), true).formatToCharacterIterator(1);
        assertThat(result.getAllAttributeKeys(), empty());
        assertThat(result.getAttributes(), anEmptyMap());
        assertThat(result.getRunLimit(), is(1));
        assertThat(result.getRunStart(), is(0));
    }

    @Test
    void formatToCharacterIterator3() {
        AttributedCharacterIterator result =
             new ExcelGeneralNumberFormat(new Locale("en"), false).formatToCharacterIterator(0);
        assertThat(result.getAllAttributeKeys(), empty());
        assertThat(result.getAttributes(), anEmptyMap());
        assertThat(result.getRunLimit(), is(1));
        assertThat(result.getRunStart(), is(0));
    }
}
