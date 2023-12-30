package com.khadri.log4j2.rolling.model;

public class Student {
	private int id;
	private String name;
	private String college;
	private Long phoneNumber;
	private Address address;
	private Subject subject;
	private Sport sport;
	private Marks marks;

	public Student() {
		super();
	}

	public Student(StudentBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.college = builder.college;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
		this.subject = builder.subject;
		this.sport = builder.sport;
		this.marks = builder.marks;
	}

	public static class StudentBuilder {
		private int id;
		private String name;
		private String college;
		private Long phoneNumber;
		private Address address;
		private Subject subject;
		private Sport sport;
		private Marks marks;

		public StudentBuilder withId(int id) {
			this.id = id;
			return this;
		}

		public StudentBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder withCollege(String college) {
			this.college = college;
			return this;
		}

		public StudentBuilder withPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public StudentBuilder withAddress(Address address) {
			this.address = address;
			return this;
		}

		public StudentBuilder withSubject(Subject subject) {
			this.subject = subject;
			return this;
		}

		public StudentBuilder withSport(Sport sport) {
			this.sport = sport;
			return this;
		}

		public StudentBuilder withMarks(Marks marks) {
			this.marks = marks;
			return this;
		}

		public Student build() {

			return new Student(this);
		}

	}
}
