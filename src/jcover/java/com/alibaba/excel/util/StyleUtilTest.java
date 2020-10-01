package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.excel.util.StyleUtil
 *
 * @author Diffblue Cover
 */

class StyleUtilTest {

    @Test
    void buildDefaultCellStyle() throws java.io.IOException, Exception {
        CellStyle cellStyle = mock(CellStyle.class);
        Workbook workbook = mock(Workbook.class);
        when(workbook.createCellStyle())
            .thenReturn(cellStyle);
        assertThat(StyleUtil.buildDefaultCellStyle(workbook), is(notNullValue()));
        Mockito.verify(cellStyle).setAlignment(ArgumentMatchers.<HorizontalAlignment>any());
        Mockito.verify(cellStyle).setBorderBottom(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle).setBorderLeft(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle).setBorderRight(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle).setBorderTop(ArgumentMatchers.<BorderStyle>any());
        Mockito.verify(cellStyle).setFillForegroundColor(ArgumentMatchers.eq((short) 22));
        Mockito.verify(cellStyle).setFillPattern(ArgumentMatchers.<FillPatternType>any());
        Mockito.verify(cellStyle).setLocked(ArgumentMatchers.eq((Boolean) true));
        Mockito.verify(cellStyle).setVerticalAlignment(ArgumentMatchers.<VerticalAlignment>any());
        Mockito.verify(cellStyle).setWrapText(ArgumentMatchers.eq((Boolean) true));
    }
}
