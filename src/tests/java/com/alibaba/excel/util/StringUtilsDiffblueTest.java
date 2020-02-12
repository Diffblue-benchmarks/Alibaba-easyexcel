package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.StringUtils
 *
 * @author Diffblue JCover
 */

public class StringUtilsDiffblueTest {

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(StringUtils.isEmpty(""), is(true));
        assertThat(StringUtils.isEmpty("foo"), is(false));
        assertThat(StringUtils.isEmpty(null), is(true));
    }
}
