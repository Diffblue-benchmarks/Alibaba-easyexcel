package com.alibaba.excel.analysis.v07.handlers.sax;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.xlsx.XlsxReadContext;

import org.junit.jupiter.api.Test;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.sax.XlsxRowHandler
 *
 * @author Diffblue Cover
 */

class XlsxRowHandlerTest {

    @Test
    void startElementLocalNameIsAcmeAndNameIsAcmeAndUriIsBar() throws org.xml.sax.SAXException {
        XlsxReadContext xlsxReadContext = mock(XlsxReadContext.class);
        Attributes attributes = mock(Attributes.class);
        new XlsxRowHandler(xlsxReadContext).startElement("bar", "Acme", "Acme", attributes);
    }

    @Test
    void endElementLocalNameIsAcmeAndNameIsAcmeAndUriIsBar() throws org.xml.sax.SAXException {
        XlsxReadContext xlsxReadContext = mock(XlsxReadContext.class);
        new XlsxRowHandler(xlsxReadContext).endElement("bar", "Acme", "Acme");
    }

    @Test
    void resolveEntityReturnsNull() throws java.io.IOException, org.xml.sax.SAXException {
        XlsxReadContext xlsxReadContext = mock(XlsxReadContext.class);
        assertThat(new XlsxRowHandler(xlsxReadContext).resolveEntity("1234", "1234"), is(nullValue()));
    }
}
