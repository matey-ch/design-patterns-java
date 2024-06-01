public class Client {
    public static void main(String[] args) {

        FileHandler mainFileHandler = new MainFileHandler();
        FileHandler txtHandler = new TxtHandler();
        FileHandler jpgHandler = new JpgHandler();
        FileHandler pngHandler = new PngHandler();
        FileHandler docHandler = new DocHandler();
        FileHandler docxHandler = new DocxHandler();
        FileHandler xlsHandler = new XlsHandler();
        FileHandler xlsxHandler = new XlsxHandler();
        FileHandler pptxHandler = new PptxHandler();
        FileHandler finalHandler = new FinalHandler();

        mainFileHandler.setNext(txtHandler);
        txtHandler.setNext(jpgHandler);
        jpgHandler.setNext(pngHandler);
        pngHandler.setNext(docxHandler);
        docxHandler.setNext(docHandler);
        docHandler.setNext(xlsxHandler);
        xlsxHandler.setNext(xlsHandler);
        xlsHandler.setNext(pptxHandler);
        pptxHandler.setNext(finalHandler);

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
                "yaml-doc.yaml"
        };

        for (String file : files) {
            mainFileHandler.handle(file);
        }


    }
}
