package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelCommonException
 *
 * @author Diffblue Cover
 */

class ExcelCommonExceptionTest {

    @Test
    void factory1() {
        ExcelCommonException excelCommonException =
             new ExcelCommonException("an error has happened");
        assertThat(excelCommonException.getCause(), is(nullValue()));
        assertThat(excelCommonException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelCommonException excelCommonException =
             new ExcelCommonException("an error has happened", cause);
        assertThat(excelCommonException.getCause().getCause(), is(nullValue()));
        assertThat(excelCommonException.getCause().getMessage(), is(nullValue()));
        assertThat(excelCommonException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory3() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelCommonException excelCommonException =
             new ExcelCommonException(cause);
        assertThat(excelCommonException.getCause().getCause(), is(nullValue()));
        assertThat(excelCommonException.getCause().getMessage(), is(nullValue()));
        assertThat(excelCommonException.getMessage(), is("java.lang.Exception"));
    }
}
