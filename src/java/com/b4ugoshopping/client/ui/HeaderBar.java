/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class HeaderBar extends VerticalPanel {

    private DialogBox dialog;

    public HeaderBar() {
        setStyleName("HeaderBar");

        HorizontalPanel hp = new HorizontalPanel();

        Hyperlink homeLink = new Hyperlink("Home", "home");
        Hyperlink postLink = new Hyperlink("Post Add", "post");

        Button city = new Button("New Delhi");

        dialog = new CityDialog();


        hp.setStyleName("HeaderBar-hp");
        homeLink.setStyleName("HeaderBar-Link");
        postLink.setStyleName("HeaderBar-Link");
        city.setStyleName("HeaderBar-city");
        dialog.setStyleName("HeaderBar-dialog");


        city.setTitle("Click to Change");

        hp.add(homeLink);
        hp.add(postLink);
        hp.add(city);

        add(hp);

        city.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                dialog.center();
                dialog.show();
            }
        });
    }
}
