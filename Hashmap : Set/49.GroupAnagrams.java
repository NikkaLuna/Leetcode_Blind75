public class Solution {

        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

            for(String word: strs) {
                
                char [] chars = toCharArray(word);
                Array.sort(chars);
                String sortedWord = new String(chars);

                if(map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>);
                }
            map.get(sortedWord).add(word);
            }
        return new ArrayList<>(map.values());
        }

    }
