package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.BooleanUtils
 *
 * @author Diffblue Cover
 */

class BooleanUtilsTest {

    @Test
    void valueOf() {
        assertThat(BooleanUtils.valueOf("1"), is(true));
        assertThat(BooleanUtils.valueOf("value"), is(false));
    }
}
