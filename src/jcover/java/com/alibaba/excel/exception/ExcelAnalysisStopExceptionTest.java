package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelAnalysisStopException
 *
 * @author Diffblue Cover
 */

class ExcelAnalysisStopExceptionTest {

    @Test
    void factory1() {
        ExcelAnalysisStopException excelAnalysisStopException =
             new ExcelAnalysisStopException("an error has happened");
        assertThat(excelAnalysisStopException.getCause(), is(nullValue()));
        assertThat(excelAnalysisStopException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory2() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelAnalysisStopException excelAnalysisStopException =
             new ExcelAnalysisStopException("an error has happened", cause);
        assertThat(excelAnalysisStopException.getCause().getCause(), is(nullValue()));
        assertThat(excelAnalysisStopException.getCause().getMessage(), is(nullValue()));
        assertThat(excelAnalysisStopException.getMessage(), is("an error has happened"));
    }

    @Test
    void factory3() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        ExcelAnalysisStopException excelAnalysisStopException =
             new ExcelAnalysisStopException(cause);
        assertThat(excelAnalysisStopException.getCause().getCause(), is(nullValue()));
        assertThat(excelAnalysisStopException.getCause().getMessage(), is(nullValue()));
        assertThat(excelAnalysisStopException.getMessage(), is("java.lang.Exception"));
    }
}
