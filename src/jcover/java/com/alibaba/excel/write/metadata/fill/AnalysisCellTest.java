package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.WriteTemplateAnalysisCellTypeEnum;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.fill.AnalysisCell
 *
 * @author Diffblue JCover
 */

public class AnalysisCellTest {

    @Test(timeout=10000)
    public void getCellTypeReturnsNull() {
        assertThat(new AnalysisCell().getCellType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getColumnIndexReturnsZero() {
        assertThat(new AnalysisCell().getColumnIndex(), is(0));
    }

    @Test(timeout=10000)
    public void getOnlyOneVariableReturnsNull() {
        assertThat(new AnalysisCell().getOnlyOneVariable(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPrepareDataListReturnsNull() {
        assertThat(new AnalysisCell().getPrepareDataList(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRowIndexReturnsZero() {
        assertThat(new AnalysisCell().getRowIndex(), is(0));
    }

    @Test(timeout=10000)
    public void getVariableListReturnsNull() {
        assertThat(new AnalysisCell().getVariableList(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCellTypeToCOMMON() {
        AnalysisCell analysisCell = new AnalysisCell();
        analysisCell.setCellType(WriteTemplateAnalysisCellTypeEnum.COMMON);
        assertThat(analysisCell.getCellType(), is(WriteTemplateAnalysisCellTypeEnum.COMMON));
    }

    @Test(timeout=10000)
    public void setColumnIndexToOne() {
        AnalysisCell analysisCell = new AnalysisCell();
        analysisCell.setColumnIndex(1);
        assertThat(analysisCell.getColumnIndex(), is(1));
    }

    @Test(timeout=10000)
    public void setOnlyOneVariableToFalse() {
        AnalysisCell analysisCell = new AnalysisCell();
        analysisCell.setOnlyOneVariable(false);
        assertThat(analysisCell.getOnlyOneVariable(), is(false));
    }

    @Test(timeout=10000)
    public void setPrepareDataListToEmpty() {
        AnalysisCell analysisCell = new AnalysisCell();
        List<String> prepareDataList = new ArrayList<String>();
        analysisCell.setPrepareDataList(prepareDataList);
        assertThat(analysisCell.getPrepareDataList(), sameInstance(prepareDataList));
    }

    @Test(timeout=10000)
    public void setRowIndexToOne() {
        AnalysisCell analysisCell = new AnalysisCell();
        analysisCell.setRowIndex(1);
        assertThat(analysisCell.getRowIndex(), is(1));
    }

    @Test(timeout=10000)
    public void setVariableListToEmpty() {
        AnalysisCell analysisCell = new AnalysisCell();
        List<String> variableList = new ArrayList<String>();
        analysisCell.setVariableList(variableList);
        assertThat(analysisCell.getVariableList(), sameInstance(variableList));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new AnalysisCell().equals("foo"), is(false));
        assertThat(new AnalysisCell().equals(null), is(false));
    }
}
