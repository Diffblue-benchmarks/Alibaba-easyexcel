package com.alibaba.excel.metadata.property;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.read.metadata.property.ExcelReadHeadProperty;

import java.lang.reflect.Field;
import java.math.RoundingMode;
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
        ExcelHeadProperty excelHeadProperty = new ExcelReadHeadProperty(null, String.class, new ArrayList<List<String>>(), false);
        HashMap<Integer, ExcelContentProperty> contentPropertyMap = new HashMap<Integer, ExcelContentProperty>();
        ExcelContentProperty x287 = new ExcelContentProperty();
        x287.setConverter(new AutoConverter());
        x287.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        x287.setHead(new Head(1, "Acme", new ArrayList<String>(), false, false));
        x287.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));
        contentPropertyMap.put(1, x287);
        excelHeadProperty.setContentPropertyMap(contentPropertyMap);
        HashMap<String, ExcelContentProperty> fieldNameContentPropertyMap = new HashMap<String, ExcelContentProperty>();
        ExcelContentProperty x322 = new ExcelContentProperty();
        x322.setConverter(new AutoConverter());
        x322.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));
        x322.setHead(new Head(1, "Acme", new ArrayList<String>(), false, false));
        x322.setNumberFormatProperty(new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP));
        fieldNameContentPropertyMap.put("foo", x322);
        excelHeadProperty.setFieldNameContentPropertyMap(fieldNameContentPropertyMap);
        excelHeadProperty.setHeadClazz(String.class);
        excelHeadProperty.setHeadKind(HeadKindEnum.NONE);
        HashMap<Integer, Head> headMap = new HashMap<Integer, Head>();
        Head x359 = new Head(1, "Acme", new ArrayList<String>(), false, false);
        x359.setColumnIndex(1);
        x359.setColumnWidthProperty(new ColumnWidthProperty(1));
        x359.setContentFontProperty(new FontProperty());
        x359.setContentStyleProperty(new StyleProperty());
        x359.setFieldName("Acme");
        x359.setForceIndex(false);
        x359.setForceName(false);
        x359.setHeadFontProperty(new FontProperty());
        x359.setHeadNameList(new ArrayList<String>());
        x359.setHeadStyleProperty(new StyleProperty());
        x359.setLoopMergeProperty(new LoopMergeProperty(1, 1));
        headMap.put(1, x359);
        excelHeadProperty.setHeadMap(headMap);
        excelHeadProperty.setHeadRowNumber(1);
        excelHeadProperty.setIgnoreMap(new HashMap<String, Field>());
        assertThat(excelHeadProperty.getContentPropertyMap().get(1), sameInstance(x287));
        assertThat(excelHeadProperty.getFieldNameContentPropertyMap().get("foo"), sameInstance(x322));
        assertThat((Class<String>) excelHeadProperty.getHeadClazz(), equalTo((Class) String.class));
        assertThat(excelHeadProperty.getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(excelHeadProperty.getHeadMap().get(1), sameInstance(x359));
        assertThat(excelHeadProperty.getHeadRowNumber(), is(1));
        assertThat(excelHeadProperty.getIgnoreMap().isEmpty(), is(true));
    }
}
