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
 * @author manu
 */
public class FooterBar extends VerticalPanel {

    public FooterBar() {
        setStyleName("FooterBar");
        
        HorizontalPanel hp = new HorizontalPanel();
        
        hp.setStyleName("FooterBar-hp");
        Hyperlink contactUs = new Hyperlink("Contact Us", "contact");
        Hyperlink copyright = new Hyperlink("Copyright", "copyright");
        
        contactUs.setStyleName("FooterBar-link");
        copyright.setStyleName("FooterBar-link");
        
        hp.add(contactUs);
        hp.add(copyright);
        
        add(hp);
    }
}
