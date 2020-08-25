package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        globalConfiguration.setUse1904windowing(false);
        assertThat(globalConfiguration.getAutoTrim(), is(false));
        assertThat(globalConfiguration.getUse1904windowing(), is(false));
    }
}
