package starfishportal.hostservice.contracts.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(String.class)
public enum UserType {
	@XmlEnumValue("1") LEVEL_3,
	@XmlEnumValue("2") LEVEL_2,
	@XmlEnumValue("3") LEVEL_1,
	@XmlEnumValue("3") LEVEL_0
}
