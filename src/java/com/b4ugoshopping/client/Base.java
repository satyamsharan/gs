/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client;

import com.b4ugoshopping.client.ui.HeaderBar;
import com.b4ugoshopping.client.ui.Logo;
import com.b4ugoshopping.client.ui.Slider;
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
        
        
        
        HeaderBar headerBar = new HeaderBar();
        add(headerBar);
        
        if((tokenOnLoad==null)||tokenOnLoad.equals("")||tokenOnLoad.trim().equals("")){
            setPage("home");
        }else{
            setPage(tokenOnLoad);
        }
        
    }
    
    
    private void setPage(String token){
        
        if(token.equals("home") ) {
            
            Logo logo = new Logo();
            logo.setStyleName("Base-logo");
            
            
            Slider slider = new Slider();
            slider.setStyleName("Base-slider");
            
            add(logo);
            add(slider);
        }
    }
    
}
