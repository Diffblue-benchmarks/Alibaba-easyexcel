package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.ReadBasicParameter
 *
 * @author Diffblue JCover
 */

public class ReadBasicParameterTest {

    @Test(timeout=10000)
    public void getCustomReadListenerListReturnsEmpty() {
        ReadBasicParameter readBasicParameter = new ReadBasicParameter();
        List<com.alibaba.excel.read.listener.ReadListener> result = readBasicParameter.getCustomReadListenerList();
        assertTrue(result.isEmpty());
        assertThat(readBasicParameter.getCustomReadListenerList(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getHeadRowNumberReturnsNull() {
        assertThat(new ReadBasicParameter().getHeadRowNumber(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCustomReadListenerListToEmpty() {
        ReadBasicParameter readBasicParameter = new ReadBasicParameter();
        List<com.alibaba.excel.read.listener.ReadListener> customReadListenerList = new ArrayList<com.alibaba.excel.read.listener.ReadListener>();
        readBasicParameter.setCustomReadListenerList(customReadListenerList);
        assertThat(readBasicParameter.getCustomReadListenerList(), sameInstance(customReadListenerList));
    }

    @Test(timeout=10000)
    public void setHeadRowNumberToOne() {
        ReadBasicParameter readBasicParameter = new ReadBasicParameter();
        readBasicParameter.setHeadRowNumber(1);
        assertThat(readBasicParameter.getHeadRowNumber(), is(1));
    }
}
