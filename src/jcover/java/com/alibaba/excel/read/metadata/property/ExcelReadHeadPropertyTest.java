package com.alibaba.excel.read.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty
 *
 * @author Diffblue Cover
 */

class ExcelReadHeadPropertyTest {

    @Test
    void factory() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        ExcelReadHeadProperty excelReadHeadProperty =
             new ExcelReadHeadProperty(holder, String.class, head, false);
        excelReadHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelReadHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelReadHeadProperty.setHeadClazz(String.class);
        excelReadHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelReadHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelReadHeadProperty.setHeadRowNumber(1);
        excelReadHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelReadHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelReadHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelReadHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelReadHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelReadHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelReadHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelReadHeadProperty.getIgnoreMap(), is(notNullValue()));
    }
}
