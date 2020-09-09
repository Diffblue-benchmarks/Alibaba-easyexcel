package com.alibaba.excel.analysis.v07.handlers.sax;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.xlsx.DefaultXlsxReadContext;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import com.alibaba.excel.support.ExcelTypeEnum;

import org.junit.jupiter.api.Test;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.handlers.sax.XlsxRowHandler
 *
 * @author Diffblue Cover
 */

class XlsxRowHandlerTest {

    @Test
    void startElementLocalNameIsAcmeAndNameIsAcme() throws org.xml.sax.SAXException {
        Attributes attributes = mock(Attributes.class);
        new XlsxRowHandler(new DefaultXlsxReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS)).startElement("/some/path.html", "Acme", "Acme", attributes);
    }

    @Test
    void endElementLocalNameIsAcmeAndNameIsAcme() throws org.xml.sax.SAXException {
        new XlsxRowHandler(new DefaultXlsxReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS)).endElement("/some/path.html", "Acme", "Acme");
    }

    @Test
    void resolveEntityReturnsNull() throws java.io.IOException, org.xml.sax.SAXException {
        assertThat(new XlsxRowHandler(new DefaultXlsxReadContext(new ReadWorkbook(), ExcelTypeEnum.XLS)).resolveEntity("1234", "1234"), is(nullValue()));
    }
}
