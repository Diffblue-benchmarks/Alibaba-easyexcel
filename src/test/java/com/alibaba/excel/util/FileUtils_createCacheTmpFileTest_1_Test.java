package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import java.io.File;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileUtils_createCacheTmpFileTest_1_Test {
//failed_pass   @Test
//  public void createCacheTmpFileTest() throws Exception {
//    // Arrange and Act
//    File actual = FileUtils.createCacheTmpFile();
//
//    // Assert
//    File canonicalFile = actual.getCanonicalFile();
//    long freeSpace = actual.getFreeSpace();
//    String name = actual.getName();
//    String toStringResult = actual.toString();
//    long usableSpace = actual.getUsableSpace();
//    boolean isAbsoluteResult = actual.isAbsolute();
//    String canonicalPath = actual.getCanonicalPath();
//    String absolutePath = actual.getAbsolutePath();
//    long totalSpace = actual.getTotalSpace();
//    URL toURLResult = actual.toURL();
//    String path = actual.getPath();
//    String parent = actual.getParent();
//    File absoluteFile = actual.getAbsoluteFile();
//    long freeSpace1 = canonicalFile.getFreeSpace();
//    String name1 = canonicalFile.getName();
//    String toStringResult1 = canonicalFile.toString();
//    long usableSpace1 = canonicalFile.getUsableSpace();
//    boolean isAbsoluteResult1 = canonicalFile.isAbsolute();
//    String canonicalPath1 = canonicalFile.getCanonicalPath();
//    String absolutePath1 = canonicalFile.getAbsolutePath();
//    long totalSpace1 = canonicalFile.getTotalSpace();
//    String path1 = canonicalFile.getPath();
//    String parent1 = canonicalFile.getParent();
//    long freeSpace2 = absoluteFile.getFreeSpace();
//    String name2 = absoluteFile.getName();
//    String toStringResult2 = absoluteFile.toString();
//    long usableSpace2 = absoluteFile.getUsableSpace();
//    boolean isAbsoluteResult2 = absoluteFile.isAbsolute();
//    String canonicalPath2 = absoluteFile.getCanonicalPath();
//    String absolutePath2 = absoluteFile.getAbsolutePath();
//    long totalSpace2 = absoluteFile.getTotalSpace();
//    String path2 = absoluteFile.getPath();
//    String parent2 = absoluteFile.getParent();
//    Assert.assertEquals(274786078720L, freeSpace);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", toStringResult);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", absolutePath);
//    Assert.assertEquals(486110535680L, totalSpace);
//    Assert.assertEquals(250069467136L, usableSpace);
//    String query = toURLResult.getQuery();
//    String file = toURLResult.getFile();
//    String authority = toURLResult.getAuthority();
//    String toStringResult3 = toURLResult.toString();
//    String toExternalFormResult = toURLResult.toExternalForm();
//    int defaultPort = toURLResult.getDefaultPort();
//    int port = toURLResult.getPort();
//    Assert.assertEquals("dbd7b022-ec69-48d6-9cd1-ef3ff182365b", name);
//    Assert.assertTrue(isAbsoluteResult);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", path);
//    Assert.assertEquals("/tmp/excache", parent);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", canonicalPath);
//    Assert.assertEquals("", authority);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b/", file);
//    Assert.assertEquals(null, query);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", absolutePath2);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", canonicalPath2);
//    Assert.assertTrue(isAbsoluteResult2);
//    Assert.assertEquals(250069463040L, usableSpace2);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", toStringResult2);
//    Assert.assertEquals("dbd7b022-ec69-48d6-9cd1-ef3ff182365b", name2);
//    Assert.assertEquals(274786074624L, freeSpace2);
//    Assert.assertEquals("/tmp/excache", parent1);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", path1);
//    Assert.assertEquals(486110535680L, totalSpace1);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", absolutePath1);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", canonicalPath1);
//    Assert.assertTrue(isAbsoluteResult1);
//    Assert.assertEquals(250069467136L, usableSpace1);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", toStringResult1);
//    Assert.assertEquals("dbd7b022-ec69-48d6-9cd1-ef3ff182365b", name1);
//    Assert.assertEquals(274786078720L, freeSpace1);
//    Assert.assertEquals(-1, port);
//    Assert.assertTrue(toURLResult.getContent() instanceof sun.net.www.content.text.PlainTextInputStream);
//    Assert.assertEquals("/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b", path2);
//    Assert.assertEquals("file:/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b/", toExternalFormResult);
//    Assert.assertEquals(-1, defaultPort);
//    Assert.assertEquals("/tmp/excache", parent2);
//    Assert.assertEquals("file:/tmp/excache/dbd7b022-ec69-48d6-9cd1-ef3ff182365b/", toStringResult3);
//    Assert.assertEquals(486110535680L, totalSpace2);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
