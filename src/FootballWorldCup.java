public class FootballWorldCup {
    public String solution(int[] goals) {
        int total = 0;
        int maxGoal = 0;
        int count = 0;

        for (int i = 0; i < goals.length; i ++) {
            for (int j = i + 1; j < goals.length; j ++) {
                total ++;
                if (goals[i] + goals[j] == maxGoal) {
                    count ++;
                }
                else if (goals[i] + goals[j] > maxGoal) {
                    count = 1;
                    maxGoal = goals[i] + goals[j];
                }
            }
        }
        float res = (float) count / total;
        return String.format("%.2f", res);
    }
}
