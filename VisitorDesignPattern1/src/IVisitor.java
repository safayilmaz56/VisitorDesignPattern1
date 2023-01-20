public abstract class IVisitor {
    private String _output = "";
    public String output;

    public String get_output() {
        return _output;
    }

    public void set_output(String _output) {
        this._output = _output;
    }

    public abstract void visit(PlainText docPart);
    public abstract void visit(HyperLink docPart);
    public abstract void visit(BoldText docPart);
}
