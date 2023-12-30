package com.khadri.log4j2.rolling.model;

public class Address {

	private int doorNo;

	private String streetName;

	private String landMark;

	private String town;

	private Address() {
		super();
	}

	public Address(AddressBuilder addressBuilder) {
		this.doorNo = addressBuilder.doorNo;
		this.streetName = addressBuilder.streetName;
		this.landMark = addressBuilder.landMark;
		this.town = addressBuilder.town;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getLandMark() {
		return landMark;
	}

	public String getTown() {
		return town;
	}

	public static class AddressBuilder {

		private int doorNo;

		private String streetName;

		private String landMark;

		private String town;

		public AddressBuilder withDoorNo(int doorNo) {
			this.doorNo = doorNo;
			return this;
		}

		public AddressBuilder withStreetName(String streetName) {
			this.streetName = streetName;
			return this;
		}

		public AddressBuilder withLandMark(String landMark) {
			this.landMark = landMark;
			return this;
		}

		public AddressBuilder withTown(String town) {
			this.town = town;
			return this;
		}

		public Address build() {
			return new Address(this);
		}

	}

}
