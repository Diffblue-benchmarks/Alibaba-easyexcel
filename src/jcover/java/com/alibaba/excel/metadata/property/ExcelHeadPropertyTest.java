package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
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
    void factory1() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head, false);
        excelHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void factory2() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, null, false);
        excelHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void factory3() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, new ArrayList<List<String>>(), false);
        excelHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void factory4() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        head.add(new ArrayList<String>());
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, head, false);
        excelHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void factory5() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, null, new ArrayList<List<String>>(), false);
        excelHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void hasHeadReturnsFalse() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty =
             new ExcelHeadProperty(holder, String.class, new ArrayList<List<String>>(), false);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        assertThat(excelHeadProperty.hasHead(), is(false));
    }

    @Test
    void hasHeadReturnsTrue() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("foo");
        head.add(list);
        assertThat(new ExcelHeadProperty(holder, String.class, head, false).hasHead(), is(true));
    }
}
