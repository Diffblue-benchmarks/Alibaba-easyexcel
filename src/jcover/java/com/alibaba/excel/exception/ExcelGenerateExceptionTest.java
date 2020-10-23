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
    void factory1() {
        ExcelGenerateException excelGenerateException =
             new ExcelGenerateException("an error has happened");
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        excelGenerateException.setStackTrace(stackTrace);
        assertThat(excelGenerateException.getCause(), is(nullValue()));
        assertThat(excelGenerateException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelGenerateException excelGenerateException =
             new ExcelGenerateException("an error has happened", cause);
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        excelGenerateException.setStackTrace(stackTrace);
        assertThat(excelGenerateException.getCause().getCause(), is(nullValue()));
        assertThat(excelGenerateException.getCause().getMessage(), is(nullValue()));
        assertThat(excelGenerateException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory3() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelGenerateException excelGenerateException =
             new ExcelGenerateException(cause);
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        excelGenerateException.setStackTrace(stackTrace);
        assertThat(excelGenerateException.getCause().getCause(), is(nullValue()));
        assertThat(excelGenerateException.getCause().getMessage(), is(nullValue()));
        assertThat(excelGenerateException.getMessage(), is("java.lang.Exception"));
    }
}
