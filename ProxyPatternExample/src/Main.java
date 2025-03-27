public class Main {
    public static void main(String[] args) {
        // Creating users
        User adminUser = new User("Admin User", true);
        User regularUser = new User("Regular User", false);

        // Creating document proxies for both users
        Document adminDocument = new DocumentProxy("SecretFile.pdf", adminUser);
        Document userDocument = new DocumentProxy("SecretFile.pdf", regularUser);

        // Trying to access the document
        System.out.println("\nAdmin User is trying to access:");
        adminDocument.display();

        System.out.println("\nRegular User is trying to access:");
        userDocument.display();
    }
}
