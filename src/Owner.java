import java.util.ArrayList;

public class Owner extends Person{
     private ArrayList<Playground> playgrounds = new ArrayList<Playground>();
     private Database request;
     public int counter =0;
     public boolean registerPlayground(String name, String location, String size, float price, float totalHR){
          playgrounds.get(counter).setName(name);
          playgrounds.get(counter).setLocation(location);
          playgrounds.get(counter).setSize(size);
          playgrounds.get(counter).setPrice(price);
          playgrounds.get(counter).setTotalAvailableHoursToBook(totalHR);
          counter++;
          return true;
     }

     public boolean editPlayGround(String choice,String name,String var ){
          for(int i=0;i<=counter;i++){
               if(name == playgrounds.get(i).getName()) {
                    if (choice.equals("name")) {
                         playgrounds.get(i).setName(var);
                    } else if (choice.equals("location")) {
                         playgrounds.get(i).setLocation(var);
                    } else if (choice.equals("size")) {
                         playgrounds.get(i).setSize(var);
                    }
               }
          }
          return true;
     }
     public boolean editPlayGround(String choice,String name,float var ){
          for(int i=0;i<=counter;i++){
               if(name == playgrounds.get(i).getName()){
                    if(choice.equals("price")){
                         playgrounds.get(i).setPrice(var);
                    }else if(choice.equals("totalHR")){
                         playgrounds.get(i).setTotalAvailableHoursToBook(var);
                    }
               }
          }
          return true;
     }
     public void displayPlayGrounds() {
          for(int i=0;i<=counter;i++){
               int num=i+1;
               System.out.println("Playground number: " + num);
               System.out.println("Name: " + playgrounds.get(i).getName());
               System.out.println("Location: " + playgrounds.get(i).getLocation());
               System.out.println("Size: " +  playgrounds.get(i).getSize());
               System.out.println("Price: " +  playgrounds.get(i).getPrice());
               System.out.println("Total hours available per day: " + playgrounds.get(i).getTotalAvailableHoursToBook());
               System.out.println("====================================");
          }
     }
     public Owner signUp(String name,String email,String password,String location,String phone){
          Owner owner = new Owner();
          owner.setName(name);
          owner.setEmail(email);
          owner.setPassword(password);
          owner.setLocation(location);
          owner.setPhone(phone);
          request.saveData(owner);
          return owner;
     }
}
