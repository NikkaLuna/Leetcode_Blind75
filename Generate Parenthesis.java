
class Solution {
    public List<String> generateParenthesis(int n) {
        List<ArrayList> answer = new ArrayList<>();
        backtracking(answer, new StringBuilder(), 0, 0, n);
            return answer;

        
    private void backtracking(List<String> answer, StringBuilder curString,  int leftCount, int rightCount, int n) {


            if(curString.length() == 2 * n) {
                answer.add(curString.toString());
                    return;
            }
            if(leftCount < n) {
                curString.append("(");
                backtracking(answer, curString, leftCount + 1, rightCount, n);
                curString.delete(caharAt(curString.length() - 1));

            }

            if(rightCount < leftCount) {

            }
    }
        
    }
}