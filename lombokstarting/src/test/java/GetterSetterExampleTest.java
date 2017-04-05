import app.GetterSetterExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetterSetterExampleTest {
	private GetterSetterExample ex;

	@BeforeEach
	void setUp() {
		ex = new GetterSetterExample();
	}

	@Test
	void withoutSettingDefaultAgeIsReturned() {
		assertThat(ex.getAge()).isEqualTo(10);
	}

	@Test
	void afterSettingSettedValueWillBeReturned() {
		ex.setAge(26);
		assertThat(ex.getAge()).isEqualTo(26);
	}
}
