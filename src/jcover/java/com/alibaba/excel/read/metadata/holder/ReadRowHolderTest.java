package com.alibaba.excel.read.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.holder.ReadRowHolder
 *
 * @author Diffblue Cover
 */

class ReadRowHolderTest {

    @Test
    void factory() {
        GlobalConfiguration globalConfiguration1 = new GlobalConfiguration();
        globalConfiguration1.setAutoTrim(false);
        globalConfiguration1.setUse1904windowing(false);
        ReadRowHolder readRowHolder =
             new ReadRowHolder(1, globalConfiguration1);
        Object currentRowAnalysisResult = new Object();
        readRowHolder.setCurrentRowAnalysisResult(currentRowAnalysisResult);
        GlobalConfiguration globalConfiguration2 = new GlobalConfiguration();
        globalConfiguration2.setAutoTrim(false);
        globalConfiguration2.setUse1904windowing(false);
        readRowHolder.setGlobalConfiguration(globalConfiguration2);
        readRowHolder.setRowIndex(1);
        assertThat(readRowHolder.getCurrentRowAnalysisResult(), sameInstance(currentRowAnalysisResult));
        assertThat(readRowHolder.getGlobalConfiguration(), sameInstance(globalConfiguration2));
        assertThat(readRowHolder.getRowIndex(), is(1));
    }

    @Test
    void holderTypeReturnsRow() {
        assertThat(new ReadRowHolder(1, new GlobalConfiguration()).holderType(), is(HolderEnum.ROW));
    }
}
