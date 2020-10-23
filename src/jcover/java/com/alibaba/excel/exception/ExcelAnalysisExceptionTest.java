package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelAnalysisException
 *
 * @author Diffblue Cover
 */

class ExcelAnalysisExceptionTest {

    @Test
    void factory1() {
        ExcelAnalysisException excelAnalysisException =
             new ExcelAnalysisException("an error has happened");
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        excelAnalysisException.setStackTrace(stackTrace);
        assertThat(excelAnalysisException.getCause(), is(nullValue()));
        assertThat(excelAnalysisException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelAnalysisException excelAnalysisException =
             new ExcelAnalysisException("an error has happened", cause);
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        excelAnalysisException.setStackTrace(stackTrace);
        assertThat(excelAnalysisException.getCause().getCause(), is(nullValue()));
        assertThat(excelAnalysisException.getCause().getMessage(), is(nullValue()));
        assertThat(excelAnalysisException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory3() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelAnalysisException excelAnalysisException =
             new ExcelAnalysisException(cause);
        StackTraceElement[] stackTrace =
             new StackTraceElement[] { new StackTraceElement("java.lang.Object", "toString", "Object.java", 1) };
        excelAnalysisException.setStackTrace(stackTrace);
        assertThat(excelAnalysisException.getCause().getCause(), is(nullValue()));
        assertThat(excelAnalysisException.getCause().getMessage(), is(nullValue()));
        assertThat(excelAnalysisException.getMessage(), is("java.lang.Exception"));
    }
}
