package com.alibaba.excel.read.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.enums.RowTypeEnum;
import com.alibaba.excel.metadata.AbstractCell;
import com.alibaba.excel.metadata.Cell;
import com.alibaba.excel.metadata.CellData;
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
        HashMap<Integer, Cell> cellMap1 = new HashMap<Integer, Cell>();
        AbstractCell x12 = new CellData();
        x12.setColumnIndex(1);
        x12.setRowIndex(1);
        cellMap1.put(1, x12);
        ReadRowHolder readRowHolder =
             new ReadRowHolder(1, RowTypeEnum.DATA, globalConfiguration1, cellMap1);
        HashMap<Integer, Cell> cellMap2 = new HashMap<Integer, Cell>();
        AbstractCell x147 = new CellData();
        x147.setColumnIndex(1);
        x147.setRowIndex(1);
        cellMap2.put(1, x147);
        readRowHolder.setCellMap(cellMap2);
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
        assertThat(readRowHolder.getCellMap().get(1).getColumnIndex(), is(1));
        assertThat(readRowHolder.getCellMap().get(1).getRowIndex(), is(1));
        assertThat(readRowHolder.getCurrentRowAnalysisResult(), sameInstance(currentRowAnalysisResult));
        assertThat(readRowHolder.getGlobalConfiguration(), sameInstance(globalConfiguration2));
        assertThat(readRowHolder.getRowIndex(), is(1));
        assertThat(readRowHolder.getRowType(), is(RowTypeEnum.DATA));
    }

    @Test
    void holderTypeReturnsROW() {
        assertThat(new ReadRowHolder(1, RowTypeEnum.DATA, new GlobalConfiguration(), new HashMap<Integer, Cell>()).holderType(), is(HolderEnum.ROW));
    }
}
