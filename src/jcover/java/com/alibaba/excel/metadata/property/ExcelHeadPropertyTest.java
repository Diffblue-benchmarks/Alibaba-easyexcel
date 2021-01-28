package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anEmptyMap;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.Holder;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ExcelHeadProperty
 *
 * @author Diffblue Cover
 */

class ExcelHeadPropertyTest {

    @Test
    void factory() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("foo");
        head.add(stringList);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head, false);
        excelHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap(), anEmptyMap());
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), anEmptyMap());
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap(), anEmptyMap());
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap(), anEmptyMap());
    }

    @Test
    void hasHeadReturnsFalse() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("foo");
        head.add(stringList);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head, false);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        assertThat(excelHeadProperty.hasHead(), is(false));
    }
}
