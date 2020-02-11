package com.alibaba.excel.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.event.SyncReadListener
 *
 * @author Diffblue JCover
 */

public class SyncReadListenerTest {

    @Test(timeout=10000)
    public void doAfterAllAnalysed() {
        AnalysisContext context = mock(AnalysisContext.class);
        new SyncReadListener().doAfterAllAnalysed(context);
    }

    @Test(timeout=10000)
    public void getListReturnsEmpty() {
        SyncReadListener syncReadListener = new SyncReadListener();
        List<Object> result = syncReadListener.getList();
        assertTrue(result.isEmpty());
        assertThat(syncReadListener.getList(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void hasNextReturnsTrue() {
        AnalysisContext context = mock(AnalysisContext.class);
        assertThat(new SyncReadListener().hasNext(context), is(true));
    }

    @Test(timeout=10000)
    public void invoke() {
        SyncReadListener syncReadListener = new SyncReadListener();
        Object object = new Object();
        AnalysisContext context = mock(AnalysisContext.class);
        syncReadListener.invoke(object, context);
        assertThat(syncReadListener.getList().size(), is(1));
        assertThat(syncReadListener.getList().get(0), sameInstance(object));
    }

    @Test(timeout=10000)
    public void setListToEmpty() {
        SyncReadListener syncReadListener = new SyncReadListener();
        List<Object> list = new ArrayList<Object>();
        syncReadListener.setList(list);
        assertThat(syncReadListener.getList(), sameInstance(list));
    }
}
