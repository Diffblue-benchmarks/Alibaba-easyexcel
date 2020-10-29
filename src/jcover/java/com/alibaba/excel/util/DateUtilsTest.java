package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.DateUtils
 *
 * @author Diffblue Cover
 */

class DateUtilsTest {

    @Test
    void parseDate() throws java.text.ParseException {
        assertThat(DateUtils.parseDate("1999-12-31"), equalTo(new Date("Dec 31 1999")));
        assertThat(DateUtils.parseDate("1999-12-31", "yyyy-MM-dd"), equalTo(new Date("Dec 31 1999")));
        assertThat(DateUtils.parseDate("1999-12-31", ""), equalTo(new Date("Dec 31 1999")));
        assertThat(DateUtils.parseDate("1999-12-31", "y"), equalTo(new Date("Jan 01 1999")));
    }

    @Test
    void format() throws java.text.ParseException {
        assertThat(Pattern.matches("\\d{2,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{2}:\\d{2}", DateUtils.format(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"))), is(true));
        assertThat(DateUtils.format(null, "bar"), is(""));
        assertThat(DateUtils.format(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), "y"), is("2010"));
    }

    @Test
    void isADateFormat() {
        assertThat(DateUtils.isADateFormat(null, "yyyy-MM-dd"), is(false));
        assertThat(DateUtils.isADateFormat(1, "yyyy-MM-dd"), is(true));
        assertThat(DateUtils.isADateFormat(1, "bar"), is(true));
        assertThat(DateUtils.isADateFormat(0, "yyyy-MM-dd"), is(true));
    }

    @Test
    void isADateFormatUncached() {
        assertThat(DateUtils.isADateFormatUncached(1, "bar"), is(false));
        assertThat(DateUtils.isADateFormatUncached(1, ""), is(false));
        assertThat(DateUtils.isADateFormatUncached(1, "y"), is(true));
        assertThat(DateUtils.isADateFormatUncached(1, "[h]"), is(true));
    }

    @Test
    void isInternalDateFormatFormatIsOneReturnsFalse() {
        assertThat(DateUtils.isInternalDateFormat(1), is(false));
    }

    @Test
    void removeThreadLocalCache() {
        DateUtils.removeThreadLocalCache();
    }
}
