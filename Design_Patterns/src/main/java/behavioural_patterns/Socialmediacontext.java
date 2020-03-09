package behavioural_patterns;
import behavioural_patterns.Socialmedia;
public class Socialmediacontext 
{
    Socialmedia smStrategy;
 
    public void setSocialmediaStrategy(Socialmedia smStrategy) 
    {
        this.smStrategy = smStrategy;
    }
 
    public void connect(String name) 
    {
        smStrategy.connectTo(name);
    }
}