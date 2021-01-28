package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.metadata.GlobalConfiguration;

import java.util.Locale;
import java.util.regex.Pattern;

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
        assertThat(NumberDataFormatterUtils.format(1.0, 1, "yyyy-MM-dd", globalConfiguration), matchesPattern("\\d{4}-\\d{1,2}-\\d{1,2}"));
    }

    @Test
    void format2() {
        GlobalConfiguration globalConfiguration =
             mock(GlobalConfiguration.class);
        assertThat(NumberDataFormatterUtils.format(1.0, 1, "yyyy-MM-dd", globalConfiguration), matchesPattern("\\d{4}-\\d{1,2}-\\d{1,2}"));
    }

    @Test
    void removeThreadLocalCache() {
        NumberDataFormatterUtils.removeThreadLocalCache();
    }
}
