import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contactsList = new ArrayList<>();
        Menu menu = new Menu();

        while (true) {
            int choice = menu.showMenu();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Contact Name    :    ");
                    String name = scanner.next();
                    System.out.print("Enter the Contact Number   :    ");
                    long number = scanner.nextInt();
                    contactsList.add(new Contact(contactsList.size() + 1, name, number));
                    System.out.println("Contact Added Successfully  ---->"+ name + " - " + number);
                    break;
                case 2:
                    if (contactsList.size() > 0) {
                        contactsList.forEach(contact -> {
                            System.out.println("     "+contact.getId() + " " + contact.getName() + " " + contact.getNumber());
                        });
                    } else {
                        System.out.println("No Such Contact Availabel");
                    }
                    break;
                case 3:
                    System.out.print("Enter Contact Name To Delete    :   ");
                    String nameToDelete = scanner.next();

                    boolean isExit =false;
                    for (Contact contact : contactsList) {
                        if (contact.getName().equals(nameToDelete)) {
                            contactsList.remove(nameToDelete);
                            isExit = true;
                        }
                    }
                    if (isExit){
                        System.out.println("Contact Deleted Successfully");
                    } else {
                        System.out.println("Contact Not Found");
                    }

                    break;
                case 4:
                    System.out.println("            *** Thanks For Spending Your Valuable Time ***");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Input");
            }

        }
    }
}
