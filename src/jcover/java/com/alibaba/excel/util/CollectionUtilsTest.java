package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.CollectionUtils
 *
 * @author Diffblue Cover
 */

class CollectionUtilsTest {

    @Test
    void isEmptyReturnsFalse() {
        LinkedList<Object> collection = new LinkedList<Object>();
        collection.add("foo");
        assertThat(CollectionUtils.isEmpty(collection), is(false));
    }

    @Test
    void isEmpty1() throws java.io.IOException, CloneNotSupportedException {
        assertThat(CollectionUtils.isEmpty(new HashMap<Object, Object>()), is(true));
    }

    @Test
    void isEmpty2() {
        assertThat(CollectionUtils.isEmpty((HashMap<Object, Object>) null), is(true));
        assertThat(CollectionUtils.isEmpty(new LinkedList<Object>()), is(true));
        assertThat(CollectionUtils.isEmpty((LinkedList<Object>) null), is(true));
    }
}
