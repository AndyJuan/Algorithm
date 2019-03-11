import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Robber implements Comparable{
    int pos;
    int vol;
    public Robber(int pos, int vol){
        this.pos=pos;
        this.vol=vol;
    }

    public Robber(){

    }

    @Override
    public int compareTo(Object o) {
        Robber b = (Robber) o;
        if (vol>b.vol) {
            return 1;
        }else if(vol==b.vol){
            return 0;
        }else {
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);

        ArrayList<Robber> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String s1 = scanner.nextLine();
            String[] arr1 = s1.split(" ");
            Robber bank = new Robber(Integer.parseInt(arr1[0]),Integer.parseInt(arr1[1]));
            list.add(bank);
        }

        Collections.sort(list);

        int max = 0;

        for (int i=1;i<=n;i++){
            int topVol = list.get(n-i).vol;
            int topPos = list.get(n-i).pos;
            for (int j=n-i-1;j>=0;j--)
            {
                int lowVol = list.get(j).vol;
                int lowPos = list.get(j).pos;
                if (Math.abs(topPos-lowPos)>=d){
                    int max1 = topVol+lowVol;
                    if (max1>max){
                        max=max1;
                    }
                    break;
                }
            }
        }

        System.out.println(max);
    }
}