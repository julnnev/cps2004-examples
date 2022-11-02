import java.util.ArrayList;

public class RecEngine {

    public void recommend(ArrayList <Event> list, String user_genre){
        //array of events and guests
        //if(list.event_genre.equals(user_genre)){
            // for each element in events array, check match for types, and if there is a match append to array.
        for(int i=0;i<= list.size();i++){
           // if(list.getType().get(i).equals(user_genre)){
                System.out.println(list.get(i));
            }
        }

    }
}
