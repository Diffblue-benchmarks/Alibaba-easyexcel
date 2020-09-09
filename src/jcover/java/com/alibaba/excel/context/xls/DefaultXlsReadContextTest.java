package com.alibaba.excel.context.xls;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.cache.Ehcache;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellExtraTypeEnum;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.read.listener.ModelBuildEventListener;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.read.metadata.holder.xls.XlsReadWorkbookHolder;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.context.xls.DefaultXlsReadContext
 *
 * @author Diffblue Cover
 */

class DefaultXlsReadContextTest {

    @Test
    void xlsReadWorkbookHolder() {

        // arrange
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setAutoCloseStream(false);
        readWorkbook.setConvertAllFiled(false);
        Object customObject = new Object();
        readWorkbook.setCustomObject(customObject);
        readWorkbook.setDefaultReturnMap(false);
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setExtraReadSet(new HashSet<CellExtraTypeEnum>());
        readWorkbook.setIgnoreEmptyRow(false);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        readWorkbook.setMandatoryUseInputStream(false);
        readWorkbook.setPassword("secret");
        readWorkbook.setReadCache(new Ehcache(1));
        readWorkbook.setUseDefaultListener(false);
        readWorkbook.setXlsxSAXParserFactoryName("Acme");
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
        Locale locale = new Locale("en");
        readWorkbook.setLocale(locale);
        readWorkbook.setUse1904windowing(false);
        readWorkbook.setUseScientificFormat(false);

        // act
        XlsReadWorkbookHolder result =
             new DefaultXlsReadContext(readWorkbook, ExcelTypeEnum.XLS).xlsReadWorkbookHolder();

        // assert
        assertThat(result.getBoundSheetRecordList(), empty());
        assertThat(result.getFormatTrackingHSSFListener(), is(nullValue()));
        assertThat(result.getHssfWorkbook(), is(nullValue()));
        assertThat(result.getIgnoreRecord(), is(false));
        assertThat(result.getNeedReadSheet(), is(true));
        assertThat(result.getPoifsFileSystem(), is(nullValue()));
        assertThat(result.getReadSheetIndex(), is(nullValue()));
        assertThat(result.getActualSheetDataList(), is(nullValue()));
        assertThat(result.getAutoCloseStream(), is(false));
        assertThat(result.getConvertAllFiled(), is(nullValue()));
        assertThat(result.getCustomObject(), sameInstance(customObject));
        assertThat(result.getDefaultReturnMap(), is(false));
        assertThat(result.getExcelType(), is(ExcelTypeEnum.XLS));
        assertThat(result.getExtraReadSet(), empty());
        assertThat(result.getFile(), is(nullValue()));
        assertThat(result.getHasReadSheet(), empty());
        assertThat(result.getIgnoreEmptyRow(), is(false));
        assertThat(result.getMandatoryUseInputStream(), is(false));
        assertThat(result.getParameterSheetDataList(), is(nullValue()));
        assertThat(result.getPassword(), is("secret"));
        assertThat(result.getReadAll(), is(nullValue()));
        assertThat(result.getReadCache(), is(nullValue()));
        assertThat(result.getReadWorkbook(), sameInstance(readWorkbook));
        assertThat(result.getTempFile(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getContentPropertyMap().get(0), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getFieldNameContentPropertyMap().isEmpty(), is(true));
        assertThat((Class<String>) result.getExcelReadHeadProperty().getHeadClazz(), equalTo((Class) String.class));
        assertThat(result.getExcelReadHeadProperty().getHeadKind(), is(HeadKindEnum.CLASS));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getColumnIndex(), is(0));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getColumnWidthProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getContentFontProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getContentStyleProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getFieldName(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getForceIndex(), is(false));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getForceName(), is(true));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getHeadFontProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getHeadNameList(), sameInstance(list));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getHeadStyleProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadMap().get(0).getLoopMergeProperty(), is(nullValue()));
        assertThat(result.getExcelReadHeadProperty().getHeadRowNumber(), is(1));
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        // pojo Class<?>
        // pojo String
        assertThat(result.getHeadRowNumber(), is(1));
        assertThat(result.getReadListenerList().size(), is(1));
        assertThat(result.getReadListenerList().get(0), sameInstance(readListener));
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
        assertThat(result.getGlobalConfiguration().getLocale(), sameInstance(locale));
        assertThat(result.getGlobalConfiguration().getUse1904windowing(), is(false));
        assertThat(result.getGlobalConfiguration().getUseScientificFormat(), is(false));
        assertThat(result.getHead().size(), is(1));
        assertThat(result.getHead().get(0), sameInstance(list));
        assertThat(result.getNewInitialization(), is(true));
    }

    @Test
    void xlsReadSheetHolderReturnsNull() {
        assertThat(new DefaultXlsReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS).xlsReadSheetHolder(), is(nullValue()));
    }
}
