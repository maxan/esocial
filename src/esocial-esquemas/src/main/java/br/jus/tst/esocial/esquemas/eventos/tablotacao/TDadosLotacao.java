//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:45 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.tablotacao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informa\u00e7\u00f5es da Lota\u00e7\u00e3o
 * 
 * <p>Java class for TDadosLotacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDadosLotacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpLotacao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpInsc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrInsc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8,14}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fpasLotacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fpas">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codTercs">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codTercsSusp" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="infoProcJudTerceiros" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procJudTerceiro" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codTerc">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrProcJud">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="20"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codSusp">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{1,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoEmprParcial" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpInscContrat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrInscContrat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{8,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpInscProp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrInscProp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{8,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDadosLotacao", namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", propOrder = {
    "tpLotacao",
    "tpInsc",
    "nrInsc",
    "fpasLotacao",
    "infoEmprParcial"
})
public class TDadosLotacao {

    @XmlElement(required = true)
    protected String tpLotacao;
    protected Byte tpInsc;
    protected String nrInsc;
    @XmlElement(required = true)
    protected TDadosLotacao.FpasLotacao fpasLotacao;
    protected TDadosLotacao.InfoEmprParcial infoEmprParcial;

    /**
     * Gets the value of the tpLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpLotacao() {
        return tpLotacao;
    }

    /**
     * Sets the value of the tpLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpLotacao(String value) {
        this.tpLotacao = value;
    }

    /**
     * Gets the value of the tpInsc property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Sets the value of the tpInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTpInsc(Byte value) {
        this.tpInsc = value;
    }

    /**
     * Gets the value of the nrInsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Sets the value of the nrInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Gets the value of the fpasLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosLotacao.FpasLotacao }
     *     
     */
    public TDadosLotacao.FpasLotacao getFpasLotacao() {
        return fpasLotacao;
    }

    /**
     * Sets the value of the fpasLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosLotacao.FpasLotacao }
     *     
     */
    public void setFpasLotacao(TDadosLotacao.FpasLotacao value) {
        this.fpasLotacao = value;
    }

    /**
     * Gets the value of the infoEmprParcial property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosLotacao.InfoEmprParcial }
     *     
     */
    public TDadosLotacao.InfoEmprParcial getInfoEmprParcial() {
        return infoEmprParcial;
    }

    /**
     * Sets the value of the infoEmprParcial property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosLotacao.InfoEmprParcial }
     *     
     */
    public void setInfoEmprParcial(TDadosLotacao.InfoEmprParcial value) {
        this.infoEmprParcial = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fpas">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codTercs">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codTercsSusp" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="infoProcJudTerceiros" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procJudTerceiro" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codTerc">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrProcJud">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="20"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codSusp">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{1,14}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "fpas",
        "codTercs",
        "codTercsSusp",
        "infoProcJudTerceiros"
    })
    public static class FpasLotacao {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
        protected BigInteger fpas;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
        protected String codTercs;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00")
        protected String codTercsSusp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00")
        protected TDadosLotacao.FpasLotacao.InfoProcJudTerceiros infoProcJudTerceiros;

        /**
         * Gets the value of the fpas property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFpas() {
            return fpas;
        }

        /**
         * Sets the value of the fpas property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFpas(BigInteger value) {
            this.fpas = value;
        }

        /**
         * Gets the value of the codTercs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodTercs() {
            return codTercs;
        }

        /**
         * Sets the value of the codTercs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodTercs(String value) {
            this.codTercs = value;
        }

        /**
         * Gets the value of the codTercsSusp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodTercsSusp() {
            return codTercsSusp;
        }

        /**
         * Sets the value of the codTercsSusp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodTercsSusp(String value) {
            this.codTercsSusp = value;
        }

        /**
         * Gets the value of the infoProcJudTerceiros property.
         * 
         * @return
         *     possible object is
         *     {@link TDadosLotacao.FpasLotacao.InfoProcJudTerceiros }
         *     
         */
        public TDadosLotacao.FpasLotacao.InfoProcJudTerceiros getInfoProcJudTerceiros() {
            return infoProcJudTerceiros;
        }

        /**
         * Sets the value of the infoProcJudTerceiros property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosLotacao.FpasLotacao.InfoProcJudTerceiros }
         *     
         */
        public void setInfoProcJudTerceiros(TDadosLotacao.FpasLotacao.InfoProcJudTerceiros value) {
            this.infoProcJudTerceiros = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="procJudTerceiro" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codTerc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrProcJud">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codSusp">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{1,14}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "procJudTerceiro"
        })
        public static class InfoProcJudTerceiros {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
            protected List<TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro> procJudTerceiro;

            /**
             * Gets the value of the procJudTerceiro property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the procJudTerceiro property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProcJudTerceiro().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro }
             * 
             * 
             */
            public List<TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro> getProcJudTerceiro() {
                if (procJudTerceiro == null) {
                    procJudTerceiro = new ArrayList<TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro>();
                }
                return this.procJudTerceiro;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="codTerc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrProcJud">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codSusp">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{1,14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
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
                "codTerc",
                "nrProcJud",
                "codSusp"
            })
            public static class ProcJudTerceiro {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
                protected String codTerc;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
                protected String nrProcJud;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
                protected BigInteger codSusp;

                /**
                 * Gets the value of the codTerc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodTerc() {
                    return codTerc;
                }

                /**
                 * Sets the value of the codTerc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodTerc(String value) {
                    this.codTerc = value;
                }

                /**
                 * Gets the value of the nrProcJud property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrProcJud() {
                    return nrProcJud;
                }

                /**
                 * Sets the value of the nrProcJud property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrProcJud(String value) {
                    this.nrProcJud = value;
                }

                /**
                 * Gets the value of the codSusp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCodSusp() {
                    return codSusp;
                }

                /**
                 * Sets the value of the codSusp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCodSusp(BigInteger value) {
                    this.codSusp = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tpInscContrat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrInscContrat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{8,14}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpInscProp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrInscProp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{8,14}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "tpInscContrat",
        "nrInscContrat",
        "tpInscProp",
        "nrInscProp"
    })
    public static class InfoEmprParcial {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00")
        protected byte tpInscContrat;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
        protected String nrInscContrat;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00")
        protected byte tpInscProp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_05_00", required = true)
        protected String nrInscProp;

        /**
         * Gets the value of the tpInscContrat property.
         * 
         */
        public byte getTpInscContrat() {
            return tpInscContrat;
        }

        /**
         * Sets the value of the tpInscContrat property.
         * 
         */
        public void setTpInscContrat(byte value) {
            this.tpInscContrat = value;
        }

        /**
         * Gets the value of the nrInscContrat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrInscContrat() {
            return nrInscContrat;
        }

        /**
         * Sets the value of the nrInscContrat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrInscContrat(String value) {
            this.nrInscContrat = value;
        }

        /**
         * Gets the value of the tpInscProp property.
         * 
         */
        public byte getTpInscProp() {
            return tpInscProp;
        }

        /**
         * Sets the value of the tpInscProp property.
         * 
         */
        public void setTpInscProp(byte value) {
            this.tpInscProp = value;
        }

        /**
         * Gets the value of the nrInscProp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrInscProp() {
            return nrInscProp;
        }

        /**
         * Sets the value of the nrInscProp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrInscProp(String value) {
            this.nrInscProp = value;
        }

    }

}
