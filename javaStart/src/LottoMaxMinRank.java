import java.util.Scanner;

public class LottoMaxMinRank {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int equals = 0;
        int zero_cnt = 0;
        int max_equals = 0, min_equals = 0;
        int rank_max =0, rank_min=0;

        // 내 번호 알수 없는 번호 개수 체크
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero_cnt++;
            }
        }

        // 내 로또 번호와 당첨번호 비교하기
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    equals++;
                }
            }
        }

        // 내 로또 번호에 알 수 없는 번호에 따른 당첨번호 개수 구하기(최고, 최저)
        if(zero_cnt != 0){
            max_equals = equals + zero_cnt;
            min_equals = equals;
        } else {
            max_equals = equals;
            min_equals = equals;
        }

        // 당첨내용 -> 순위 변환
        if(max_equals == 6){
            rank_max = 1;
        } else if(max_equals == 5){
            rank_max = 2;
        } else if(max_equals == 4){
            rank_max = 3;
        } else if(max_equals == 3){
            rank_max = 4;
        } else if(max_equals == 2){
            rank_max = 5;
        } else if(max_equals < 2){
            rank_max = 6;
        }

        if(min_equals == 6){
            rank_min = 1;
        } else if(min_equals == 5){
            rank_min = 2;
        } else if(min_equals == 4){
            rank_min = 3;
        } else if(min_equals == 3){
            rank_min = 4;
        } else if(min_equals == 2){
            rank_min = 5;
        } else if(min_equals < 2){
            rank_min = 6;
        }

        answer[0] = rank_max;
        answer[1] = rank_min;

        return answer;
    }
    public static void main(String[] args) {
        int[] lottos ={44,1,0,0,31,25};
        int[] win_nums ={31,10,45,1,6,19};
        int[] result = solution(lottos,win_nums);
        System.out.print("result : ");
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
