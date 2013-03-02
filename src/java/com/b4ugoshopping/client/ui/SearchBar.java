/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class SearchBar extends VerticalPanel {

    SuggestBox productBox;
    SuggestBox locationBox;
    Button searchButton;

    public SearchBar() {
        productBox = new SuggestBox();
        locationBox = new SuggestBox();
        searchButton = new Button("search");

        add(productBox);
        add(locationBox);
        add(searchButton);

        searchButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                History.newItem("searchresults", true);
            }
        });

    }
}
