package me.wook.autoconfig;

public class Holoman {
	private String name;
	private int howLong;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getHowLong() {
		return howLong;
	}

	public void setHowLong(final int howLong) {
		this.howLong = howLong;
	}

	@Override
	public String toString() {
		return "Holoman{" +
				"name='" + name + '\'' +
				", howLong=" + howLong +
				'}';
	}
}
