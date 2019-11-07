package com.alibaba.excel.write.metadata.holder;

import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import java.io.File;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class WriteWorkbookHolder_setFileTest_7_Test {
//failed_pass   @Test
//  public void setFileTest() throws Exception {
//    // Arrange
//    WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
//    File file = new File("Can not found file.");
//
//    // Act
//    writeWorkbookHolder.setFile(file);
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
//    Assert.assertEquals(0L, freeSpace);
//    Assert.assertEquals("Can not found file.", toStringResult);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", absolutePath);
//    Assert.assertEquals(0L, totalSpace);
//    Assert.assertEquals(0L, usableSpace);
//    String query = toURLResult.getQuery();
//    String file1 = toURLResult.getFile();
//    String authority = toURLResult.getAuthority();
//    String toStringResult3 = toURLResult.toString();
//    String toExternalFormResult = toURLResult.toExternalForm();
//    int defaultPort = toURLResult.getDefaultPort();
//    Assert.assertEquals(null, parentFile);
//    Assert.assertEquals("Can not found file.", name);
//    Assert.assertFalse(isAbsoluteResult);
//    Assert.assertEquals("Can not found file.", path);
//    Assert.assertEquals(null, parent);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", canonicalPath);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", file1);
//    Assert.assertEquals(null, query);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", absolutePath2);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", canonicalPath2);
//    Assert.assertTrue(isAbsoluteResult2);
//    Assert.assertEquals(0L, usableSpace2);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", toStringResult2);
//    Assert.assertEquals("Can not found file.", name2);
//    Assert.assertEquals(0L, freeSpace2);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work", parent1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", path1);
//    Assert.assertEquals(0L, totalSpace1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", absolutePath1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", canonicalPath1);
//    Assert.assertTrue(isAbsoluteResult1);
//    Assert.assertEquals(0L, usableSpace1);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", toStringResult1);
//    Assert.assertEquals("Can not found file.", name1);
//    Assert.assertEquals(0L, freeSpace1);
//    Assert.assertEquals(-1, defaultPort);
//    Assert.assertEquals(-1, toURLResult.getPort());
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", path2);
//    Assert.assertEquals("file:/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.", toStringResult3);
//    Assert.assertEquals("file:/tmp/aiden.workspace/myproject/dumm/dummy/work/Can not found file.",
//        toExternalFormResult);
//    Assert.assertEquals("/tmp/aiden.workspace/myproject/dumm/dummy/work", parent2);
//    Assert.assertEquals("", authority);
//    Assert.assertEquals(0L, totalSpace2);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
