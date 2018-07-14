package com.springapp.light.service;

import com.springapp.light.domain.AutomatedLine;
import com.springapp.light.dao.AutomatedLineDao;
import com.springapp.light.util.ImageUtilLight;
import com.springapp.light.util.UploadMultipartFileUtilLight;
import com.springapp.light.util.exel.ParserExcelAutomatedLine;
import com.springapp.mvc.util.cart.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class AutomatedLineServiceImpl implements AutomatedLineService {


    @Autowired
    private AutomatedLineDao AutomatedLineDao;

    @Override @Transactional
    public void uploadAutomatedLine(String path, MultipartFile[] file) {
        for (int i = 0; i < file.length; i++) {
            try {
                File uploadFile = UploadMultipartFileUtilLight.uploadFile(path, file[i]);
                AutomatedLine AutomatedLine = ParserExcelAutomatedLine.readAutomatedLine(uploadFile);
                AutomatedLineDao.saveAutomatedLine(AutomatedLine);
                uploadFile.delete();
                System.out.println("Successfully uplgoaded machine: " + file[i].getOriginalFilename());
            } catch (IOException e) {
                System.out.println("Failed to upload machine file: " + e.getMessage());
            }
        }
    }

    @Override @Transactional
    public Product getProduct(Integer id) {
        AutomatedLine automatedLine = getLightById(id);
        Product product = automatedLine;
        return product;
    }

    @Override @Transactional
    public Product getProduct(AutomatedLine automatedLine) {
        Product p = automatedLine;
        return p;
    }


    public void setAutomatedLineDao(com.springapp.light.dao.AutomatedLineDao automatedLineDao) {
        AutomatedLineDao = automatedLineDao;
    }

    @Override @Transactional
    public List<AutomatedLine> getListAutomatedLine() {
        return  AutomatedLineDao.getListAutomatedLine();
    }

    @Override @Transactional
    public List<AutomatedLine> getListAutomatedLine(String emergency, String powers, String size, String type) {
        String[] arrPowers = (powers != null) ? powers.split(",") : null;
        return  AutomatedLineDao.getListAutomatedLine(emergency, arrPowers, size, type);
    }

    @Override @Transactional
    public AutomatedLine getLightByUrl(String url) {
        return  AutomatedLineDao.getLightByUrl(url);
    }

    @Transactional
    public String[] listImage(String path) {
        return ImageUtilLight.getListImage(path);
    }


    @Transactional
    public void uploadImagesLight(String path, MultipartFile[] images) {
        for (int i = 0; i < images.length; i++) {
            try {
                UploadMultipartFileUtilLight.uploadImage(path, images[i]);
                System.out.println("Successfully uploaded photo: " + images[i].getOriginalFilename());
            } catch (IOException e) {
                System.out.println("Failed to upload photo: " + e.getMessage());
            }
        }
    }


    @Override @Transactional
    public AutomatedLine getLightById(Integer id) {
        return  AutomatedLineDao.getLightById(id);
    }

    @Override @Transactional
    public void renewFiltersLight() {



//        AutomatedLineDao.renewAutomatedLinePower();
//        AutomatedLineDao.renewAutomatedLineSize();
//
//        AutomatedLineDao.renewAutomatedLineType();

    }


    @Override @Transactional
    public List<AutomatedLine> getListLighByIds(String ids) {
        String[] idsArr = (ids != null) ? ids.split(",") : null;
        return AutomatedLineDao.getListLighByIds(idsArr);
    }
    @Override @Transactional
    public List<AutomatedLine> getListLightFromSearch(String word) {
        return AutomatedLineDao.getListLightFromSearch( word);
    }


}
