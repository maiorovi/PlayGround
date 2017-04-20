package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class B {
	private A a;

	@Autowired
	public B(@Lazy A a) {
		this.a = a;
	}

}
