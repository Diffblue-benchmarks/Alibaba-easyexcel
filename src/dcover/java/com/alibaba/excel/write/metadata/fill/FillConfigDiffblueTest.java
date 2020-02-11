package com.alibaba.excel.write.metadata.fill;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.excel.enums.WriteDirectionEnum;
import org.junit.Test;

public class FillConfigDiffblueTest {
  @Test(timeout=10000)
  public void buildTest2() {
    // Arrange and Act
    FillConfig actualBuildResult = FillConfig.builder().build(true);

    // Assert
    WriteDirectionEnum actualDirection = actualBuildResult.getDirection();
    assertEquals(WriteDirectionEnum.VERTICAL, actualDirection);
    assertEquals(Boolean.valueOf(false), actualBuildResult.getForceNewRow());
  }

  @Test(timeout=10000)
  public void buildTest() {
    // Arrange and Act
    FillConfig actualBuildResult = FillConfig.builder().build();

    // Assert
    WriteDirectionEnum actualDirection = actualBuildResult.getDirection();
    assertEquals(WriteDirectionEnum.VERTICAL, actualDirection);
    assertEquals(Boolean.valueOf(false), actualBuildResult.getForceNewRow());
  }

  @Test(timeout=10000)
  public void initTest() {
    // Arrange
    FillConfig fillConfig = new FillConfig();

    // Act
    fillConfig.init();

    // Assert
    WriteDirectionEnum actualDirection = fillConfig.getDirection();
    assertEquals(WriteDirectionEnum.VERTICAL, actualDirection);
    assertEquals(Boolean.valueOf(false), fillConfig.getForceNewRow());
  }

  @Test(timeout=10000)
  public void setDirectionTest() {
    // Arrange
    FillConfig fillConfig = new FillConfig();

    // Act
    fillConfig.setDirection(WriteDirectionEnum.VERTICAL);

    // Assert
    assertEquals(WriteDirectionEnum.VERTICAL, fillConfig.getDirection());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    FillConfig actualFillConfig = new FillConfig();

    // Assert
    WriteDirectionEnum actualDirection = actualFillConfig.getDirection();
    assertNull(actualDirection);
    assertNull(actualFillConfig.getForceNewRow());
  }

  @Test(timeout=10000)
  public void getForceNewRowTest() {
    // Arrange, Act and Assert
    assertNull((new FillConfig()).getForceNewRow());
  }

  @Test(timeout=10000)
  public void getDirectionTest() {
    // Arrange, Act and Assert
    assertNull((new FillConfig()).getDirection());
  }

  @Test(timeout=10000)
  public void setForceNewRowTest() {
    // Arrange
    FillConfig fillConfig = new FillConfig();

    // Act
    fillConfig.setForceNewRow(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), fillConfig.getForceNewRow());
  }
}

