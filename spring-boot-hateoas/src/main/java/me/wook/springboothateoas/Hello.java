package me.wook.springboothateoas;

public class Hello {

	private String prefix;

	private String name;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(final String prefix) {
		this.prefix = prefix;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return prefix + " " + name;
	}
}
