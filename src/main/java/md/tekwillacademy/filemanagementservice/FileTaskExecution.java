package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {

    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/tekwillacademy/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(fileObject);
        System.out.println(FileManager.createTheFileIfItDoesNotExists(fileObject));
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsDirectoryOrAFile(fileObject);


        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(),"Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(fileObject.getPath(),"Altceva");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject,"Value Free");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject,"Value Free 2");


        InputFileReaderManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReaderManager.printDataFromAFileUsingBufferedReader(fileObject);
        InputFileReaderManager.printDataUsingTheEasiestWay(fileObject);

    }
}
