package com.alibaba.excel.analysis.v07;

import com.alibaba.excel.analysis.v07.XlsxSaxAnalyser;
import com.alibaba.excel.context.AnalysisContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;



public class XlsxSaxAnalyserTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullNotNullOutputNullPointerException9992a53d52d21e0af19() throws Exception {

    // Arrange
    final AnalysisContext arg0 = null;
    final byte[] myByteArray = { (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 10, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0 };
    final ByteArrayInputStream arg1 = new ByteArrayInputStream(myByteArray);

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new XlsxSaxAnalyser(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
