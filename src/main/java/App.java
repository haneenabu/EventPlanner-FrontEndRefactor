import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/4/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Haneen's Event Planning Service!" + '\n' + "You will be prompted with a few event options to get you an accurate event quote!" + '\n');
        try{
            //Guest Price
            System.out.println("Enter the number of your expected attendees: ");
            int guestNumInput = Integer.parseInt(bufferedReader.readLine());
            Event event = new Event();
            int finalCost = event.costOfGuest(guestNumInput);
            System.out.println("Your cost for " + guestNumInput+ " guests would amount to $" + finalCost +"." + '\n' + "Select any key to continue.");
            System.in.read(); //wait for the user to select any key before displaying more options

            //Food Price
            System.out.println("Choose one of the following food options: " + '\n' + "1. Italian Cuisine" + '\n' + "2. Asian Fusion" + '\n' + "3. Mediterranean");
        }catch (IOException e){
           e.printStackTrace();
        }
    }
}
