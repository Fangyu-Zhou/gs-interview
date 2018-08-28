import java.util.PriorityQueue;

public class SchoolAllotment {

    public int[] solution(int[] seats, int[] scores, int[][] preferences) {
        int[] res = new int[2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        for (int i = 0; i < scores.length; i ++) {
            pq.offer(new int[]{i, scores[i]});
        }
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int id = cur[0];
            int[] prefer = preferences[id];
            if (seats[prefer[0]] != 0) {
                seats[prefer[0]] --;
            }
            else if (seats[prefer[1]] != 0) {
                seats[prefer[1]] --;
            }
            else if (seats[prefer[2]] != 0) {
                seats[prefer[2]] --;
            }
            else {
                res[1] ++;
            }
        }

        for (int seat : seats) {
            if (seat != 0) {
                res[0] += seat;
            }
        }
        return res;
    }
}
