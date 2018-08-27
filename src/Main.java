import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WholeMinuteDilemma wholeMinuteDilemma = new WholeMinuteDilemma();
        int[] songs = {20, 30, 30, 30, 40, 50, 60};
        System.out.println(wholeMinuteDilemma.solution(songs));

        CharitableGiving charitableGiving = new CharitableGiving();
        int[] donates = {3,2,1,2,3};
        String[] out = charitableGiving.solution(donates);
        System.out.println(Arrays.toString(out));

    }
}
