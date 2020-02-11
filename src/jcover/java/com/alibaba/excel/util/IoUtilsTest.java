package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.IoUtils
 *
 * @author Diffblue JCover
 */

public class IoUtilsTest {

    @Test(timeout=10000)
    public void copy() throws java.io.IOException {
        assertThat(IoUtils.copy(new StringBufferInputStream("Broadway"), new ByteArrayOutputStream()), is(8));
        assertThat(IoUtils.copy(new StringBufferInputStream(""), new ByteArrayOutputStream()), is(0));
    }

    @Test(timeout=10000)
    public void toByteArray() throws java.io.IOException {
        assertArrayEquals(new byte[] { 98, 97, 114 }, IoUtils.toByteArray(new StringBufferInputStream("bar")));
        assertArrayEquals(new byte[] { 66 }, IoUtils.toByteArray(new StringBufferInputStream("Broadway"), 1));
        assertArrayEquals(new byte[] { }, IoUtils.toByteArray(new StringBufferInputStream("Broadway"), 0));
    }
}
