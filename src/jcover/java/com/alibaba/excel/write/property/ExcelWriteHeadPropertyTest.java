package com.alibaba.excel.write.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.Holder;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.OnceAbsoluteMergeProperty;
import com.alibaba.excel.metadata.property.RowHeightProperty;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.property.ExcelWriteHeadProperty
 *
 * @author Diffblue Cover
 */

class ExcelWriteHeadPropertyTest {

    @Test
    void factory1() {
        Holder holder = mock(Holder.class);
        ArrayList<List<String>> head = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add("Smith");
        head.add(list);
        ExcelWriteHeadProperty excelWriteHeadProperty =
             new ExcelWriteHeadProperty(holder, null, head, false);
        RowHeightProperty contentRowHeightProperty =
             new RowHeightProperty((short) 1);
        contentRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setContentRowHeightProperty(contentRowHeightProperty);
        RowHeightProperty headRowHeightProperty =
             new RowHeightProperty((short) 1);
        headRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setHeadRowHeightProperty(headRowHeightProperty);
        OnceAbsoluteMergeProperty onceAbsoluteMergeProperty =
             new OnceAbsoluteMergeProperty(1, 1, 1, 1);
        onceAbsoluteMergeProperty.setFirstColumnIndex(1);
        onceAbsoluteMergeProperty.setFirstRowIndex(1);
        onceAbsoluteMergeProperty.setLastColumnIndex(1);
        onceAbsoluteMergeProperty.setLastRowIndex(1);
        excelWriteHeadProperty.setOnceAbsoluteMergeProperty(onceAbsoluteMergeProperty);
        excelWriteHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelWriteHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelWriteHeadProperty.setHeadClazz(String.class);
        excelWriteHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelWriteHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelWriteHeadProperty.setHeadRowNumber(1);
        excelWriteHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelWriteHeadProperty.getContentRowHeightProperty(), sameInstance(contentRowHeightProperty));
        assertThat(excelWriteHeadProperty.getHeadRowHeightProperty(), sameInstance(headRowHeightProperty));
        assertThat(excelWriteHeadProperty.getOnceAbsoluteMergeProperty(), sameInstance(onceAbsoluteMergeProperty));
        assertThat(excelWriteHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelWriteHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelWriteHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelWriteHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelWriteHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelWriteHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelWriteHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void factory2() {
        Holder holder = mock(Holder.class);
        ExcelWriteHeadProperty excelWriteHeadProperty =
             new ExcelWriteHeadProperty(holder, String.class, new ArrayList<List<String>>(), false);
        RowHeightProperty contentRowHeightProperty =
             new RowHeightProperty((short) 1);
        contentRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setContentRowHeightProperty(contentRowHeightProperty);
        RowHeightProperty headRowHeightProperty =
             new RowHeightProperty((short) 1);
        headRowHeightProperty.setHeight((short) 1);
        excelWriteHeadProperty.setHeadRowHeightProperty(headRowHeightProperty);
        OnceAbsoluteMergeProperty onceAbsoluteMergeProperty =
             new OnceAbsoluteMergeProperty(1, 1, 1, 1);
        onceAbsoluteMergeProperty.setFirstColumnIndex(1);
        onceAbsoluteMergeProperty.setFirstRowIndex(1);
        onceAbsoluteMergeProperty.setLastColumnIndex(1);
        onceAbsoluteMergeProperty.setLastRowIndex(1);
        excelWriteHeadProperty.setOnceAbsoluteMergeProperty(onceAbsoluteMergeProperty);
        excelWriteHeadProperty.setContentPropertyMap(new HashMap<Integer, ExcelContentProperty>());
        excelWriteHeadProperty.setFieldNameContentPropertyMap(new HashMap<String, ExcelContentProperty>());
        excelWriteHeadProperty.setHeadClazz(String.class);
        excelWriteHeadProperty.setHeadKind(HeadKindEnum.NONE);
        excelWriteHeadProperty.setHeadMap(new HashMap<Integer, Head>());
        excelWriteHeadProperty.setHeadRowNumber(1);
        excelWriteHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelWriteHeadProperty.getContentRowHeightProperty(), sameInstance(contentRowHeightProperty));
        assertThat(excelWriteHeadProperty.getHeadRowHeightProperty(), sameInstance(headRowHeightProperty));
        assertThat(excelWriteHeadProperty.getOnceAbsoluteMergeProperty(), sameInstance(onceAbsoluteMergeProperty));
        assertThat(excelWriteHeadProperty.getContentPropertyMap(), is(notNullValue()));
        assertThat(excelWriteHeadProperty.getFieldNameContentPropertyMap(), is(notNullValue()));
        assertThat((Class<String>) excelWriteHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelWriteHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelWriteHeadProperty.getHeadMap(), is(notNullValue()));
        assertThat(excelWriteHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelWriteHeadProperty.getIgnoreMap(), is(notNullValue()));
    }

    @Test
    void headCellRangeListReturnsEmpty() {
        Holder holder = mock(Holder.class);
        assertThat(new ExcelWriteHeadProperty(holder, String.class, new ArrayList<List<String>>(), false).headCellRangeList(), empty());
    }
}
