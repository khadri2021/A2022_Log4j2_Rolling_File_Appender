package com.khadri.log4j2.rolling.model;

public class Sport {

	private Boolean cricket;
	private Boolean footBall;
	private Boolean valleyBal;
	private Boolean tennisBal;

	private Sport() {
		super();
	}

	public Sport(SportBuilder builder) {
		this.cricket = builder.cricket;
		this.footBall = builder.footBall;
		this.valleyBal = builder.valleyBal;
		this.tennisBal = builder.tennisBal;
	}

	public Boolean getCricket() {
		return cricket;
	}

	public Boolean getFootBall() {
		return footBall;
	}

	public Boolean getValleyBal() {
		return valleyBal;
	}

	public Boolean getTennisBal() {
		return tennisBal;
	}

	public static class SportBuilder {

		private Boolean cricket;
		private Boolean footBall;
		private Boolean valleyBal;
		private Boolean tennisBal;

		public SportBuilder withCricket(Boolean cricket) {
			this.cricket = cricket;
			return this;
		}

		public SportBuilder withFootBall(Boolean footBall) {
			this.footBall = footBall;
			return this;
		}

		public SportBuilder withValleyBal(Boolean valleyBal) {
			this.valleyBal = valleyBal;
			return this;
		}

		public SportBuilder withTennisBal(Boolean tennisBal) {
			this.tennisBal = tennisBal;
			return this;
		}

		public Sport build() {
			return new Sport(this);
		}

	}
}