package com.alibaba.excel.read.processor;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.read.metadata.holder.ReadHolder;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.read.processor.DefaultAnalysisEventProcessor
 *
 * @author Diffblue Cover
 */

class DefaultAnalysisEventProcessorTest {

    @Test
    void endSheet() {

        // arrange
        ArrayList<ReadListener> readListenerList =
             new ArrayList<ReadListener>();
        @SuppressWarnings("unchecked")
        ReadListener<String> readListener = mock(ReadListener.class);
        readListenerList.add(readListener);
        ReadHolder readHolder = mock(ReadHolder.class);
        when(readHolder.readListenerList())
            .thenReturn(readListenerList);
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        when(analysisContext.currentReadHolder())
            .thenReturn(readHolder);

        // act
        new DefaultAnalysisEventProcessor().endSheet(analysisContext);

        // assert
        Mockito.verify(readListener).doAfterAllAnalysed(Mockito.<AnalysisContext>any());
    }
}
