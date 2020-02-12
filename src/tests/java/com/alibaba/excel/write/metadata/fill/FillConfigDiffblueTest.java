package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.excel.enums.WriteDirectionEnum;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.fill.FillConfig
 *
 * @author Diffblue JCover
 */

public class FillConfigDiffblueTest {

    @Test(timeout=10000)
    public void builder() {
        // pojo FillConfig.FillConfigBuilder
    }

    @Test(timeout=10000)
    public void getDirectionReturnsNull() {
        assertThat(new FillConfig().getDirection(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getForceNewRowReturnsNull() {
        assertThat(new FillConfig().getForceNewRow(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void init() {
        FillConfig fillConfig = new FillConfig();
        fillConfig.init();
        assertThat(fillConfig.getDirection(), is(WriteDirectionEnum.VERTICAL));
        assertThat(fillConfig.getForceNewRow(), is(false));
    }

    @Test(timeout=10000)
    public void setDirectionToVERTICAL() {
        FillConfig fillConfig = new FillConfig();
        fillConfig.setDirection(WriteDirectionEnum.VERTICAL);
        assertThat(fillConfig.getDirection(), is(WriteDirectionEnum.VERTICAL));
    }

    @Test(timeout=10000)
    public void setForceNewRowToFalse() {
        FillConfig fillConfig = new FillConfig();
        fillConfig.setForceNewRow(false);
        assertThat(fillConfig.getForceNewRow(), is(false));
    }
}
