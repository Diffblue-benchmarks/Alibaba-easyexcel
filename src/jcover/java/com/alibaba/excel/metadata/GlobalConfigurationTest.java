package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.GlobalConfiguration
 *
 * @author Diffblue JCover
 */

public class GlobalConfigurationTest {

    @Test(timeout=10000)
    public void getAutoTrimReturnsNull() {
        assertThat(new GlobalConfiguration().getAutoTrim(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUse1904windowingReturnsNull() {
        assertThat(new GlobalConfiguration().getUse1904windowing(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAutoTrimToFalse() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        assertThat(globalConfiguration.getAutoTrim(), is(false));
    }

    @Test(timeout=10000)
    public void setUse1904windowingToFalse() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setUse1904windowing(false);
        assertThat(globalConfiguration.getUse1904windowing(), is(false));
    }
}
