package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.holder.ReadHolder;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.ConverterUtils
 *
 * @author Diffblue Cover
 */

class ConverterUtilsTest {

    @Test
    void convertToStringMapReturnsEmpty() throws java.io.IOException, CloneNotSupportedException {
        ReadHolder readHolder = mock(ReadHolder.class);
        AnalysisContext context = mock(AnalysisContext.class);
        when(context.currentReadHolder())
            .thenReturn(readHolder);
        assertThat(ConverterUtils.convertToStringMap(new HashMap<Integer, CellData>(), context).isEmpty(), is(true));
    }
}
