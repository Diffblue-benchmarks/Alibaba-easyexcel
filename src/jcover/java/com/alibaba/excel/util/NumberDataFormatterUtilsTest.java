package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.metadata.GlobalConfiguration;

import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.NumberDataFormatterUtils
 *
 * @author Diffblue Cover
 */

class NumberDataFormatterUtilsTest {

    @Test
    void format1() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        assertThat(NumberDataFormatterUtils.format(1.0, 1, "yyyy-MM-dd", globalConfiguration), is("1900-01-01"));
    }

    @Test
    void format2() {
        assertThat(NumberDataFormatterUtils.format(1.0, 1, "yyyy-MM-dd", new GlobalConfiguration()), is("1900-01-01"));
    }

    @Test
    void removeThreadLocalCache() {
        NumberDataFormatterUtils.removeThreadLocalCache();
    }
}
