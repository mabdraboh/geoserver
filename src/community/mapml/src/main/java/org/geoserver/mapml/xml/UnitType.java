//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.17 at 04:13:52 PM PST 
//


package org.geoserver.mapml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="tilematrix"/>
 *     &lt;enumeration value="pcrs"/>
 *     &lt;enumeration value="tcrs"/>
 *     &lt;enumeration value="map"/>
 *     &lt;enumeration value="gcrs"/>
 *     &lt;enumeration value="tile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitType")
@XmlEnum
public enum UnitType {

    @XmlEnumValue("tilematrix")
    TILEMATRIX("tilematrix"),
    @XmlEnumValue("pcrs")
    PCRS("pcrs"),
    @XmlEnumValue("tcrs")
    TCRS("tcrs"),
    @XmlEnumValue("map")
    MAP("map"),
    @XmlEnumValue("gcrs")
    GCRS("gcrs"),
    @XmlEnumValue("tile")
    TILE("tile");
    private final String value;

    UnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitType fromValue(String v) {
        for (UnitType c: UnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
