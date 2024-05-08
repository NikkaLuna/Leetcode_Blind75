

class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> queueRadiant = new LinkedList<>();
        Queue<Integer> queueDire = new LinkedList<>();
        int length = senate.length();
        
        for (int i = 0; i < length; i++) {

            if (senate.charAt(i) == 'R') {
                queueRadiant.offer(i);

            } else {
                queueDire.offer(i);
            }
        }
        
        while (!queueRadiant.isEmpty() && !queueDire.isEmpty()) {
            int q1 = queueRadiant.poll();
            int q2 = queueDire.poll();

            if (q1 < q2) {
                queueRadiant.offer(q1 + length);

            } else {
                queueDire.offer(q2 + length);
            }
        }
        
        return queueRadiant.size() > queueDire.size() ? "Radiant" : "Dire";
    }
}
