import javax.xml.crypto.Data;

/**
 * This class is the playground that players will book
 *
 * @author Mohammad Alameen
 * @version 1.0
 * @since 6 June 2021
 */


public class Playground implements Comparable<Playground> {
    private String name;
    private String location;
    private String size;
    private float price;
    private float cancellationPeriod;
    private int totalAvailableHoursToBook;
    private String status;
    private Owner owner;

    /**
     * default constructor for the Playground class
     */
    public Playground() {
        this.name = "";
        this.location = "";
        this.size = "";
        this.price = 0.0f;
        this.cancellationPeriod = 0.0f;
        this.totalAvailableHoursToBook = 0;
        this.status = "";
        this.owner = new Owner();
    }

    /**
     * is the parametrized constructor of the Playground class
     */
    public Playground(String name, String location, String size, float price, float cancellationPeriod, int totalAvailableHoursToBook, String status , Owner owner) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.price = price;
        this.cancellationPeriod = cancellationPeriod;
        this.totalAvailableHoursToBook = totalAvailableHoursToBook;
        this.status = status;
        Database.playgrounds.add(this);
        this.owner = owner;
    }


    /**
     * @return the name of the playground
     */
    public String getName() {
        return name;
    }

    /**
     * @return the location of the playground
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return the size of the playground
     */
    public String getSize() {
        return size;
    }

    /**
     * @return the pricing of the playground
     */
    public float getPrice() {
        return price;
    }

    /**
     * @return the cancellation period of the playground
     */
    public float getCancellationPeriod() {
        return cancellationPeriod;
    }

    /**
     * @return the total available hours the playground can be booked
     */
    public int getTotalAvailableHoursToBook() {
        return totalAvailableHoursToBook;
    }

    /**
     * status could be: active, suspended
     *
     * @return the status of the playground
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the owner of the playground
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Assigns the name of the playground to name
     *
     * @param name is the name of the playground
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Assigns the location of the playground to location
     *
     * @param location is the location of the playground
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Assigns the size of the playground to size
     *
     * @param size is the size of the playground
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Assigns the price of the playground to price
     *
     * @param price is the price of the playground
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Assigns  the totalAvailableHoursToBook of the playground to totalAvailableHoursToBook
     *
     * @param totalAvailableHoursToBook is the total hours available that can be booked
     */
    public void setTotalAvailableHoursToBook(int totalAvailableHoursToBook) {
        this.totalAvailableHoursToBook = totalAvailableHoursToBook;
    }

    /**
     * Assigns the cancellationPeriod of the playground to cancellationPeriod
     *
     * @param cancellationPeriod is the cancellation period of the playground
     */
    public void setCancellationPeriod(float cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    /**
     * Assigns the status of the playground to status
     *
     * @param status is the statues of the playground
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Assigns the owner of the playground to owner
     *
     * @param //owner is the owner of the playground
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public int compareTo(Playground comparesTo) {
        int compareTotalAvailableHoursToBook = ((Playground) comparesTo).getTotalAvailableHoursToBook();
        return compareTotalAvailableHoursToBook - this.getTotalAvailableHoursToBook();
    }

    /**
     * displays the information of the playground
     *
     * @Override
     */
    public String toString() {
        return "Playground{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", cancellationPeriod=" + cancellationPeriod +
                ", totalAvailableHoursToBook=" + totalAvailableHoursToBook +
                ", status='" + status + '\'' +
                ", owner=" + //owner +
                '}';
    }
}
