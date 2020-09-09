package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.GlobalConfiguration
 *
 * @author Diffblue Cover
 */

class GlobalConfigurationTest {

    @Test
    void factory() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        Locale locale = new Locale("en");
        globalConfiguration.setLocale(locale);
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        assertThat(globalConfiguration.getAutoTrim(), is(false));
        assertThat(globalConfiguration.getLocale(), sameInstance(locale));
        assertThat(globalConfiguration.getUse1904windowing(), is(false));
        assertThat(globalConfiguration.getUseScientificFormat(), is(false));
    }
}
