package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.read.metadata.ReadSheet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.util.SheetUtils
 *
 * @author Diffblue JCover
 */

public class SheetUtilsDiffblueTest {

    @Test(timeout=10000)
    public void match1() {
        List<ReadSheet> parameterReadSheetList = new ArrayList<ReadSheet>();
        ((ArrayList<ReadSheet>)parameterReadSheetList).add(new ReadSheet());
        assertThat(SheetUtils.match(new ReadSheet(), parameterReadSheetList, false, new GlobalConfiguration()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void match2() {
        ReadSheet readSheet1 = new ReadSheet(0);
        List<ReadSheet> parameterReadSheetList = new ArrayList<ReadSheet>();
        ((ArrayList<ReadSheet>)parameterReadSheetList).add(new ReadSheet());
        ReadSheet result = SheetUtils.match(readSheet1, parameterReadSheetList, false, new GlobalConfiguration());
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(0));
        assertTrue(result.getCustomReadListenerList().isEmpty());
        assertThat(result.getHeadRowNumber(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test(timeout=10000)
    public void match3() {
        ReadSheet readSheet = new ReadSheet(1);
        List<ReadSheet> parameterReadSheetList = new ArrayList<ReadSheet>();
        ((ArrayList<ReadSheet>)parameterReadSheetList).add(new ReadSheet(1));
        ReadSheet result = SheetUtils.match(readSheet, parameterReadSheetList, false, new GlobalConfiguration());
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(1));
        assertTrue(result.getCustomReadListenerList().isEmpty());
        assertThat(result.getHeadRowNumber(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
        assertThat(readSheet, sameInstance(result));
    }

    @Test(timeout=10000)
    public void match4() {
        List<ReadSheet> parameterReadSheetList = new ArrayList<ReadSheet>();
        ((ArrayList<ReadSheet>)parameterReadSheetList).add(new ReadSheet(null, ""));
        assertThat(SheetUtils.match(new ReadSheet(), parameterReadSheetList, false, new GlobalConfiguration()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void matchParameterReadSheetListIsEmpty() {
        assertThat(SheetUtils.match(new ReadSheet(), new ArrayList<ReadSheet>(), false, new GlobalConfiguration()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void matchParameterReadSheetListIsEmptyAndReadAllIsTrue() {
        ReadSheet readSheet1 = new ReadSheet();
        ReadSheet result = SheetUtils.match(readSheet1, new ArrayList<ReadSheet>(), true, new GlobalConfiguration());
        assertThat(result.getSheetName(), is(nullValue()));
        assertThat(result.getSheetNo(), is(nullValue()));
        assertTrue(result.getCustomReadListenerList().isEmpty());
        assertThat(result.getHeadRowNumber(), is(nullValue()));
        assertThat(result.getAutoTrim(), is(nullValue()));
        assertThat(result.getClazz(), is(nullValue()));
        assertThat(result.getCustomConverterList(), is(nullValue()));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getUse1904windowing(), is(nullValue()));
        assertThat(readSheet1, sameInstance(result));
    }

    @Test(timeout=10000)
    public void matchParameterReadSheetListIsNull() {
        List<ReadSheet> parameterReadSheetList = new ArrayList<ReadSheet>();
        ((ArrayList<ReadSheet>)parameterReadSheetList).add(null);
        assertThat(SheetUtils.match(new ReadSheet(), parameterReadSheetList, false, new GlobalConfiguration()), is(nullValue()));
    }
}
