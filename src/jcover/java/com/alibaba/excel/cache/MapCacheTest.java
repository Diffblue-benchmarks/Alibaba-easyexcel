package com.alibaba.excel.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.cache.MapCache
 *
 * @author Diffblue JCover
 */

public class MapCacheTest {

    @Test(timeout=10000)
    public void destroy() {
        new MapCache().destroy();
    }

    @Test(timeout=10000)
    public void get() {
        assertThat(new MapCache().get(-1), is(nullValue()));
        assertThat(new MapCache().get(null), is(nullValue()));
        assertThat(new MapCache().get(1), is(nullValue()));
    }

    @Test(timeout=10000)
    public void init() {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        new MapCache().init(analysisContext);
    }

    @Test(timeout=10000)
    public void putFinished() {
        new MapCache().putFinished();
    }

    @Test(timeout=10000)
    public void putValueIsFoo() {
        new MapCache().put("foo");
    }
}
