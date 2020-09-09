package com.alibaba.excel.write.merge;

import com.alibaba.excel.metadata.property.LoopMergeProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.merge.LoopMergeStrategy
 *
 * @author Diffblue Cover
 */

class LoopMergeStrategyTest {

    @Test
    void factory1() {
        // pojo LoopMergeStrategy
    }

    @Test
    void factory2() {
        LoopMergeProperty loopMergeProperty = new LoopMergeProperty(0, 1);
        loopMergeProperty.setColumnExtend(2);
        loopMergeProperty.setEachRow(1);
        // pojo LoopMergeStrategy
    }

    @Test
    void factory3() {
        LoopMergeProperty loopMergeProperty = new LoopMergeProperty(0, 1);
        loopMergeProperty.setColumnExtend(1);
        loopMergeProperty.setEachRow(2);
        // pojo LoopMergeStrategy
    }
}
