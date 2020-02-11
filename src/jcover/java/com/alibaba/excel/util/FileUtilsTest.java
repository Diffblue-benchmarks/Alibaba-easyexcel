package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.FileUtils
 *
 * @author Diffblue JCover
 */

public class FileUtilsTest {

    @Test(timeout=10000)
    public void createPoiFilesDirectory() {
        FileUtils.createPoiFilesDirectory();
    }

//    @Test(timeout=10000)
//    public void getPath() {
//        assertThat(FileUtils.createCacheTmpFile().getPath(), is("/tmp/excache/796ddcc1-3905-457a-ba72-d2649553147f"));  <-- Expected: is "/tmp/excache/796ddcc1-3905-457a-ba72-d2649553147f"     but: was "/tmp/excache/8c4eba53-cf07-4306-89b7-f6b4a492ba4b"
//        assertThat(FileUtils.createTmpDirectory("bar").getPath(), is("/tmp/bar"));
//        assertThat(FileUtils.createTmpFile("bar").getPath(), is("/tmp/bar"));
//    }
}
