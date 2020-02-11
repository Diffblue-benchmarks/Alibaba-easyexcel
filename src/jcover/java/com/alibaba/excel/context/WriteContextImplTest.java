package com.alibaba.excel.context;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.alibaba.excel.enums.HeadKindEnum;
import com.alibaba.excel.enums.WriteTypeEnum;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.context.WriteContextImpl
 *
 * @author Diffblue JCover
 */

public class WriteContextImplTest {

    @Test(timeout=10000)
    public void currentSheetWriteTypeIsADD() {
        WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
        WriteSheet writeSheet = new WriteSheet();
        writeContextImpl.currentSheet(writeSheet, WriteTypeEnum.ADD);
        assertThat(writeSheet.getSheetNo(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getActiveCell(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getAutobreaks(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getCellComments().isEmpty(), is(true));
        assertArrayEquals(new int[] { }, writeContextImpl.getCurrentSheet().getColumnBreaks());
        // pojo org.apache.poi.ss.usermodel.DataValidationHelper
        assertTrue(writeContextImpl.getCurrentSheet().getDataValidations().isEmpty());
        assertThat(writeContextImpl.getCurrentSheet().getDefaultColumnWidth(), is(8));
        assertThat(writeContextImpl.getCurrentSheet().getDefaultRowHeight(), is((short)300));
        assertEquals(15.0f, writeContextImpl.getCurrentSheet().getDefaultRowHeightInPoints(), 0);
        assertThat(writeContextImpl.getCurrentSheet().getDisplayGuts(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getDrawingPatriarch(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getFirstRowNum(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getFitToPage(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getFooter().getCenter(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getFooter().getLeft(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getFooter().getRight(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getForceFormulaRecalculation(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getHeader().getCenter(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getHeader().getLeft(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getHeader().getRight(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getHorizontallyCenter(), is(false));
        assertTrue(writeContextImpl.getCurrentSheet().getHyperlinkList().isEmpty());
        assertThat(writeContextImpl.getCurrentSheet().getLastRowNum(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getLeftCol(), is((short)0));
        assertTrue(writeContextImpl.getCurrentSheet().getMergedRegions().isEmpty());
        assertThat(writeContextImpl.getCurrentSheet().getNumMergedRegions(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getPaneInformation(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getPhysicalNumberOfRows(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getCopies(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getDraft(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getFitHeight(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getFitWidth(), is((short)1));
        assertEquals(0.3, writeContextImpl.getCurrentSheet().getPrintSetup().getFooterMargin(), 0);
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getHResolution(), is((short)600));
        assertEquals(0.3, writeContextImpl.getCurrentSheet().getPrintSetup().getHeaderMargin(), 0);
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getLandscape(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getLeftToRight(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getNoColor(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getNoOrientation(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getNotes(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getPageStart(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getPaperSize(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getScale(), is((short)100));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getUsePage(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getVResolution(), is((short)600));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getValidSettings(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getProtect(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getRepeatingColumns(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getRepeatingRows(), is(nullValue()));
        assertArrayEquals(new int[] { }, writeContextImpl.getCurrentSheet().getRowBreaks());
        assertThat(writeContextImpl.getCurrentSheet().getRowSumsBelow(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getRowSumsRight(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getScenarioProtect(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getSheetConditionalFormatting().getNumConditionalFormattings(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getSheetName(), is("0"));
        assertThat(writeContextImpl.getCurrentSheet().getTopRow(), is((short)0));
        assertThat(writeContextImpl.getCurrentSheet().getVerticallyCenter(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getActiveSheetIndex(), is(0));
        assertTrue(writeContextImpl.getCurrentSheet().getWorkbook().getAllNames().isEmpty());
        assertTrue(writeContextImpl.getCurrentSheet().getWorkbook().getAllPictures().isEmpty());
        // pojo org.apache.poi.ss.usermodel.CreationHelper
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getFirstVisibleTab(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getForceFormulaRecalculation(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumCellStyles(), is(2));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumberOfFonts(), is((short)2));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumberOfNames(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumberOfSheets(), is(1));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL2007));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayFormulas(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayGridlines(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayRowColHeadings(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayZeros(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().isPrintGridlines(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isPrintRowAndColumnHeadings(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isRightToLeft(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isSelected(), is(true));
        assertThat(writeContextImpl.getWorkbook().getNumCellStyles(), is(2));
        assertThat(writeContextImpl.getWorkbook().getNumberOfFonts(), is((short)2));
        assertThat(writeContextImpl.getWorkbook().getNumberOfSheets(), is(1));
    }

    @Test(timeout=10000)
    public void currentSheetWriteTypeIsFILL() {
        WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
        WriteSheet writeSheet = new WriteSheet();
        writeContextImpl.currentSheet(writeSheet, WriteTypeEnum.FILL);
        assertThat(writeSheet.getSheetNo(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getActiveCell(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getAutobreaks(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getCellComments().isEmpty(), is(true));
        assertArrayEquals(new int[] { }, writeContextImpl.getCurrentSheet().getColumnBreaks());
        // pojo org.apache.poi.ss.usermodel.DataValidationHelper
        assertTrue(writeContextImpl.getCurrentSheet().getDataValidations().isEmpty());
        assertThat(writeContextImpl.getCurrentSheet().getDefaultColumnWidth(), is(8));
        assertThat(writeContextImpl.getCurrentSheet().getDefaultRowHeight(), is((short)300));
        assertEquals(15.0f, writeContextImpl.getCurrentSheet().getDefaultRowHeightInPoints(), 0);
        assertThat(writeContextImpl.getCurrentSheet().getDisplayGuts(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getDrawingPatriarch(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getFirstRowNum(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getFitToPage(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getFooter().getCenter(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getFooter().getLeft(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getFooter().getRight(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getForceFormulaRecalculation(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getHeader().getCenter(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getHeader().getLeft(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getHeader().getRight(), is(""));
        assertThat(writeContextImpl.getCurrentSheet().getHorizontallyCenter(), is(false));
        assertTrue(writeContextImpl.getCurrentSheet().getHyperlinkList().isEmpty());
        assertThat(writeContextImpl.getCurrentSheet().getLastRowNum(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getLeftCol(), is((short)0));
        assertTrue(writeContextImpl.getCurrentSheet().getMergedRegions().isEmpty());
        assertThat(writeContextImpl.getCurrentSheet().getNumMergedRegions(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getPaneInformation(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getPhysicalNumberOfRows(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getCopies(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getDraft(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getFitHeight(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getFitWidth(), is((short)1));
        assertEquals(0.3, writeContextImpl.getCurrentSheet().getPrintSetup().getFooterMargin(), 0);
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getHResolution(), is((short)600));
        assertEquals(0.3, writeContextImpl.getCurrentSheet().getPrintSetup().getHeaderMargin(), 0);
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getLandscape(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getLeftToRight(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getNoColor(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getNoOrientation(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getNotes(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getPageStart(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getPaperSize(), is((short)1));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getScale(), is((short)100));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getUsePage(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getVResolution(), is((short)600));
        assertThat(writeContextImpl.getCurrentSheet().getPrintSetup().getValidSettings(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getProtect(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getRepeatingColumns(), is(nullValue()));
        assertThat(writeContextImpl.getCurrentSheet().getRepeatingRows(), is(nullValue()));
        assertArrayEquals(new int[] { }, writeContextImpl.getCurrentSheet().getRowBreaks());
        assertThat(writeContextImpl.getCurrentSheet().getRowSumsBelow(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getRowSumsRight(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().getScenarioProtect(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getSheetConditionalFormatting().getNumConditionalFormattings(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getSheetName(), is("0"));
        assertThat(writeContextImpl.getCurrentSheet().getTopRow(), is((short)0));
        assertThat(writeContextImpl.getCurrentSheet().getVerticallyCenter(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getActiveSheetIndex(), is(0));
        assertTrue(writeContextImpl.getCurrentSheet().getWorkbook().getAllNames().isEmpty());
        assertTrue(writeContextImpl.getCurrentSheet().getWorkbook().getAllPictures().isEmpty());
        // pojo org.apache.poi.ss.usermodel.CreationHelper
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getFirstVisibleTab(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getForceFormulaRecalculation(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumCellStyles(), is(2));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumberOfFonts(), is((short)2));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumberOfNames(), is(0));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getNumberOfSheets(), is(1));
        assertThat(writeContextImpl.getCurrentSheet().getWorkbook().getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL2007));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayFormulas(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayGridlines(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayRowColHeadings(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().isDisplayZeros(), is(true));
        assertThat(writeContextImpl.getCurrentSheet().isPrintGridlines(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isPrintRowAndColumnHeadings(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isRightToLeft(), is(false));
        assertThat(writeContextImpl.getCurrentSheet().isSelected(), is(true));
        assertThat(writeContextImpl.getWorkbook().getNumCellStyles(), is(2));
        assertThat(writeContextImpl.getWorkbook().getNumberOfFonts(), is((short)2));
        assertThat(writeContextImpl.getWorkbook().getNumberOfSheets(), is(1));
    }

    @Test(timeout=10000)
    public void currentTableWriteTableIsNull() {
        new WriteContextImpl(new WriteWorkbook()).currentTable(null);
    }

    @Test(timeout=10000)
    public void currentWriteHolder() {
        // pojo com.alibaba.excel.write.metadata.holder.WriteHolder
    }

    @Test(timeout=10000)
    public void getOutputStreamReturnsNull() {
        assertThat(new WriteContextImpl(new WriteWorkbook()).getOutputStream(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWorkbook() {
        WriteContextImpl writeContextImpl = new WriteContextImpl(new WriteWorkbook());
        Workbook result = writeContextImpl.getWorkbook();
        assertThat(result.getActiveSheetIndex(), is(0));
        assertTrue(result.getAllNames().isEmpty());
        assertTrue(result.getAllPictures().isEmpty());
        // pojo org.apache.poi.ss.usermodel.CreationHelper
        assertThat(result.getFirstVisibleTab(), is(0));
        assertThat(result.getForceFormulaRecalculation(), is(false));
        assertThat(result.getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(result.getNumCellStyles(), is(1));
        assertThat(result.getNumberOfFonts(), is((short)1));
        assertThat(result.getNumberOfNames(), is(0));
        assertThat(result.getNumberOfSheets(), is(0));
        assertThat(result.getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL2007));
        assertThat(writeContextImpl.getWorkbook(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void writeTableHolderReturnsNull() {
        assertThat(new WriteContextImpl(new WriteWorkbook()).writeTableHolder(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void writeWorkbookHolder() {
        WriteWorkbook writeWorkbook = new WriteWorkbook();
        WriteWorkbookHolder result = new WriteContextImpl(writeWorkbook).writeWorkbookHolder();
        assertThat(result.getAutoCloseStream(), is(true));
        assertThat(result.getCachedWorkbook().getActiveSheetIndex(), is(0));
        assertTrue(result.getCachedWorkbook().getAllNames().isEmpty());
        assertTrue(result.getCachedWorkbook().getAllPictures().isEmpty());
        // pojo org.apache.poi.ss.usermodel.CreationHelper
        assertThat(result.getCachedWorkbook().getFirstVisibleTab(), is(0));
        assertThat(result.getCachedWorkbook().getForceFormulaRecalculation(), is(false));
        assertThat(result.getCachedWorkbook().getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(result.getCachedWorkbook().getNumCellStyles(), is(1));
        assertThat(result.getCachedWorkbook().getNumberOfFonts(), is((short)1));
        assertThat(result.getCachedWorkbook().getNumberOfNames(), is(0));
        assertThat(result.getCachedWorkbook().getNumberOfSheets(), is(0));
        assertThat(result.getCachedWorkbook().getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL2007));
        assertThat(result.getExcelType(), is(ExcelTypeEnum.XLSX));
        assertThat(result.getFile(), is(nullValue()));
        assertThat(result.getHasBeenInitializedSheet().isEmpty(), is(true));
        assertThat(result.getInMemory(), is(false));
        assertThat(result.getMandatoryUseInputStream(), is(false));
        assertThat(result.getOutputStream(), is(nullValue()));
        assertThat(result.getPassword(), is(nullValue()));
        assertThat(result.getTempTemplateInputStream(), is(nullValue()));
        assertThat(result.getTemplateFile(), is(nullValue()));
        assertThat(result.getTemplateInputStream(), is(nullValue()));
        assertThat(result.getWorkbook().getActiveSheetIndex(), is(0));
        assertTrue(result.getWorkbook().getAllNames().isEmpty());
        assertTrue(result.getWorkbook().getAllPictures().isEmpty());
        // pojo org.apache.poi.ss.usermodel.CreationHelper
        assertThat(result.getWorkbook().getFirstVisibleTab(), is(0));
        assertThat(result.getWorkbook().getForceFormulaRecalculation(), is(false));
        assertThat(result.getWorkbook().getMissingCellPolicy(), is(Row.MissingCellPolicy.RETURN_NULL_AND_BLANK));
        assertThat(result.getWorkbook().getNumCellStyles(), is(1));
        assertThat(result.getWorkbook().getNumberOfFonts(), is((short)1));
        assertThat(result.getWorkbook().getNumberOfNames(), is(0));
        assertThat(result.getWorkbook().getNumberOfSheets(), is(0));
        assertThat(result.getWorkbook().getSpreadsheetVersion(), is(SpreadsheetVersion.EXCEL2007));
        assertThat(result.getWriteWorkbook(), sameInstance(writeWorkbook));
        assertThat(result.getExcelWriteHeadProperty().getContentRowHeightProperty(), is(nullValue()));
        assertThat(result.getExcelWriteHeadProperty().getHeadRowHeightProperty(), is(nullValue()));
        assertThat(result.getExcelWriteHeadProperty().getContentPropertyMap().isEmpty(), is(true));
        assertThat(result.getExcelWriteHeadProperty().getFieldNameContentPropertyMap().isEmpty(), is(true));
        assertThat(result.getExcelWriteHeadProperty().getHeadClazz(), is(nullValue()));
        assertThat(result.getExcelWriteHeadProperty().getHeadKind(), is(HeadKindEnum.NONE));
        assertThat(result.getExcelWriteHeadProperty().getHeadMap().isEmpty(), is(true));
        assertThat(result.getExcelWriteHeadProperty().getHeadRowNumber(), is(0));
        assertThat(result.getExcelWriteHeadProperty().getIgnoreMap().isEmpty(), is(true));
        assertThat(result.getExcludeColumnFiledNames(), is(nullValue()));
        assertThat(result.getExcludeColumnIndexes(), is(nullValue()));
        assertThat(result.getIncludeColumnFiledNames(), is(nullValue()));
        assertThat(result.getIncludeColumnIndexes(), is(nullValue()));
        assertThat(result.getNeedHead(), is(true));
        assertThat(result.getRelativeHeadRowIndex(), is(0));
        assertThat(result.getUseDefaultStyle(), is(true));
        assertThat(result.getWriteHandlerMap().get(com.alibaba.excel.write.handler.CellWriteHandler.class).size(), is(1));
        // pojo com.alibaba.excel.write.handler.WriteHandler
        assertThat(result.getWriteHandlerMap().get(com.alibaba.excel.write.handler.WriteHandler.class).size(), is(1));
        // pojo com.alibaba.excel.write.handler.WriteHandler
        assertTrue(result.getWriteHandlerMap().get(com.alibaba.excel.write.handler.WorkbookWriteHandler.class).isEmpty());
        assertThat(result.getWriteHandlerMap().get(com.alibaba.excel.write.handler.SheetWriteHandler.class).size(), is(1));
        // pojo com.alibaba.excel.write.handler.WriteHandler
        assertTrue(result.getWriteHandlerMap().get(com.alibaba.excel.write.handler.RowWriteHandler.class).isEmpty());
        assertThat(result.getClazz(), is(nullValue()));
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        // pojo com.alibaba.excel.converters.Converter
        assertThat(result.getGlobalConfiguration().getAutoTrim(), is(true));
        assertThat(result.getGlobalConfiguration().getUse1904windowing(), is(false));
        assertThat(result.getHead(), is(nullValue()));
        assertThat(result.getNewInitialization(), is(true));
        assertThat(result.isNew(), is(true));
    }
}
