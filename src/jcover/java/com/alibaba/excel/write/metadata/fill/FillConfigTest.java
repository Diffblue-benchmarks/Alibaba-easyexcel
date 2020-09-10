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
    void init1() {

        // arrange
        FillConfig fillConfig = new FillConfig();

        // act
        fillConfig.init();

        // assert
        assertThat(fillConfig.getDirection(), is(WriteDirectionEnum.VERTICAL));
    }

    @Test
    void init2() {

        // arrange
        FillConfig fillConfig = new FillConfig();

        // act
        fillConfig.init();

        // assert
        assertThat(fillConfig.getForceNewRow(), is(false));
    }

    @Test
    void builder() {
        FillConfig object = FillConfig.builder()
            .direction(WriteDirectionEnum.VERTICAL)
            .forceNewRow(false)
            .build();
        assertThat(object.getDirection(), is(WriteDirectionEnum.VERTICAL));
        assertThat(object.getForceNewRow(), is(false));
    }
}
