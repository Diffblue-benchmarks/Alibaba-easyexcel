package com.alibaba.excel.read.metadata.holder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import org.junit.Test;

public class ReadRowHolderDiffblueTest {
  @Test(timeout=10000)
  public void holderTypeTest() {
    // Arrange, Act and Assert
    assertEquals(HolderEnum.ROW, (new ReadRowHolder(Integer.valueOf(1), new GlobalConfiguration())).holderType());
  }

  @Test(timeout=10000)
  public void setCurrentRowAnalysisResultTest() {
    // Arrange
    ReadRowHolder readRowHolder = new ReadRowHolder(Integer.valueOf(1), new GlobalConfiguration());

    // Act
    readRowHolder.setCurrentRowAnalysisResult("foo");

    // Assert
    assertTrue(readRowHolder.getCurrentRowAnalysisResult() instanceof String);
  }

  @Test(timeout=10000)
  public void setRowIndexTest() {
    // Arrange
    ReadRowHolder readRowHolder = new ReadRowHolder(Integer.valueOf(1), new GlobalConfiguration());

    // Act
    readRowHolder.setRowIndex(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), readRowHolder.getRowIndex());
  }

  @Test(timeout=10000)
  public void getCurrentRowAnalysisResultTest() {
    // Arrange, Act and Assert
    assertNull((new ReadRowHolder(Integer.valueOf(1), new GlobalConfiguration())).getCurrentRowAnalysisResult());
  }

  @Test(timeout=10000)
  public void getRowIndexTest() {
    // Arrange, Act and Assert
    assertEquals(Integer.valueOf(1), (new ReadRowHolder(Integer.valueOf(1), new GlobalConfiguration())).getRowIndex());
  }

  @Test(timeout=10000)
  public void getGlobalConfigurationTest() {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act and Assert
    assertSame(globalConfiguration,
        (new ReadRowHolder(Integer.valueOf(1), globalConfiguration)).getGlobalConfiguration());
  }

  @Test(timeout=10000)
  public void setGlobalConfigurationTest() {
    // Arrange
    ReadRowHolder readRowHolder = new ReadRowHolder(Integer.valueOf(1), new GlobalConfiguration());
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    readRowHolder.setGlobalConfiguration(globalConfiguration);

    // Assert
    assertSame(globalConfiguration, readRowHolder.getGlobalConfiguration());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    GlobalConfiguration globalConfiguration = new GlobalConfiguration();

    // Act
    ReadRowHolder actualReadRowHolder = new ReadRowHolder(Integer.valueOf(1), globalConfiguration);

    // Assert
    GlobalConfiguration actualGlobalConfiguration = actualReadRowHolder.getGlobalConfiguration();
    assertSame(globalConfiguration, actualGlobalConfiguration);
    assertEquals(Integer.valueOf(1), actualReadRowHolder.getRowIndex());
  }
}

