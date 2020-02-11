package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Holder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.property.ExcelHeadProperty
 *
 * @author Diffblue JCover
 */

public class ExcelHeadPropertyTest {

    @Test(timeout=10000)
    public void getContentPropertyMapReturnsEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<Integer, ExcelContentProperty> result = excelHeadProperty.getContentPropertyMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(excelHeadProperty.getContentPropertyMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getFieldNameContentPropertyMapReturnsEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<String, ExcelContentProperty> result = excelHeadProperty.getFieldNameContentPropertyMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getHeadClazzReturnsString() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).getHeadClazz(), equalTo((Class)String.class));
    }

    @Test(timeout=10000)
    public void getHeadKindReturnsCLASS() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).getHeadKind(), is(HeadKindEnum.CLASS));
    }

    @Test(timeout=10000)
    public void getHeadMapReturnsEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<Integer, com.alibaba.excel.metadata.Head> result = excelHeadProperty.getHeadMap();
        assertThat(result.isEmpty(), is(true));
        assertThat(excelHeadProperty.getHeadMap(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getHeadRowNumberReturnsOne() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), true).getHeadRowNumber(), is(1));
    }

    @Test(timeout=10000)
    public void getHeadRowNumberReturnsZero() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).getHeadRowNumber(), is(0));
    }

//    @Test(timeout=10000)
//    public void getIgnoreMap() {
//        Holder holder = mock(Holder.class);
//        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
//        Map<String, java.lang.reflect.Field> result = excelHeadProperty.getIgnoreMap();
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // pojo String
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat((Class<String>)result.get("CASE_INSENSITIVE_ORDER").getDeclaringClass(), equalTo((Class)String.class));
//        assertThat(result.get("CASE_INSENSITIVE_ORDER").getGenericType().getTypeName(), is("java.util.Comparator<java.lang.String>"));
//        assertThat(result.get("CASE_INSENSITIVE_ORDER").getModifiers(), is(25));
//        assertThat(result.get("CASE_INSENSITIVE_ORDER").getName(), is("CASE_INSENSITIVE_ORDER"));
//        assertThat((Class<java.util.Comparator>)result.get("CASE_INSENSITIVE_ORDER").getType(), equalTo((Class)java.util.Comparator.class));
//        assertThat(result.get("CASE_INSENSITIVE_ORDER").isEnumConstant(), is(false));
//        assertThat(result.get("CASE_INSENSITIVE_ORDER").isSynthetic(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat(result.get("CASE_INSENSITIVE_ORDER").isAccessible(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // pojo String
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat((Class<String>)result.get("hash").getDeclaringClass(), equalTo((Class)String.class));
//        assertThat(result.get("hash").getGenericType().getTypeName(), is("int"));
//        assertThat(result.get("hash").getModifiers(), is(2));
//        assertThat(result.get("hash").getName(), is("hash"));
//        assertThat((Class<int>)result.get("hash").getType(), equalTo((Class)int.class));  <-- unexpected type
//        assertThat(result.get("hash").isEnumConstant(), is(false));
//        assertThat(result.get("hash").isSynthetic(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat(result.get("hash").isAccessible(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // pojo String
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat((Class<String>)result.get("serialPersistentFields").getDeclaringClass(), equalTo((Class)String.class));
//        assertThat(result.get("serialPersistentFields").getGenericType().getTypeName(), is("java.io.ObjectStreamField[]"));
//        assertThat(result.get("serialPersistentFields").getModifiers(), is(26));
//        assertThat(result.get("serialPersistentFields").getName(), is("serialPersistentFields"));
//        assertThat((Class<java.io.ObjectStreamField[]>)result.get("serialPersistentFields").getType(), equalTo((Class)java.io.ObjectStreamField[].class));
//        assertThat(result.get("serialPersistentFields").isEnumConstant(), is(false));
//        assertThat(result.get("serialPersistentFields").isSynthetic(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat(result.get("serialPersistentFields").isAccessible(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // pojo String
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat((Class<String>)result.get("serialVersionUID").getDeclaringClass(), equalTo((Class)String.class));
//        assertThat(result.get("serialVersionUID").getGenericType().getTypeName(), is("long"));
//        assertThat(result.get("serialVersionUID").getModifiers(), is(26));
//        assertThat(result.get("serialVersionUID").getName(), is("serialVersionUID"));
//        assertThat((Class<long>)result.get("serialVersionUID").getType(), equalTo((Class)long.class));  <-- unexpected type
//        assertThat(result.get("serialVersionUID").isEnumConstant(), is(false));
//        assertThat(result.get("serialVersionUID").isSynthetic(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat(result.get("serialVersionUID").isAccessible(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        // pojo String
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat((Class<String>)result.get("value").getDeclaringClass(), equalTo((Class)String.class));
//        assertThat(result.get("value").getGenericType().getTypeName(), is("char[]"));
//        assertThat(result.get("value").getModifiers(), is(18));
//        assertThat(result.get("value").getName(), is("value"));
//        assertThat((Class<char[]>)result.get("value").getType(), equalTo((Class)char[].class));
//        assertThat(result.get("value").isEnumConstant(), is(false));
//        assertThat(result.get("value").isSynthetic(), is(false));
//        // array literal with unexpected element type java.lang.annotation.Annotation
//        assertThat(result.get("value").isAccessible(), is(false));
//        assertThat(excelHeadProperty.getIgnoreMap(), sameInstance(result));
//    }
//
    @Test(timeout=10000)
    public void hasHead1() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHead2() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, null, false).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHead3() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), null).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHead4() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), true).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHead5() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, java.lang.reflect.Field.class, new ArrayList<java.util.List<String>>(), true).hasHead(), is(true));
    }

    @Test(timeout=10000)
    public void hasHeadReturnsFalse() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelHeadProperty(holder, null, new ArrayList<java.util.List<String>>(), false).hasHead(), is(false));
    }

    @Test(timeout=10000)
    public void setContentPropertyMapToEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<Integer, ExcelContentProperty> contentPropertyMap = new HashMap<Integer, ExcelContentProperty>();
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        assertThat(excelHeadProperty.getContentPropertyMap(), sameInstance(contentPropertyMap));
    }

    @Test(timeout=10000)
    public void setFieldNameContentPropertyMapToEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<String, ExcelContentProperty> fieldNameContentPropertyMap = new HashMap<String, ExcelContentProperty>();
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap(), sameInstance(fieldNameContentPropertyMap));
    }

    @Test(timeout=10000)
    public void setHeadClazzToString() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, com.alibaba.excel.annotation.ExcelIgnoreUnannotated.class, new ArrayList<java.util.List<String>>(), false);
        excelHeadProperty.setHeadClazz(String.class);
        assertThat((Class<String>)excelHeadProperty.getHeadClazz(), equalTo((Class)String.class));
    }

    @Test(timeout=10000)
    public void setHeadKindToNONE() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
    }

    @Test(timeout=10000)
    public void setHeadMapToEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<Integer, com.alibaba.excel.metadata.Head> headMap = new HashMap<Integer, com.alibaba.excel.metadata.Head>();
        excelHeadProperty.setHeadMap(headMap);
        assertThat(excelHeadProperty.getHeadMap(), sameInstance(headMap));
    }

    @Test(timeout=10000)
    public void setHeadRowNumberToOne() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        excelHeadProperty.setHeadRowNumber(1);
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
    }

    @Test(timeout=10000)
    public void setIgnoreMapToEmpty() {
        Holder holder = mock(Holder.class);
        ExcelHeadProperty excelHeadProperty = new ExcelHeadProperty(holder, String.class, new ArrayList<java.util.List<String>>(), false);
        Map<String, java.lang.reflect.Field> ignoreMap = new HashMap<String, java.lang.reflect.Field>();
        excelHeadProperty.setIgnoreMap(ignoreMap);
        assertThat(excelHeadProperty.getIgnoreMap(), sameInstance(ignoreMap));
    }
}
