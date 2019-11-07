//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.07 às 12:41:45 AM AMT 
//


package br.com.empresaalexandre;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArtistasEncontrados" type="{http://EmpresaAlexandre.com.br}ArtistasEncontrados" maxOccurs="unbounded"/>
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
    "artistasEncontrados"
})
@XmlRootElement(name = "ConsultaArtistaNomeResponse")
public class ConsultaArtistaNomeResponse {

    @XmlElement(name = "ArtistasEncontrados", required = true)
    protected List<ArtistasEncontrados> artistasEncontrados;

    /**
     * Gets the value of the artistasEncontrados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artistasEncontrados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtistasEncontrados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtistasEncontrados }
     * 
     * 
     */
    public List<ArtistasEncontrados> getArtistasEncontrados() {
        if (artistasEncontrados == null) {
            artistasEncontrados = new ArrayList<ArtistasEncontrados>();
        }
        return this.artistasEncontrados;
    }

}
