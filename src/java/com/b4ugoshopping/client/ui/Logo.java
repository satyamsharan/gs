/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class Logo extends VerticalPanel {

    public Logo() {
        setStyleName("Logo");
        
        VerticalPanel vp = new VerticalPanel();
        vp.setStyleName("Logo-vp");
        
        Image img = new Image("images/logo.png");
        img.setStyleName("Logo-img");
        img.setTitle("www.b4ugoshopping.com");
        vp.add(img);
        add(vp);
        img.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                History.newItem("home");
            }
        });
    }
}
