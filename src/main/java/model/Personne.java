package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * 
 * <p>
 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Personne")
public class Personne {

	@XmlElement(name = "Nom", required = true)
	protected String nom;
	protected boolean gender;
	@XmlElement(name = "Prenom", required = true)
	protected String prenom;

	public Personne(String nom, boolean gender, String prenom) {
		super();
		this.nom = nom;
		this.gender = gender;
		this.prenom = prenom;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtient la valeur de la propri�t� nom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * D�finit la valeur de la propri�t� nom.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNom(String value) {
		this.nom = value;
	}

	/**
	 * Obtient la valeur de la propri�t� gender.
	 * 
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * D�finit la valeur de la propri�t� gender.
	 * 
	 */
	public void setGender(boolean value) {
		this.gender = value;
	}

	/**
	 * Obtient la valeur de la propri�t� prenom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * D�finit la valeur de la propri�t� prenom.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrenom(String value) {
		this.prenom = value;
	}

}
