import java.util.Comparator;
import java.util.PriorityQueue;

public class CharitableGiving {
    class Pair {
        int num;
        String charity;

        public Pair(int x, String s) {
            num = x;
            charity = s;
        }

        @Override
        public String toString() {
            return charity + ": " + num;
        }
    }

    public String[] solution(int[] donates) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.num == o2.num) {
                    return o1.charity.compareTo(o2.charity);
                }
                return o1.num - o2.num;
            }
        });
        pq.offer(new Pair(0, "A"));
        pq.offer(new Pair(0, "B"));
        pq.offer(new Pair(0, "C"));

        String[] res = new String[donates.length];
        for (int i = 0; i < donates.length; i ++) {
            System.out.println("Current pq: " + pq);
            Pair cur = pq.poll();
            System.out.println("cur pick: " + cur);
            res[i] = cur.charity;
            cur.num += donates[i];
            pq.offer(cur);
            System.out.println("New pq: " + pq);
            System.out.println();
        }
        return res;
    }
}
