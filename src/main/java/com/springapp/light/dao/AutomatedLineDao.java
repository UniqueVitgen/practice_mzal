package com.springapp.light.dao;

import com.springapp.light.domain.AutomatedLine;

import java.util.List;

public interface AutomatedLineDao {

    //    public Video getVideo(String url);
//    
    public List<AutomatedLine> getListAutomatedLine();
    public List<AutomatedLine> getListAutomatedLine(String emergency, String [] arrPowers, String size, String type);
    public AutomatedLine getLightByUrl(String url);
    public AutomatedLine getLightById(int id);
//    public List<Video> getListVideo(String section);
//    public List<Video> getList10RandomVideo();
//    public List<Video> getListVideoFromRequest(String key);
//    public Video getRandomVideo();
//    public Video getLastInARowVideo();

    public void saveAutomatedLine(AutomatedLine AutomatedLine);





//    public void  renewAutomatedLinePower();
//    public void  renewAutomatedLineSize();
//
//    public void  renewAutomatedLineType();
    public List<AutomatedLine> getListLighByIds(String [] ids);
    public List<AutomatedLine> getListLightFromSearch(String word);
}
