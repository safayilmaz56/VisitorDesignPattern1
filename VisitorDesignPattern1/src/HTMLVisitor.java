public class HTMLVisitor extends IVisitor{
    @Override
    public void visit(PlainText docPart) {
        super.output += "<p>" + docPart.text + "</p>";
    }

    @Override
    public void visit(HyperLink docPart) {
        super.output += "<b>" + docPart.text + "</b>";
    }

    @Override
    public void visit(BoldText docPart) {
        super.output += "<a href =/ " + docPart.text + "</a>";
    }
}
