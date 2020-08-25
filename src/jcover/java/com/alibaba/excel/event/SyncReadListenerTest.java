package com.alibaba.excel.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.context.AnalysisContextImpl;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.StringBufferInputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.event.SyncReadListener
 *
 * @author Diffblue Cover
 */

class SyncReadListenerTest {

    @Test
    void factory() {
        SyncReadListener syncReadListener = new SyncReadListener();
        ArrayList<Object> list = new ArrayList<Object>();
        Object object = new Object();
        list.add(object);
        syncReadListener.setList(list);
        assertThat(syncReadListener.getList().size(), is(1));
        assertThat(syncReadListener.getList().get(0), sameInstance(object));
    }

    @Test
    void invoke() {

        // arrange
        SyncReadListener syncReadListener = new SyncReadListener();
        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add(new Object());
        syncReadListener.setList(list1);
        Object object2 = new Object();
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));

        // act
        syncReadListener.invoke(object2, new AnalysisContextImpl(readWorkbook));

        // assert
        assertThat(syncReadListener.getList().size(), is(2));
        assertThat(syncReadListener.getList().get(1), sameInstance(object2));
    }

    @Test
    void doAfterAllAnalysed() {
        ReadWorkbook readWorkbook = new ReadWorkbook();
        readWorkbook.setExcelType(ExcelTypeEnum.XLS);
        readWorkbook.setInputStream(new StringBufferInputStream("Broadway"));
        new SyncReadListener().doAfterAllAnalysed(new AnalysisContextImpl(readWorkbook));
    }
}
