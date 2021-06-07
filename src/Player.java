import java.util.ArrayList;

public class Player extends Person{
    private String accType = "Player" ;
    private ArrayList<Player> friend = new ArrayList<Player>();
    private ArrayList<Player> favTeam = new ArrayList<Player>();
    private ArrayList<Booking> bookings = new ArrayList<Booking>();

    public void addFriend(Player fPlayer){
        friend.add(fPlayer);
    }

    public void addFavTeam(Player fPlayer){
        favTeam.add(fPlayer);
    }

    public void addBooking(Booking myBooking){
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

    public void signUp(String name, String email, String password, String location, String phone){
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLocation(location);
        this.setPhone(phone);
    }
    public void bookPlayground(){

    }
}
