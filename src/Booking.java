import java.util.ArrayList;

public class Booking {
    private ArrayList<Playground> pgList = new ArrayList<Playground>();

    public ArrayList<Playground> getPlaygrounds(){
        return pgList;
    }

    public ArrayList<Playground> specificLocation(String loc){
        ArrayList<Playground> pg = new ArrayList<Playground>();
        for (int i = 0; i< Database.playgrounds.size(); i++){
            if(Database.playgrounds.get(i).getLocation() == loc){

            }
        }
        return null;
    }

    public Playground choosePlayground(String name){
        for (int i = 0; i< pgList.size(); i++){
            if(pgList.get(i).getName() == name){
                return pgList.get(i);
            }
        }
        return null;
    }

}
