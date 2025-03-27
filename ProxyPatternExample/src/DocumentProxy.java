public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String documentName;
    private User user;

    public DocumentProxy(String documentName, User user) {
        this.documentName = documentName;
        this.user = user;
    }

    @Override
    public void display() {
        if (user.isAdmin()) {
            if (realDocument == null) {
                realDocument = new RealDocument(documentName);
            }
            realDocument.display();
        } else {
            System.out.println("Access Denied: Only admin users can view this document.");
        }
    }
}
