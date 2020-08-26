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
        CellData x56 = new CellData();
        x56.setBooleanValue(false);
        x56.setData(new Object());
        x56.setDataFormat(1);
        x56.setDataFormatString("yyyy-MM-dd");
        x56.setFormula(false);
        x56.setFormulaValue("value");
        byte[] imageValue2 = new byte[] { 1 };
        x56.setImageValue(imageValue2);
        x56.setNumberValue(BigDecimal.valueOf(1L));
        x56.setStringValue("foo");
        x56.setType(CellDataTypeEnum.STRING);
        content.put(1, x56);
        assertThat(new EachRowAnalysisFinishEvent(content).getAnalysisResult().get(1), sameInstance(x56));
    }
}
