public class HyperLink extends DocumentPart{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
