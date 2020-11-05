package stack;

public class code_42_trap {
    public static void main(String[] args) {
        int[] height ={0,1,0,2,1,0,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height){
        int ans=0;
        int heig = getMax(height);
        for (int i =1; i< heig; i++){
            int temp=0;
            for (int j =1; j<height.length-1; i++){
                if (height[j]<i && (height[j-1]>=height[j] || height[j+1] >=height[j])){
                    temp++;
                }

                if (height[j] >=i){
                    
                }
            }
            ans=ans+temp;
        }
        return ans;

    }

    public static int getMax(int[] height){
        int max = Integer.MIN_VALUE;
        for (int i =0;i<height.length;i++){
            if (height[i] >max){
                max = height[i];
            }
        }
        return max;
    }


}
