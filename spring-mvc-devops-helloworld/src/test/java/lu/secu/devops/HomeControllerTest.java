package lu.secu.devops;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeControllerTest {

	@Test
	void loadingHomeController() {
		System.out.println("Starting Test loadingHomeController");
		assertTrue(true);
	}
}
