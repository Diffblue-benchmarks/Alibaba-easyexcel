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
    void isEmptyCollectionIsFooReturnsFalse() {
        LinkedList<String> collection = new LinkedList<String>();
        collection.add("foo");
        assertThat(CollectionUtils.isEmpty(collection), is(false));
    }

    @Test
    void isEmpty1() {
        assertThat(CollectionUtils.isEmpty(new HashMap<String, String>()), is(true));
    }

    @Test
    void isEmpty2() {
        assertThat(CollectionUtils.isEmpty((HashMap<String, String>) null), is(true));
        assertThat(CollectionUtils.isEmpty(new LinkedList<String>()), is(true));
        assertThat(CollectionUtils.isEmpty((LinkedList<String>) null), is(true));
    }

    @Test
    void isEmptyReturnsFalse() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("", "foo");
        assertThat(CollectionUtils.isEmpty(map), is(false));
    }
}
