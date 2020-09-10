package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.parameter.GenerateParam;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.builder.ExcelWriterTableBuilder
 *
 * @author Diffblue Cover
 */

class ExcelWriterTableBuilderTest {

    @Test
    void factory() throws Exception {
        GenerateParam generateParam =
             new GenerateParam("name", String.class, new ByteArrayOutputStream());
        generateParam.setClazz(String.class);
        generateParam.setNeedHead(false);
        generateParam.setOutputStream(new ByteArrayOutputStream());
        generateParam.setSheetName("name");
        generateParam.setType(ExcelTypeEnum.XLS);
        WriteSheet writeSheet = new WriteSheet();
        HashMap<Integer, Integer> columnWidthMap =
             new HashMap<Integer, Integer>();
        columnWidthMap.put(1, 1);
        writeSheet.setColumnWidthMap(columnWidthMap);
        writeSheet.setSheetName("Acme");
        writeSheet.setSheetNo(1);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableContentBackGroundColor(IndexedColors.BLACK1);
        Font tableContentFont = new Font();
        tableContentFont.setBold(false);
        tableContentFont.setFontHeightInPoints((short) 1);
        tableContentFont.setFontName("Acme");
        tableStyle.setTableContentFont(tableContentFont);
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLACK1);
        Font tableHeadFont = new Font();
        tableHeadFont.setBold(false);
        tableHeadFont.setFontHeightInPoints((short) 1);
        tableHeadFont.setFontName("Acme");
        tableStyle.setTableHeadFont(tableHeadFont);
        writeSheet.setTableStyle(tableStyle);
        writeSheet.setAutomaticMergeHead(false);
        ArrayList<WriteHandler> customWriteHandlerList2 =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler4 = mock(WriteHandler.class);
        customWriteHandlerList2.add(writeHandler4);
        writeSheet.setCustomWriteHandlerList(customWriteHandlerList2);
        LinkedList<String> excludeColumnFiledNames2 = new LinkedList<String>();
        excludeColumnFiledNames2.add("data.txt");
        writeSheet.setExcludeColumnFiledNames(excludeColumnFiledNames2);
        LinkedList<Integer> excludeColumnIndexes2 = new LinkedList<Integer>();
        excludeColumnIndexes2.add(1);
        writeSheet.setExcludeColumnIndexes(excludeColumnIndexes2);
        LinkedList<String> includeColumnFiledNames2 = new LinkedList<String>();
        includeColumnFiledNames2.add("data.txt");
        writeSheet.setIncludeColumnFiledNames(includeColumnFiledNames2);
        LinkedList<Integer> includeColumnIndexes2 = new LinkedList<Integer>();
        includeColumnIndexes2.add(1);
        writeSheet.setIncludeColumnIndexes(includeColumnIndexes2);
        writeSheet.setNeedHead(false);
        writeSheet.setRelativeHeadRowIndex(1);
        writeSheet.setUseDefaultStyle(false);
        writeSheet.setAutoTrim(false);
        writeSheet.setClazz(String.class);
        ArrayList<Converter> customConverterList2 = new ArrayList<Converter>();
        Converter converter2 = mock(Converter.class);
        customConverterList2.add(converter2);
        writeSheet.setCustomConverterList(customConverterList2);
        ArrayList<List<String>> head2 = new ArrayList<List<String>>();
        List<String> list2 = new ArrayList<String>();
        list2.add("foo");
        head2.add(list2);
        writeSheet.setHead(head2);
        writeSheet.setLocale(new Locale("en"));
        writeSheet.setUse1904windowing(false);
        writeSheet.setUseScientificFormat(false);
        // pojo ExcelWriterTableBuilder
    }

    @Test
    void tableNoTableNoIsOne() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.tableNo(1), sameInstance(excelWriterTableBuilder));
    }

    @Test
    void build() {
        WriteTable result = new ExcelWriterTableBuilder().build();
        assertThat(result.getTableNo(), is(nullValue()));
        assertThat(result.getTableStyle(), is(nullValue()));
        assertThat(result.getAutomaticMergeHead(), is(nullValue()));
        assertThat(result.getCustomWriteHandlerList(), empty());
        assertThat(result.getExcludeColumnFiledNames(), is(nullValue()));
        assertThat(result.getExcludeColumnIndexes(), is(nullValue()));
        assertThat(result.getIncludeColumnFiledNames(), is(nullValue()));
        assertThat(result.getIncludeColumnIndexes(), is(nullValue()));
        assertThat(result.getNeedHead(), is(nullValue()));
        assertThat(result.getRelativeHeadRowIndex(), is(nullValue()));
        assertThat(result.getUseDefaultStyle(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getLocale(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
        assertThat(result.getUseScientificFormat(), is(nullValue()));
    }

    @Test
    void automaticMergeHeadAutomaticMergeHeadIsFalse() {
        ExcelWriterTableBuilder excelWriterTableBuilder =
             new ExcelWriterTableBuilder();
        assertThat(excelWriterTableBuilder.automaticMergeHead(false), sameInstance(excelWriterTableBuilder));
    }
}
