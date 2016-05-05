package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Client">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CodePostal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Equipe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://univ.fr/stb}Personne" maxOccurs="7" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fonctionnalite" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{http://univ.fr/stb}ExigenceFonctionnelle" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Priorite" type="{http://univ.fr/stb}Prio" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "titre", "version", "date", "description", "client", "equipe", "fonctionnalite",
		"commentaire" })
@XmlRootElement(name = "STB")
public class STB {

	@XmlElement(name = "Id", required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected int id;
	@XmlElement(name = "Titre", required = true)
	protected String titre;
	@XmlElement(name = "Version", required = true)
	protected String version;
	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar date;
	@XmlElement(name = "Description", required = true)
	protected String description;
	@XmlElement(name = "Client", required = true)
	protected STB.Client client;
	@XmlElement(name = "Equipe", required = true)
	protected STB.Equipe equipe;
	@XmlElement(name = "Fonctionnalite", required = true)
	protected List<STB.Fonctionnalite> fonctionnalite;
	@XmlElement(name = "Commentaire")
	protected String commentaire;

	public STB(int id, String titre, String version, XMLGregorianCalendar date, String description, Client client,
			Equipe equipe, List<Fonctionnalite> fonctionnalite, String commentaire) {
		super();
		this.id = id;
		this.titre = titre;
		this.version = version;
		this.date = date;
		this.description = description;
		this.client = client;
		this.equipe = equipe;
		this.fonctionnalite = fonctionnalite;
		this.commentaire = commentaire;
	}

	public STB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtient la valeur de la propriété id.
	 * 
	 * @return possible object is {@link int }
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Définit la valeur de la propriété id.
	 * 
	 * @param value
	 *            allowed object is {@link int }
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Obtient la valeur de la propriété titre.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Définit la valeur de la propriété titre.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitre(String value) {
		this.titre = value;
	}

	/**
	 * Obtient la valeur de la propriété version.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Définit la valeur de la propriété version.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Obtient la valeur de la propriété date.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * Définit la valeur de la propriété date.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate(XMLGregorianCalendar value) {
		this.date = value;
	}

	/**
	 * Obtient la valeur de la propriété description.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Définit la valeur de la propriété description.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Obtient la valeur de la propriété client.
	 * 
	 * @return possible object is {@link STB.Client }
	 * 
	 */
	public STB.Client getClient() {
		return client;
	}

	/**
	 * Définit la valeur de la propriété client.
	 * 
	 * @param value
	 *            allowed object is {@link STB.Client }
	 * 
	 */
	public void setClient(STB.Client value) {
		this.client = value;
	}

	/**
	 * Obtient la valeur de la propriété equipe.
	 * 
	 * @return possible object is {@link STB.Equipe }
	 * 
	 */
	public STB.Equipe getEquipe() {
		return equipe;
	}

	/**
	 * Définit la valeur de la propriété equipe.
	 * 
	 * @param value
	 *            allowed object is {@link STB.Equipe }
	 * 
	 */
	public void setEquipe(STB.Equipe value) {
		this.equipe = value;
	}

	/**
	 * Gets the value of the fonctionnalite property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the fonctionnalite property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFonctionnalite().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link STB.Fonctionnalite }
	 * 
	 * 
	 */
	public List<STB.Fonctionnalite> getFonctionnalite() {
		if (fonctionnalite == null) {
			fonctionnalite = new ArrayList<STB.Fonctionnalite>();
		}
		return this.fonctionnalite;
	}

	/**
	 * Obtient la valeur de la propriété commentaire.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * Définit la valeur de la propriété commentaire.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCommentaire(String value) {
		this.commentaire = value;
	}

	/**
	 * <p>
	 * Classe Java pour anonymous complex type.
	 * 
	 * <p>
	 * Le fragment de schéma suivant indique le contenu attendu figurant dans
	 * cette classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Entite" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="CodePostal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "entite", "contact", "codePostal" })
	public static class Client {

		@XmlElement(name = "Entite", required = true)
		protected String entite;
		@XmlElement(name = "Contact", required = true)
		protected String contact;
		@XmlElement(name = "CodePostal", required = true)
		@XmlSchemaType(name = "positiveInteger")
		protected int codePostal;

		public Client(String entite, String contact, int codePostal) {
			super();
			this.entite = entite;
			this.contact = contact;
			this.codePostal = codePostal;
		}

		public Client() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * Obtient la valeur de la propriété entite.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEntite() {
			return entite;
		}

		/**
		 * Définit la valeur de la propriété entite.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEntite(String value) {
			this.entite = value;
		}

		/**
		 * Obtient la valeur de la propriété contact.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getContact() {
			return contact;
		}

		/**
		 * Définit la valeur de la propriété contact.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setContact(String value) {
			this.contact = value;
		}

		/**
		 * Obtient la valeur de la propriété codePostal.
		 * 
		 * @return possible object is {@link int }
		 * 
		 */
		public int getCodePostal() {
			return codePostal;
		}

		/**
		 * Définit la valeur de la propriété codePostal.
		 * 
		 * @param value
		 *            allowed object is {@link int }
		 * 
		 */
		public void setCodePostal(int value) {
			this.codePostal = value;
		}

	}

	/**
	 * <p>
	 * Classe Java pour anonymous complex type.
	 * 
	 * <p>
	 * Le fragment de schéma suivant indique le contenu attendu figurant dans
	 * cette classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element ref="{http://univ.fr/stb}Personne" maxOccurs="7" minOccurs="2"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "personne" })
	public static class Equipe {

		@XmlElement(name = "Personne", namespace = "http://univ.fr/stb", required = true)
		protected List<Personne> personne;

		public Equipe(List<Personne> personne) {
			super();
			this.personne = personne;
		}

		public Equipe() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * Gets the value of the personne property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the personne property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPersonne().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Personne }
		 * 
		 * 
		 */
		public List<Personne> getPersonne() {
			if (personne == null) {
				personne = new ArrayList<Personne>();
			}
			return this.personne;
		}

	}

	/**
	 * <p>
	 * Classe Java pour anonymous complex type.
	 * 
	 * <p>
	 * Le fragment de schéma suivant indique le contenu attendu figurant dans
	 * cette classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element ref="{http://univ.fr/stb}ExigenceFonctionnelle" maxOccurs="unbounded" minOccurs="2"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="Priorite" type="{http://univ.fr/stb}Prio" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "description", "exigenceFonctionnelle" })
	public static class Fonctionnalite {

		@XmlElement(name = "Description", required = true)
		protected String description;
		@XmlElement(name = "ExigenceFonctionnelle", namespace = "http://univ.fr/stb", required = true)
		protected List<ExigenceFonctionnelle> exigenceFonctionnelle;
		@XmlAttribute(name = "Priorite")
		protected Integer priorite;

		public Fonctionnalite(String description, List<ExigenceFonctionnelle> exigenceFonctionnelle, Integer priorite) {
			super();
			this.description = description;
			this.exigenceFonctionnelle = exigenceFonctionnelle;
			this.priorite = priorite;
		}

		public Fonctionnalite() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * Obtient la valeur de la propriété description.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Définit la valeur de la propriété description.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

		/**
		 * Gets the value of the exigenceFonctionnelle property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the exigenceFonctionnelle property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getExigenceFonctionnelle().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ExigenceFonctionnelle }
		 * 
		 * 
		 */
		public List<ExigenceFonctionnelle> getExigenceFonctionnelle() {
			if (exigenceFonctionnelle == null) {
				exigenceFonctionnelle = new ArrayList<ExigenceFonctionnelle>();
			}
			return this.exigenceFonctionnelle;
		}

		/**
		 * Obtient la valeur de la propriété priorite.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPriorite() {
			return priorite;
		}

		/**
		 * Définit la valeur de la propriété priorite.
		 * 
		 * @param value
		 *            allowed object is {@link Integer }
		 * 
		 */
		public void setPriorite(Integer value) {
			this.priorite = value;
		}

	}

}
