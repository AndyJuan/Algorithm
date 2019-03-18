import java.util.Scanner;

public class Toutiao2_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n+1];
        int i=0;
        while(sc.hasNextLine()) {
            words[i++]=sc.nextLine();
            if(i==(n+1))
                break;
        }
        sc.close();
        for(int j=1;j<words.length;j++) {
            checkedWord(words[j]);
        }
    }

    public void testName() throws Exception {
        checkedWord("hellooo");
        checkedWord("w00000w");
    }
    private static void checkedWord(String word) {
        if(word.isEmpty())
            System.out.println("");
        char[] wc=word.toCharArray();
        int cur_count=0;
        int pre_count=0;
        for(int i=0;i<wc.length;i++) {
            if(i==0) {
                cur_count=1;
                continue;
            }
            if(wc[i]==wc[i-1]) {
                cur_count++;
                if(cur_count==3) {
                    wc[i-2]=',';
                    cur_count=2;
                }
                if(cur_count==2 && pre_count==2) {
                    wc[i-1]=',';
                    cur_count=1;
                }
            }else {
                pre_count=cur_count;
                cur_count=1;
            }
        }
        String result=new String(wc);

        System.out.println(result.replaceAll(",", ""));
    }

}