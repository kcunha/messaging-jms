package hello.model;

import javax.validation.constraints.NotNull;

public class Email {

	@NotNull(message = "to parameter cannot be null")
	private String to;

	@NotNull(message = "the body message cannot be null")
	private String body;

	public Email() {
	}

	public Email(String to, String body) {
		this.to = to;
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Email{to=%s, body=%s}", getTo(), getBody());
	}

}
