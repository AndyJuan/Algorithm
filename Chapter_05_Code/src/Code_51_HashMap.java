import java.util.HashMap;

public class Code_51_HashMap {
    public static class RandonPool{
        public HashMap<String, Integer> map1 ;
        public HashMap< Integer, String> map2 ;
        public int size;

        public RandonPool(){
            map1 = new HashMap<>();
            map2 = new HashMap<>();
            size = 0;
        }

        public void add (String str){
            map1.put(str, size);
            map2.put(size, str);
            size++;
        }

        public String getRandom(){
            if (size == 0)
                return null;
            int index = (int)(Math.random() * size);
            return map2.get(index);
        }


    }

}
