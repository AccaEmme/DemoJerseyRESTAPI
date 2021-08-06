package it.accaemme.spring.demo;

public class GreetingsBean {
	String language, message, username;
	
	public GreetingsBean(String lang, String usr) {
		this.language=lang;
		this.message = lang.equals("it")	?	"Ciao! "	:	"Hello ";
		this.username=usr;		
	}
	
	public String getMessage() {
		return this.message+this.username;
	}
	
}
