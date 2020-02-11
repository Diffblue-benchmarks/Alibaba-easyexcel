package com.alibaba.excel.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.exception.ExcelGenerateException
 *
 * @author Diffblue JCover
 */

public class ExcelGenerateExceptionTest {

    @Test(timeout=10000)
    public void constructor() {
        ExcelGenerateException excelGenerateException = new ExcelGenerateException("jpg");
        assertThat(excelGenerateException.getCause(), is(nullValue()));
        assertThat(excelGenerateException.getLocalizedMessage(), is("jpg"));
        assertThat(excelGenerateException.getMessage(), is("jpg"));
        // array literal with unexpected element type StackTraceElement
        // array literal with unexpected element type Throwable
    }
}
