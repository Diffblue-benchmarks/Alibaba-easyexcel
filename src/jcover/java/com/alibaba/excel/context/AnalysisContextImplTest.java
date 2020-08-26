package com.alibaba.excel.context;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.context.AnalysisContextImpl
 *
 * @author Diffblue Cover
 */

class AnalysisContextImplTest {

    @Test
    void readWorkbookHolder() {

        // arrange
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(false);
        readWorkbook.setConvertAllFiled(false);
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        readWorkbook.setDefaultReturnMap(false);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setIgnoreEmptyRow(false);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        readWorkbook.setReadCache(new Ehcache(1));
        ArrayList<ReadListener> customReadListenerList =
             new ArrayList<ReadListener>();
        ReadListener readListener = new ModelBuildEventListener();
        customReadListenerList.add(readListener);
        readWorkbook.setCustomReadListenerList(customReadListenerList);
        readWorkbook.setHeadRowNumber(1);
        readWorkbook.setAutoTrim(false);
        readWorkbook.setClazz(String.class);
        readWorkbook.setCustomConverterList(new ArrayList<Converter>());
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        readWorkbook.setHead(head);
        readWorkbook.setUse1904windowing(false);

        // act
        ReadWorkbookHolder result =
             new AnalysisContextImpl(readWorkbook).readWorkbookHolder();

        // assert
        assertThat(result.getAutoCloseStream(), is(false));
        assertThat(result.getConvertAllFiled(), is(nullValue()));
        assertThat(result.getCustomObject(), sameInstance(customObject));
        assertThat(result.getDefaultReturnMap(), is(false));
        assertThat(result.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(result.getFile(), is(nullValue()));
        assertThat(result.getHasReadSheet(), empty());
        assertThat(result.getIgnoreEmptyRow(), is(false));
        assertThat(result.getIgnoreRecord03(), is(false));
        assertThat(result.getMandatoryUseInputStream(), is(false));
        assertThat(result.getOpcPackage(), is(nullValue()));
        assertThat(result.getPassword(), is("secret"));
        assertThat(result.getPoifsFileSystem(), is(nullValue()));
        assertThat(result.getReadCache(), is(nullValue()));
        assertThat(result.getReadWorkbook(), sameInstance(readWorkbook));
        assertThat(result.getTempFile(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getContentPropertyMap().get(0), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getFieldNameContentPropertyMap().isEmpty(), is(true));
        assertThat((Class<String>) result.getExcelReadHeadProperty().getHeadClazz(), equalTo((Class) String.class));
        assertThat(result.getExcelReadHeadProperty().getHeadKind(), is(HeadKindEnum.STRING));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getColumnIndex(), is(0));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getColumnWidthProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getFieldName(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getForceIndex(), is(false));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getForceName(), is(true));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getHeadNameList(), sameInstance(list));
        assertThat(result.getExcelReadHeadProperty().getHeadRowNumber(), is(1));
        assertThat(result.getExcelReadHeadProperty().getIgnoreMap().isEmpty(), is(true));
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getReadListenerList().size(), is(2));
        // pojo ReadListener
        assertThat(result.getReadListenerList().get(1), sameInstance(readListener));
        assertThat((Class<String>) result.getClazz(), equalTo((Class) String.class));
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        // pojo Converter
        assertThat(result.getGlobalConfiguration().getAutoTrim(), is(false));
        assertThat(result.getGlobalConfiguration().getUse1904windowing(), is(false));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list));
        assertThat(result.getNewInitialization(), is(true));
    }

    @Test
    void readSheetHolderReturnsNull() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        assertThat(new AnalysisContextImpl(readWorkbook).readSheetHolder(), is(nullValue()));
    }

    @Test
    void readRowHolderReturnsNull() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        assertThat(new AnalysisContextImpl(readWorkbook).readRowHolder(), is(nullValue()));
    }

    @Test
    void readRowHolder() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        new AnalysisContextImpl(readWorkbook).readRowHolder(new ReadRowHolder(1, new GlobalConfiguration()));
    }

    @Test
    void currentReadHolder() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        // pojo com.alibaba.excel.read.metadata.holder.ReadHolder
    }

    @Test
    void getCustom() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        assertThat(new AnalysisContextImpl(readWorkbook).getCustom(), sameInstance(customObject));
    }

    @Test
    void getExcelTypeReturnsXls() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        assertThat(new AnalysisContextImpl(readWorkbook).getExcelType(), is(ExcelTypeEnum.XLS));
    }

    @Test
    void getInputStream() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        // pojo java.io.InputStream
    }
}
