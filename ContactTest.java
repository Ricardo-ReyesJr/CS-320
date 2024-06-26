import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void testGetContactID() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "Address");
		if(contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}

	@Test
	void testGetFirstName() {
		Contact contact = new Contact("TestFirstName", "LastName", "PhoneNumber", "Address");
		if(contact.getFirstName().length() > 10) {
			fail("First name has too many characters.");
		}
	}

	@Test
	void testGetLastName() {
		Contact contact = new Contact("FirstName", "TestLastName", "PhoneNumber", "Address");
		if(contact.getLastName().length() > 10) {
			fail("Last Name has too many characters.");
		}
	}

	@Test
	void testGetNumber() {
		Contact contact = new Contact("FirstName", "LastName", "5555555555", "Address");
		if(contact.getNumber().length() != 10) {
			fail("Phone number does not equal to 10");
		}
	}

	@Test
	void testGetAddress() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "123456789TenElevenTwelveThirteenFourteenFifthteen");
		if(contact.getAddress().length() > 30) {
			fail("Address is too long, there is more than 30 characters.");
		}
	}

	@Test
	void testSetFirstName() {
		Contact contact = new Contact(null, "LastName", "PhoneNumber", "Address");
		assertNotNull(contact.getFirstName(), "First name is not null");
	}

	@Test
	void testSetLastName() {
		Contact contact = new Contact("FirstName", null, "PhoneNumber", "Address");
		assertNotNull(contact.getLastName(), "Last name is not null.");
	}

	@Test
	void testSetNumber() {
		Contact contact = new Contact("FirstName", "LastName", null, "Address");
		assertNotNull(contact.getNumber(), "Phone number is not null");
	}

	@Test
	void testSetAddress() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", null);
		assertNotNull(contact.getAddress(), "Address is not null");
	}

}
