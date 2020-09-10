package com.alibaba.excel.analysis.v07.handlers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.xlsx.XlsxReadContext;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.MergeCellTagHandler
 *
 * @author Diffblue Cover
 */

class MergeCellTagHandlerTest {

    @Test
    void startElementNameIsAcme() {
        XlsxReadContext xlsxReadContext = mock(XlsxReadContext.class);
        Attributes attributes = mock(Attributes.class);
        when(attributes.getValue(Mockito.<String>any()))
            .thenReturn("");
        new MergeCellTagHandler().startElement(xlsxReadContext, "Acme", attributes);
    }
}
