package com.alibaba.excel.write.handler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.handler.DefaultWriteHandlerLoader
 *
 * @author Diffblue Cover
 */

class DefaultWriteHandlerLoaderTest {

    @Test
    void loadDefaultHandlerUseDefaultStyleIsFalseReturnsEmpty() {
        assertThat(DefaultWriteHandlerLoader.loadDefaultHandler(false), empty());
    }

    @Test
    void loadDefaultHandlerUseDefaultStyleIsTrue() {
        List<WriteHandler> result = DefaultWriteHandlerLoader.loadDefaultHandler(true);
        assertThat(result.size(), is(1));
        // pojo WriteHandler
    }
}
