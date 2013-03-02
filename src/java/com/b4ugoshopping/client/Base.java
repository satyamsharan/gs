/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client;

import com.b4ugoshopping.client.ui.FooterBar;
import com.b4ugoshopping.client.ui.HeaderBar;
import com.b4ugoshopping.client.ui.Logo;
import com.b4ugoshopping.client.ui.SearchBar;
import com.b4ugoshopping.client.ui.Slider;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class Base extends VerticalPanel {

    VerticalPanel mainPanel;

    void init() {

        History.addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                setPage(event.getValue());
            }
        });

        String tokenOnLoad = History.getToken();


        mainPanel = new VerticalPanel();
        HeaderBar headerBar = new HeaderBar();

        mainPanel.setStyleName("Base-mainPanel");


        add(headerBar);
        add(mainPanel);

        setPage(tokenOnLoad);


        FooterBar footer = new FooterBar();
        add(footer);
    }

    private void setPage(String token) {
        mainPanel.clear();

        if ((token == null) || token.equals("") || token.trim().equals("") || token.trim().equals("home")) {

            Logo logo = new Logo();
            logo.setStyleName("Base-logo");

            Slider slider = new Slider();
            slider.setStyleName("Base-slider");

            SearchBar searchbar = new SearchBar();
            searchbar.setStyleName("Base-searchbar");

            mainPanel.add(logo);
            mainPanel.add(slider);
            mainPanel.add(searchbar);

        } else if (token.equals("contact")) {
            Frame contactFrame = new Frame("pages/Contact Us.html");
            mainPanel.add(contactFrame);
        } else if (token.equals("copyright")) {
            Frame copyrightFrame = new Frame("pages/Copyright.html");
            mainPanel.add(copyrightFrame);
        } else if (token.equals("searchresults")) {
        }
    }
}
