/*
 * Copyright 2013-2016 Uncharted Software Inc.
 *
 *  Property of Uncharted(TM), formerly Oculus Info Inc.
 *  https://uncharted.software/
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package influent.server.spi.impl.anb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class AttributeClass {

	private String attrName;
	private String attrType;
	private Boolean attrShowValue;
	private Boolean attrVisible;
	private Boolean attrUserCanAdd;
	private Boolean attrUserCanRemove;
	private String attrPrefix;
	private Boolean attrShowPrefix;
	private Font font;
	
	//------------------------------------------------------------------------------------------------------------------
    
    public AttributeClass() {}
	
	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	public String setAttrName() {
		return this.attrName;
	}

	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	//------------------------------------------------------------------------------------------------------------------

	public String setAttrType() {
		return this.attrType;
	}

	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrShowValue(Boolean attrShowValue) {
		this.attrShowValue = attrShowValue;
	}

	//------------------------------------------------------------------------------------------------------------------

	public Boolean setAttrShowValue() {
		return this.attrShowValue;
	}

	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrVisible(Boolean attrVisible) {
		this.attrVisible = attrVisible;
	}

	//------------------------------------------------------------------------------------------------------------------

	public Boolean setAttrVisible() {
		return this.attrVisible;
	}

	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrUserCanAdd(Boolean attrUserCanAdd) {
		this.attrUserCanAdd = attrUserCanAdd;
	}

	//------------------------------------------------------------------------------------------------------------------

	public Boolean setAttrUserCanAdd() {
		return this.attrUserCanAdd;
	}

	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrUserCanRemove(Boolean attrUserCanRemove) {
		this.attrUserCanRemove = attrUserCanRemove;
	}

	//------------------------------------------------------------------------------------------------------------------

	public Boolean setAttrUserCanRemove() {
		return this.attrUserCanRemove;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrPrefix(String attrPrefix) {
		this.attrPrefix = attrPrefix;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	public String setAttrPrefix() {
		return this.attrPrefix;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	@XmlAttribute
    public void setAttrShowPrefix(Boolean attrShowPrefix) {
		this.attrShowPrefix = attrShowPrefix;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	public Boolean setAttrShowPrefix() {
		return this.attrShowPrefix;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	@XmlElement
	public void setFont(Font font) {
		this.font = font;
	}
	
	//------------------------------------------------------------------------------------------------------------------

	public Font getFont() {
		return this.font;
	}
}
