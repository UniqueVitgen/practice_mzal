
package com.springapp.light.web;

import com.springapp.light.domain.AutomatedLine;
import com.springapp.light.service.AutomatedLineService;
import com.springapp.light.util.compare_automated_line.*;
import com.springapp.mvc.domain.message.Message;
import com.springapp.mvc.util.PrintInFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class ConlrollerCompareAutomatedLine extends PrintInFile{
  
final private String COMPARE_LIGHT = "compare-automated-line";

@Autowired  AutomatedLineService automatedLineService;
  
       
    @RequestMapping(value =  "/"+COMPARE_LIGHT+"", method = RequestMethod.GET)
    public String compareAutomatedLine(HttpSession session) {
        String ids = "";
       CompareCartAutomatedLine compareCartAutomatedLine = (CompareCartAutomatedLine) session.getAttribute("compareCartAutomatedLine");
       if (compareCartAutomatedLine==null)  {
           compareCartAutomatedLine = new CompareCartAutomatedLine();
       }  else {
           for(CompareCartItemAutomatedLine cc : compareCartAutomatedLine.getItems()){
             ids +=  cc.getProduct().getId()+",";
           }
       }
       if (ids.equals(""))  
        return "redirect:/"+COMPARE_LIGHT+"?ids="+null; 
       return "redirect:/"+COMPARE_LIGHT+"?ids="+ids; 
    }
    
    
    @RequestMapping(value =  "/"+COMPARE_LIGHT+"", method = RequestMethod.GET, params = "ids")
    public ModelAndView compareAutomatedLineWithID( @RequestParam(value = "ids", required = false) String ids,
                                            HttpSession session){
    
    ModelAndView mv = new ModelAndView("automated_line/automated_line_compare");
    List<AutomatedLine> listAutomatedLine=null;
    if(ids!=null && !ids.equals("") )  listAutomatedLine = automatedLineService.getListLighByIds(ids);

    Message mes=new Message(); mes.setMessage(listAutomatedLine.toString());
        
    mv.addObject("message", mes); // it is need for feed back !!!!!!
    mv.addObject("listAutomatedLine", listAutomatedLine);
    session.setAttribute("currentpagewithpage", COMPARE_LIGHT+"?ids="+ids);
    return mv;
    }
   
   
    
//        @RequestMapping(value =  "/compare/automatedLine/add" , method = RequestMethod.GET)
        @RequestMapping(value =  "/compare-automated-line-add" , method = RequestMethod.GET)
    public String addProductToCompareList( 
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "pagereturn") String pagereturn, 
            HttpSession session ) {
       
    CompareCartAutomatedLine compareCartAutomatedLine = (CompareCartAutomatedLine) session.getAttribute("compareCartAutomatedLine");
    if (compareCartAutomatedLine==null)  compareCartAutomatedLine = new CompareCartAutomatedLine();

 
    compareCartAutomatedLine.addItem(automatedLineService.getLightById(id));
    session.setAttribute("compareCartAutomatedLine", compareCartAutomatedLine);  

           
//    if (pagereturn == null)   pagereturn = "index";
//        
//    return "redirect:/"+pagereturn;  
       String currentpagewithpage =  (String)session.getAttribute("currentpagewithpage");              
           if (currentpagewithpage == null)   currentpagewithpage = "index";
      return "redirect:"+currentpagewithpage;   
    }

    

    
        @RequestMapping(value = "/compare-automated-line-del-{id}", method = RequestMethod.GET)
    public String delfromcompare(@PathVariable("id") Integer id, HttpSession session) {
   
    CompareCartAutomatedLine compareCartAutomatedLine = (CompareCartAutomatedLine) session.getAttribute("compareCartAutomatedLine");
    if (compareCartAutomatedLine==null)  compareCartAutomatedLine = new CompareCartAutomatedLine();
    AutomatedLine automatedLine =  new AutomatedLine();
    automatedLine.setId(id);

    compareCartAutomatedLine.update(automatedLine, "0"); // delete from compare
    session.setAttribute("compareCartAutomatedLine", compareCartAutomatedLine);

    return "redirect:/"+COMPARE_LIGHT+""; 
    }
  
    
    


    
}
