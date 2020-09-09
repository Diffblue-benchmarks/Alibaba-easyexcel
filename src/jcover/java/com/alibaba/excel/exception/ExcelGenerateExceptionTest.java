package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelGenerateException
 *
 * @author Diffblue Cover
 */

class ExcelGenerateExceptionTest {

    @Test
    void factory() {
        ExcelGenerateException excelGenerateException = new ExcelGenerateException("jpg");
        assertThat(excelGenerateException.getCause(), is(nullValue()));
        assertThat(excelGenerateException.getMessage(), is("jpg"));
    }
}
