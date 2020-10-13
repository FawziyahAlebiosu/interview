package com.company;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class uniqueWordsTest {

    @org.junit.Test
    public void displayUniqueWordsHappy() {
        String text = "This is a test. That is not a test. Test";
        List<String> expected = new ArrayList<>() ;
        Collections.addAll(expected,"test 3", "a 2", "is 2", "not 1" ,"that 1", "this 1");
        Assert.assertEquals(expected, uniqueWords.displayUniqueWords(text));

        //good path

    }
    public void displayUniqueWordsSad(){}


}