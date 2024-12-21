import java.util.*;

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber;
    }
}

public class ContactManagement {
    private static List<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Search Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added.");
    }

    private static void removeContact() {
        System.out.print("Enter name to remove: ");
        String name = scanner.nextLine();
        Contact contactToRemove = null;

        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(name)) {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact removed.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(name)) {
                System.out.println(contact);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}
