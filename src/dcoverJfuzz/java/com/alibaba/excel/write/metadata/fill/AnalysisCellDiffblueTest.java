package com.alibaba.excel.write.metadata.fill;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.excel.enums.WriteTemplateAnalysisCellTypeEnum;
import java.util.List;
import org.junit.Test;

public class AnalysisCellDiffblueTest {
  @Test(timeout=10000)
  public void setColumnIndexTest() {
    // Arrange
    AnalysisCell analysisCell = new AnalysisCell();

    // Act
    analysisCell.setColumnIndex(1);

    // Assert
    assertEquals(1, analysisCell.getColumnIndex());
  }

  @Test(timeout=10000)
  public void setPrepareDataListTest() {
    // Arrange
    AnalysisCell analysisCell = new AnalysisCell();

    // Act
    analysisCell.setPrepareDataList(null);

    // Assert
    assertNull(analysisCell.getPrepareDataList());
  }

  @Test(timeout=10000)
  public void setCellTypeTest() {
    // Arrange
    AnalysisCell analysisCell = new AnalysisCell();

    // Act
    analysisCell.setCellType(WriteTemplateAnalysisCellTypeEnum.COMMON);

    // Assert
    assertEquals(WriteTemplateAnalysisCellTypeEnum.COMMON, analysisCell.getCellType());
  }

  @Test(timeout=10000)
  public void setVariableListTest() {
    // Arrange
    AnalysisCell analysisCell = new AnalysisCell();

    // Act
    analysisCell.setVariableList(null);

    // Assert
    assertNull(analysisCell.getVariableList());
  }

  @Test(timeout=10000)
  public void setRowIndexTest() {
    // Arrange
    AnalysisCell analysisCell = new AnalysisCell();

    // Act
    analysisCell.setRowIndex(1);

    // Assert
    assertEquals(1, analysisCell.getRowIndex());
  }

  @Test(timeout=10000)
  public void setOnlyOneVariableTest() {
    // Arrange
    AnalysisCell analysisCell = new AnalysisCell();

    // Act
    analysisCell.setOnlyOneVariable(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), analysisCell.getOnlyOneVariable());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new AnalysisCell()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getVariableListTest() {
    // Arrange, Act and Assert
    assertNull((new AnalysisCell()).getVariableList());
  }

  @Test(timeout=10000)
  public void getOnlyOneVariableTest() {
    // Arrange, Act and Assert
    assertNull((new AnalysisCell()).getOnlyOneVariable());
  }

  @Test(timeout=10000)
  public void getColumnIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AnalysisCell()).getColumnIndex());
  }

  @Test(timeout=10000)
  public void getPrepareDataListTest() {
    // Arrange, Act and Assert
    assertNull((new AnalysisCell()).getPrepareDataList());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AnalysisCell()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    AnalysisCell actualAnalysisCell = new AnalysisCell();

    // Assert
    WriteTemplateAnalysisCellTypeEnum actualCellType = actualAnalysisCell.getCellType();
    int actualRowIndex = actualAnalysisCell.getRowIndex();
    List<String> actualPrepareDataList = actualAnalysisCell.getPrepareDataList();
    int actualColumnIndex = actualAnalysisCell.getColumnIndex();
    Boolean actualOnlyOneVariable = actualAnalysisCell.getOnlyOneVariable();
    assertNull(actualCellType);
    assertNull(actualAnalysisCell.getVariableList());
    assertNull(actualOnlyOneVariable);
    assertEquals(0, actualColumnIndex);
    assertNull(actualPrepareDataList);
    assertEquals(0, actualRowIndex);
  }

  @Test(timeout=10000)
  public void getRowIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AnalysisCell()).getRowIndex());
  }

  @Test(timeout=10000)
  public void getCellTypeTest() {
    // Arrange, Act and Assert
    assertNull((new AnalysisCell()).getCellType());
  }
}

