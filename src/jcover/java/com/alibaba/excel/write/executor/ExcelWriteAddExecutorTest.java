package com.alibaba.excel.write.executor;

import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.WriteContext;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.executor.ExcelWriteAddExecutor
 *
 * @author Diffblue JCover
 */

public class ExcelWriteAddExecutorTest {

    @Test(timeout=10000)
    public void addDataIsEmpty() {
        WriteContext writeContext = mock(WriteContext.class);
        new ExcelWriteAddExecutor(writeContext).add(new ArrayList());
    }
}
