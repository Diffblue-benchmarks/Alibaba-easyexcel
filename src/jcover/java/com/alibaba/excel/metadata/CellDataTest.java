package com.alibaba.excel.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertArrayEquals;

import com.alibaba.excel.enums.CellDataTypeEnum;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.CellData
 *
 * @author Diffblue JCover
 */

public class CellDataTest {

    @Test(timeout=10000)
    public void checkEmpty1() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void checkEmpty10() {
        CellData<Object> cellData = new CellData<Object>(CellDataTypeEnum.BOOLEAN);
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void checkEmpty11() {
        new CellData<Object>(CellDataTypeEnum.ERROR, "something").checkEmpty();
    }

    @Test(timeout=10000)
    public void checkEmpty12() {
        CellData<Object> cellData = new CellData<Object>("");
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void checkEmpty2() {
        CellData<Object> cellData = new CellData<Object>(CellDataTypeEnum.STRING);
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void checkEmpty3() {
        new CellData<Object>((Boolean)false).checkEmpty();
    }

    @Test(timeout=10000)
    public void checkEmpty4() {
        CellData<Object> cellData = new CellData<Object>(new Object());
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void checkEmpty5() {
        CellData<Object> cellData = new CellData<Object>(new Object(), "something");
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void checkEmpty6() {
        new CellData<Object>("something").checkEmpty();
    }

    @Test(timeout=10000)
    public void checkEmpty7() {
        new CellData<Object>(java.math.BigDecimal.valueOf(1L)).checkEmpty();
    }

    @Test(timeout=10000)
    public void checkEmpty8() {
        byte[] imageValue = new byte[] { 1 };
        new CellData<Object>(imageValue).checkEmpty();
    }

    @Test(timeout=10000)
    public void checkEmpty9() {
        CellData<Object> cellData = new CellData<Object>(CellDataTypeEnum.NUMBER);
        cellData.checkEmpty();
        assertThat(cellData.getType(), is(CellDataTypeEnum.EMPTY));
    }

    @Test(timeout=10000)
    public void getBooleanValueReturnsNull() {
        assertThat(new CellData<Object>().getBooleanValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataFormatReturnsNull() {
        assertThat(new CellData<Object>().getDataFormat(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataFormatStringReturnsNull() {
        assertThat(new CellData<Object>().getDataFormatString(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataReturnsNull() {
        assertThat(new CellData<Object>().getData(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFormulaReturnsNull() {
        assertThat(new CellData<Object>().getFormula(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFormulaValueReturnsNull() {
        assertThat(new CellData<Object>().getFormulaValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getImageValueReturnsNull() {
        assertThat(new CellData<Object>().getImageValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNumberValueReturnsNull() {
        assertThat(new CellData<Object>().getNumberValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStringValueReturnsNull() {
        assertThat(new CellData<Object>().getStringValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new CellData<Object>().getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setBooleanValueToFalse() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setBooleanValue(false);
        assertThat(cellData.getBooleanValue(), is(false));
    }

    @Test(timeout=10000)
    public void setData() {
        CellData<Object> cellData = new CellData<Object>();
        Object data3 = new Object();
        cellData.setData(data3);
        assertThat(cellData.getData(), sameInstance(data3));
    }

    @Test(timeout=10000)
    public void setDataFormatString() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setDataFormatString("yyyy-MM-dd");
        assertThat(cellData.getDataFormatString(), is("yyyy-MM-dd"));
    }

    @Test(timeout=10000)
    public void setDataFormatToOne() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setDataFormat(1);
        assertThat(cellData.getDataFormat(), is(1));
    }

    @Test(timeout=10000)
    public void setFormulaToFalse() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setFormula(false);
        assertThat(cellData.getFormula(), is(false));
    }

    @Test(timeout=10000)
    public void setFormulaValueToSomething() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setFormulaValue("something");
        assertThat(cellData.getFormulaValue(), is("something"));
    }

    @Test(timeout=10000)
    public void setImageValueToOne() {
        CellData<Object> cellData = new CellData<Object>();
        byte[] imageValue2 = new byte[] { 1 };
        cellData.setImageValue(imageValue2);
        assertArrayEquals(new byte[] { 1 }, cellData.getImageValue());
    }

    @Test(timeout=10000)
    public void setNumberValue() {
        CellData<Object> cellData = new CellData<Object>();
        BigDecimal numberValue2 = BigDecimal.valueOf(1L);
        cellData.setNumberValue(numberValue2);
        assertThat(cellData.getNumberValue(), sameInstance(numberValue2));
    }

    @Test(timeout=10000)
    public void setStringValueToSomething() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setStringValue("something");
        assertThat(cellData.getStringValue(), is("something"));
    }

    @Test(timeout=10000)
    public void setTypeToSTRING() {
        CellData<Object> cellData = new CellData<Object>();
        cellData.setType(CellDataTypeEnum.STRING);
        assertThat(cellData.getType(), is(CellDataTypeEnum.STRING));
    }
}
