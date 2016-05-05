package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifiant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Priorite" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifiant",
    "description",
    "priorite"
})
@XmlRootElement(name = "ExigenceFonctionnelle")
public class ExigenceFonctionnelle {

    @XmlElement(name = "Identifiant", required = true)
    protected String identifiant;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Priorite", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected int priorite;

    public ExigenceFonctionnelle(String identifiant, String description, int priorite) {
		super();
		this.identifiant = identifiant;
		this.description = description;
		this.priorite = priorite;
	}
    

	public ExigenceFonctionnelle() {
		super();
	}


	/**
     * Obtient la valeur de la propri�t� identifiant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * D�finit la valeur de la propri�t� identifiant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiant(String value) {
        this.identifiant = value;
    }

    /**
     * Obtient la valeur de la propri�t� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * D�finit la valeur de la propri�t� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propri�t� priorite.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getPriorite() {
        return priorite;
    }

    /**
     * D�finit la valeur de la propri�t� priorite.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setPriorite(int value) {
        this.priorite = value;
    }

}
