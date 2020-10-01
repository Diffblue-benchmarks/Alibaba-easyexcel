package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.enums.WriteTemplateAnalysisCellTypeEnum;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.fill.AnalysisCell
 *
 * @author Diffblue Cover
 */

class AnalysisCellTest {

    @Test
    void factory() {
        AnalysisCell analysisCell = new AnalysisCell();
        analysisCell.setCellType(WriteTemplateAnalysisCellTypeEnum.COMMON);
        analysisCell.setColumnIndex(1);
        analysisCell.setFirstRow(false);
        analysisCell.setOnlyOneVariable(false);
        analysisCell.setPrefix("/bin/bash");
        analysisCell.setPrepareDataList(new ArrayList<String>());
        analysisCell.setRowIndex(1);
        analysisCell.setVariableList(new ArrayList<String>());
        assertThat(analysisCell.getCellType(), is(WriteTemplateAnalysisCellTypeEnum.COMMON));
        assertThat(analysisCell.getColumnIndex(), is(1));
        assertThat(analysisCell.getFirstRow(), is(false));
        assertThat(analysisCell.getOnlyOneVariable(), is(false));
        assertThat(analysisCell.getPrefix(), is("/bin/bash"));
        assertThat(analysisCell.getPrepareDataList(), empty());
        assertThat(analysisCell.getRowIndex(), is(1));
        assertThat(analysisCell.getVariableList(), empty());
    }

    @Test
    void testEquals() {
        assertThat(new AnalysisCell().equals(new Object()), is(false));
        assertThat(new AnalysisCell().equals(null), is(false));
    }
}
