package com.alibaba.excel.parameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.parameter.GenerateParam
 *
 * @author Diffblue Cover
 */

class GenerateParamTest {

    @Test
    void factory() {
        GenerateParam generateParam =
             new GenerateParam("bar", String.class, new ByteArrayOutputStream());
        generateParam.setClazz(String.class);
        generateParam.setNeedHead(false);
        generateParam.setOutputStream(new ByteArrayOutputStream());
        generateParam.setSheetName("name");
        generateParam.setType(ExcelTypeEnum.XLS);
        assertThat((Class<String>) generateParam.getClazz(), equalTo((Class) String.class));
        assertThat(generateParam.getSheetName(), is("name"));
        assertThat(generateParam.getType(), is(ExcelTypeEnum.XLS));
        assertThat(generateParam.isNeedHead(), is(false));
    }
}
