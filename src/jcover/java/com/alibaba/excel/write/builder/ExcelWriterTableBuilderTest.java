package com.alibaba.excel.write.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

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
    void factory() {
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
        writeSheet.setCustomWriteHandlerList(new ArrayList<WriteHandler>());
        writeSheet.setExcludeColumnFiledNames(new LinkedList<String>());
        writeSheet.setExcludeColumnIndexes(new LinkedList<Integer>());
        writeSheet.setIncludeColumnFiledNames(new LinkedList<String>());
        writeSheet.setIncludeColumnIndexes(new LinkedList<Integer>());
        writeSheet.setNeedHead(false);
        writeSheet.setRelativeHeadRowIndex(1);
        writeSheet.setUseDefaultStyle(false);
        writeSheet.setAutoTrim(false);
        writeSheet.setClazz(String.class);
        writeSheet.setCustomConverterList(new ArrayList<Converter>());
        writeSheet.setHead(new ArrayList<List<String>>());
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
