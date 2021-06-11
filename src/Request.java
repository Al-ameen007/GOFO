/**
 * This class is the Request that used to request a booking from players
 *
 * @author  Youssef Mohamed, Mahmoud Gamal
 * @version 1.0
 * @since 6 June 2021
 */

public class Request {
    private Playground requestedPG;
    static int id = 0;
    private boolean accepted = false;

    /**
     * Used to request a booking for a playground
     * @param playground
     */
    public Request(Playground playground){
        requestedPG = playground;
        requestedPG.getOwner().addRequest(this);
        id++;
    }

    /**
     * set accepted to true
     */
    public void accept(){
        accepted = true;
    }

    /**
     * set accepted to false
     */
    public void decline(){
        accepted = false;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @return accepted
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * @param accepted
     */
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

}
