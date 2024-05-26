


class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];
        
        queue.add(0);
        visited[0] = true;
        int visitedCount = 1;
        
        while (!queue.isEmpty()) {

            int room = queue.poll();

            for (int key : rooms.get(room)) {

                if (!visited[key]) {
                    queue.add(key);
                    visited[key] = true;
                    visitedCount++;
                    
                    if (visitedCount == rooms.size()) {
                        return true;
                    }
                }
            }
        }
        
        return visitedCount == rooms.size();
    }
}



