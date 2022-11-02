import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
        Event one = new Event("Movie Night", 1);
        Event two = new Event("Poker", 2);


        Guest guest1 = new Guest("SLM", 1);

        ArrayList <Event> list = new ArrayList<Event>();
        list.add(one);
        list.add(two);

        recommend(list, guest1.preferred_type);

    }

    public static void recommend(ArrayList <Event> list, int user_genre){
        //array of events and guests
        //if(list.event_genre.equals(user_genre)){
        // for each element in events array, check match for types, and if there is a match append to array.
        for(int i=0;i<= list.size();i++){
            if(list.get(i).equals(user_genre)){
                System.out.println(list.get(i));
            }
        }

    }

}

