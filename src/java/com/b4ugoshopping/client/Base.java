/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client;

import com.b4ugoshopping.client.ui.HeaderBar;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author Satyam Sharan<satyam.sharan@hotmail.com>
 */
public class Base extends VerticalPanel{

    void init() {
        
        History.addValueChangeHandler(new ValueChangeHandler<String>() {

            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                setPage(event.getValue());
            }
        });
        
        String tokenOnLoad=History.getToken();
        
        if((tokenOnLoad==null)||tokenOnLoad.equals("")||tokenOnLoad.trim().equals("")){
            setPage("home");
        }else{
            setPage(tokenOnLoad);
        }
        
        HeaderBar headerBar = new HeaderBar();
        add(headerBar);
    }
    
    
    private void setPage(String token){
        
    }
    
}
