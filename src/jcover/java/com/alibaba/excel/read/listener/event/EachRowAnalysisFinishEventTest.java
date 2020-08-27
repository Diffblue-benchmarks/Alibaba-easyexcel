package com.alibaba.excel.read.listener.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;

import java.math.BigDecimal;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.listener.event.EachRowAnalysisFinishEvent
 *
 * @author Diffblue Cover
 */

class EachRowAnalysisFinishEventTest {

    @Test
    void factory() {
        HashMap<Integer, CellData> content = new HashMap<Integer, CellData>();
        CellData x106 = new CellData();
        x106.setBooleanValue(false);
        x106.setData(new Object());
        x106.setDataFormat(1);
        x106.setDataFormatString("yyyy-MM-dd");
        x106.setFormula(false);
        x106.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        x106.setImageValue(imageValue4);
        x106.setNumberValue(BigDecimal.valueOf(1L));
        x106.setStringValue("foo");
        x106.setType(CellDataTypeEnum.STRING);
        content.put(1, x106);
        assertThat(new EachRowAnalysisFinishEvent(content).getAnalysisResult().get(1), sameInstance(x106));
    }
}
