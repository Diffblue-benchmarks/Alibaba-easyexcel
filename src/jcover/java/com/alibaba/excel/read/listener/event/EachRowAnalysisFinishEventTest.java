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
        CellData x104 = new CellData();
        x104.setBooleanValue(false);
        x104.setData(new Object());
        x104.setDataFormat(1);
        x104.setDataFormatString("yyyy-MM-dd");
        x104.setFormula(false);
        x104.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        x104.setImageValue(imageValue4);
        x104.setNumberValue(BigDecimal.valueOf(1L));
        x104.setStringValue("foo");
        x104.setType(CellDataTypeEnum.STRING);
        content.put(1, x104);
        assertThat(new EachRowAnalysisFinishEvent(content).getAnalysisResult().get(1), sameInstance(x104));
    }
}
