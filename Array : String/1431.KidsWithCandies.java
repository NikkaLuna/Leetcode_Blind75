
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> answer= new ArrayList<>();
        int maxCandies = 0;
        
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
            answer.add(candy + extraCandies >= maxCandies);
        }

        return answer;
    }
}
