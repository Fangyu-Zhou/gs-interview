import java.util.*;

public class LatestStudents {
    public String solution(List<List<String>> attendanceData) {
        Collections.sort(attendanceData, (a,b) -> (a.get(0).compareTo(b.get(0))));
        Map<String, Integer> avg = new HashMap<>();
        int index = 0;
        while (index < attendanceData.size()) {
            String curDate = attendanceData.get(index).get((0));
            int sum = 0;
            int count = 0;
            while (index < attendanceData.size() && attendanceData.get(index).get(0).equals(curDate)) {
                int lateness = Integer.parseInt(attendanceData.get(index).get(3)) - Integer.parseInt(attendanceData.get(index).get(2));
                sum += (lateness <= 0 ? 0 : lateness);
                count ++;
                index ++;
            }
            avg.put(curDate, sum / count);
        }

        PriorityQueue<String> pq = new PriorityQueue<>();
        Map<String, Integer> map = new HashMap<>();
        int maxLateness = 0;

        for (List<String> data : attendanceData) {
            String name = data.get(1);
            int lateness = Integer.parseInt(data.get(3)) - Integer.parseInt(data.get(2));
            int ave = avg.get(data.get(0));
            int relativeLateness = lateness - ave;
            if (relativeLateness >= 0) {
                map.put(name, map.getOrDefault(name, 0) + relativeLateness);
                if (map.get(name) == maxLateness) {
                    pq.offer(name);
                }
                else if (map.get(name) > maxLateness) {
                    pq.clear();
                    maxLateness = map.get(name);
                    pq.offer(name);
                }
            }
        }
        return pq.isEmpty() ? "" : pq.poll();
    }
}
