package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.CollectionUtils
 *
 * @author Diffblue JCover
 */

public class CollectionUtilsDiffblueTest {

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(CollectionUtils.isEmpty(new LinkedList<Object>()), is(true));
        assertThat(CollectionUtils.isEmpty((java.util.Collection<?>)null), is(true));
        assertThat(CollectionUtils.isEmpty(new HashMap<Object, Object>()), is(true));
        assertThat(CollectionUtils.isEmpty((java.util.Map<?, ?>)null), is(true));
    }

    @Test(timeout=10000)
    public void isEmptyReturnsFalse1() {
        Collection<?> collection = new LinkedList<Object>();
        ((LinkedList<Object>)collection).add(new Object());
        assertThat(CollectionUtils.isEmpty(collection), is(false));
    }

    @Test(timeout=10000)
    public void isEmptyReturnsFalse2() {
        Map<?, ?> map = new HashMap<Object, Object>();
        ((HashMap<Object, Object>)map).put(new Object(), new Object());
        assertThat(CollectionUtils.isEmpty(map), is(false));
    }
}
