//$Id: Person.java,v 1.2 2005/02/12 07:27:29 steveebersole Exp $
package org.hibernate.test.onetoone.singletable;

/**
 * @author Gavin King
 */
public class Person extends Entity {
	public Address address;
	public Address mailingAddress;
}