package com.alibaba.excel.converters.date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.enums.CellDataTypeEnum;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.date.DateNumberConverter
 *
 * @author Diffblue JCover
 */

public class DateNumberConverterTest {

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new DateNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsDate() {
        assertThat(new DateNumberConverter().supportJavaTypeKey(), equalTo((Class)java.util.Date.class));
    }
}
