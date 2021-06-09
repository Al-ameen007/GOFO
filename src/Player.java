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

    /**
     * adds a player to the list of team
     * @param id is the id of the selected player to be added
     */
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

    /**
     * @return the friends of the player
     */
    public ArrayList<Player> getFriend() {
        return friend;
    }

    public ArrayList<Player> getFavTeam() {
        return favTeam;
    }

    /**
     * @return the request of the player
     */
    public ArrayList<Request> getRequests() {
        return requests;
    }

    /**
     * @return the selected playground to book
     */
    public Playground getSelectedPG() {
        return selectedPG;
    }

    /** Assigns the selected playground to book
     * @param selectedPG
     */
    public void setSelectedPG(Playground selectedPG) {
        this.selectedPG = selectedPG;
    }

    /**
     * adds a new player to the system
     * @param name is the name of the player
     * @param email is the email of the player
     * @param password is the password of the player
     * @param location is the location of the player
     * @param phone is the phone of the player
     */
    public void signUp(String name, String email, String password, String location, String phone) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLocation(location);
        this.setPhone(phone);
        Database.players.add(this);
    }

    /**
     * @return all the playgrounds saved in the database
     */
    public ArrayList<Playground> displayAll(){
        return Database.playgrounds;
    }

    /**
     * @return an arraylist that contains the playgrounds near to the player
     */
    public ArrayList<Playground> displayNearToMe() {
        ArrayList<Playground> temp = new ArrayList<Playground>();
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (this.getLocation() == Database.playgrounds.get(i).getLocation()) {
                temp.add(Database.playgrounds.get(i));
            }
        }
        return temp;
    }

    /** makes sure that the selected time slots are available in the playground
     * @param start is the start of the time slots the player wants to book
     * @param numOfHours is the number of hours the player wants to book
     */
    public void checkAvailableTimeSLots(int start, int numOfHours) {
        for (int i =0 ; i < numOfHours; i++){
            if (!selectedPG.getTimeSlot().contains(LocalTime.of(start,0))){
                System.out.println("Selected Time slot is not available");
                break;
            }start++;
        }
        System.out.println("Selected Time slot is available");
        book(selectedPG, start, numOfHours);
    }

    /**
     * @param loc is the location of the playgrounds that the players wants to display
     * @return an arraylist of the playground in the location the player chosen
     */
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

    /**
     * @return an arraylist of the playgrounds sorted by total available hours
     */
    public ArrayList<Playground> filterByHours() {
        ArrayList<Playground> temp = new ArrayList<Playground>();
        temp = Database.playgrounds;
        Collections.sort(temp);
        return temp;
    }

    public void book(Playground p){

    }

    /**
     * @param name is the name of the playground that the players wants to choose
     * @return the playground the player wanted to choose
     */
    public Playground selectPlayGround(String name) {
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (Database.playgrounds.get(i).getName() == name) {
                selectedPG = Database.playgrounds.get(i);
                System.out.println(selectedPG.getTimeSlot());
                return  selectedPG;
            }
        }
        return null;
    }
}
