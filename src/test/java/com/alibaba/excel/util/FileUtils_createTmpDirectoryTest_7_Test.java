package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import java.io.File;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileUtils_createTmpDirectoryTest_7_Test {
//failed_pass   @Test
//  public void createTmpDirectoryTest() throws Exception {
//    // Arrange
//    String path = "' cannot be read";
//
//    // Act
//    File actual = FileUtils.createTmpDirectory(path);
//
//    // Assert
//    long freeSpace = actual.getFreeSpace();
//    String name = actual.getName();
//    String toStringResult = actual.toString();
//    long usableSpace = actual.getUsableSpace();
//    boolean isAbsoluteResult = actual.isAbsolute();
//    String canonicalPath = actual.getCanonicalPath();
//    String absolutePath = actual.getAbsolutePath();
//    long totalSpace = actual.getTotalSpace();
//    URL toURLResult = actual.toURL();
//    File parentFile = actual.getParentFile();
//    String path1 = actual.getPath();
//    String parent = actual.getParent();
//    File absoluteFile = actual.getAbsoluteFile();
//    Assert.assertEquals(274774769664L, freeSpace);
//    long freeSpace1 = absoluteFile.getFreeSpace();
//    String name1 = absoluteFile.getName();
//    String toStringResult1 = absoluteFile.toString();
//    long usableSpace1 = absoluteFile.getUsableSpace();
//    boolean isAbsoluteResult1 = absoluteFile.isAbsolute();
//    String canonicalPath1 = absoluteFile.getCanonicalPath();
//    String absolutePath1 = absoluteFile.getAbsolutePath();
//    long totalSpace1 = absoluteFile.getTotalSpace();
//    String path2 = absoluteFile.getPath();
//    String parent1 = absoluteFile.getParent();
//    Assert.assertEquals("/tmp", parent);
//    Assert.assertEquals("' cannot be read", name);
//    Assert.assertEquals(250058158080L, usableSpace);
//    Assert.assertEquals(486110535680L, totalSpace);
//    String query = toURLResult.getQuery();
//    String file = toURLResult.getFile();
//    String authority = toURLResult.getAuthority();
//    String toStringResult2 = toURLResult.toString();
//    String toExternalFormResult = toURLResult.toExternalForm();
//    int defaultPort = toURLResult.getDefaultPort();
//    int port = toURLResult.getPort();
//    Object content = toURLResult.getContent();
//    String host = toURLResult.getHost();
//    String path3 = toURLResult.getPath();
//    String ref = toURLResult.getRef();
//    String userInfo = toURLResult.getUserInfo();
//    String protocol = toURLResult.getProtocol();
//    Assert.assertTrue(isAbsoluteResult);
//    long freeSpace2 = parentFile.getFreeSpace();
//    String name2 = parentFile.getName();
//    String toStringResult3 = parentFile.toString();
//    long usableSpace2 = parentFile.getUsableSpace();
//    boolean isAbsoluteResult2 = parentFile.isAbsolute();
//    String canonicalPath2 = parentFile.getCanonicalPath();
//    String absolutePath2 = parentFile.getAbsolutePath();
//    Assert.assertEquals("/tmp/' cannot be read", path1);
//    Assert.assertEquals("/tmp/' cannot be read", toStringResult);
//    Assert.assertEquals("/tmp/' cannot be read", canonicalPath);
//    Assert.assertEquals("/tmp/' cannot be read", absolutePath);
//    Assert.assertTrue(isAbsoluteResult2);
//    Assert.assertEquals(250058153984L, usableSpace2);
//    Assert.assertEquals("/tmp", toStringResult3);
//    Assert.assertEquals("tmp", name2);
//    Assert.assertEquals(274774765568L, freeSpace2);
//    Assert.assertEquals(null, ref);
//    Assert.assertEquals("/tmp/' cannot be read/", path3);
//    Assert.assertEquals("", host);
//    Assert.assertTrue(content instanceof sun.net.www.content.text.PlainTextInputStream);
//    Assert.assertEquals(-1, port);
//    Assert.assertEquals(-1, defaultPort);
//    Assert.assertEquals("file:/tmp/' cannot be read/", toExternalFormResult);
//    Assert.assertEquals("file:/tmp/' cannot be read/", toStringResult2);
//    Assert.assertEquals("", authority);
//    Assert.assertEquals("/tmp/' cannot be read/", file);
//    Assert.assertEquals(null, query);
//    Assert.assertEquals(486110535680L, totalSpace1);
//    Assert.assertEquals("/tmp/' cannot be read", absolutePath1);
//    Assert.assertEquals("/tmp/' cannot be read", canonicalPath1);
//    Assert.assertTrue(isAbsoluteResult1);
//    Assert.assertEquals(250058158080L, usableSpace1);
//    Assert.assertEquals("/tmp/' cannot be read", toStringResult1);
//    Assert.assertEquals("' cannot be read", name1);
//    Assert.assertEquals(274774769664L, freeSpace1);
//    Assert.assertEquals("/tmp", parent1);
//    Assert.assertEquals("/tmp", absolutePath2);
//    Assert.assertEquals(486110535680L, parentFile.getTotalSpace());
//    Assert.assertEquals("file", protocol);
//    Assert.assertEquals("/tmp/' cannot be read", path2);
//    Assert.assertEquals("/tmp", canonicalPath2);
//    Assert.assertEquals(null, userInfo);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
