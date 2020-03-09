package structural_patterns;
import structural_patterns.Composite1;
import structural_patterns.Accountstatement;
public class CompositeAccount extends Composite1{
	private float totalBalance;
    private Accountstatement compositeStmt, individualStmt;
 
    public float getBalance() {
        totalBalance = 0;
        for (Composite1 f : list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }
 
    public Accountstatement getStatement() {
        for (Composite1 f : list) {
            individualStmt = f.getStatement();
            compositeStmt.merge(individualStmt);
        }
        return compositeStmt;
    }
}
