/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class CityDialog extends DialogBox {

    public CityDialog() {

        VerticalPanel vp = new VerticalPanel();
        Button closeButton = new Button(
                "", new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                hide();
            }
        });

        Label label = new Label("Please select your city.");
        ListBox cityList = new ListBox();

        for (int i = 0; i < 10; i++) {
            cityList.setItemText(i, "City " + i);
        }

        label.setStyleName("CityDialog-label");
        cityList.setStyleName("CityDialog-cityList");
        vp.setStyleName("CityDialog-vp");

        vp.add(closeButton);
        vp.add(label);
        vp.add(cityList);

        closeButton.setStyleName("CityDialog-closeButton");

        setGlassEnabled(true);
        setAnimationEnabled(true);
        setGlassStyleName("CityDialog-glassStyle");
        setStyleName("CityDialog");
        setSize("300px", "150px");
        setWidget(vp);
    }
}
