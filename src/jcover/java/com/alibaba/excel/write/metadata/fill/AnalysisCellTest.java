package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.WriteTemplateAnalysisCellTypeEnum;

import java.util.ArrayList;
import java.util.Arrays;

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
        analysisCell.setFirstRow(true);
        analysisCell.setOnlyOneVariable(false);
        analysisCell.setPrefix("/bin/bash");
        analysisCell.setPrepareDataList(new ArrayList<String>());
        analysisCell.setRowIndex(1);
        ArrayList<String> variableList = new ArrayList<String>();
        variableList.add("Smith");
        analysisCell.setVariableList(variableList);
        assertThat(analysisCell.getCellType(), is(WriteTemplateAnalysisCellTypeEnum.COMMON));
        assertThat(analysisCell.getColumnIndex(), is(1));
        assertThat(analysisCell.getFirstRow(), is(true));
        assertThat(analysisCell.getOnlyOneVariable(), is(false));
        assertThat(analysisCell.getPrefix(), is("/bin/bash"));
        assertThat(analysisCell.getPrepareDataList(), empty());
        assertThat(analysisCell.getRowIndex(), is(1));
        assertThat(analysisCell.getVariableList(), equalTo(Arrays.asList("Smith")));
    }

    @Test
    void testEquals() {
        assertThat(new AnalysisCell().equals(new Object()), is(false));
        assertThat(new AnalysisCell().equals(null), is(false));
    }
}
