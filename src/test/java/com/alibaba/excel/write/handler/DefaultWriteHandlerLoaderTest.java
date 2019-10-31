package com.alibaba.excel.write.handler;

import com.alibaba.excel.write.handler.DefaultWriteHandlerLoader;
import com.alibaba.excel.write.handler.WriteHandler;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.List;



public class DefaultWriteHandlerLoaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c2967413f60fe43f() {

    // Act, creating object to test constructor
    final DefaultWriteHandlerLoader actual = new DefaultWriteHandlerLoader();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void loadDefaultHandlerOutput1999546adb285ddb7c8b() {

    // Act
    final List<WriteHandler> actual = DefaultWriteHandlerLoader.loadDefaultHandler();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertFalse((Boolean) Reflector.getInstanceField(actual.get(0), "hasInitialized"));

  }
}
