import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.cg.parlp.beans.*;


public class TestparlP {
   @Test
   public void testTransaction1() {
	   System.out.println("from TestTransaction1");
	   Transaction t = new Transaction();
	   t.setAmount(5000);
	   assertEquals(5000, t.getAmount());
   }
   @Test
   public void testTransaction2() {
	   System.out.println("from TestTransaction2");
	   Transaction t = new Transaction();
	   t.setAction("DEPOSIT");
	   assertEquals("DEPOSIT",t.getAction());
   }
   @Test
   public void testTransaction3() {
	   System.out.println("from TestTransaction3");
	   Transaction t = new Transaction();
	   t.setTransacted_account("2000");
	   assertEquals("2000",t.getTransacted_account());
   }
   @Test
   public void testAccount1() {
	   System.out.println("from TestAccount1");
	   Account a = new Account(3000, 2345, null);
	   assertEquals(3000, a.getBalance());
	   assertEquals(2345,a.getAccNumber());
	   assertEquals(null,a.getHistory());
   }
   @Test
   public void testAccount2() {
	   System.out.println("from TestAccount2");
	   Account a = new Account(3000, 2345, null);
	   a.setAccNumber(123);
	   assertEquals(123,a.getAccNumber());
   }
   @Test
   public void testAccount3() {
	   System.out.println("from TestAccount3");
	   Account a = new Account(3000, 2345, null);
	   a.setBalance(4000);
	   assertEquals(4000,a.getBalance());
   }
   @Test
   public void testAccount4() {
	   System.out.println("from TestAccount4");
	   Account a = new Account(3000, 2345, null);
	   ArrayList<Transaction> AL= new ArrayList<Transaction>();
	   a.setHistory(AL);
	   assertEquals(AL,a.getHistory());
   }
   @Test
   public void testCustomer1() {
	   System.out.println("from TestCustomer1");
	   Customer c = new Customer("Anna", null);
	   assertEquals(null,c.getAccount());
	   assertEquals("Anna",c.getCustName());
   }
   @Test
   public void testCustomer2() {
	   System.out.println("from TestCustomer2");
	   Customer c = new Customer("Anna", null);
	   c.setCustName("JOHN");
	   assertEquals("JOHN",c.getCustName());
   }
   @Test
   public void testCustomer3() {
	   System.out.println("from TestCustomer3");
	   Customer c = new Customer("Anna", null);
	   c.setCustID(245);
	   assertEquals(245,c.getCustID());
   }
   @Test
   public void testCustomer4() {
	   System.out.println("from TestCustomer4");
	   Customer c = new Customer("Anna", null);
	   Account a = new Account(3000, 2345, null);
	   c.setAccount(a);
	   assertEquals(a,c.getAccount());
   }
}
