public class Main {
    public static void main(String[] args) {
        // Creating users
        User adminUser = new User("AdminUser", true);
        User regularUser = new User("RegularUser", false);

        // Creating document proxies for both users
        Document adminDocument = new DocumentProxy("SecretFile.pdf", adminUser);
        Document userDocument = new DocumentProxy("SecretFile.pdf", regularUser);

        // Trying to access the document
        System.out.println("\nAdmin User trying to access:");
        adminDocument.display();

        System.out.println("\nRegular User trying to access:");
        userDocument.display();
    }
}
