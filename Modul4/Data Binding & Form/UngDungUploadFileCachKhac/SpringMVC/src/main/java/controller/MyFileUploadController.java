package controller;

import form.MyUploadForm;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

@Controller

public class MyFileUploadController {

    @GetMapping(value = "/upload")
    public String uploadOneFileHandler(Model model) {
        return "uploadOneFile";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    String uploadFileHandler(Model model,@RequestParam MultipartFile fileUpdate){
        try{
            byte[] bytes=fileUpdate.getBytes();
            String folder="E:\\Modul4\\Data Binding & Form\\UngDungUploadFileCachKhac\\SpringMVC\\src\\main\\webapp\\WEB-INF\\uploads\\";
            File dir=new File(folder);
            if (!dir.exists()){
                dir.mkdirs();
            }
            String fileSource= dir.getAbsolutePath()+File.separator+fileUpdate.getOriginalFilename();
            File serverFile=new File(fileSource);
            BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(serverFile));
            stream.write(bytes);
            stream.close();
            String img="./uploads/"+fileUpdate.getOriginalFilename();
            model.addAttribute("Link",img);
        }catch (Exception e){
            System.out.println(e);
            model.addAttribute("err","error");
        }
        return "_menu";
    }
}