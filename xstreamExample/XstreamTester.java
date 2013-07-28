package com.shivaraj.xstreamExample;

import com.thoughtworks.xstream.XStream;

public class XstreamTester {
	
	public static void main(String[] args) {
		XStream stream = new XStream();
		stream.alias("person", Person.class);
		stream.alias("phonenumber", PhoneNumber.class);
		
		Person person = new Person();
		person.setFirstName("shivaraj");
		person.setLastName("kv");
		person.setPhone(new PhoneNumber(91,"9738255658"));
		
		String xml = stream.toXML(person);//serialization
		System.out.println(xml);
		
		Person deSerializedPerson = (Person)stream.fromXML(xml);
		System.out.println(deSerializedPerson.getFirstName());
	}

}
