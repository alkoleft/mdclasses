//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for ApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoBaseInstanceID" type="{http://v8.1c.ru/8.1/data/core}UUID"/&gt;
 *         &lt;element name="infoBaseAlias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locale" type="{http://v8.1c.ru/8.2/managed-application/core}LocaleInfo" minOccurs="0"/&gt;
 *         &lt;element name="langs" type="{http://v8.1c.ru/8.2/managed-application/core}LangSettings"/&gt;
 *         &lt;element name="config" type="{http://v8.1c.ru/8.1/data/core}UUID"/&gt;
 *         &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://v8.1c.ru/8.1/data/core}UUID"/&gt;
 *         &lt;element name="rolesID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="seance" type="{http://v8.1c.ru/8.1/data/core}UUID"/&gt;
 *         &lt;element name="seanceNo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="userRunMode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="configRunMode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="splash" type="{http://v8.1c.ru/8.2/managed-application/core}SplashInfo" minOccurs="0"/&gt;
 *         &lt;element name="fullLocale" type="{http://v8.1c.ru/8.2/managed-application/core}MngLocale" minOccurs="0"/&gt;
 *         &lt;element name="compatibilityMode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="compatibilityModeLive" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="userSeparatorsEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="training" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="modalityUseMode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="rigthClientsStart" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="syncCallsUseMode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="assemblyVersion" type="{http://v8.1c.ru/8.1/data/core}ObjectVersion"/&gt;
 *         &lt;element name="interactiveSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultPaperWidth" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="defaultPaperHeight" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="confNotSaved" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="noFontsOnServer" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="noFontConfigOnServer" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationInfo", namespace = "http://v8.1c.ru/8.2/managed-application/core", propOrder = {
    "infoBaseInstanceID",
    "infoBaseAlias",
    "locale",
    "langs",
    "config",
    "types",
    "user",
    "rolesID",
    "seance",
    "seanceNo",
    "userRunMode",
    "configRunMode",
    "splash",
    "fullLocale",
    "compatibilityMode",
    "compatibilityModeLive",
    "userSeparatorsEmpty",
    "training",
    "modalityUseMode",
    "rigthClientsStart",
    "syncCallsUseMode",
    "assemblyVersion",
    "interactiveSecurity",
    "defaultPaperWidth",
    "defaultPaperHeight"
})
public class ApplicationInfo {

    @XmlElement(required = true)
    protected String infoBaseInstanceID;
    @XmlElement(required = true)
    protected String infoBaseAlias;
    protected LocaleInfo locale;
    @XmlElement(required = true)
    protected LangSettings langs;
    @XmlElement(required = true)
    protected String config;
    @XmlElement(required = true)
    protected String types;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected BigDecimal rolesID;
    @XmlElement(required = true)
    protected String seance;
    @XmlElement(required = true)
    protected BigDecimal seanceNo;
    @XmlElement(required = true)
    protected BigDecimal userRunMode;
    @XmlElement(required = true)
    protected BigDecimal configRunMode;
    protected SplashInfo splash;
    protected MngLocale fullLocale;
    protected BigDecimal compatibilityMode;
    protected BigDecimal compatibilityModeLive;
    protected boolean userSeparatorsEmpty;
    protected boolean training;
    @XmlElement(required = true)
    protected BigDecimal modalityUseMode;
    @XmlElement(required = true)
    protected BigDecimal rigthClientsStart;
    @XmlElement(required = true)
    protected BigDecimal syncCallsUseMode;
    @XmlElement(required = true)
    protected String assemblyVersion;
    protected boolean interactiveSecurity;
    @XmlElement(required = true)
    protected BigDecimal defaultPaperWidth;
    @XmlElement(required = true)
    protected BigDecimal defaultPaperHeight;
    @XmlAttribute(name = "confNotSaved")
    protected Boolean confNotSaved;
    @XmlAttribute(name = "noFontsOnServer")
    protected Boolean noFontsOnServer;
    @XmlAttribute(name = "noFontConfigOnServer")
    protected Boolean noFontConfigOnServer;

    /**
     * Gets the value of the infoBaseInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBaseInstanceID() {
        return infoBaseInstanceID;
    }

    /**
     * Sets the value of the infoBaseInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBaseInstanceID(String value) {
        this.infoBaseInstanceID = value;
    }

    /**
     * Gets the value of the infoBaseAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoBaseAlias() {
        return infoBaseAlias;
    }

    /**
     * Sets the value of the infoBaseAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoBaseAlias(String value) {
        this.infoBaseAlias = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleInfo }
     *     
     */
    public LocaleInfo getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleInfo }
     *     
     */
    public void setLocale(LocaleInfo value) {
        this.locale = value;
    }

    /**
     * Gets the value of the langs property.
     * 
     * @return
     *     possible object is
     *     {@link LangSettings }
     *     
     */
    public LangSettings getLangs() {
        return langs;
    }

    /**
     * Sets the value of the langs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangSettings }
     *     
     */
    public void setLangs(LangSettings value) {
        this.langs = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfig(String value) {
        this.config = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypes(String value) {
        this.types = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the rolesID property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRolesID() {
        return rolesID;
    }

    /**
     * Sets the value of the rolesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRolesID(BigDecimal value) {
        this.rolesID = value;
    }

    /**
     * Gets the value of the seance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeance() {
        return seance;
    }

    /**
     * Sets the value of the seance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeance(String value) {
        this.seance = value;
    }

    /**
     * Gets the value of the seanceNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeanceNo() {
        return seanceNo;
    }

    /**
     * Sets the value of the seanceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeanceNo(BigDecimal value) {
        this.seanceNo = value;
    }

    /**
     * Gets the value of the userRunMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserRunMode() {
        return userRunMode;
    }

    /**
     * Sets the value of the userRunMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserRunMode(BigDecimal value) {
        this.userRunMode = value;
    }

    /**
     * Gets the value of the configRunMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfigRunMode() {
        return configRunMode;
    }

    /**
     * Sets the value of the configRunMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfigRunMode(BigDecimal value) {
        this.configRunMode = value;
    }

    /**
     * Gets the value of the splash property.
     * 
     * @return
     *     possible object is
     *     {@link SplashInfo }
     *     
     */
    public SplashInfo getSplash() {
        return splash;
    }

    /**
     * Sets the value of the splash property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplashInfo }
     *     
     */
    public void setSplash(SplashInfo value) {
        this.splash = value;
    }

    /**
     * Gets the value of the fullLocale property.
     * 
     * @return
     *     possible object is
     *     {@link MngLocale }
     *     
     */
    public MngLocale getFullLocale() {
        return fullLocale;
    }

    /**
     * Sets the value of the fullLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link MngLocale }
     *     
     */
    public void setFullLocale(MngLocale value) {
        this.fullLocale = value;
    }

    /**
     * Gets the value of the compatibilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompatibilityMode() {
        return compatibilityMode;
    }

    /**
     * Sets the value of the compatibilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompatibilityMode(BigDecimal value) {
        this.compatibilityMode = value;
    }

    /**
     * Gets the value of the compatibilityModeLive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompatibilityModeLive() {
        return compatibilityModeLive;
    }

    /**
     * Sets the value of the compatibilityModeLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompatibilityModeLive(BigDecimal value) {
        this.compatibilityModeLive = value;
    }

    /**
     * Gets the value of the userSeparatorsEmpty property.
     * 
     */
    public boolean isUserSeparatorsEmpty() {
        return userSeparatorsEmpty;
    }

    /**
     * Sets the value of the userSeparatorsEmpty property.
     * 
     */
    public void setUserSeparatorsEmpty(boolean value) {
        this.userSeparatorsEmpty = value;
    }

    /**
     * Gets the value of the training property.
     * 
     */
    public boolean isTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     */
    public void setTraining(boolean value) {
        this.training = value;
    }

    /**
     * Gets the value of the modalityUseMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModalityUseMode() {
        return modalityUseMode;
    }

    /**
     * Sets the value of the modalityUseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModalityUseMode(BigDecimal value) {
        this.modalityUseMode = value;
    }

    /**
     * Gets the value of the rigthClientsStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRigthClientsStart() {
        return rigthClientsStart;
    }

    /**
     * Sets the value of the rigthClientsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRigthClientsStart(BigDecimal value) {
        this.rigthClientsStart = value;
    }

    /**
     * Gets the value of the syncCallsUseMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSyncCallsUseMode() {
        return syncCallsUseMode;
    }

    /**
     * Sets the value of the syncCallsUseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSyncCallsUseMode(BigDecimal value) {
        this.syncCallsUseMode = value;
    }

    /**
     * Gets the value of the assemblyVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyVersion() {
        return assemblyVersion;
    }

    /**
     * Sets the value of the assemblyVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyVersion(String value) {
        this.assemblyVersion = value;
    }

    /**
     * Gets the value of the interactiveSecurity property.
     * 
     */
    public boolean isInteractiveSecurity() {
        return interactiveSecurity;
    }

    /**
     * Sets the value of the interactiveSecurity property.
     * 
     */
    public void setInteractiveSecurity(boolean value) {
        this.interactiveSecurity = value;
    }

    /**
     * Gets the value of the defaultPaperWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultPaperWidth() {
        return defaultPaperWidth;
    }

    /**
     * Sets the value of the defaultPaperWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultPaperWidth(BigDecimal value) {
        this.defaultPaperWidth = value;
    }

    /**
     * Gets the value of the defaultPaperHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultPaperHeight() {
        return defaultPaperHeight;
    }

    /**
     * Sets the value of the defaultPaperHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultPaperHeight(BigDecimal value) {
        this.defaultPaperHeight = value;
    }

    /**
     * Gets the value of the confNotSaved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfNotSaved() {
        return confNotSaved;
    }

    /**
     * Sets the value of the confNotSaved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfNotSaved(Boolean value) {
        this.confNotSaved = value;
    }

    /**
     * Gets the value of the noFontsOnServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFontsOnServer() {
        return noFontsOnServer;
    }

    /**
     * Sets the value of the noFontsOnServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFontsOnServer(Boolean value) {
        this.noFontsOnServer = value;
    }

    /**
     * Gets the value of the noFontConfigOnServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFontConfigOnServer() {
        return noFontConfigOnServer;
    }

    /**
     * Sets the value of the noFontConfigOnServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFontConfigOnServer(Boolean value) {
        this.noFontConfigOnServer = value;
    }

}