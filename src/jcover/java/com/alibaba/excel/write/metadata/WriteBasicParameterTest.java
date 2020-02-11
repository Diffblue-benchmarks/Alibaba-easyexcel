package com.alibaba.excel.write.metadata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.WriteBasicParameter
 *
 * @author Diffblue JCover
 */

public class WriteBasicParameterTest {

    @Test(timeout=10000)
    public void getCustomWriteHandlerListReturnsEmpty() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        List<com.alibaba.excel.write.handler.WriteHandler> result = writeBasicParameter.getCustomWriteHandlerList();
        assertTrue(result.isEmpty());
        assertThat(writeBasicParameter.getCustomWriteHandlerList(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getExcludeColumnFiledNamesReturnsNull() {
        assertThat(new WriteBasicParameter().getExcludeColumnFiledNames(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getExcludeColumnIndexesReturnsNull() {
        assertThat(new WriteBasicParameter().getExcludeColumnIndexes(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIncludeColumnFiledNamesReturnsNull() {
        assertThat(new WriteBasicParameter().getIncludeColumnFiledNames(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIncludeColumnIndexesReturnsNull() {
        assertThat(new WriteBasicParameter().getIncludeColumnIndexes(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNeedHeadReturnsNull() {
        assertThat(new WriteBasicParameter().getNeedHead(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRelativeHeadRowIndexReturnsNull() {
        assertThat(new WriteBasicParameter().getRelativeHeadRowIndex(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUseDefaultStyleReturnsNull() {
        assertThat(new WriteBasicParameter().getUseDefaultStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCustomWriteHandlerListToEmpty() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        List<com.alibaba.excel.write.handler.WriteHandler> customWriteHandlerList = new ArrayList<com.alibaba.excel.write.handler.WriteHandler>();
        writeBasicParameter.setCustomWriteHandlerList(customWriteHandlerList);
        assertThat(writeBasicParameter.getCustomWriteHandlerList(), sameInstance(customWriteHandlerList));
    }

    @Test(timeout=10000)
    public void setExcludeColumnFiledNamesToEmpty() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        Collection<String> excludeColumnFiledNames = new LinkedList<String>();
        writeBasicParameter.setExcludeColumnFiledNames(excludeColumnFiledNames);
        assertThat(writeBasicParameter.getExcludeColumnFiledNames(), sameInstance(excludeColumnFiledNames));
    }

    @Test(timeout=10000)
    public void setExcludeColumnIndexesToEmpty() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        Collection<Integer> excludeColumnIndexes = new LinkedList<Integer>();
        writeBasicParameter.setExcludeColumnIndexes(excludeColumnIndexes);
        assertThat(writeBasicParameter.getExcludeColumnIndexes(), sameInstance(excludeColumnIndexes));
    }

    @Test(timeout=10000)
    public void setIncludeColumnFiledNamesToEmpty() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        Collection<String> includeColumnFiledNames = new LinkedList<String>();
        writeBasicParameter.setIncludeColumnFiledNames(includeColumnFiledNames);
        assertThat(writeBasicParameter.getIncludeColumnFiledNames(), sameInstance(includeColumnFiledNames));
    }

    @Test(timeout=10000)
    public void setIncludeColumnIndexesToEmpty() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        Collection<Integer> includeColumnIndexes = new LinkedList<Integer>();
        writeBasicParameter.setIncludeColumnIndexes(includeColumnIndexes);
        assertThat(writeBasicParameter.getIncludeColumnIndexes(), sameInstance(includeColumnIndexes));
    }

    @Test(timeout=10000)
    public void setNeedHeadToFalse() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        writeBasicParameter.setNeedHead(false);
        assertThat(writeBasicParameter.getNeedHead(), is(false));
    }

    @Test(timeout=10000)
    public void setRelativeHeadRowIndexToOne() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        writeBasicParameter.setRelativeHeadRowIndex(1);
        assertThat(writeBasicParameter.getRelativeHeadRowIndex(), is(1));
    }

    @Test(timeout=10000)
    public void setUseDefaultStyleToFalse() {
        WriteBasicParameter writeBasicParameter = new WriteBasicParameter();
        writeBasicParameter.setUseDefaultStyle(false);
        assertThat(writeBasicParameter.getUseDefaultStyle(), is(false));
    }
}
