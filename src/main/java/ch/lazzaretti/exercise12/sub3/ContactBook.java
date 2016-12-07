package ch.lazzaretti.exercise12.sub3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ContactBook {
	private Map<String, Contact> contactBook = new HashMap<>();

	public static final String STORAGE_FILE = "./out/contactbook.data";

	public void load() throws ContactBookException {
		try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(STORAGE_FILE))) {
			contactBook = (Map<String, Contact>) stream.readObject();
		}catch (FileNotFoundException e){
			throw new ContactBookException("Pleas save the contactBook before loading");
		}catch (IOException e){
			throw new ContactBookException("Error with the file: "+e.toString());
		}catch (ClassNotFoundException e){
			throw new ContactBookException("Error file is not valid: "+e.toString());
		}
	}

	public void save() throws ContactBookException {
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(STORAGE_FILE))){
			stream.writeObject(contactBook);
		}catch (IOException e){
			throw new ContactBookException("Error with the file: "+e.toString());
		}
	}

	public void addContact(String name, String address) {
		if (contactBook.containsKey(name)) {
			throw new IllegalArgumentException("Name already exists");
		}
		contactBook.put(name, new Contact(name, address));
	}

	public void addNumber(String name, String number, String description) {
		if (!contactBook.containsKey(name)) {
			throw new IllegalArgumentException("Name does not exist");
		}
		Contact contact = contactBook.get(name);
		contact.addPhoneEntry(new PhoneEntry(number, description));
	}

	public Contact findContact(String name) {
		return contactBook.get(name);
	}
}