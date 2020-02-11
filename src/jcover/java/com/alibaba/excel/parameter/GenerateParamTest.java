package com.alibaba.excel.parameter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.parameter.GenerateParam
 *
 * @author Diffblue JCover
 */

public class GenerateParamTest {

    @Test(timeout=10000)
    public void getClazzReturnsString() {
        assertThat(new GenerateParam("name", String.class, new ByteArrayOutputStream()).getClazz(), equalTo((Class)String.class));
    }

    @Test(timeout=10000)
    public void getOutputStream() {
        OutputStream outputStream = new ByteArrayOutputStream();
        assertThat(new GenerateParam("name", String.class, outputStream).getOutputStream(), sameInstance(outputStream));
    }

    @Test(timeout=10000)
    public void getSheetNameReturnsName() {
        assertThat(new GenerateParam("name", String.class, new ByteArrayOutputStream()).getSheetName(), is("name"));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new GenerateParam("name", String.class, new ByteArrayOutputStream()).getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isNeedHeadReturnsTrue() {
        assertThat(new GenerateParam("name", String.class, new ByteArrayOutputStream()).isNeedHead(), is(true));
    }

    @Test(timeout=10000)
    public void setClazzToString() {
        new GenerateParam("name", String.class, new ByteArrayOutputStream()).setClazz(String.class);
    }

    @Test(timeout=10000)
    public void setNeedHeadToFalse() {
        GenerateParam generateParam = new GenerateParam("name", String.class, new ByteArrayOutputStream());
        generateParam.setNeedHead(false);
        assertThat(generateParam.isNeedHead(), is(false));
    }

    @Test(timeout=10000)
    public void setOutputStream() {
        GenerateParam generateParam = new GenerateParam("name", String.class, new ByteArrayOutputStream());
        OutputStream outputStream = new ByteArrayOutputStream();
        generateParam.setOutputStream(outputStream);
        assertThat(generateParam.getOutputStream(), sameInstance(outputStream));
    }

    @Test(timeout=10000)
    public void setSheetNameToName() {
        new GenerateParam("name", String.class, new ByteArrayOutputStream()).setSheetName("name");
    }

    @Test(timeout=10000)
    public void setTypeToXLS() {
        GenerateParam generateParam = new GenerateParam("name", String.class, new ByteArrayOutputStream());
        generateParam.setType(ExcelTypeEnum.XLS);
        assertThat(generateParam.getType(), is(ExcelTypeEnum.XLS));
    }
}
