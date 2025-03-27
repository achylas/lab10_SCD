public class RealDocument implements Document {
    private String documentName;

    public RealDocument(String documentName) {
        this.documentName = documentName;
        loadDocument();
    }

    private void loadDocument() {
        System.out.println("Loading document: " + documentName);
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + documentName);
    }
}
