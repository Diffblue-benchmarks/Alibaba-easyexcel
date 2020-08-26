package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.enums.WriteDirectionEnum;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.fill.FillConfig
 *
 * @author Diffblue Cover
 */

class FillConfigTest {

    @Test
    void builder1() {
        FillConfig object = FillConfig.builder()
            .direction(WriteDirectionEnum.VERTICAL)
            .forceNewRow(false)
            .build();
        assertThat(object.getDirection(), is(WriteDirectionEnum.VERTICAL));
        assertThat(object.getForceNewRow(), is(false));
    }

    @Test
    void builder2() {
        FillConfig object = FillConfig.builder()
            .direction(null)
            .forceNewRow(false)
            .build();
        assertThat(object.getDirection(), is(WriteDirectionEnum.VERTICAL));
        assertThat(object.getForceNewRow(), is(false));
    }

    @Test
    void builder3() {
        FillConfig object = FillConfig.builder()
            .direction(WriteDirectionEnum.VERTICAL)
            .forceNewRow(null)
            .build();
        assertThat(object.getDirection(), is(WriteDirectionEnum.VERTICAL));
        assertThat(object.getForceNewRow(), is(false));
    }
}
