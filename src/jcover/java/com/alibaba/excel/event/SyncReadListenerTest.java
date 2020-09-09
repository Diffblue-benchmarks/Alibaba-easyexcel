package com.alibaba.excel.event;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

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
        syncReadListener.setList(new ArrayList<Object>());
        assertThat(syncReadListener.getList(), empty());
    }
}
