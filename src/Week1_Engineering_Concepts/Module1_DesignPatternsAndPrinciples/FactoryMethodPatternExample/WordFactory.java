package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Concrete Factory that creates WordDocument
public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument(); // Return WordDocument object
    }
}

