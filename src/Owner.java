import java.util.ArrayList;

/**
 * This class is the Owner that will register their playgrounds
 *
 * @author Youssef Mohamed
 * @version 1.0
 * @since 6 June 2021
 */

public class Owner extends Person {
    private ArrayList<Playground> playgrounds = new ArrayList<Playground>();
    private ArrayList<Request> myRequests = new ArrayList<Request>();


    public void registerPlayground(String name, String location, String size, int price, float cancellationPeriod, int totalHR, int start, int end) {
        Playground myPG = new Playground(name, location, size, price, cancellationPeriod, totalHR, this, start, end);

    }

    public void editPlayground(String choice, String name, String var) {
        int n = playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (choice == playgrounds.get(i).getName()) {
                switch (name) {
                    case "name": {
                        playgrounds.get(i).setName(var);
                        break;
                    }
                    case "location": {
                        playgrounds.get(i).setLocation(var);
                        break;
                    }
                    case "size": {
                        playgrounds.get(i).setSize(var);
                        break;
                    }
                    case "price": {
                        int val = Integer.parseInt(var);
                        playgrounds.get(i).setPrice(val);
                        break;
                    }
                    case "totalHR": {
                        int val = Integer.parseInt(var);
                        playgrounds.get(i).setTotalAvailableHoursToBook(val);
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        }
    }


    public void getMyPlaygrounds() {
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (Database.playgrounds.get(i).getOwner().getName() == this.getName()) {
                playgrounds.add(Database.playgrounds.get(i));
            }
        }
    }

    public void displayPlayGrounds() {
        getMyPlaygrounds();
        int n = playgrounds.size();
        for (int i = 0; i < n; i++) {
            System.out.println(playgrounds.get(i));
        }
    }

    public void signUp(String name, String email, String password, String location, String phone) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setLocation(location);
        this.setPhone(phone);
        Database.owners.add(this);

    }

    public void addRequest(Request req) {
        myRequests.add(req);
    }

    public ArrayList<Request> getMyRequests() {
        return myRequests;
    }

    public Request selectReq(int id) {
        int n = myRequests.size();
        for (int i = 0; i < n; i++) {
            if (id == myRequests.get(i).getId()) {
                return myRequests.get(i);
            } else {
                return null;
            }
        }
        return null;
    }

    public void acceptRequest(Request r) {
        r.accept();
    }

    public void declineRequest(Request r) {
        r.decline();
    }
}
