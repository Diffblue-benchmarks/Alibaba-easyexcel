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
    void createTmpFile() {
        assertThat(FileUtils.createTmpFile("data.txt").getPath().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }

    @Test
    void getTempFilePrefix() {
        assertThat(FileUtils.getTempFilePrefix().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }

    @Test
    void setTempFilePrefix() {
        FileUtils.setTempFilePrefix("/bin/bash");
    }

    @Test
    void getPoiFilesPath() {
        assertThat(FileUtils.getPoiFilesPath().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }

    @Test
    void setPoiFilesPath() {
        FileUtils.setPoiFilesPath("/bin/bash");
    }

    @Test
    void getCachePath() {
        assertThat(FileUtils.getCachePath().startsWith(System.getProperty("java.io.tmpdir")), is(true));
    }

    @Test
    void setCachePath() {
        FileUtils.setCachePath("/bin/bash");
    }
}
