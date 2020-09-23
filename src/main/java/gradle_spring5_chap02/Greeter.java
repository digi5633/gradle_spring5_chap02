package gradle_spring5_chap02;

public class Greeter {

	private String formet;

	public String greet(String guest) {
		return String.format(formet, guest);
	}

	public void setFormet(String formet) {
		this.formet = formet;
	}

}
