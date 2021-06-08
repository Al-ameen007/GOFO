import java.util.*;

public class Player extends Person {
    private String accType = "Player";
    private ArrayList<Player> friend = new ArrayList<Player>();
    private ArrayList<Player> favTeam = new ArrayList<Player>();
    private ArrayList<Booking> bookings = new ArrayList<Booking>();

    public void addFriend(String id) {
        int n = Database.players.size();
        for (int i = 0; i < n; i++) {
            if (Database.players.get(i).getID().equalsIgnoreCase(id)) {
                friend.add(Database.players.get(i));
                break;
            }
        }
    }

    public void addFavTeam(String id) {
        int n = Database.players.size();
        for (int i = 0; i < n; i++) {
            if (Database.players.get(i).getID().equalsIgnoreCase(id)) {
                favTeam.add(Database.players.get(i));
                break;
            }
        }
    }

    public void addBooking(Booking myBooking) {
        bookings.add(myBooking);
    }

    public ArrayList<Player> getFriend() {
        return friend;
    }

    public ArrayList<Player> getFavTeam() {
        return favTeam;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void signUp(String name, String email, String password, String location, String phone) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLocation(location);
        this.setPhone(phone);
        Database.players.add(this);
    }

    public ArrayList<Playground> dispalyNearToMe() {
        ArrayList<Playground> temp = new ArrayList<Playground>();
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (this.getLocation() == Database.playgrounds.get(i).getLocation()) {
                temp.add(Database.playgrounds.get(i));
            }
        }
        return temp;
    }

    public ArrayList<Playground> displaySpecificLocation(String loc) {
        ArrayList<Playground> temp = new ArrayList<Playground>();
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (loc == Database.playgrounds.get(i).getLocation()) {
                temp.add(Database.playgrounds.get(i));
            }
        }
        return temp;
    }



    public ArrayList<Playground> filterByHours() {
        ArrayList<Playground> temp = new ArrayList<Playground>();
        temp = Database.playgrounds;
        Collections.sort(temp);
        return temp;
    }

    public void book(Playground p){

    }

    public void bookPlayground(String name) {
        int n = Database.playgrounds.size();
        for (int i =0 ; i < n; i++){
            if (Database.playgrounds.get(i).getName() == name){
                book(Database.playgrounds.get(i));
            }
        }
    }


}
