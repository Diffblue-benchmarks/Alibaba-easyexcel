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
        LinkedList<String> collectionData1 = new LinkedList<String>();
        collectionData1.add("/bin/bash");
        FillWrapper fillWrapper = new FillWrapper("data.txt", collectionData1);
        LinkedList<String> collectionData2 = new LinkedList<String>();
        collectionData2.add("something");
        fillWrapper.setCollectionData(collectionData2);
        fillWrapper.setName("data.txt");
        assertThat(fillWrapper.getCollectionData().size(), is(1));
        assertTrue(fillWrapper.getCollectionData().contains("something"));
        assertThat(fillWrapper.getName(), is("data.txt"));
    }

    @Test
    void factory2() {
        LinkedList<String> collectionData1 = new LinkedList<String>();
        collectionData1.add("/bin/bash");
        FillWrapper fillWrapper = new FillWrapper(collectionData1);
        LinkedList<String> collectionData2 = new LinkedList<String>();
        collectionData2.add("something");
        fillWrapper.setCollectionData(collectionData2);
        fillWrapper.setName("data.txt");
        assertThat(fillWrapper.getCollectionData().size(), is(1));
        assertTrue(fillWrapper.getCollectionData().contains("something"));
        assertThat(fillWrapper.getName(), is("data.txt"));
    }
}
