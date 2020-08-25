package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.merge.LoopMergeStrategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteBasicParameter
 *
 * @author Diffblue Cover
 */

class WriteBasicParameterTest {

    @Test
    void factory() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        ArrayList<WriteHandler> customWriteHandlerList =
             new ArrayList<WriteHandler>();
        WriteHandler writeHandler = new LoopMergeStrategy(1, 1);
        customWriteHandlerList.add(writeHandler);
        writeBasicParameter.setCustomWriteHandlerList(customWriteHandlerList);
        LinkedList<String> excludeColumnFiledNames = new LinkedList<String>();
        excludeColumnFiledNames.add("data.txt");
        writeBasicParameter.setExcludeColumnFiledNames(excludeColumnFiledNames);
        LinkedList<Integer> excludeColumnIndexes = new LinkedList<Integer>();
        excludeColumnIndexes.add(1);
        writeBasicParameter.setExcludeColumnIndexes(excludeColumnIndexes);
        LinkedList<String> includeColumnFiledNames = new LinkedList<String>();
        includeColumnFiledNames.add("data.txt");
        writeBasicParameter.setIncludeColumnFiledNames(includeColumnFiledNames);
        LinkedList<Integer> includeColumnIndexes = new LinkedList<Integer>();
        includeColumnIndexes.add(1);
        writeBasicParameter.setIncludeColumnIndexes(includeColumnIndexes);
        writeBasicParameter.setNeedHead(false);
        writeBasicParameter.setRelativeHeadRowIndex(1);
        writeBasicParameter.setUseDefaultStyle(false);
        writeBasicParameter.setAutoTrim(false);
        writeBasicParameter.setClazz(String.class);
        ArrayList<Converter> customConverterList = new ArrayList<Converter>();
        Converter converter = new AutoConverter();
        customConverterList.add(converter);
        writeBasicParameter.setCustomConverterList(customConverterList);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("data");
        head.add(list);
        writeBasicParameter.setHead(head);
        writeBasicParameter.setUse1904windowing(false);
        assertThat(writeBasicParameter.getCustomWriteHandlerList().size(), is(1));
        assertThat(writeBasicParameter.getCustomWriteHandlerList().get(0), sameInstance(writeHandler));
        assertThat(writeBasicParameter.getExcludeColumnFiledNames(), hasSize(1));
        assertTrue(writeBasicParameter.getExcludeColumnFiledNames().contains("data.txt"));
        assertThat(writeBasicParameter.getExcludeColumnIndexes(), hasSize(1));
        assertTrue(writeBasicParameter.getExcludeColumnIndexes().contains(1));
        assertThat(writeBasicParameter.getIncludeColumnFiledNames(), hasSize(1));
        assertTrue(writeBasicParameter.getIncludeColumnFiledNames().contains("data.txt"));
        assertThat(writeBasicParameter.getIncludeColumnIndexes(), hasSize(1));
        assertTrue(writeBasicParameter.getIncludeColumnIndexes().contains(1));
        assertThat(writeBasicParameter.getNeedHead(), is(false));
        assertThat(writeBasicParameter.getRelativeHeadRowIndex(), is(1));
        assertThat(writeBasicParameter.getUseDefaultStyle(), is(false));
        assertThat(writeBasicParameter.getAutoTrim(), is(false));
        assertThat((Class<String>) writeBasicParameter.getClazz(), equalTo((Class) String.class));
        assertThat(writeBasicParameter.getCustomConverterList().size(), is(1));
        assertThat(writeBasicParameter.getCustomConverterList().get(0), sameInstance(converter));
        assertThat(writeBasicParameter.getHead().size(), is(1));
        assertThat(writeBasicParameter.getHead().get(0), sameInstance(list));
        assertThat(writeBasicParameter.getUse1904windowing(), is(false));
    }
}
