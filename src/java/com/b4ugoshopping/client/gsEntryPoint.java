/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Main entry point.
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class gsEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of gsEntryPoint
     */
    public gsEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that
     * declares an implementing class as an entry-point
     */
    @Override
    public void onModuleLoad() {
        
        Base base = new Base();
        base.init();
        
        RootPanel.get("baseDiv").add(base);
    }
    
}
