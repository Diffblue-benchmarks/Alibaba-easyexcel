package com.alibaba.excel.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.cache.MapCache
 *
 * @author Diffblue Cover
 */

class MapCacheTest {

    @Test
    void putValueIsValue() {
        new MapCache().put("value");
    }

    @Test
    void get() {
        assertThat(new MapCache().get(-1), is(nullValue()));
        assertThat(new MapCache().get(null), is(nullValue()));
        assertThat(new MapCache().get(1), is(nullValue()));
    }

    @Test
    void putFinished() {
        new MapCache().putFinished();
    }

    @Test
    void destroy() {
        new MapCache().destroy();
    }
}
