import java.util.Arrays;

public class code_61_pukpai {
    public boolean isContinuous(int [] numbers){
        if (numbers.length<5){
            return false;
        }

        Arrays.sort(numbers);
        int cnt = 0;
        for (int num : numbers){
            if (num == 0 ){
                cnt++;
            }
        }
        for(int i =cnt; i < numbers.length-1; i++){
            if (numbers[i+1] ==numbers[i]){
                return false;
            }
            cnt -= numbers[i+1] - numbers[i] -1;
        }
        return cnt>=0;



    }

}
