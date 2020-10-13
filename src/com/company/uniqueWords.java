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

 */
public class uniqueWords {
    public static List<String> displayUniqueWords(String text) {
        HashMap<String, Integer> tracker = new HashMap<>();

        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace(";", "");

        String[] allWords = text.split(" ");

        List<String> sortedWords = new ArrayList<>();

        //validate input:
        if(text.isEmpty()){
            return null;
        }
        for (String word : allWords) {
            String current_word = word.toLowerCase();
            //make it lowercase, so that all words are considered equally

            if (tracker.containsKey(current_word)) {
                tracker.replace(current_word, tracker.get(current_word) + 1);

            } else {
                tracker.put(current_word, 1);
                sortedWords.add(current_word);

            }
        }
        Collections.sort(sortedWords);
        return sortUniqueWords(tracker,sortedWords);
    }

    public static List<String> sortUniqueWords(HashMap<String, Integer> tracker, List<String> allWords) {
        //put values in a list
        List<Integer> frequency = new ArrayList<>(tracker.values());
        frequency.sort(Collections.reverseOrder());
        List<String> result = new ArrayList<>();

        while(!tracker.isEmpty()){
            for (String key : allWords) {
               if(frequency.size()!= 0 && frequency.get(0) == tracker.get(key)){
                    frequency.remove(0);

                    result.add(key + " " + tracker.get(key));
                    tracker.remove(key);
                }

            }
            }
       return result;


    }
    public static void main (String[] args){
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
        System.out.println(displayUniqueWords(text));
    }
}