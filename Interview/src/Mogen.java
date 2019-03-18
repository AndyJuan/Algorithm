import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Room{
    int start;
    int end;
    public Room(int start,int end){
        this.start = start;
        this.end = end;
    }
}

 class CompareRoom implements Comparator<Room> {
    @Override
    public int compare(Room o1,Room o2){
        return o2.end-o1.end;

    }

}

public class Mogen {
    public static boolean IsCanAttendAll (Room[] rooms){
        if (rooms == null || rooms.length == 0)
            return false;
        Arrays.sort(rooms, new CompareRoom());
        for (int i = 1 ; i< rooms.length;i++){
            int before = rooms[i-1].end;
            if (rooms[i].start<=before){
                return false;
            }
        }
        return true;
    }

    public static int minRoomInterver(Room[] rooms){
        if (rooms == null || rooms.length == 0)
            return 0;
        int min = rooms[0].end - rooms[0].start;
        int num = 0;
        for (int i = 1; i < rooms.length;i++){
            int cur = rooms[i].end - rooms[i].start;
            if (cur< min){
                min = cur;
                num = i;
            }
        }
        return  num;
    }

    public static void main(String[] args) {
        Room[] rooms = new Room[5];
        rooms[0] = new Room(900,1000);
        rooms[1] = new Room(900,930);
        rooms[2] = new Room(930,1000);
        rooms[3] = new Room(900,1100);
        rooms[4] = new Room(950,1000);


        System.out.println(IsCanAttendAll(rooms));
        System.out.println(minRoomInterver(rooms));

        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        for (int i = 0; i < total; i++){
            rooms[i] = new Room(scan.nextInt(),scan.nextInt());
            System.out.println(rooms[i].start);
        }






    }

}
