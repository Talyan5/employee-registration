/**
 * File Name: PersonTest.java<br>
 * Starisnkiy, Anatoliy<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 18, 2016
 */

package com.as;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Starinskiy, Anatoliy
 * @version 1.0.0
 * @since 1.0
 */
public class PersonTest {

	@Test
	public void testPersonCreation() {
		// Create Person object and store inside "person" named variable
		Person person = new Person();
		// Dispalay person content by call the toString method on the object
		System.out.println(person);

	}
}

