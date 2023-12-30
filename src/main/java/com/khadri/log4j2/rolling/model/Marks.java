package com.khadri.log4j2.rolling.model;

public class Marks {

	private String sub1Marks;
	private String sub2Marks;
	private String sub3Marks;
	private String sub4Marks;
	private String sub5Marks;
	private String sub6Marks;

	private Marks() {
		super();
	}

	public Marks(MarksBuilder builder) {
		this.sub1Marks = builder.sub1Marks;
		this.sub2Marks = builder.sub2Marks;
		this.sub3Marks = builder.sub3Marks;
		this.sub4Marks = builder.sub4Marks;
		this.sub5Marks = builder.sub5Marks;
		this.sub6Marks = builder.sub6Marks;
	}

	public String getSub1Marks() {
		return sub1Marks;
	}

	public String getSub2Marks() {
		return sub2Marks;
	}

	public String getSub3Marks() {
		return sub3Marks;
	}

	public String getSub4Marks() {
		return sub4Marks;
	}

	public String getSub5Marks() {
		return sub5Marks;
	}

	public String getSub6Marks() {
		return sub6Marks;
	}

	public static class MarksBuilder {

		private String sub1Marks;
		private String sub2Marks;
		private String sub3Marks;
		private String sub4Marks;
		private String sub5Marks;
		private String sub6Marks;

		public MarksBuilder withSub1Marks(String sub1Marks) {
			this.sub1Marks = sub1Marks;
			return this;
		}

		public MarksBuilder withSub2Marks(String sub2Marks) {
			this.sub2Marks = sub2Marks;
			return this;
		}

		public MarksBuilder withSub3Marks(String sub3Marks) {
			this.sub3Marks = sub3Marks;
			return this;
		}

		public MarksBuilder withSub4Marks(String sub4Marks) {
			this.sub4Marks = sub4Marks;
			return this;
		}

		public MarksBuilder withSub5Marks(String sub5Marks) {
			this.sub5Marks = sub5Marks;
			return this;
		}

		public MarksBuilder withSub6Marks(String sub6Marks) {
			this.sub6Marks = sub6Marks;
			return this;
		}

		public Marks build() {
			return new Marks(this);
		}

	}

}
