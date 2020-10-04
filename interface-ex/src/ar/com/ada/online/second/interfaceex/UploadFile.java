package ar.com.ada.online.second.interfaceex;

public interface UploadFile {

    //Atributos:
    String IMGBUCKET = "IMG_DRIVE";
    String PDFBUCKET = "PDF_DRIVE";

    void uploadFile(String fileName);  //No es necesario escribir ni public ni abstract, la interface por defecto lo hace

}
