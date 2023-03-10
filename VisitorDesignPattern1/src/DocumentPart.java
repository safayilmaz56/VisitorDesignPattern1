public abstract class DocumentPart {
    public String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract void accept(IVisitor visitor);
}
