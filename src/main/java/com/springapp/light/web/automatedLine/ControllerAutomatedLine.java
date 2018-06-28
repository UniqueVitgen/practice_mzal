package com.springapp.light.web.automatedLine;

import com.springapp.light.domain.AutomatedLine;
import com.springapp.light.service.AutomatedLineService;
import com.springapp.light.util.pdf.AutomatedLinePdf;
import com.springapp.mvc.domain.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

@Controller
public class ControllerAutomatedLine {

    @Autowired
    private AutomatedLineService AutomatedLineService;


    @RequestMapping(value = "/automated_line", method = RequestMethod.GET)
    public ModelAndView light_all(@RequestParam(value = "emergency", required = false) String emergency,
                                  @RequestParam(value = "powers", required = false) String powers,
                                  @RequestParam(value = "size", required = false) String size,
                                  @RequestParam(value = "type", required = false) String type,
                                  HttpSession session ) {

        ModelAndView mv = new ModelAndView("automated_line/automated_line_all");

        List<AutomatedLine> list, list2, list3;
        list2 = AutomatedLineService.getListLightFromSearch("KM");
        list3 = AutomatedLineService.getListLightFromSearch("KM3");
        if(emergency == null && powers==null && size ==null && type ==null) {
            list = AutomatedLineService.getListAutomatedLine();
            mv.addObject("listAutomatedLine", list);
        }else{
            list = AutomatedLineService.getListAutomatedLine(emergency, powers, size, type);
            mv.addObject("listAutomatedLine", list);
        }


        if(type != null) {
//            switch (type) {
//                case "office":
//                case "Office":
//                    mv.addObject("listLightPower", AutomatedLineService.getListAutomatedLinePower()); //  for  filter
//                    mv.addObject("listLightSize", AutomatedLineService.getListAutomatedLineSize()); //   for   filter
//                    break;
//
//
//                default:
//                    break;
//            }

        }

//        mv.addObject("listLightType", AutomatedLineService.getListAutomatedLineType()); //  for   filter

        mv.addObject("emergency", emergency); // it is need for feed back !!!!!!
        mv.addObject("powers", powers); // it is need for feed back !!!!!!
        mv.addObject("size", size); // it is need for feed back !!!!!!
        mv.addObject("type", type); // it is need for feed back !!!!!!


        mv.addObject("message", new Message()); // it is need for feed back !!!!!!
        session.setAttribute("search", "automated_line" ); // for search


        String str = "" ;
        if (emergency!=null) str += "&emergency="+emergency;
        if (powers!=null) str += "&powers="+powers;
        if (size!=null && !size.equals("")) str += "&size="+size;
        if (type!=null && !type.equals("")) str += "&type="+type;
        session.setAttribute("currentpagewithpage", "/automated_line?"+str);

        return mv;
    }



    @RequestMapping(value = "/automated_line-{url}", method = RequestMethod.GET)
    public ModelAndView light_all(@PathVariable("url") String url, HttpSession session) {

        ModelAndView mv = new ModelAndView("automated_line/automated_line_one");
        AutomatedLine AutomatedLine = AutomatedLineService.getLightByUrl(url);
        mv.addObject("automatedLine", AutomatedLine);

        mv.addObject("message", new Message("automated line " +AutomatedLine.getTypeEn() , AutomatedLine.getModelEn())); // it is need for feed back !!!!!!
        session.setAttribute("search", "automated_light"); // for search
        session.setAttribute("currentpagewithpage", "/automated_line-" + url);
        return mv;
    }



    @RequestMapping(value =  "/automated_line/pdf/{url}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getPdfSingle(HttpServletRequest request, @PathVariable ("url") String url )throws Exception {
//    public ResponseEntity<byte[]> getPdfSingle(@RequestParam("productId") String productId,
//                                               @RequestParam(value = "company", required = false) String company,
//                                               @RequestParam(value = "director", required = false) String director,
//                                               @RequestParam("showPrice") String showPrice,
//                                               HttpServletRequest request) throws Exception {

        String path = request.getServletContext().getRealPath("") + "/resources";
//        return getPDFOfferSingle(path, productId, company, "director", Boolean.getBoolean("true"));
        return getPDFOfferSingle(path, url, "company", "director", Boolean.getBoolean("true"));
    }




    public ResponseEntity<byte[]> getPDFOfferSingle(String path, String url, String company, String director, boolean showPrice) throws Exception {
//        Hmc machine = hmcDAO.getMachine(productId);
        AutomatedLine light = AutomatedLineService.getLightByUrl(url);
        String pathPdf = AutomatedLinePdf.createPdfLight(path, light, company, director, showPrice);

        File file = new File(pathPdf);
        byte[] contents = new byte[(int) file.length()];
        new FileInputStream(file).read(contents);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        String filename = "Light-" + light.getModelEn() + ".pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
    }
}
