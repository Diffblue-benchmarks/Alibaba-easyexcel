package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.IoUtils
 *
 * @author Diffblue Cover
 */

class IoUtilsTest {

    @Test
    void toByteArray() throws java.io.IOException {
        assertArrayEquals(new byte[] { 98, 97, 114 }, IoUtils.toByteArray(new StringBufferInputStream("bar")));
        assertArrayEquals(new byte[] { 102 }, IoUtils.toByteArray(new StringBufferInputStream("foo"), 1));
    }

    @Test
    void toByteArraySizeIsZeroReturnsEmpty() throws java.io.IOException {
        assertThat(IoUtils.toByteArray(new StringBufferInputStream("foo"), 0).length, is(0));
    }

    @Test
    void copyReturnsThree() throws java.io.IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertThat(IoUtils.copy(new StringBufferInputStream("foo"), output), is(3));
        assertArrayEquals(new byte[] { 102, 111, 111 }, output.toByteArray());
    }

    @Test
    void copyReturnsZero() throws java.io.IOException {
        assertThat(IoUtils.copy(new StringBufferInputStream(""), new ByteArrayOutputStream()), is(0));
    }
}
