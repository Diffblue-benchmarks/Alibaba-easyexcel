package com.alibaba.excel.write.metadata.fill;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        LinkedList collectionData1 = new LinkedList();
        collectionData1.add(new Object());
        FillWrapper fillWrapper = new FillWrapper("Acme", collectionData1);
        LinkedList collectionData2 = new LinkedList();
        Object object2 = new Object();
        collectionData2.add(object2);
        fillWrapper.setCollectionData(collectionData2);
        fillWrapper.setName("data.txt");
        assertThat(fillWrapper.getCollectionData().size(), is(1));
        assertThat(fillWrapper.getName(), is("data.txt"));
    }

    @Test
    void factory2() {
        LinkedList collectionData1 = new LinkedList();
        collectionData1.add(new Object());
        FillWrapper fillWrapper = new FillWrapper(collectionData1);
        LinkedList collectionData2 = new LinkedList();
        Object object2 = new Object();
        collectionData2.add(object2);
        fillWrapper.setCollectionData(collectionData2);
        fillWrapper.setName("data.txt");
        assertThat(fillWrapper.getCollectionData().size(), is(1));
        assertThat(fillWrapper.getName(), is("data.txt"));
    }
}
