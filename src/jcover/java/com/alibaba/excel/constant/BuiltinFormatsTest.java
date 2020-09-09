package com.alibaba.excel.constant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.constant.BuiltinFormats
 *
 * @author Diffblue Cover
 */

class BuiltinFormatsTest {

    @Test
    void getBuiltinFormat() {
        assertThat(BuiltinFormats.getBuiltinFormat(-1, "0x00E00", new Locale("en")), is("0x00E00"));
        assertThat(BuiltinFormats.getBuiltinFormat(null, "0x00E00", new Locale("en")), is("0x00E00"));
        assertThat(BuiltinFormats.getBuiltinFormat(1, "0x00E00", new Locale("en")), is("0"));
        assertThat(BuiltinFormats.getBuiltinFormat(1, "yyyy-MM-dd", null), is("0"));
    }
}
