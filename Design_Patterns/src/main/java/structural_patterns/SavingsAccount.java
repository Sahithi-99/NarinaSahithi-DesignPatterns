package structural_patterns;
import structural_patterns.Composite1;
public class SavingsAccount extends Composite1 {
	private String accountNo;
    private float accountBalance;
     
    private Accountstatement currentStmt;
     
    public SavingsAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }
 
    public String getAccountNo() {
        return accountNo;
    }
 
    public float getBalance() {
        return accountBalance;
    }
 
    public Accountstatement getStatement() {
        return currentStmt;
    }
}
