import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class code_ex_stringSplit {
    public static void main(String[] args) {
//        String str = "2020/9/24,16A01,1603,\" TMC1车 1A 2B,M车3B动态地图黑屏\",7天,2020/9/25,已通知质保方，待有备件后处理,";
//        String[] strArr = str.trim().split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)",-1);
//        for (int i = 0;i<strArr.length;i++){
//            System.out.println(strArr[i]);
//        }

        String line = "2020/9/24,16A01,1603,\" TMC1车 1A 2B,M车3B动态地图黑屏\",7天,2020/9/25,已通知质保方，待有备件后处理,,,,";
        line = line + (line.endsWith(",") ? "0" : "");
        List<String> cols = Arrays.stream(line.split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)")).map(col -> {
            if (col.isEmpty()) {
                return "0";
            } else if (col.contains("\" ")){
                col=col.replace("\"","");
                System.out.println(col);
                return col;
            }else {
                return col;
            }
        }).collect(Collectors.toList());
        for (int i=0;i<cols.size();i++){
            if (cols.get(i).contains("\" ")) {
                cols.get(i).replace("\"", "");
               // System.out.println(cols.get(i));
            }
        }
        line = String.join(",", cols) + (line.endsWith(",") ? "," : "");
       // System.out.println(line);

        String str = "\" TMC1车 1A 2B,M车3B动态地图黑屏\"";
        str=str.replace("\"", "");
      //  System.out.println(str);
    }
}
