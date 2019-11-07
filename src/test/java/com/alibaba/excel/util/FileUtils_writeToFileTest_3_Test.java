package com.alibaba.excel.util;

import com.alibaba.excel.util.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileUtils_writeToFileTest_3_Test {
//failed_pass   @Test
//  public void writeToFileTest() throws Exception {
//    // Arrange
//    File file = new File("' cannot be read");
//    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
//        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0});
//
//    // Act
//    FileUtils.writeToFile(file, byteArrayInputStream);
//
//    // Assert
//    File canonicalFile = file.getCanonicalFile();
//    long freeSpace = file.getFreeSpace();
//    String name = file.getName();
//    String toStringResult = file.toString();
//    long usableSpace = file.getUsableSpace();
//    boolean isAbsoluteResult = file.isAbsolute();
//    String canonicalPath = file.getCanonicalPath();
//    String absolutePath = file.getAbsolutePath();
//    long totalSpace = file.getTotalSpace();
//    URL toURLResult = file.toURL();
//    File parentFile = file.getParentFile();
//    String path = file.getPath();
//    String parent = file.getParent();
//    File absoluteFile = file.getAbsoluteFile();
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
//    Assert.assertEquals(274781020160L, freeSpace);
//    Assert.assertEquals("' cannot be read", toStringResult);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", absolutePath);
//    Assert.assertEquals(486110535680L, totalSpace);
//    Assert.assertEquals(250064408576L, usableSpace);
//    String query = toURLResult.getQuery();
//    String file1 = toURLResult.getFile();
//    String authority = toURLResult.getAuthority();
//    String toStringResult3 = toURLResult.toString();
//    String toExternalFormResult = toURLResult.toExternalForm();
//    int defaultPort = toURLResult.getDefaultPort();
//    int port = toURLResult.getPort();
//    Assert.assertEquals(null, parentFile);
//    Assert.assertEquals("' cannot be read", name);
//    Assert.assertFalse(isAbsoluteResult);
//    Assert.assertEquals("' cannot be read", path);
//    Assert.assertEquals(null, parent);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", canonicalPath);
//    Assert.assertEquals("", authority);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", file1);
//    Assert.assertEquals(null, query);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", absolutePath2);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", canonicalPath2);
//    Assert.assertTrue(isAbsoluteResult2);
//    Assert.assertEquals(250064404480L, usableSpace2);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", toStringResult2);
//    Assert.assertEquals("' cannot be read", name2);
//    Assert.assertEquals(274781016064L, freeSpace2);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work", parent1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", path1);
//    Assert.assertEquals(486110535680L, totalSpace1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", absolutePath1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", canonicalPath1);
//    Assert.assertTrue(isAbsoluteResult1);
//    Assert.assertEquals(250064404480L, usableSpace1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", toStringResult1);
//    Assert.assertEquals("' cannot be read", name1);
//    Assert.assertEquals(274781016064L, freeSpace1);
//    Assert.assertEquals(-1, port);
//    Assert.assertTrue(toURLResult.getContent() instanceof java.io.BufferedInputStream);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", path2);
//    Assert.assertEquals("file:/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", toExternalFormResult);
//    Assert.assertEquals(-1, defaultPort);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work", parent2);
//    Assert.assertEquals("file:/tmp/aiden.workspace/myproject/dumm/dummy/work/' cannot be read", toStringResult3);
//    Assert.assertEquals(486110535680L, totalSpace2);
//    int availableResult = byteArrayInputStream.available();
//    Assert.assertEquals(0, availableResult);
//    Assert.assertNotNull(byteArrayInputStream.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
