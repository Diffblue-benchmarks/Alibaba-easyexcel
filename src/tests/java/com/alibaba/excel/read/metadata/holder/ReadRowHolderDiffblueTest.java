package com.alibaba.excel.read.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.holder.ReadRowHolder
 *
 * @author Diffblue JCover
 */

public class ReadRowHolderDiffblueTest {

    @Test(timeout=10000)
    public void getCurrentRowAnalysisResultReturnsNull() {
        assertThat(new ReadRowHolder(1, new GlobalConfiguration()).getCurrentRowAnalysisResult(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGlobalConfiguration() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        assertThat(new ReadRowHolder(1, globalConfiguration).getGlobalConfiguration(), sameInstance(globalConfiguration));
    }

    @Test(timeout=10000)
    public void getRowIndexReturnsOne() {
        assertThat(new ReadRowHolder(1, new GlobalConfiguration()).getRowIndex(), is(1));
    }

    @Test(timeout=10000)
    public void holderTypeReturnsROW() {
        assertThat(new ReadRowHolder(1, new GlobalConfiguration()).holderType(), is(HolderEnum.ROW));
    }

    @Test(timeout=10000)
    public void setCurrentRowAnalysisResult() {
        ReadRowHolder readRowHolder = new ReadRowHolder(1, new GlobalConfiguration());
        Object currentRowAnalysisResult = new Object();
        readRowHolder.setCurrentRowAnalysisResult(currentRowAnalysisResult);
        assertThat(readRowHolder.getCurrentRowAnalysisResult(), sameInstance(currentRowAnalysisResult));
    }

    @Test(timeout=10000)
    public void setGlobalConfiguration() {
        ReadRowHolder readRowHolder = new ReadRowHolder(1, new GlobalConfiguration());
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        readRowHolder.setGlobalConfiguration(globalConfiguration);
        assertThat(readRowHolder.getGlobalConfiguration(), sameInstance(globalConfiguration));
    }

    @Test(timeout=10000)
    public void setRowIndexToOne() {
        new ReadRowHolder(1, new GlobalConfiguration()).setRowIndex(1);
    }
}
