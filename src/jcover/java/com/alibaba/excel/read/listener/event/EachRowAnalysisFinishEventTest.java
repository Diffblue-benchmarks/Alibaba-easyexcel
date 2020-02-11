package com.alibaba.excel.read.listener.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.listener.event.EachRowAnalysisFinishEvent
 *
 * @author Diffblue JCover
 */

public class EachRowAnalysisFinishEventTest {

    @Test(timeout=10000)
    public void getAnalysisResult() {
        Map<Integer, com.alibaba.excel.metadata.CellData> content = new HashMap<Integer, com.alibaba.excel.metadata.CellData>();
        assertThat(new EachRowAnalysisFinishEvent(content).getAnalysisResult(), sameInstance(content));
    }
}
