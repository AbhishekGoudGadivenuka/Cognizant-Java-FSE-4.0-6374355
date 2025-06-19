package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Concrete Product: ExcelDocument implements Document
public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}

