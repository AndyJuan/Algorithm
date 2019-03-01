public class code_39_MajorityNumber {
    public int MoreThanHalfNum_Solution(int [] array){
        int majority = array[0];
        int cnt = 1;
        for (int i = 0; i < array.length; i++){
            cnt = array[i] == majority ? cnt +1 : cnt -1;
            if (cnt == 0){
                majority = array[i];
                cnt = 1;
            }
        }
        cnt = 0;
        for(int val : array){
            if (val == majority){
                cnt++;
            }
        }
        return cnt>array.length/2 ? majority : 0;
    }
}
