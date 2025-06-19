package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Concrete Factory that creates PdfDocument
public class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument(); // Return PdfDocument object
    }
}

