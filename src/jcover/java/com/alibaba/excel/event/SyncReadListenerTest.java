package com.alibaba.excel.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;

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
        assertThat(syncReadListener.getList(), hasSize(1));
        assertThat(syncReadListener.getList().get(0), sameInstance(object));
    }

    @Test
    void invoke() {

        // arrange
        SyncReadListener syncReadListener = new SyncReadListener();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Object());
        syncReadListener.setList(list);
        Object object2 = new Object();
        AnalysisContext context = mock(AnalysisContext.class);

        // act
        syncReadListener.invoke(object2, context);

        // assert
        assertThat(syncReadListener.getList(), hasSize(2));
        assertThat(syncReadListener.getList().get(1), sameInstance(object2));
    }

    @Test
    void doAfterAllAnalysed() {
        AnalysisContext context = mock(AnalysisContext.class);
        new SyncReadListener().doAfterAllAnalysed(context);
    }
}
