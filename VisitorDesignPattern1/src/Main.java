public class Main {
    public static void main(String[] args)
    {
        PlainText dockPart1 = new PlainText();
        HyperLink dockPart2 = new HyperLink();
        BoldText dockPart3 = new BoldText();

        dockPart1.text = "Tasarım kalıpları bir tecrübenin ürünü olarak ortaya çıkmıştır";
        dockPart2.text = "Kitap linki";
        dockPart3.text = "Java ile tasarım kalıpları";

        IVisitor htmlVisitor = new HTMLVisitor();
        dockPart1.accept(htmlVisitor);
        dockPart2.accept(htmlVisitor);
        dockPart3.accept(htmlVisitor);

        System.out.println("Çıktınız:" + htmlVisitor.output);
    }
}