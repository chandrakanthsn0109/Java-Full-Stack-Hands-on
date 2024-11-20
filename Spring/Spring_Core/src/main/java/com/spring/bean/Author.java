package com.spring.bean;

public class Author {
	private String authorname;
	private String location;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorname, String location) {
		super();
		this.authorname = authorname;
		this.location = location;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Author [authorname=" + authorname + ", location=" + location + "]";
	}

}
