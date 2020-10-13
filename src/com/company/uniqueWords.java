package com.company;

import java.util.*;

/*

input: string t
action: find all words in string, and count their frequency, sort frequcny in descneding order, and if there are mutlipl e frequcies
sort in ascendning order if multiple frequencies
result: return the list
plan:
hashmap
go through each word in string
check if we've seen before, add to hashmap
after find frequnecy
sort all values by large to small
go through values
add values and key to list


Given a string of text, write a program that prints a list of unique words contained in the string
        along with the number of occurrences of each word in the string. The list should be sorted in
        descending order by frequency, and ascending order alphabetically when multiple words occur
        with the same frequency.
        For example, given the input ...
        “This is a test. That is not a test. Test”
        ... the expected output could be ...
        test 3
        a 2
        is 2
        not 1
        that 1
        this 1
        After you have a working program, you should run it on this input, and send us the result:
        “ From the moment the first immigrants arrived on these shores, generations of parents have worked hard
        and sacrificed whatever is necessary so that their children could have the same chances they had; or
        the chances they never had. Because while we could never ensure that our children would be rich or
        successful; while we could never be positive that they would do better than their parents, America is
        about making it possible to give them the chance. To give every child the opportunity to try. Education
        is still the foundation of this opportunity. And the most basic building block that holds that
        foundation together is still reading. At the dawn of the 21st century, in a world where knowledge truly
        is power and literacy is the skill that unlocks the gates of opportunity and success, we all have a
        responsibility as parents and librarians, educators and citizens, to instill in our children a love of
        reading so that we can give them the chance to fulfill their dreams.”

 */
public class uniqueWords {
    public static List<String> displayUniqueWords(String text) {
        HashMap<String, Integer> tracker = new HashMap<>();
        text = text.replace(".", "");
        String[] allWords = text.split(" ");
        List<String> sortedWords = new ArrayList<>();


        for (String word : allWords) {
            //make it lowercase, so that all words are considered equally
            if (tracker.containsKey(word.toLowerCase())) {
                tracker.replace(word.toLowerCase(), tracker.get(word.toLowerCase()) + 1);

            } else {
                tracker.put(word.toLowerCase(), 1);
                sortedWords.add(word.toLowerCase());

            }
        }
        Collections.sort(sortedWords);
        return sortUniqueWords(tracker,sortedWords);
    }

    public static List<String> sortUniqueWords(HashMap<String, Integer> tracker, List<String> allWords) {
        //put values in a list
        List<Integer> frequency = new ArrayList<Integer>(tracker.values());
        Collections.sort(frequency, Collections.reverseOrder());
        List<String> result = new ArrayList<>();

        while(!tracker.isEmpty()){
            for (String key : allWords) {
               if(frequency.get(0) == tracker.get(key)){
                    frequency.remove(0);

                    result.add(key + " " + tracker.get(key));
                    tracker.remove(key);
                }

            }






           /* for (int i : frequency) {
                if (tracker.get(key) == i) {
                    result.add(key + "" + i);


                }

            */
            }



        return result;


    }
}