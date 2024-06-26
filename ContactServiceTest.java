import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Crowley", "5555555555", "757 Media Drive");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "Contact was not added.");
	}

	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Crowley", "5555555555", "757 Media Drive");
		service.deleteContact("17");
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
		
	}

	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Crowley", "55555555555", "757 Media Drive");
		service.updateFirstName("John", "9");
		service.displayContactList();
		assertEquals("John", service.getContact("9").getFirstName(), "First name was not updated.");
	}

	@Test
	void testUpdateLastName() {
		ContactService service =  new ContactService();
		service.addContact("Mr.", "Crowley", "5555555555", "757 Media Drive");
		service.updateLastName("Joseph", "11");
		service.displayContactList();
		assertEquals("Joseph", service.getContact("11").getLastName(), "Last name was not updated.");
	}

	@Test
	void testUpdateNumber() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Crowley", "5555555555", "757 Media Drive");
		service.updateNumber("5555511111", "17");
		assertEquals("5555511111", service.getContact("17").getNumber(), "Phone Number was not updated.");
	}

	@Test
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Mr.", "Crowley", "5555555555", "757 Media Drive");
		service.updateAddress("313 Mexico Way", "15");
		service.displayContactList();		
	}

}
