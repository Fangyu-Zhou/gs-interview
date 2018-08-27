import java.util.HashMap;
import java.util.Map;

public class WholeMinuteDilemma {
    public int solution(int[] songs) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int song : songs) {
            if (map.containsKey(60 - song)) {
                res += map.get(60 - song);
            }

            map.put(song, map.getOrDefault(song, 0) + 1);
        }

        return res;
    }
}
