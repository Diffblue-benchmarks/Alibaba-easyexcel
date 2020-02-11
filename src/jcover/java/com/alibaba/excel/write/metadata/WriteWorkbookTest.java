package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.event.WriteHandler;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteWorkbook
 *
 * @author Diffblue JCover
 */

public class WriteWorkbookTest {

    @Test(timeout=10000)
    public void getAutoCloseStreamReturnsNull() {
        assertThat(new WriteWorkbook().getAutoCloseStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getConvertAllFiledReturnsNull() {
        assertThat(new WriteWorkbook().getConvertAllFiled(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExcelTypeReturnsNull() {
        assertThat(new WriteWorkbook().getExcelType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFileReturnsNull() {
        assertThat(new WriteWorkbook().getFile(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInMemoryReturnsNull() {
        assertThat(new WriteWorkbook().getInMemory(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMandatoryUseInputStreamReturnsNull() {
        assertThat(new WriteWorkbook().getMandatoryUseInputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOutputStreamReturnsNull() {
        assertThat(new WriteWorkbook().getOutputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPasswordReturnsNull() {
        assertThat(new WriteWorkbook().getPassword(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTemplateFileReturnsNull() {
        assertThat(new WriteWorkbook().getTemplateFile(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTemplateInputStreamReturnsNull() {
        assertThat(new WriteWorkbook().getTemplateInputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWriteHandlerReturnsNull() {
        assertThat(new WriteWorkbook().getWriteHandler(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAutoCloseStreamToFalse() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setAutoCloseStream(false);
        assertThat(writeWorkbook.getAutoCloseStream(), is(false));
    }

    @Test(timeout=10000)
    public void setConvertAllFiledToFalse() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setConvertAllFiled(false);
        assertThat(writeWorkbook.getConvertAllFiled(), is(false));
    }

    @Test(timeout=10000)
    public void setExcelTypeToXLS() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setExcelType(ExcelTypeEnum.XLS);
        assertThat(writeWorkbook.getExcelType(), is(ExcelTypeEnum.XLS));
    }

    @Test(timeout=10000)
    public void setInMemoryToFalse() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setInMemory(false);
        assertThat(writeWorkbook.getInMemory(), is(false));
    }

    @Test(timeout=10000)
    public void setMandatoryUseInputStreamToFalse() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setMandatoryUseInputStream(false);
        assertThat(writeWorkbook.getMandatoryUseInputStream(), is(false));
    }

    @Test(timeout=10000)
    public void setOutputStream() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        OutputStream outputStream = new ByteArrayOutputStream();
        writeWorkbook.setOutputStream(outputStream);
        assertThat(writeWorkbook.getOutputStream(), sameInstance(outputStream));
    }

    @Test(timeout=10000)
    public void setPasswordToFoo() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbook.setPassword("foo");
        assertThat(writeWorkbook.getPassword(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTemplateInputStream() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        InputStream templateInputStream = new StringBufferInputStream("Broadway");
        writeWorkbook.setTemplateInputStream(templateInputStream);
        assertThat(writeWorkbook.getTemplateInputStream(), sameInstance(templateInputStream));
    }

    @Test(timeout=10000)
    public void setWriteHandler() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        WriteHandler writeHandler = mock(WriteHandler.class);
        writeWorkbook.setWriteHandler(writeHandler);
        assertThat(writeWorkbook.getWriteHandler(), sameInstance(writeHandler));
    }
}
