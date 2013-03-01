/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class HeaderBar extends HorizontalPanel{

    public HeaderBar() {
        setStyleName("HeaderBar");
        add(new Hyperlink("Home", "home"));
        add(new Hyperlink("Post Add", "post"));
    }
    
}
