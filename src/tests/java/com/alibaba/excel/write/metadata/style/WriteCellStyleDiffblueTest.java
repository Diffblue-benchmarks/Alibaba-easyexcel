package com.alibaba.excel.write.metadata.style;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.style.WriteCellStyle
 *
 * @author Diffblue JCover
 */

public class WriteCellStyleDiffblueTest {

    @Test(timeout=10000)
    public void getBorderBottomReturnsNull() {
        assertThat(new WriteCellStyle().getBorderBottom(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getBorderLeftReturnsNull() {
        assertThat(new WriteCellStyle().getBorderLeft(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getBorderRightReturnsNull() {
        assertThat(new WriteCellStyle().getBorderRight(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getBorderTopReturnsNull() {
        assertThat(new WriteCellStyle().getBorderTop(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getBottomBorderColorReturnsNull() {
        assertThat(new WriteCellStyle().getBottomBorderColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataFormatReturnsNull() {
        assertThat(new WriteCellStyle().getDataFormat(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFillBackgroundColorReturnsNull() {
        assertThat(new WriteCellStyle().getFillBackgroundColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFillForegroundColorReturnsNull() {
        assertThat(new WriteCellStyle().getFillForegroundColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getFillPatternTypeReturnsNull() {
        assertThat(new WriteCellStyle().getFillPatternType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHiddenReturnsNull() {
        assertThat(new WriteCellStyle().getHidden(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHorizontalAlignmentReturnsNull() {
        assertThat(new WriteCellStyle().getHorizontalAlignment(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIndentReturnsNull() {
        assertThat(new WriteCellStyle().getIndent(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLeftBorderColorReturnsNull() {
        assertThat(new WriteCellStyle().getLeftBorderColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLockedReturnsNull() {
        assertThat(new WriteCellStyle().getLocked(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getQuotePrefixReturnsNull() {
        assertThat(new WriteCellStyle().getQuotePrefix(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRightBorderColorReturnsNull() {
        assertThat(new WriteCellStyle().getRightBorderColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRotationReturnsNull() {
        assertThat(new WriteCellStyle().getRotation(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getShrinkToFitReturnsNull() {
        assertThat(new WriteCellStyle().getShrinkToFit(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTopBorderColorReturnsNull() {
        assertThat(new WriteCellStyle().getTopBorderColor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getVerticalAlignmentReturnsNull() {
        assertThat(new WriteCellStyle().getVerticalAlignment(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWrappedReturnsNull() {
        assertThat(new WriteCellStyle().getWrapped(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWriteFontReturnsNull() {
        assertThat(new WriteCellStyle().getWriteFont(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setBorderBottomToNONE() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setBorderBottom(BorderStyle.NONE);
        assertThat(writeCellStyle.getBorderBottom(), is(BorderStyle.NONE));
    }

    @Test(timeout=10000)
    public void setBorderLeftToNONE() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setBorderLeft(BorderStyle.NONE);
        assertThat(writeCellStyle.getBorderLeft(), is(BorderStyle.NONE));
    }

    @Test(timeout=10000)
    public void setBorderRightToNONE() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setBorderRight(BorderStyle.NONE);
        assertThat(writeCellStyle.getBorderRight(), is(BorderStyle.NONE));
    }

    @Test(timeout=10000)
    public void setBorderTopToNONE() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setBorderTop(BorderStyle.NONE);
        assertThat(writeCellStyle.getBorderTop(), is(BorderStyle.NONE));
    }

    @Test(timeout=10000)
    public void setBottomBorderColorToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setBottomBorderColor((short)1);
        assertThat(writeCellStyle.getBottomBorderColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setDataFormatToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setDataFormat((short)1);
        assertThat(writeCellStyle.getDataFormat(), is((short)1));
    }

    @Test(timeout=10000)
    public void setFillBackgroundColorToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setFillBackgroundColor((short)1);
        assertThat(writeCellStyle.getFillBackgroundColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setFillForegroundColorToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setFillForegroundColor((short)1);
        assertThat(writeCellStyle.getFillForegroundColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setFillPatternTypeToNO_FILL() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setFillPatternType(FillPatternType.NO_FILL);
        assertThat(writeCellStyle.getFillPatternType(), is(FillPatternType.NO_FILL));
    }

    @Test(timeout=10000)
    public void setHiddenToFalse() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setHidden(false);
        assertThat(writeCellStyle.getHidden(), is(false));
    }

    @Test(timeout=10000)
    public void setHorizontalAlignmentToGENERAL() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        assertThat(writeCellStyle.getHorizontalAlignment(), is(HorizontalAlignment.GENERAL));
    }

    @Test(timeout=10000)
    public void setIndentToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setIndent((short)1);
        assertThat(writeCellStyle.getIndent(), is((short)1));
    }

    @Test(timeout=10000)
    public void setLeftBorderColorToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setLeftBorderColor((short)1);
        assertThat(writeCellStyle.getLeftBorderColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setLockedToFalse() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setLocked(false);
        assertThat(writeCellStyle.getLocked(), is(false));
    }

    @Test(timeout=10000)
    public void setQuotePrefixToFalse() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setQuotePrefix(false);
        assertThat(writeCellStyle.getQuotePrefix(), is(false));
    }

    @Test(timeout=10000)
    public void setRightBorderColorToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setRightBorderColor((short)1);
        assertThat(writeCellStyle.getRightBorderColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setRotationToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setRotation((short)1);
        assertThat(writeCellStyle.getRotation(), is((short)1));
    }

    @Test(timeout=10000)
    public void setShrinkToFitToFalse() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setShrinkToFit(false);
        assertThat(writeCellStyle.getShrinkToFit(), is(false));
    }

    @Test(timeout=10000)
    public void setTopBorderColorToOne() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setTopBorderColor((short)1);
        assertThat(writeCellStyle.getTopBorderColor(), is((short)1));
    }

    @Test(timeout=10000)
    public void setVerticalAlignmentToTOP() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setVerticalAlignment(VerticalAlignment.TOP);
        assertThat(writeCellStyle.getVerticalAlignment(), is(VerticalAlignment.TOP));
    }

    @Test(timeout=10000)
    public void setWrappedToFalse() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        writeCellStyle.setWrapped(false);
        assertThat(writeCellStyle.getWrapped(), is(false));
    }

    @Test(timeout=10000)
    public void setWriteFont() {
        WriteCellStyle writeCellStyle = new WriteCellStyle();
        WriteFont writeFont = new WriteFont();
        writeCellStyle.setWriteFont(writeFont);
        assertThat(writeCellStyle.getWriteFont(), sameInstance(writeFont));
    }
}
