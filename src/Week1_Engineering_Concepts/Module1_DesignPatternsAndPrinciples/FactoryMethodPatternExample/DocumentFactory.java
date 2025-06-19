package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Abstract Factory that declares the factory method
public abstract class DocumentFactory {
    // Factory method to be implemented by subclasses
    public abstract Document createDocument();
}
