package com.springapp.light.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name="automated_line", schema = "", catalog = "light_test")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "AutomatedLine.findAll", query = "SELECT l FROM AutomatedLine l"),
        @NamedQuery(name = "AutomatedLine.findById", query = "SELECT l FROM AutomatedLine l WHERE l.id = :id"),
//        @NamedQuery(name = "AutomatedLine.findByProductId", query = "SELECT l FROM AutomatedLine l WHERE l.product_id = :id"),
//        @NamedQuery(name = "AutomatedLine.findByType_en", query = "SELECT l FROM AutomatedLine l WHERE l.type_en = :type_en"),
//        @NamedQuery(name = "AutomatedLine.findByTypeRu", query = "SELECT l FROM AutomatedLine l WHERE l.type_ru = :type_ru"),
//        @NamedQuery(name = "AutomatedLine.findByModelEn", query = "SELECT l FROM AutomatedLine l WHERE l.model_en = :model_en"),
//        @NamedQuery(name = "AutomatedLine.findByModelRu", query = "SELECT l FROM AutomatedLine l WHERE l.model_ru = :model_ru"),
//        @NamedQuery(name = "AutomatedLine.findByUrl", query = "SELECT l FROM AutomatedLine l WHERE l.url = :url"),
//        @NamedQuery(name = "AutomatedLine.findByManufacturerEn", query = "SELECT l FROM AutomatedLine l WHERE l.manufacturer_en = :manufacturer_en"),
//        @NamedQuery(name = "AutomatedLine.findByManufacturerRu", query = "SELECT l FROM AutomatedLine l WHERE l.manufacturer_ru = :manufacturer_ru"),
//        @NamedQuery(name = "AutomatedLine.findByCountryEn", query = "SELECT l FROM AutomatedLine l WHERE l.country_en = :country_en"),
//        @NamedQuery(name = "AutomatedLine.findByCountryRu", query = "SELECT l FROM AutomatedLine l WHERE l.country_ru = :country_ru"),
//        @NamedQuery(name = "AutomatedLine.findByCncEn", query = "SELECT l FROM AutomatedLine l WHERE l.cnc_en = :cnc_en"),
//        @NamedQuery(name = "AutomatedLine.findByCncRu", query = "SELECT l FROM AutomatedLine l WHERE l.cnc_ru = :cnc_ru"),
//        @NamedQuery(name = "AutomatedLine.findByCncFullEn", query = "SELECT l FROM AutomatedLine l WHERE l.cnc_full_en = :cnc_full_en"),
//        @NamedQuery(name = "AutomatedLine.findByCncFullRu", query = "SELECT l FROM AutomatedLine l WHERE l.cnc_full_ru = :cnc_full_ru"),
//        @NamedQuery(name = "AutomatedLine.findByMachineConditionEn", query = "SELECT l FROM AutomatedLine l WHERE l.machine_condition_en = :machine_condition_en"),
//        @NamedQuery(name = "AutomatedLine.findByMachineConditionRu", query = "SELECT l FROM AutomatedLine l WHERE l.machine_condition_ru = :machine_condition_ru"),
//        @NamedQuery(name = "AutomatedLine.findByMachineLocationEn", query = "SELECT l FROM AutomatedLine l WHERE l.machine_location_en = :machine_location_en"),
//        @NamedQuery(name = "AutomatedLine.findByMachineLocationRu", query = "SELECT l FROM AutomatedLine l WHERE l.machine_location_ru = :machine_location_ru"),
//        @NamedQuery(name = "AutomatedLine.findByYear", query = "SELECT l FROM AutomatedLine l WHERE l.year1 = :year1"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceEn", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_en = :workpiece_en"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceRu", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_ru = :workpiece_ru"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceWeight", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_weight = :workpiece_weight"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpiecePhoto1", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_photo1 = :workpiece_photo1"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpiecePhoto2", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_photo2 = :workpiece_photo2"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceDescriptionEn", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_description_en = :workpiece_description_en"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceDescriptionRu", query = "SELECT l FROM AutomatedLine l WHERE l.workpiece_description_ru = :workpiece_description_ru"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceLineWidth", query = "SELECT l FROM AutomatedLine l WHERE l.line_width = :line_width"),
//        @NamedQuery(name = "AutomatedLine.findByWorkpieceLineLength", query = "SELECT l FROM AutomatedLine l WHERE l.line_length = :line_length"),
//        @NamedQuery(name = "AutomatedLine.findByNumOfWorkingStaff", query = "SELECT l FROM AutomatedLine l WHERE l.num_of_working_staff = :num_of_working_staff"),
//        @NamedQuery(name = "AutomatedLine.findByProductivity", query = "SELECT l FROM AutomatedLine l WHERE l.productivity = :productivity"),
//        @NamedQuery(name = "AutomatedLine.findByPrice", query = "SELECT l FROM AutomatedLine l WHERE l.price = :price"),
//        @NamedQuery(name = "AutomatedLine.findByPhoto1", query = "SELECT l FROM AutomatedLine l WHERE l.photo1 = :photo1"),
//        @NamedQuery(name = "AutomatedLine.findByPhoto2", query = "SELECT l FROM AutomatedLine l WHERE l.photo2 = :photo2"),
//        @NamedQuery(name = "AutomatedLine.findByDescriptionEn", query = "SELECT l FROM AutomatedLine l WHERE l.description_en = :description_en"),
//        @NamedQuery(name = "AutomatedLine.findByDescriptionRu", query = "SELECT l FROM AutomatedLine l WHERE l.description_ru = :description_ru"),




//        @NamedQuery(name = "AutomatedLine.findByDiffuser", query = "SELECT l FROM AutomatedLine l WHERE l.diffuser = :diffuser"),
//        @NamedQuery(name = "AutomatedLine.findByPower", query = "SELECT l FROM AutomatedLine l WHERE l.power = :power"),
//        @NamedQuery(name = "AutomatedLine.findByLuminousFlux", query = "SELECT l FROM AutomatedLine l WHERE l.luminousFlux = :luminousFlux"),
//        @NamedQuery(name = "AutomatedLine.findByLuminousFluxEmergency", query = "SELECT l FROM AutomatedLine l WHERE l.luminousFluxEmergency = :luminousFluxEmergency"),
//        @NamedQuery(name = "AutomatedLine.findByTemperatureGlow", query = "SELECT l FROM AutomatedLine l WHERE l.temperatureGlow = :temperatureGlow"),
//        @NamedQuery(name = "AutomatedLine.findBySize", query = "SELECT l FROM AutomatedLine l WHERE l.size = :size"),
//        @NamedQuery(name = "AutomatedLine.findBySizeInstallation", query = "SELECT l FROM AutomatedLine l WHERE l.sizeInstallation = :sizeInstallation"),
//        @NamedQuery(name = "AutomatedLine.findByCoefficientPulsation", query = "SELECT l FROM AutomatedLine l WHERE l.coefficientPulsation = :coefficientPulsation"),
//        @NamedQuery(name = "AutomatedLine.findByCoefficientPower", query = "SELECT l FROM AutomatedLine l WHERE l.coefficientPower = :coefficientPower"),
//        @NamedQuery(name = "AutomatedLine.findByTypeLidc", query = "SELECT l FROM AutomatedLine l WHERE l.typeLidc = :typeLidc"),
//        @NamedQuery(name = "AutomatedLine.findByIndexColor", query = "SELECT l FROM AutomatedLine l WHERE l.indexColor = :indexColor"),
//        @NamedQuery(name = "AutomatedLine.findBySecurity", query = "SELECT l FROM AutomatedLine l WHERE l.security = :security"),
//        @NamedQuery(name = "AutomatedLine.findByWeight", query = "SELECT l FROM AutomatedLine l WHERE l.weight = :weight"),
//        @NamedQuery(name = "AutomatedLine.findByTemperatureWork", query = "SELECT l FROM AutomatedLine l WHERE l.temperatureWork = :temperatureWork"),
//        @NamedQuery(name = "AutomatedLine.findByGuarantee", query = "SELECT l FROM AutomatedLine l WHERE l.guarantee = :guarantee"),
//        @NamedQuery(name = "AutomatedLine.findByDimmingFunction", query = "SELECT l FROM AutomatedLine l WHERE l.dimmingFunction = :dimmingFunction"),
//        @NamedQuery(name = "AutomatedLine.findByMountingType", query = "SELECT l FROM AutomatedLine l WHERE l.mountingType = :mountingType"),
//        @NamedQuery(name = "AutomatedLine.findByPrice", query = "SELECT l FROM AutomatedLine l WHERE l.price = :price"),
//        @NamedQuery(name = "AutomatedLine.findByPhoto1", query = "SELECT l FROM AutomatedLine l WHERE l.photo1 = :photo1"),
//        @NamedQuery(name = "AutomatedLine.findByPhoto2", query = "SELECT l FROM AutomatedLine l WHERE l.photo2 = :photo2"),
//        @NamedQuery(name = "AutomatedLine.findByPhoto3", query = "SELECT l FROM AutomatedLine l WHERE l.photo3 = :photo3"),
//        @NamedQuery(name = "AutomatedLine.findByVideo1", query = "SELECT l FROM AutomatedLine l WHERE l.video1 = :video1")
})
public class AutomatedLine implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Size(max = 255)
    @Column(name = "id")
    private Integer id;

//    @Size(max = 255)
//    @Column(name = "product_id")
//    private String ProductId;

    @Basic(optional = false)
    @NotNull
//    @Size(min = 1, max = 245)
    @Column(name = "type_en")
    private String typeEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 245)
    @Column(name = "type_ru")
    private String typeRu;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "model_en")
    private String modelEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "model_ru")
    private String modelRu;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "url")
    private String url;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer_en")
    private String manufacturerEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "manufacturer_ru")
    private String manufacturerRu;

//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 255)
//    @Column(name = "country_en")
//    private String countryEn;
//
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 255)
//    @Column(name = "country_ru")
//    private String countryRu;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cnc_en")
    private String cncEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cnc_ru")
    private String cncRu;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cnc_full_en")
    private String cncFullEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cnc_full_ru")
    private String cncFullRu;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "machine_condition_en")
    private String machineConditionEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "machine_condition_ru")
    private String machineConditionRu;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "machine_location_en")
    private String machineLocationEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "machine_location_ru")
    private String machineLocationRu;

    @Basic(optional = false)
    @NotNull
    @Column(name = "year1")
    private int year;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "workpiece_en")
    private String workpieceEn;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "workpiece_ru")
    private String workpieceRu;

    @Basic(optional = false)
    @NotNull
    @Column(name = "workpiece_weight")
    private int workpieceWeight;
//    @Basic(optional = false)
//    @NotNull
//    @Column(name = "luminous_flux")
//    private int luminousFlux;

    @Basic(optional = false)
    @NotNull
    @Column(name = "dimensions")
    private String Dimensions;

    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private int weight;

    @Basic(optional = false)
    @Size(min = 1, max = 200)
    @Column(name = "workpiece_photo1")
    private String workpiecePhoto1;

    @Basic(optional = false)
    @Size(min = 1, max = 200)
    @Column(name = "workpiece_photo2")
    private String workpiecePhoto2;

    @Basic(optional = false)
    @Lob
    @Size(max = 65535)
    @Column(name = "workpiece_description_en")
    private String workpieceDescriptionEn;

    @Basic(optional = false)
    @Lob
    @Size(max = 65535)
    @Column(name = "workpiece_description_ru")
    private String workpieceDescriptionRu;

    @Basic(optional = false)
    @Column(name = "productivity")
    private int productivity;

    @Column(name = "price")
    private Integer price;
    @Size(max = 245)
    @Column(name = "photo1")
    private String photo1;
    @Size(max = 245)
    @Column(name = "photo2")
    private String photo2;
    @Size(max = 245)
    @Column(name = "photo3")
    private String photo3;
    @Lob
    @Size(max = 65535)
    @Column(name = "description_en")
    private String descriptionEn;
    @Lob
    @Size(max = 65535)
    @Column(name = "description_ru")
    private String descriptionRu;

    public AutomatedLine() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    public String getTypeRu() {
        return typeRu;
    }

    public void setTypeRu(String typeRu) {
        this.typeRu = typeRu;
    }

    public String getModelEn() {
        return modelEn;
    }

    public void setModelEn(String modelEn) {
        this.modelEn = modelEn;
    }

    public String getModelRu() {
        return modelRu;
    }

    public void setModelRu(String modelRu) {
        this.modelRu = modelRu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getManufacturerEn() {
        return manufacturerEn;
    }

    public void setManufacturerEn(String manufacturerEn) {
        this.manufacturerEn = manufacturerEn;
    }

    public String getManufacturerRu() {
        return manufacturerRu;
    }

    public void setManufacturerRu(String manufacturerRu) {
        this.manufacturerRu = manufacturerRu;
    }


    public String getCncEn() {
        return cncEn;
    }

    public void setCncEn(String cncEn) {
        this.cncEn = cncEn;
    }

    public String getCncRu() {
        return cncRu;
    }

    public void setCncRu(String cncRu) {
        this.cncRu = cncRu;
    }

    public String getCncFullEn() {
        return cncFullEn;
    }

    public void setCncFullEn(String cncFullEn) {
        this.cncFullEn = cncFullEn;
    }

    public String getCncFullRu() {
        return cncFullRu;
    }

    public void setCncFullRu(String cncFullRu) {
        this.cncFullRu = cncFullRu;
    }

    public String getMachineConditionEn() {
        return machineConditionEn;
    }

    public void setMachineConditionEn(String machineConditionEn) {
        this.machineConditionEn = machineConditionEn;
    }

    public String getMachineConditionRu() {
        return machineConditionRu;
    }

    public void setMachineConditionRu(String machineConditionRu) {
        this.machineConditionRu = machineConditionRu;
    }

    public String getMachineLocationEn() {
        return machineLocationEn;
    }

    public void setMachineLocationEn(String machineLocationEn) {
        this.machineLocationEn = machineLocationEn;
    }

    public String getMachineLocationRu() {
        return machineLocationRu;
    }

    public void setMachineLocationRu(String machineLocationRu) {
        this.machineLocationRu = machineLocationRu;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWorkpieceEn() {
        return workpieceEn;
    }

    public void setWorkpieceEn(String workpieceEn) {
        this.workpieceEn = workpieceEn;
    }

    public String getWorkpieceRu() {
        return workpieceRu;
    }

    public void setWorkpieceRu(String workpieceRu) {
        this.workpieceRu = workpieceRu;
    }

    public int getWorkpieceWeight() {
        return workpieceWeight;
    }

    public void setWorkpieceWeight(int workpieceWeight) {
        this.workpieceWeight = workpieceWeight;
    }

    public String getWorkpiecePhoto1() {
        return workpiecePhoto1;
    }

    public void setWorkpiecePhoto1(String workpiecePhoto1) {
        this.workpiecePhoto1 = workpiecePhoto1;
    }

    public String getWorkpiecePhoto2() {
        return workpiecePhoto2;
    }

    public void setWorkpiecePhoto2(String workpiecePhoto2) {
        this.workpiecePhoto2 = workpiecePhoto2;
    }

    public String getWorkpieceDescriptionEn() {
        return workpieceDescriptionEn;
    }

    public void setWorkpieceDescriptionEn(String workpieceDescriptionEn) {
        this.workpieceDescriptionEn = workpieceDescriptionEn;
    }

    public String getWorkpieceDescriptionRu() {
        return workpieceDescriptionRu;
    }

    public void setWorkpieceDescriptionRu(String workpieceDescriptionRu) {
        this.workpieceDescriptionRu = workpieceDescriptionRu;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public void setDimensions(String dimensions) {
        Dimensions = dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionRu() {
        return descriptionRu;
    }

    public void setDescriptionRu(String descriptionRu) {
        this.descriptionRu = descriptionRu;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
