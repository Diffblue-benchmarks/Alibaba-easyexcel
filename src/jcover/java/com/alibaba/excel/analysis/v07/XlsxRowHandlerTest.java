package com.alibaba.excel.analysis.v07;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.context.AnalysisContext;

import org.apache.poi.xssf.model.StylesTable;
import org.junit.Test;
import org.xml.sax.Attributes;

/**
 * Unit tests for com.alibaba.excel.analysis.v07.XlsxRowHandler
 *
 * @author Diffblue JCover
 */

public class XlsxRowHandlerTest {

    @Test(timeout=10000)
    public void charactersChIsaAndLengthIsOneAndStartIsZero() throws org.xml.sax.SAXException {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        char[] ch = new char[] { 'a' };
        new XlsxRowHandler(analysisContext, new org.apache.poi.xssf.model.StylesTable()).characters(ch, 0, 1);
    }

    @Test(timeout=10000)
    public void endElementLocalNameIsBarAndNameIsBarAndUriIsFoo() throws org.xml.sax.SAXException {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        new XlsxRowHandler(analysisContext, new org.apache.poi.xssf.model.StylesTable()).endElement("foo", "bar", "bar");
    }

    @Test(timeout=10000)
    public void resolveEntityPublicIdIsBarAndSystemIdIsFooReturnsNull() throws java.io.IOException, org.xml.sax.SAXException {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        assertThat(new XlsxRowHandler(analysisContext, new StylesTable()).resolveEntity("bar", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void startElementLocalNameIsBarAndNameIsBarAndUriIsFoo() throws org.xml.sax.SAXException {
        AnalysisContext analysisContext = mock(AnalysisContext.class);
        Attributes attributes = mock(Attributes.class);
        new XlsxRowHandler(analysisContext, new StylesTable()).startElement("foo", "bar", "bar", attributes);
    }
}
