package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.write.metadata.holder.WriteHolder;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.ClassUtils
 *
 * @author Diffblue Cover
 */

class ClassUtilsTest {

    @Test
    void declaredFieldsConvertAllFiledIsFalseAndIgnoreMapIsEmptyAndIndexFiledMapIsEmptyAndNeedIgnoreIsTrue() {

        // arrange
        HashMap<String, Field> ignoreMap = new HashMap<String, Field>();
        Holder holder = mock(Holder.class);

        // act
        ClassUtils.declaredFields(String.class, new HashMap<Integer, Field>(), new HashMap<Integer, Field>(), ignoreMap, false, true, holder);

        // assert
        assertThat((Class<String>) ignoreMap.get("CASE_INSENSITIVE_ORDER").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("CASE_INSENSITIVE_ORDER").getName(), is("CASE_INSENSITIVE_ORDER"));
        assertThat((Class<String>) ignoreMap.get("hash").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("hash").getName(), is("hash"));
        assertThat((Class<String>) ignoreMap.get("serialPersistentFields").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("serialPersistentFields").getName(), is("serialPersistentFields"));
        assertThat((Class<String>) ignoreMap.get("serialVersionUID").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("serialVersionUID").getName(), is("serialVersionUID"));
        assertThat((Class<String>) ignoreMap.get("value").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("value").getName(), is("value"));
    }

    @Test
    void declaredFieldsIgnoreMapIsEmptyAndIndexFiledMapIsEmpty() {

        // arrange
        HashMap<String, Field> ignoreMap = new HashMap<String, Field>();
        Holder holder = mock(Holder.class);

        // act
        ClassUtils.declaredFields(String.class, new HashMap<Integer, Field>(), new HashMap<Integer, Field>(), ignoreMap, true, false, holder);

        // assert
        assertThat((Class<String>) ignoreMap.get("CASE_INSENSITIVE_ORDER").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("CASE_INSENSITIVE_ORDER").getName(), is("CASE_INSENSITIVE_ORDER"));
        assertThat((Class<String>) ignoreMap.get("hash").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("hash").getName(), is("hash"));
        assertThat((Class<String>) ignoreMap.get("serialPersistentFields").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("serialPersistentFields").getName(), is("serialPersistentFields"));
        assertThat((Class<String>) ignoreMap.get("serialVersionUID").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("serialVersionUID").getName(), is("serialVersionUID"));
        assertThat((Class<String>) ignoreMap.get("value").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("value").getName(), is("value"));
    }

    @Test
    void declaredFieldsIgnoreMapIsEmptyAndIndexFiledMapIsNull() {

        // arrange
        HashMap<String, Field> ignoreMap = new HashMap<String, Field>();
        Holder holder = mock(Holder.class);

        // act
        ClassUtils.declaredFields(String.class, new HashMap<Integer, Field>(), null, ignoreMap, true, false, holder);

        // assert
        assertThat((Class<String>) ignoreMap.get("CASE_INSENSITIVE_ORDER").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("CASE_INSENSITIVE_ORDER").getName(), is("CASE_INSENSITIVE_ORDER"));
        assertThat((Class<String>) ignoreMap.get("hash").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("hash").getName(), is("hash"));
        assertThat((Class<String>) ignoreMap.get("serialPersistentFields").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("serialPersistentFields").getName(), is("serialPersistentFields"));
        assertThat((Class<String>) ignoreMap.get("serialVersionUID").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("serialVersionUID").getName(), is("serialVersionUID"));
        assertThat((Class<String>) ignoreMap.get("value").getDeclaringClass(), equalTo((Class) String.class));
        assertThat(ignoreMap.get("value").getName(), is("value"));
    }

    @Test
    void declaredFields() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        ClassUtils.declaredFields(String.class, new HashMap<Integer, Field>(), true, false, writeHolder);
    }

    @Test
    void declaredFieldsClazzIsBaseRowModelAndConvertAllFiledIsFalse() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        ClassUtils.declaredFields(com.alibaba.excel.metadata.BaseRowModel.class, new HashMap<Integer, Field>(), false, false, writeHolder);
    }

    @Test
    void declaredFieldsClazzIsNull() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        ClassUtils.declaredFields(null, new HashMap<Integer, Field>(), true, false, writeHolder);
    }

    @Test
    void declaredFieldsConvertAllFiledIsFalse() {
        WriteHolder writeHolder = mock(WriteHolder.class);
        ClassUtils.declaredFields(String.class, new HashMap<Integer, Field>(), false, false, writeHolder);
    }
}
