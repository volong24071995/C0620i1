package form;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

public class MyUploadForm {
    private String description;

    // Upload files.
    private MultipartFile fileUpdate;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getFileUpdate() {
        return fileUpdate;
    }
    public String image;

    public void setFileUpdate(MultipartFile fileUpdate) {
        this.fileUpdate = fileUpdate;
    }

    public boolean upLoadFile(){
        try {
//            String fileNameAndPath ="E:\\Modul4\\Data Binding & Form\\UngdungUploadFile\\SpringMVC\\src\\main\\webapp\\WEB-INF\\uploads\\";
            String fileImg = "E:\\Modul4\\Data Binding & Form\\UngdungUploadFile\\SpringMVC\\target\\SpringMVC\\WEB-INF\\uploads\\";

            image = "http://localhost:8080/uploads/"+fileUpdate.getOriginalFilename();
//            fileUpdate.transferTo(new File(fileNameAndPath + fileUpdate.getOriginalFilename()));
            fileUpdate.transferTo(new File(fileImg + fileUpdate.getOriginalFilename()));

            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}