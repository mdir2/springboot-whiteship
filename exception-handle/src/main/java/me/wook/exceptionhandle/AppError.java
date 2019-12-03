package me.wook.exceptionhandle;

public class AppError {
	private String message;
	private String reason;
	private String originMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(final String reason) {
		this.reason = reason;
	}

	public String getOriginMessage() {
		return originMessage;
	}

	public void setOriginMessage(final String originMessage) {
		this.originMessage = originMessage;
	}
}
