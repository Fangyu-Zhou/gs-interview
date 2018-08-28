import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WholeMinuteDilemma wholeMinuteDilemma = new WholeMinuteDilemma();
        int[] songs = {20, 30, 30, 30, 40, 50, 60};
        System.out.println(wholeMinuteDilemma.solution(songs));

//        CharitableGiving charitableGiving = new CharitableGiving();
//        int[] donates = {3,2,1,2,3};
//        String[] out = charitableGiving.solution(donates);
//        System.out.println(Arrays.toString(out));

        SchoolAllotment schoolAllotment = new SchoolAllotment();
        int[] seats = {1,3,1,2};
        int[] scores = {990,700, 800, 880, 900};
        int[][] prefereces = {{3,2,1}, {3,0,0}, {2,0,1}, {0,1,3}, {0,2,3}};
        int[] ret = schoolAllotment.solution(seats, scores, prefereces);
        System.out.println(ret[0] + ", " + ret[1]);

        CapsLock capsLock = new CapsLock();
        String s = "Baa, Baa! said the sheep";
        System.out.println(capsLock.solution(s));

        LatestStudents latestStudents = new LatestStudents();
        List<List<String>> attendance = new ArrayList<>();
        attendance.add(Arrays.asList("06-22","Chuck","540","540"));
        attendance.add(Arrays.asList("06-23","Debby","540","555"));
        attendance.add(Arrays.asList("06-23","Chuck","540","540"));
        attendance.add(Arrays.asList("06-23","Doug","600","630"));
        attendance.add(Arrays.asList("06-24","Chuck","600","600"));
        attendance.add(Arrays.asList("06-24","Doug","600","600"));
        System.out.println(attendance);
        System.out.println(latestStudents.solution(attendance));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.set(0,2);

        ReverseExpression reverseExpression = new ReverseExpression();
        String expression = "10.4*32.7/-12";
        System.out.println(reverseExpression.solution(expression));

    }
}
