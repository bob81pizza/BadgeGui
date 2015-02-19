/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Chris Martin and Maggie Shipley

package badgegui;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author cwm24
 */
public class Parameters {
    private String name;
    private String shape;
    private Color color;
    private Color bgcolor;
    private String stringX;
    private String stringY;
    private Integer ftstyle;
    private String ftsizeString;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the bgcolor
     */
    public Color getBgcolor() {
        return bgcolor;
    }

    /**
     * @param bgcolor the bgcolor to set
     */
    public void setBgcolor(Color bgcolor) {
        this.bgcolor = bgcolor;
    }

    /**
     * @return the stringX
     */
    public String getStringX() {
        return stringX;
    }

    /**
     * @param stringX the stringX to set
     */
    public void setStringX(String stringX) {
        this.stringX = stringX;
    }

    /**
     * @return the stringY
     */
    public String getStringY() {
        return stringY;
    }

    /**
     * @param stringY the stringY to set
     */
    public void setStringY(String stringY) {
        this.stringY = stringY;
    }

    /**
     * @return the ftsizeString
     */
    public String getFtsizeString() {
        return ftsizeString;
    }

    /**
     * @param ftsizeString the ftsizeString to set
     */
    public void setFtsizeString(String ftsizeString) {
        this.ftsizeString = ftsizeString;
    }

    /**
     * @return the ftstyle
     */
    public Integer getFtstyle() {
        return ftstyle;
    }

    /**
     * @param ftstyle the ftstyle to set
     */
    public void setFtstyle(Integer ftstyle) {
        this.ftstyle = ftstyle;
    }

}
