/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.b4ugoshopping.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 *
 * @author manu
 */
public class Login extends VerticalPanel {

    public Login() {
        SuggestBox loginBox = new SuggestBox();
        PasswordTextBox passBox = new PasswordTextBox();

        Button loginButton = new Button("login");

        add(loginBox);
        add(passBox);
        add(loginButton);

        loginButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                History.newItem("login");
            }
        });
    }
}
