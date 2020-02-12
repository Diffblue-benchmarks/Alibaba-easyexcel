package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.Head;

import java.math.RoundingMode;
import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ExcelContentProperty
 *
 * @author Diffblue JCover
 */

public class ExcelContentPropertyDiffblueTest {

    @Test(timeout=10000)
    public void getConverterReturnsNull() {
        assertThat(new ExcelContentProperty().getConverter(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDateTimeFormatPropertyReturnsNull() {
        assertThat(new ExcelContentProperty().getDateTimeFormatProperty(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFieldReturnsNull() {
        assertThat(new ExcelContentProperty().getField(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHeadReturnsNull() {
        assertThat(new ExcelContentProperty().getHead(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNumberFormatPropertyReturnsNull() {
        assertThat(new ExcelContentProperty().getNumberFormatProperty(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setConverter() {
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        Converter converter = mock(Converter.class);
        excelContentProperty.setConverter(converter);
        assertThat(excelContentProperty.getConverter(), sameInstance(converter));
    }

    @Test(timeout=10000)
    public void setDateTimeFormatProperty() {
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        DateTimeFormatProperty dateTimeFormatProperty = new DateTimeFormatProperty("yyyy-MM-dd", false);
        excelContentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);
        assertThat(excelContentProperty.getDateTimeFormatProperty(), sameInstance(dateTimeFormatProperty));
    }

    @Test(timeout=10000)
    public void setHead() {
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        Head head = new Head(1, "/bin/bash", new ArrayList<String>(), false, false);
        excelContentProperty.setHead(head);
        assertThat(excelContentProperty.getHead(), sameInstance(head));
    }

    @Test(timeout=10000)
    public void setNumberFormatProperty() {
        ExcelContentProperty excelContentProperty = new ExcelContentProperty();
        NumberFormatProperty numberFormatProperty = new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        excelContentProperty.setNumberFormatProperty(numberFormatProperty);
        assertThat(excelContentProperty.getNumberFormatProperty(), sameInstance(numberFormatProperty));
    }
}
