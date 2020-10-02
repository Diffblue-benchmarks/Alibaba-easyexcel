package com.alibaba.excel.write.merge;

import com.alibaba.excel.metadata.property.OnceAbsoluteMergeProperty;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.merge.OnceAbsoluteMergeStrategy
 *
 * @author Diffblue Cover
 */

class OnceAbsoluteMergeStrategyTest {

    @Test
    void factory1() {
        // pojo OnceAbsoluteMergeStrategy
    }

    @Test
    void factory2() {
        OnceAbsoluteMergeProperty onceAbsoluteMergeProperty =
             new OnceAbsoluteMergeProperty(0, 1, 1, 1);
        onceAbsoluteMergeProperty.setFirstColumnIndex(1);
        onceAbsoluteMergeProperty.setFirstRowIndex(1);
        onceAbsoluteMergeProperty.setLastColumnIndex(1);
        onceAbsoluteMergeProperty.setLastRowIndex(1);
        // pojo OnceAbsoluteMergeStrategy
    }
}
