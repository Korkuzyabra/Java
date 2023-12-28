import java.util.ArrayList;

public class Main
{
    public class Reservation
    {
        public Reservation (String guestName, int roomNumbers) {}
        public int getRoomNumber() {}
    }
    public class Hotel
    {
        private Reservation[] rooms;
        private ArrayList waitList;
        public Reservation requestRoom(String guestName)
        {
            for (int i=0; i<rooms.length; i++)
            {
                if(rooms[i]==null)
                {
                    rooms[i] = new Reservation(guestName, i);
                    return rooms[i];
                }
                waitList.add(guestName);
                return  null;
            }
        }
        public Reservation cancelAndReassing(Reservation res)
        {
            int roomNum = res.getRoomNumber();
            rooms[roomNum] = null;
            if (!waitList.isEmpty())
            {
                rooms[roomNum] = requestRoom((String) waitList.get(0));
                waitList.remove(0);
            }
            return rooms[roomNum];
        }

    }

}
