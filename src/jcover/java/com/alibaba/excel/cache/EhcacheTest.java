package com.alibaba.excel.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.cache.Ehcache
 *
 * @author Diffblue JCover
 */

public class EhcacheTest {

    @Test(timeout=10000)
    public void get() {
        assertThat(new Ehcache(1).get(-1), is(nullValue()));
        assertThat(new Ehcache(1).get(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void putFinished() {
        new Ehcache(1).putFinished();
    }

    @Test(timeout=10000)
    public void putValueIsFoo() {
        new Ehcache(1).put("foo");
    }
}
