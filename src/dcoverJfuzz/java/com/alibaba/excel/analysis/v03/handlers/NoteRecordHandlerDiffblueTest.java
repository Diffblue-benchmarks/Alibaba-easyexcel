package com.alibaba.excel.analysis.v03.handlers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteRecordHandlerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NoteRecordHandler()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NoteRecordHandler actualNoteRecordHandler = new NoteRecordHandler();

    // Assert
    int actualRow = actualNoteRecordHandler.getRow();
    assertEquals(-1, actualRow);
    assertEquals(-1, actualNoteRecordHandler.getColumn());
  }
}

