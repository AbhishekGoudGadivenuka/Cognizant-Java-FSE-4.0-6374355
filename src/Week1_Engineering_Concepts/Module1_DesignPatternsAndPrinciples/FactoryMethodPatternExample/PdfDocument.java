package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Concrete Product: PdfDocument implements Document
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

