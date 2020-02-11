package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.BooleanUtils
 *
 * @author Diffblue JCover
 */

public class BooleanUtilsTest {

    @Test(timeout=10000)
    public void valueOf() {
        assertThat(BooleanUtils.valueOf("1"), is(true));
        assertThat(BooleanUtils.valueOf("foo"), is(false));
    }
}
