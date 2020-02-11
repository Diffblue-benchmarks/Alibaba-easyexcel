package com.alibaba.excel.write.metadata.holder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.HolderEnum;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder
 *
 * @author Diffblue JCover
 */

public class WriteWorkbookHolderTest {

    @Test(timeout=10000)
    public void getAutoCloseStreamReturnsTrue() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getAutoCloseStream(), is(true));
    }

    @Test(timeout=10000)
    public void getCachedWorkbookReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getCachedWorkbook(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExcelTypeReturnsXLSX() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getExcelType(), is(ExcelTypeEnum.XLSX));
    }

    @Test(timeout=10000)
    public void getFileReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getFile(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHasBeenInitializedSheetReturnsEmpty() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        Map<Integer, WriteSheetHolder> result = writeWorkbookHolder.getHasBeenInitializedSheet();
        assertThat(result.isEmpty(), is(true));
        assertThat(writeWorkbookHolder.getHasBeenInitializedSheet(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getInMemoryReturnsFalse() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getInMemory(), is(false));
    }

    @Test(timeout=10000)
    public void getMandatoryUseInputStreamReturnsFalse() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getMandatoryUseInputStream(), is(false));
    }

    @Test(timeout=10000)
    public void getOutputStreamReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getOutputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPasswordReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getPassword(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTemplateFileReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getTemplateFile(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTemplateInputStreamReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getTemplateInputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTempTemplateInputStreamReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getTempTemplateInputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWorkbookReturnsNull() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).getWorkbook(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWriteWorkbook() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        assertThat(new WriteWorkbookHolder(writeWorkbook).getWriteWorkbook(), sameInstance(writeWorkbook));
    }

    @Test(timeout=10000)
    public void holderTypeReturnsWORKBOOK() {
        assertThat(new WriteWorkbookHolder(new WriteWorkbook()).holderType(), is(HolderEnum.WORKBOOK));
    }

    @Test(timeout=10000)
    public void setAutoCloseStreamToFalse() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        writeWorkbookHolder.setAutoCloseStream(false);
        assertThat(writeWorkbookHolder.getAutoCloseStream(), is(false));
    }

    @Test(timeout=10000)
    public void setCachedWorkbook() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        Workbook cachedWorkbook = mock(Workbook.class);
        writeWorkbookHolder.setCachedWorkbook(cachedWorkbook);
        assertThat(writeWorkbookHolder.getCachedWorkbook(), sameInstance(cachedWorkbook));
    }

    @Test(timeout=10000)
    public void setExcelTypeToXLS() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        writeWorkbookHolder.setExcelType(ExcelTypeEnum.XLS);
        assertThat(writeWorkbookHolder.getExcelType(), is(ExcelTypeEnum.XLS));
    }

    @Test(timeout=10000)
    public void setHasBeenInitializedSheetToEmpty() {
        WriteWorkbookHolder writeWorkbookHolder1 = new WriteWorkbookHolder(new WriteWorkbook());
        Map<Integer, WriteSheetHolder> hasBeenInitializedSheet = new HashMap<Integer, WriteSheetHolder>();
        writeWorkbookHolder1.setHasBeenInitializedSheet(hasBeenInitializedSheet);
        assertThat(writeWorkbookHolder1.getHasBeenInitializedSheet(), sameInstance(hasBeenInitializedSheet));
    }

    @Test(timeout=10000)
    public void setInMemoryToTrue() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        writeWorkbookHolder.setInMemory(true);
        assertThat(writeWorkbookHolder.getInMemory(), is(true));
    }

    @Test(timeout=10000)
    public void setMandatoryUseInputStreamToTrue() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        writeWorkbookHolder.setMandatoryUseInputStream(true);
        assertThat(writeWorkbookHolder.getMandatoryUseInputStream(), is(true));
    }

    @Test(timeout=10000)
    public void setOutputStream() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        OutputStream outputStream = new ByteArrayOutputStream();
        writeWorkbookHolder.setOutputStream(outputStream);
        assertThat(writeWorkbookHolder.getOutputStream(), sameInstance(outputStream));
    }

    @Test(timeout=10000)
    public void setPasswordToFoo() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        writeWorkbookHolder.setPassword("foo");
        assertThat(writeWorkbookHolder.getPassword(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTemplateInputStream() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        InputStream templateInputStream = new StringBufferInputStream("Broadway");
        writeWorkbookHolder.setTemplateInputStream(templateInputStream);
        assertThat(writeWorkbookHolder.getTemplateInputStream(), sameInstance(templateInputStream));
    }

    @Test(timeout=10000)
    public void setTempTemplateInputStream() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        InputStream tempTemplateInputStream = new StringBufferInputStream("Broadway");
        writeWorkbookHolder.setTempTemplateInputStream(tempTemplateInputStream);
        assertThat(writeWorkbookHolder.getTempTemplateInputStream(), sameInstance(tempTemplateInputStream));
    }

    @Test(timeout=10000)
    public void setWorkbook() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        Workbook workbook = mock(Workbook.class);
        writeWorkbookHolder.setWorkbook(workbook);
        assertThat(writeWorkbookHolder.getWorkbook(), sameInstance(workbook));
    }

    @Test(timeout=10000)
    public void setWriteWorkbook() {
        WriteWorkbookHolder writeWorkbookHolder = new WriteWorkbookHolder(new WriteWorkbook());
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        writeWorkbookHolder.setWriteWorkbook(writeWorkbook);
        assertThat(writeWorkbookHolder.getWriteWorkbook(), sameInstance(writeWorkbook));
    }
}
