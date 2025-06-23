package Week1.FactoryMethod;
interface Document{
    void createDocument();
}

class WordDocument implements Document{
    public void createDocument(){
        System.out.println("Word Document created");
    }
}

class PDFDocument implements Document{
    public void createDocument(){
        System.out.println("PDF Document created");
    }
}

class ExcelDocument implements Document{
    public void createDocument(){
        System.out.println("Excel Document created");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PDFDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PDFDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document word = factory.createDocument();
        word.createDocument();

        factory = new PDFDocumentFactory();
        Document pdf = factory.createDocument();
        pdf.createDocument();

        factory = new ExcelDocumentFactory();
        Document excel = factory.createDocument();
        excel.createDocument();
    }
}
