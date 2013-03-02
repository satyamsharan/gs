/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class HeaderBar extends VerticalPanel{

    public HeaderBar() {
        setStyleName("HeaderBar");
        HorizontalPanel hp = new HorizontalPanel();
        
        hp.setStyleName("HeaderBar-hp");
        
        hp.add(new Hyperlink("Home", "home"));
        hp.add(new Hyperlink("Post Add", "post"));
        
        add(hp);
    }
    
}
