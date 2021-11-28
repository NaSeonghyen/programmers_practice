import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("str : " + str);

        int[] lottos ={44,1,0,0,31,25};
        int[] win_nums ={31,10,45,1,6,19};
        int[] result = LottoMaxMinRank.solution(lottos,win_nums);

        System.out.println(result);
    }
}
