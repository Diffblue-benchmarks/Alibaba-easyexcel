package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.write.metadata.fill.FillWrapper
 *
 * @author Diffblue Cover
 */

class FillWrapperTest {

    @Test
    void factory1() {
        FillWrapper fillWrapper = new FillWrapper("Acme", new LinkedList());
        fillWrapper.setCollectionData(new LinkedList());
        fillWrapper.setName("data.txt");
        assertTrue((fillWrapper.getCollectionData()).isEmpty());
        assertThat(fillWrapper.getName(), is("data.txt"));
    }

    @Test
    void factory2() {
        FillWrapper fillWrapper = new FillWrapper(new LinkedList());
        fillWrapper.setCollectionData(new LinkedList());
        fillWrapper.setName("data.txt");
        assertTrue((fillWrapper.getCollectionData()).isEmpty());
        assertThat(fillWrapper.getName(), is("data.txt"));
    }
}
