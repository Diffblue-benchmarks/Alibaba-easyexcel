package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxCellHandler;
import com.alibaba.excel.analysis.v07.XlsxHandlerFactory;
import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;
import org.apache.poi.xssf.model.StylesTable;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.List;
import java.util.TreeMap;



public class XlsxHandlerFactoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildCellHandlersInputNullNotNullOutput39993981506e58a8a596() {

    // Arrange
    final AnalysisContext arg0 = null;
    final StylesTable arg1 = new StylesTable();

    // Act
    final List<XlsxCellHandler> actual = XlsxHandlerFactory.buildCellHandlers(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertNotNull(actual.get(1));
    final TreeMap<Integer, CellData> treeMap = new TreeMap<Integer, CellData>();
    Assert.assertEquals(treeMap, ((DefaultCellHandler) actual.get(1)).getCurRowContent());
    Assert.assertNotNull(actual.get(2));

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992c87682c4078a770() {

    // Act, creating object to test constructor
    final XlsxHandlerFactory actual = new XlsxHandlerFactory();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
