//Group Anagrams
package Strings;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pb_08 {
        public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String words:strs)
        {
            char[] chars=words.toCharArray();
            Arrays.sort(chars);
            String sortedWord=new String(chars);
            if(!map.containsKey(sortedWord))
            {
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(words);
        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
