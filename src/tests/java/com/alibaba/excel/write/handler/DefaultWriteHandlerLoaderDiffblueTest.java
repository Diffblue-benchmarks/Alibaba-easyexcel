package com.alibaba.excel.write.handler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.handler.DefaultWriteHandlerLoader
 *
 * @author Diffblue JCover
 */

public class DefaultWriteHandlerLoaderDiffblueTest {

    @Test(timeout=10000)
    public void loadDefaultHandler() {
        assertTrue(DefaultWriteHandlerLoader.loadDefaultHandler(false).isEmpty());
        assertThat(DefaultWriteHandlerLoader.loadDefaultHandler(true).size(), is(1));
        // pojo WriteHandler
    }
}
