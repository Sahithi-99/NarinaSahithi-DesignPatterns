package structural_patterns;
import java.util.ArrayList;
import java.util.List;
import structural_patterns.Accountstatement;
public abstract class Composite1 {
	Accountstatement accStatement;
	 
    public List<Composite1> list = new ArrayList<>();
 
    public abstract float getBalance();
 
    public abstract Accountstatement getStatement();
 
    public void add(Composite1 g) {
        list.add(g);
    }
 
    public void remove(Composite1 g) {
        list.remove(g);
    }
 
    public Composite1 getChild(int i) {
        return (Composite1) list.get(i);
    }
}
