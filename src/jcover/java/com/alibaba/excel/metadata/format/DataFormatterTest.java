package com.alibaba.excel.metadata.format;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.excel.metadata.GlobalConfiguration;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.metadata.format.DataFormatter
 *
 * @author Diffblue Cover
 */

class DataFormatterTest {

    @Test
    void format1() {
        assertThat(new DataFormatter(null).format(1.0, 1, "yyyy-MM-dd"), is("1900-01-01"));
    }

    @Test
    void format2() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        assertThat(new DataFormatter(globalConfiguration).format(1.0, 1, "yyyy-MM-dd"), is("1900-01-01"));
    }

    @Test
    void format3() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        assertThat(new DataFormatter(globalConfiguration).format(1.0, 1, "yyyy-MM-dd"), is("1900-01-01"));
    }

    @Test
    void format4() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUseScientificFormat(false);
        assertThat(new DataFormatter(globalConfiguration).format(1.0, 1, "yyyy-MM-dd"), is("1900-01-01"));
    }

    @Test
    void format5() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        assertThat(new DataFormatter(globalConfiguration).format(1.0, 1, "yyyy-MM-dd"), is("1900-01-01"));
    }

    @Test
    void formatDataFormatIsNull() {
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        DataFormatter dataFormatter = new DataFormatter(globalConfiguration);
        dataFormatter.setDefaultNumberFormat(new ExcelGeneralNumberFormat(new Locale("en"), false));
        assertThat(dataFormatter.format(1.0, null, "yyyy-MM-dd"), is("1"));
    }

    @Test
    void setExcelStyleRoundingMode() {

        // arrange
        DecimalFormat format = new DecimalFormat();

        // act
        DataFormatter.setExcelStyleRoundingMode(format);

        // assert
        assertThat(format.getRoundingMode(), is(RoundingMode.HALF_UP));
    }
}
