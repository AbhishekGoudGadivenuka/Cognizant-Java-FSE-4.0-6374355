package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Concrete Product: WordDocument implements Document
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}

