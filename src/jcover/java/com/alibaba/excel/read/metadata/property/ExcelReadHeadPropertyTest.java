package com.alibaba.excel.read.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.metadata.Holder;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty
 *
 * @author Diffblue JCover
 */

public class ExcelReadHeadPropertyTest {

    @Test(timeout=10000)
    public void hasHeadReturnsTrue() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelReadHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).hasHead(), is(true));
    }
}
