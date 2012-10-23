/**
 * Fresnel Editor
 * 
 * SVG Preprocessor
 */
package cz.muni.fi.fresneleditor.common.visualization.preprocessor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Object representation of a resource 
 * 
 * @author Milos Kalab <173388@mail.muni.cz>
 * @version 5. 5. 2012
 */
public class Resource {

    private int resourceId;
    private String resourceUri;
    private String resourceLabel;
    private String originalResourceLabel;
    private int longTextRowNumber = 1;
    private List<Property> properties;
    private Boolean hasParent = false;

    public Resource(String resourceUri, String resourceLabel) {
        int rowsNeeded;
        int rectWidth = SVGPreprocessor.xslSet.getRectWidth();
        int rectMargin = SVGPreprocessor.xslSet.getTextResXInd() - SVGPreprocessor.xslSet.getRectResXInd();
        if (rectWidth > rectMargin) {
            rectWidth -= rectMargin; //margins in the rectangle
        }
        if (!"".equals(resourceLabel)) {
            rowsNeeded = Utils.getInstance().countRows(resourceLabel, rectWidth);
        } else {
            rowsNeeded = Utils.getInstance().countRows(resourceUri, rectWidth);
        }
        if (rowsNeeded > 1) {
            this.longTextRowNumber = rowsNeeded;
            if (!"".equals(resourceLabel)) {
                this.originalResourceLabel = resourceLabel;
                this.resourceLabel = Utils.getInstance().shortenText(resourceLabel, rectWidth);
            } else {
                this.originalResourceLabel = resourceUri;
                this.resourceUri = Utils.getInstance().shortenText(resourceUri, rectWidth);
            }
        } else {
            if (!"".equals(resourceLabel)) {
                this.originalResourceLabel = resourceLabel;
                this.resourceLabel = resourceLabel;
            } else {
                this.originalResourceLabel = resourceUri;
                this.resourceUri = resourceUri;
            }

        }
        properties = new ArrayList<Property>();
        TempXMLParser parser = TempXMLParser.getInstance();
        this.resourceId = parser.getResourceId();
        parser.incrementResourceId();
        parser.addResourceToMap(this);
    }

    public int getResourceId() {
        return resourceId;
    }

    public Boolean getHasParent() {
        return hasParent;
    }

    public void setHasParent(Boolean hasParent) {
        this.hasParent = hasParent;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public String getResourceLabel() {
        return resourceLabel;
    }

    public void setResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public int getLongTextRowNumber() {
        return longTextRowNumber;
    }

    public void setLongTextRowNumber(int longTextRowNumber) {
        this.longTextRowNumber = longTextRowNumber;
    }

    public String getOriginalResourceLabel() {
        return originalResourceLabel;
    }

    public void setOriginalResourceLabel(String originalResourceLabel) {
        this.originalResourceLabel = originalResourceLabel;
    }

    @Override
    public String toString() {
        String s = "<resource";
        s += " long-text-rows=\"" + this.getLongTextRowNumber() + "\"";

        if (!this.getResourceUri().trim().isEmpty()) {
            s += " uri=\"" + this.getResourceUri() + "\"";
        }
        if (!this.getOriginalResourceLabel().trim().isEmpty()) {
            s += " full-label=\"" + this.getOriginalResourceLabel() + "\"";
        }
        if (this.getResourceLabel().trim().isEmpty()) {
            s += ">\n";
            s += "<title/>\n";
        } else {
            s += ">" + this.getResourceLabel() + "</title>\n";
        }

        List<Property> tempProperties = this.getProperties();
        if (!tempProperties.isEmpty()) {
            for (Iterator it = properties.iterator(); it.hasNext();) {
                Property property = (Property) it.next();
                s += property.toString();
            }
        }
        s += "</resource>\n";
        return s;
    }
}
