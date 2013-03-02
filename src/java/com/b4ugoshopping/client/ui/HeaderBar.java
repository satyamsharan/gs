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
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class HeaderBar extends VerticalPanel {

    public HeaderBar() {
        setStyleName("HeaderBar");

        HorizontalPanel hp = new HorizontalPanel();

        Hyperlink homeLink = new Hyperlink("Home", "home");
        Hyperlink postLink = new Hyperlink("Post Add", "post");

        Button city = new Button("New Delhi");


        hp.setStyleName("HeaderBar-hp");
        homeLink.setStyleName("HeaderBar-Link");
        postLink.setStyleName("HeaderBar-Link");
        city.setStyleName("HeaderBar-city");


        city.setTitle("Click to Change");

        hp.add(homeLink);
        hp.add(postLink);
        hp.add(city);

        add(hp);

        city.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final DialogBox dialog = new DialogBox();
                dialog.setStyleName("HeaderBar-dialog");
                Button closeButton = new Button(
                        "Cancel", new ClickHandler() {
                            @Override
                    public void onClick(ClickEvent event) {
                        dialog.hide();
                    }
                });

                dialog.add(closeButton);
                dialog.center();
                dialog.setAnimationEnabled(true);
                dialog.setGlassEnabled(true);
                dialog.setGlassStyleName("glassStyle");
                dialog.setSize("300px", "150px");
                dialog.setVisible(true);
                dialog.show();
            }
        });
    }
}
