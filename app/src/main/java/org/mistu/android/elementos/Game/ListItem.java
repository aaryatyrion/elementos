package org.mistu.android.elementos.Game;

import java.io.Serializable;

/**
 * Created by kedee on 24/12/16.
 */

public class ListItem implements Serializable{
    private String listItemPrimaryText;
    private String listItemSecondaryText;
    private int listItemPrimaryImageId;
    private int listItemSecondaryImageId;

    private static final long serialVersionUID = 1L;

    public ListItem() {

    }

    public ListItem(String listItemPrimaryText, int listItemPrimaryImageId) {
        this.listItemPrimaryText = listItemPrimaryText;
        this.listItemPrimaryImageId = listItemPrimaryImageId;
        this.listItemSecondaryImageId = -1;
    }

    public ListItem(String listItemPrimaryText, String listItemSecondaryText, int listItemPrimaryImageId) {
        this.listItemPrimaryText = listItemPrimaryText;
        this.listItemSecondaryText = listItemSecondaryText;
        this.listItemPrimaryImageId = listItemPrimaryImageId;
        this.listItemSecondaryImageId = -1;
    }

    public ListItem(String listItemPrimaryText, String listItemSecondaryText, int listItemPrimaryImageId, int listItemSecondaryImageId) {
        this.listItemPrimaryText = listItemPrimaryText;
        this.listItemSecondaryText = listItemSecondaryText;
        this.listItemPrimaryImageId = listItemPrimaryImageId;
        this.listItemSecondaryImageId = listItemSecondaryImageId;
    }

    public String getListItemPrimaryText() {
        return listItemPrimaryText;
    }

    public void setListItemPrimaryText(String listItemPrimaryText) {
        this.listItemPrimaryText = listItemPrimaryText;
    }

    public int getListItemPrimaryImageId() {
        return listItemPrimaryImageId;
    }

    public void setListItemPrimaryImageId(int listItemPrimaryImageId) {
        this.listItemPrimaryImageId = listItemPrimaryImageId;
    }

    public String getListItemSecondaryText() {
        return listItemSecondaryText;
    }

    public void setListItemSecondaryText(String listItemSecondaryText) {
        this.listItemSecondaryText = listItemSecondaryText;
    }

    public int getListItemSecondaryImageId() {
        return listItemSecondaryImageId;
    }

    public void setListItemSecondaryImageId(int listItemSecondaryImageId) {
        this.listItemSecondaryImageId = listItemSecondaryImageId;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "listItemPrimaryText='" + listItemPrimaryText + '\'' +
                ", listItemSecondaryText='" + listItemSecondaryText + '\'' +
                ", listItemPrimaryImageId=" + listItemPrimaryImageId +
                ", listItemSecondaryImageId=" + listItemSecondaryImageId +
                '}';
    }
}

