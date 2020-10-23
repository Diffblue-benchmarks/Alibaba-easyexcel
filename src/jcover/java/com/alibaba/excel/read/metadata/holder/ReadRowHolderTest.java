package com.alibaba.excel.read.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.enums.RowTypeEnum;
import com.alibaba.excel.metadata.Cell;
import com.alibaba.excel.metadata.GlobalConfiguration;

import java.util.HashMap;
import java.util.Locale;

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
        globalConfiguration1.setLocale(new Locale("en"));
        globalConfiguration1.setUse1904windowing(false);
        globalConfiguration1.setUseScientificFormat(false);
        ReadRowHolder readRowHolder =
             new ReadRowHolder(1, RowTypeEnum.DATA, globalConfiguration1, new HashMap<Integer, Cell>());
        readRowHolder.setCellMap(new HashMap<Integer, Cell>());
        Object currentRowAnalysisResult = new Object();
        readRowHolder.setCurrentRowAnalysisResult(currentRowAnalysisResult);
        GlobalConfiguration globalConfiguration2 = new GlobalConfiguration();
        globalConfiguration2.setAutoTrim(false);
        globalConfiguration2.setLocale(new Locale("en"));
        globalConfiguration2.setUse1904windowing(false);
        globalConfiguration2.setUseScientificFormat(false);
        readRowHolder.setGlobalConfiguration(globalConfiguration2);
        readRowHolder.setRowIndex(1);
        readRowHolder.setRowType(RowTypeEnum.DATA);
        assertThat(readRowHolder.getCellMap().isEmpty(), is(true));
        assertThat(readRowHolder.getCurrentRowAnalysisResult(), sameInstance(currentRowAnalysisResult));
        assertThat(readRowHolder.getGlobalConfiguration(), sameInstance(globalConfiguration2));
        assertThat(readRowHolder.getRowIndex(), is(1));
        assertThat(readRowHolder.getRowType(), is(RowTypeEnum.DATA));
    }

    @Test
    void holderTypeReturnsRow() {
        assertThat(new ReadRowHolder(1, RowTypeEnum.DATA, new GlobalConfiguration(), new HashMap<Integer, Cell>()).holderType(), is(HolderEnum.ROW));
    }
}
