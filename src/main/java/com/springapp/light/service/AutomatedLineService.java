package com.springapp.light.service;

import com.springapp.light.domain.AutomatedLine;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AutomatedLineService {
    public AutomatedLine getLightByUrl(String url);
    public AutomatedLine getLightById(String id);

    public List<AutomatedLine> getListLighByIds(String ids);
    public  List<AutomatedLine> getListLightFromSearch(String word);
    //    public List<Wesold> getListWesold();
    public List<AutomatedLine> getListAutomatedLine();
    public List<AutomatedLine> getListAutomatedLine(String emergency, String powers, String size, String type);
    public void uploadAutomatedLine(String path, MultipartFile[] file);


    public void renewFiltersLight();
}
