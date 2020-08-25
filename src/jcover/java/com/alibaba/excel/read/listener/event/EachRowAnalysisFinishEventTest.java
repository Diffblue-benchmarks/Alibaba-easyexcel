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
        CellData x60 = new CellData();
        x60.setBooleanValue(false);
        x60.setData(new Object());
        x60.setDataFormat(1);
        x60.setDataFormatString("yyyy-MM-dd");
        x60.setFormula(false);
        x60.setFormulaValue("value");
        byte[] imageValue2 = new byte[] { 1 };
        x60.setImageValue(imageValue2);
        x60.setNumberValue(BigDecimal.valueOf(1L));
        x60.setStringValue("foo");
        x60.setType(CellDataTypeEnum.STRING);
        content.put(1, x60);
        assertThat(new EachRowAnalysisFinishEvent(content).getAnalysisResult().get(1), sameInstance(x60));
    }
}
