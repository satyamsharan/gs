/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;

/**
 *
 * @author manu
 */
public class Footer extends HorizontalPanel {

    public Footer() {
        Hyperlink contactUs = new Hyperlink("Contact Us", "contact");
        Hyperlink copyright = new Hyperlink("Copyright", "copyright");
        contactUs.setStyleName("Footer-contactUs");
        copyright.setStyleName("Footer-copyright");
        add(contactUs);
        add(copyright);
    }
}
