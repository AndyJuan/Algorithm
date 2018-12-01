import edu.princeton.cs.algs4.Bag;

public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        Double[] a ={10.0,20.0,10.2,12.0,168.0};
        for (double i : a){
            numbers.add(i);
        }
        int N = numbers.size();
        Double sum = 0.0;
        for (Double x : numbers){
            sum += x;
        }
        Double mean = sum/N;

        sum = 0.0;
        for(double x : numbers)
            sum += (x - mean)*(x - mean);
        double std = Math.sqrt(sum/(N-1));
        System.out.printf("Mean : %.2f\n",mean);
        System.out.printf("Std dev : %.2f\n",std);


    }
}
