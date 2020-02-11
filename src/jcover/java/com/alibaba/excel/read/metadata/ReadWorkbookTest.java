package com.alibaba.excel.read.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.cache.ReadCache;
import com.alibaba.excel.cache.selector.ReadCacheSelector;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.ReadWorkbook
 *
 * @author Diffblue JCover
 */

public class ReadWorkbookTest {

    @Test(timeout=10000)
    public void getAutoCloseStreamReturnsNull() {
        assertThat(new ReadWorkbook().getAutoCloseStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getConvertAllFiledReturnsNull() {
        assertThat(new ReadWorkbook().getConvertAllFiled(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCustomObjectReturnsNull() {
        assertThat(new ReadWorkbook().getCustomObject(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDefaultReturnMapReturnsNull() {
        assertThat(new ReadWorkbook().getDefaultReturnMap(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExcelTypeReturnsNull() {
        assertThat(new ReadWorkbook().getExcelType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFileReturnsNull() {
        assertThat(new ReadWorkbook().getFile(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIgnoreEmptyRowReturnsNull() {
        assertThat(new ReadWorkbook().getIgnoreEmptyRow(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInputStreamReturnsNull() {
        assertThat(new ReadWorkbook().getInputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMandatoryUseInputStreamReturnsNull() {
        assertThat(new ReadWorkbook().getMandatoryUseInputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPasswordReturnsNull() {
        assertThat(new ReadWorkbook().getPassword(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getReadCacheReturnsNull() {
        assertThat(new ReadWorkbook().getReadCache(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getReadCacheSelectorReturnsNull() {
        assertThat(new ReadWorkbook().getReadCacheSelector(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAutoCloseStreamToFalse() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(false);
        assertThat(readWorkbook.getAutoCloseStream(), is(false));
    }

    @Test(timeout=10000)
    public void setConvertAllFiledToFalse() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setConvertAllFiled(false);
        assertThat(readWorkbook.getConvertAllFiled(), is(false));
    }

    @Test(timeout=10000)
    public void setCustomObject() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        assertThat(readWorkbook.getCustomObject(), sameInstance(customObject));
    }

    @Test(timeout=10000)
    public void setDefaultReturnMapToFalse() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setDefaultReturnMap(false);
        assertThat(readWorkbook.getDefaultReturnMap(), is(false));
    }

    @Test(timeout=10000)
    public void setExcelTypeToXLS() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        assertThat(readWorkbook.getExcelType(), is(ExcelTypeEnum.XLS));
    }

    @Test(timeout=10000)
    public void setIgnoreEmptyRowToFalse() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setIgnoreEmptyRow(false);
        assertThat(readWorkbook.getIgnoreEmptyRow(), is(false));
    }

    @Test(timeout=10000)
    public void setInputStream() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        InputStream inputStream = new StringBufferInputStream("Broadway");
        readWorkbook.setInputStream(inputStream);
        assertThat(readWorkbook.getInputStream(), sameInstance(inputStream));
    }

    @Test(timeout=10000)
    public void setMandatoryUseInputStreamToFalse() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setMandatoryUseInputStream(false);
        assertThat(readWorkbook.getMandatoryUseInputStream(), is(false));
    }

    @Test(timeout=10000)
    public void setPasswordToFoo() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setPassword("foo");
        assertThat(readWorkbook.getPassword(), is("foo"));
    }

    @Test(timeout=10000)
    public void setReadCache() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        ReadCache readCache = mock(ReadCache.class);
        readWorkbook.setReadCache(readCache);
        assertThat(readWorkbook.getReadCache(), sameInstance(readCache));
    }

    @Test(timeout=10000)
    public void setReadCacheSelector() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        ReadCacheSelector readCacheSelector = mock(ReadCacheSelector.class);
        readWorkbook.setReadCacheSelector(readCacheSelector);
        assertThat(readWorkbook.getReadCacheSelector(), sameInstance(readCacheSelector));
    }
}
