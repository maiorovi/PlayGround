package features.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MapperTest {
	private ObjectMapper mapper = new ObjectMapper();

	@BeforeEach
	void setUp() {
//		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
	}

	@Test
	void convertsObjectToJson() throws JsonProcessingException {
		Album album = new Album("Happy new Year");

		assertThat(mapper.writeValueAsString(album)).isEqualTo("{\"title\":\"Happy new Year\"}");
	}
}
