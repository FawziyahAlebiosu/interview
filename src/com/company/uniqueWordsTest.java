package com.company;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class uniqueWordsTest {

    @org.junit.Test
    public void displayUniqueWordsHappy() {
        //happy path

        String text = "This is a test. That is not a test. Test";
        List<String> expected = new ArrayList<>() ;
        Collections.addAll(expected,"test 3", "a 2", "is 2", "not 1" ,"that 1", "this 1");
        Assert.assertEquals(expected, uniqueWords.displayUniqueWords(text));

    }

    @org.junit.Test
    public void displayUniqueWordsHard() {
        //happy path

        String text = "From the moment the first immigrants " +
                "arrived on these shores, generations of parents have worked hard and sacrificed whatever " +
                "is necessary so that their children could have the same chances they had; or the chances they " +
                "never had. Because while we could never ensure that our children would be rich or successful; while we could " +
                "never be positive that they would do better than their parents, America is about making it possible to " +
                "give them the chance. To give every child the opportunity to try. Education is still the foundation of " +
                "this opportunity. And the most basic building block that holds that foundation together is still reading. " +
                "At the dawn of the 21st century, in a world where knowledge truly is power and literacy is the skill " +
                "that unlocks the gates of opportunity and success, we all have a responsibility as parents and librarians, " +
                "educators and citizens, to instill in our children a love of reading so that we can give them the " +
                "chance to fulfill their dreams.";

        List<String> expected = new ArrayList<>() ;
        Collections.addAll(expected,"the 13", "that 7", "and 6", "is 6", "of 5", "to 5", "we 4", "a 3", "children 3",
                "could 3", "give 3", "have 3", "never 3", "opportunity 3", "parents 3", "their 3", "they 3", "while 2", "would 2",
                "be 2", "chance 2", "chances 2", "foundation 2", "had 2", "in 2", "or 2", "our 2", "reading 2", "so 2", "still 2",
                "them 2", "these 1", "this 1", "together 1", "truly 1", "try 1", "unlocks 1", "whatever 1", "where 1", "worked 1",
                "world 1", "21st 1", "about 1", "all 1", "america 1", "arrived 1", "as 1","at 1", "basic 1", "because 1", "better 1",
                "block 1", "building 1", "can 1", "century 1", "child 1", "citizens 1", "dawn 1", "do 1", "dreams 1", "education 1",
                "educators 1", "ensure 1", "every 1", "first 1", "from 1", "fulfill 1", "gates 1", "generations 1", "hard 1", "holds 1",
                "immigrants 1", "instill 1", "it 1", "knowledge 1", "librarians 1", "literacy 1", "love 1", "making 1", "moment 1", "most 1",
                "necessary 1", "on 1", "positive 1", "possible 1", "power 1", "responsibility 1", "rich 1", "sacrificed 1", "same 1", "shores 1",
                "skill 1", "success 1", "successful 1", "than 1");


        Assert.assertEquals(expected, uniqueWords.displayUniqueWords(text));

    }


}