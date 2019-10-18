//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for EnumProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="UseStandardCommands" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StandardAttributes" type="{http://v8.1c.ru/8.3/xcf/readable}StandardAttributeDescriptions"/&gt;
 *         &lt;element name="Characteristics" type="{http://v8.1c.ru/8.3/xcf/readable}CharacteristicsDescriptions"/&gt;
 *         &lt;element name="QuickChoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ChoiceMode" type="{http://v8.1c.ru/8.3/xcf/enums}ChoiceMode"/&gt;
 *         &lt;element name="DefaultListForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultChoiceForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryListForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryChoiceForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="ManagerModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="ListPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ExtendedListPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Explanation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ChoiceHistoryOnInput" type="{http://v8.1c.ru/8.2/managed-application/logform}ChoiceHistoryOnInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "useStandardCommands",
    "standardAttributes",
    "characteristics",
    "quickChoice",
    "choiceMode",
    "defaultListForm",
    "defaultChoiceForm",
    "auxiliaryListForm",
    "auxiliaryChoiceForm",
    "managerModule",
    "listPresentation",
    "extendedListPresentation",
    "explanation",
    "choiceHistoryOnInput"
})
public class EnumProperties {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Synonym", required = true)
    protected LocalStringType synonym;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "ObjectBelonging", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "UseStandardCommands")
    protected boolean useStandardCommands;
    @XmlElement(name = "StandardAttributes", required = true)
    protected StandardAttributeDescriptions standardAttributes;
    @XmlElement(name = "Characteristics", required = true)
    protected CharacteristicsDescriptions characteristics;
    @XmlElement(name = "QuickChoice")
    protected boolean quickChoice;
    @XmlElement(name = "ChoiceMode", required = true)
    @XmlSchemaType(name = "string")
    protected ChoiceMode choiceMode;
    @XmlElement(name = "DefaultListForm", required = true)
    protected String defaultListForm;
    @XmlElement(name = "DefaultChoiceForm", required = true)
    protected String defaultChoiceForm;
    @XmlElement(name = "AuxiliaryListForm", required = true)
    protected String auxiliaryListForm;
    @XmlElement(name = "AuxiliaryChoiceForm", required = true)
    protected String auxiliaryChoiceForm;
    @XmlElement(name = "ManagerModule", required = true)
    protected String managerModule;
    @XmlElement(name = "ListPresentation", required = true)
    protected LocalStringType listPresentation;
    @XmlElement(name = "ExtendedListPresentation", required = true)
    protected LocalStringType extendedListPresentation;
    @XmlElement(name = "Explanation", required = true)
    protected LocalStringType explanation;
    @XmlElement(name = "ChoiceHistoryOnInput", required = true)
    @XmlSchemaType(name = "string")
    protected ChoiceHistoryOnInput choiceHistoryOnInput;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the synonym property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getSynonym() {
        return synonym;
    }

    /**
     * Sets the value of the synonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setSynonym(LocalStringType value) {
        this.synonym = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the objectBelonging property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectBelonging }
     *     
     */
    public ObjectBelonging getObjectBelonging() {
        return objectBelonging;
    }

    /**
     * Sets the value of the objectBelonging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectBelonging }
     *     
     */
    public void setObjectBelonging(ObjectBelonging value) {
        this.objectBelonging = value;
    }

    /**
     * Gets the value of the useStandardCommands property.
     * 
     */
    public boolean isUseStandardCommands() {
        return useStandardCommands;
    }

    /**
     * Sets the value of the useStandardCommands property.
     * 
     */
    public void setUseStandardCommands(boolean value) {
        this.useStandardCommands = value;
    }

    /**
     * Gets the value of the standardAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StandardAttributeDescriptions }
     *     
     */
    public StandardAttributeDescriptions getStandardAttributes() {
        return standardAttributes;
    }

    /**
     * Sets the value of the standardAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardAttributeDescriptions }
     *     
     */
    public void setStandardAttributes(StandardAttributeDescriptions value) {
        this.standardAttributes = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsDescriptions }
     *     
     */
    public CharacteristicsDescriptions getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsDescriptions }
     *     
     */
    public void setCharacteristics(CharacteristicsDescriptions value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the quickChoice property.
     * 
     */
    public boolean isQuickChoice() {
        return quickChoice;
    }

    /**
     * Sets the value of the quickChoice property.
     * 
     */
    public void setQuickChoice(boolean value) {
        this.quickChoice = value;
    }

    /**
     * Gets the value of the choiceMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceMode }
     *     
     */
    public ChoiceMode getChoiceMode() {
        return choiceMode;
    }

    /**
     * Sets the value of the choiceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceMode }
     *     
     */
    public void setChoiceMode(ChoiceMode value) {
        this.choiceMode = value;
    }

    /**
     * Gets the value of the defaultListForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultListForm() {
        return defaultListForm;
    }

    /**
     * Sets the value of the defaultListForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultListForm(String value) {
        this.defaultListForm = value;
    }

    /**
     * Gets the value of the defaultChoiceForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultChoiceForm() {
        return defaultChoiceForm;
    }

    /**
     * Sets the value of the defaultChoiceForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultChoiceForm(String value) {
        this.defaultChoiceForm = value;
    }

    /**
     * Gets the value of the auxiliaryListForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryListForm() {
        return auxiliaryListForm;
    }

    /**
     * Sets the value of the auxiliaryListForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryListForm(String value) {
        this.auxiliaryListForm = value;
    }

    /**
     * Gets the value of the auxiliaryChoiceForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryChoiceForm() {
        return auxiliaryChoiceForm;
    }

    /**
     * Sets the value of the auxiliaryChoiceForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryChoiceForm(String value) {
        this.auxiliaryChoiceForm = value;
    }

    /**
     * Gets the value of the managerModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerModule() {
        return managerModule;
    }

    /**
     * Sets the value of the managerModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerModule(String value) {
        this.managerModule = value;
    }

    /**
     * Gets the value of the listPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getListPresentation() {
        return listPresentation;
    }

    /**
     * Sets the value of the listPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setListPresentation(LocalStringType value) {
        this.listPresentation = value;
    }

    /**
     * Gets the value of the extendedListPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedListPresentation() {
        return extendedListPresentation;
    }

    /**
     * Sets the value of the extendedListPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedListPresentation(LocalStringType value) {
        this.extendedListPresentation = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExplanation(LocalStringType value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the choiceHistoryOnInput property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceHistoryOnInput }
     *     
     */
    public ChoiceHistoryOnInput getChoiceHistoryOnInput() {
        return choiceHistoryOnInput;
    }

    /**
     * Sets the value of the choiceHistoryOnInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceHistoryOnInput }
     *     
     */
    public void setChoiceHistoryOnInput(ChoiceHistoryOnInput value) {
        this.choiceHistoryOnInput = value;
    }

}