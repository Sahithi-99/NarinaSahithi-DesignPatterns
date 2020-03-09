package behavioural_patterns;
import behavioural_patterns.Socialmedia;
public class Twitter implements Socialmedia{
	public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
