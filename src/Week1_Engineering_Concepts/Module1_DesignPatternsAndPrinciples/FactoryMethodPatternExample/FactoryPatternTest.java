package Week1_Engineering_Concepts.Module1_DesignPatternsAndPrinciples.FactoryMethodPatternExample;

// Client class that tests the Factory Method Pattern
public class FactoryPatternTest {
    public static void main(String[] args) {
        // Uses WordFactory to create a WordDocument
        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open(); //  print: Opening a Word document.

        // Use PdfFactory to create a PdfDocument
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open(); //  print: Opening a PDF document.

        // Use ExcelFactory to create an ExcelDocument
        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open(); //  print: Opening an Excel document.
    }
}
