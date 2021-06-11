public class Admin extends Person{

    /**
     * accept a playground
     * @param name is the name of playground that need the approval
     */
    public void approvePlayground(String name){
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (name == Database.playgrounds.get(i).getName()) {
                Database.playgrounds.get(i).setStatus("activated");
            }
        }
    }

    /**
     * suspend a playground
     * @param name is the name of playground that is suspended
     */
    public void suspend(String name){
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (name == Database.playgrounds.get(i).getName()) {
                Database.playgrounds.get(i).setStatus("suspended");
            }
        }
    }

    /**
     * reactivate a playground
     * @param name is the name of playground that need to be reactivate
     */
    public void reactivate(String name){
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (name == Database.playgrounds.get(i).getName()) {
                Database.playgrounds.get(i).setStatus("reactivate");
            }
        }
    }

    /**
     * delete a playground
     * @param name is the name of playground that is delete
     */
    public void delete(String name){
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (name == Database.playgrounds.get(i).getName()) {
                  Database.playgrounds.remove(Database.playgrounds.get(i));
            }
        }
    }

    /**
     * display a playground
     * @param name is the name of playground that is displayed
     */
    public void display(String name) {
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            if (name == Database.playgrounds.get(i).getName()) {
                System.out.println(Database.playgrounds.get(i));
            }
        }
    }

    /**
     * display all playgrounds
     */
    public void display() {
        int n = Database.playgrounds.size();
        for (int i = 0; i < n; i++) {
            System.out.println(Database.playgrounds.get(i));
        }
    }

    /**
     * used to register the Admin
     * @param name
     * @param email
     * @param password
     * @param location
     * @param phone
     * @return
     */
    public Admin signUp(String name,String email,String password,String location,String phone){
        Admin admin = new Admin();
        admin.setName(name);
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setLocation(location);
        admin.setPhone(phone);
        Database.myAdmin = admin;
        return admin;
    }
}
