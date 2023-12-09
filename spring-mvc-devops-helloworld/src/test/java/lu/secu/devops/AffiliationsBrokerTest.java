package lu.secu.devops;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AffiliationsBrokerTest {

	@Test
	void loadingHomeController() {
		int index = 2;
		int base = 20;
		
		int product = 1;
		for(int i = 0; i<index ;i++) {
			product *= base;
		}
		System.out.println("The product of this formula is : "+product);
		System.out.println("Starting Test loadingHomeController");
		
		assertTrue(true);
	}
}
