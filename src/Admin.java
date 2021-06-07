public class Admin extends Person{
    private Database data;
    public boolean approvePlayground(Playground playground){

    }
    public boolean suspend(Playground playground){

    }
    public boolean reactivate(Playground playground){

    }
    public boolean delete(Playground playground){

    }
    public void display(String name) {
        for (int i = 0; i <= data.playgrounds.getCounter(); i++) {
            if (name == data.playgrounds.get(i).getName()) {
                System.out.println("Playground:");
                System.out.println("Name: " + data.playgrounds.get(i).getName());
                System.out.println("Location: " + data.playgrounds.get(i).getLocation());
                System.out.println("Size: " + data.playgrounds.get(i).getSize());
                System.out.println("Price: " + data.playgrounds.get(i).getPrice());
                System.out.println("Total hours available per day: " + data.playgrounds.get(i).getTotalAvailableHoursToBook());
            }
        }
    }
    public Admin signUp(String name,String email,String password,String location,String phone){
        Admin admin = new Admin();
        admin.setName(name);
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setLocation(location);
        admin.setPhone(phone);
        data.saveData(admin);
        return admin;
    }
}
