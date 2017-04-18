package app.validation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidationTest {

	private Employee employee;
	private Validator validator;
	//	private Validator


	@BeforeEach
	void setUp() {
		ValidatorFactory validationFactory =  Validation.buildDefaultValidatorFactory();
		validator = validationFactory.getValidator();
	}

	@Test
	void validatesWithoutExceptionCorrectEntity() {
		employee = new Employee();

		Set<ConstraintViolation<Employee>> violations = validator.validate(employee);

	}
}
