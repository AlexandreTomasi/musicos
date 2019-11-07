//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.11.06 às 05:57:13 PM AMST 
//


package br.com.empresaalexandre;

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
 *         &lt;element name="tamanhoNome" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ordem" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tamanhoNome",
    "ordem"
})
@XmlRootElement(name = "GetCustomerDetailRequestTamanho")
public class GetCustomerDetailRequestTamanho {

    protected int tamanhoNome;
    @XmlElement(required = true)
    protected String ordem;

    /**
     * Obtém o valor da propriedade tamanhoNome.
     * 
     */
    public int getTamanhoNome() {
        return tamanhoNome;
    }

    /**
     * Define o valor da propriedade tamanhoNome.
     * 
     */
    public void setTamanhoNome(int value) {
        this.tamanhoNome = value;
    }

    /**
     * Obtém o valor da propriedade ordem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdem() {
        return ordem;
    }

    /**
     * Define o valor da propriedade ordem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdem(String value) {
        this.ordem = value;
    }

}
