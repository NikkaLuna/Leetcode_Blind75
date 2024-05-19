

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int time) {
        requests.add(time);

        while (requests.peek() < time - 3000) {
            requests.poll();
        }

        return requests.size();
    }
}

