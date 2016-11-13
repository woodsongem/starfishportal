package starfishportal.hostservice.contracts.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(String.class)
public enum ResultStatus {
	@XmlEnumValue("1") Success,
	@XmlEnumValue("2") Fail, 
	@XmlEnumValue("3") Info,
	@XmlEnumValue("4") Error,
}
