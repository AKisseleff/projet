package model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link STB }
     * 
     */
    public STB createSTB() {
        return new STB();
    }

    /**
     * Create an instance of {@link STB.Client }
     * 
     */
    public STB.Client createSTBClient() {
        return new STB.Client();
    }

    /**
     * Create an instance of {@link STB.Equipe }
     * 
     */
    public STB.Equipe createSTBEquipe() {
        return new STB.Equipe();
    }

    /**
     * Create an instance of {@link STB.Fonctionnalite }
     * 
     */
    public STB.Fonctionnalite createSTBFonctionnalite() {
        return new STB.Fonctionnalite();
    }

    /**
     * Create an instance of {@link ExigenceFonctionnelle }
     * 
     */
    public ExigenceFonctionnelle createExigenceFonctionnelle() {
        return new ExigenceFonctionnelle();
    }

    /**
     * Create an instance of {@link ListSTB }
     * 
     */
    public ListSTB createListSTB() {
        return new ListSTB();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

}
