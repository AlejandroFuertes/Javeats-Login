package com.javdev.javeats.login.views.createaccount;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Create Account")
@Route(value = "create-account")
@Uses(Icon.class)
public class CreateAccountView extends Composite<VerticalLayout> {

    public CreateAccountView() {
        H1 h1 = new H1();
        H3 h3 = new H3();
        TextField textField = new TextField();
        H3 h32 = new H3();
        EmailField emailField = new EmailField();
        H3 h33 = new H3();
        PasswordField passwordField = new PasswordField();
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().addClassName(Padding.XLARGE);
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.START);
        h1.setText("Crear una cuenta");
        h3.setText("Usuario");
        textField.setLabel("usuario");
        h32.setText("Correo electronico");
        emailField.setLabel("Email");
        h33.setText("Contraseña");
        passwordField.setLabel("Password field");
        getContent().add(h1);
        getContent().add(h3);
        getContent().add(textField);
        getContent().add(h32);
        getContent().add(emailField);
        getContent().add(h33);
        getContent().add(passwordField);
    }
}
