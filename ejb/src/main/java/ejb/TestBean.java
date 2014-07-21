package ejb;

import javax.ejb.Stateless;

@Stateless
public class TestBean {

	public String hello() {
		return "World!";
	}
}
