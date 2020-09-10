package com.alibaba.excel.analysis.v07.handlers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.excel.context.xlsx.XlsxReadContext;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.HyperlinkTagHandler
 *
 * @author Diffblue Cover
 */

class HyperlinkTagHandlerTest {

    @Test
    void startElementNameIsAcme() {
        XlsxReadContext xlsxReadContext = mock(XlsxReadContext.class);
        Attributes attributes = mock(Attributes.class);
        when(attributes.getValue(Mockito.<String>any()))
            .thenReturn("")
            .thenReturn("foo");
        new HyperlinkTagHandler().startElement(xlsxReadContext, "Acme", attributes);
    }
}
