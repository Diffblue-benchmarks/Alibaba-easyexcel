package com.alibaba.excel.metadata.format;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.format.ExcelGeneralNumberFormat
 *
 * @author Diffblue Cover
 */

class ExcelGeneralNumberFormatTest {

    @Test
    void format() {
        assertThat(new ExcelGeneralNumberFormat(new Locale("en"), false).format(1), is("1"));
        assertThat(new ExcelGeneralNumberFormat(new Locale("en"), true).format(1), is("1"));
        assertThat(new ExcelGeneralNumberFormat(new Locale("en"), false).format(0), is("0"));
    }
}
