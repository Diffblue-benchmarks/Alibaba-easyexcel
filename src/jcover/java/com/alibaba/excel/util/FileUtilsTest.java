package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.FileUtils
 *
 * @author Diffblue Cover
 */

class FileUtilsTest {

    @Test
    void createPoiFilesDirectory() {
        FileUtils.createPoiFilesDirectory();
    }

    @Test
    void createCacheTmpFile() {
        assertThat(FileUtils.createCacheTmpFile().getPath().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }

    @Test
    void createTmpDirectoryPathIsBar() {
        assertThat(FileUtils.createTmpDirectory("bar").getPath().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }

    @Test
    void createTmpFile() {
        assertThat(FileUtils.createTmpFile("data.txt").getPath().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }
}
