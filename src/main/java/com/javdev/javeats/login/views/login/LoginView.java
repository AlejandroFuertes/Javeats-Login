package com.javdev.javeats.login.views.login;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Login")
@Route(value = "Login")
@RouteAlias(value = "")
@Uses(Icon.class)
public class LoginView extends Composite<VerticalLayout> {

    public LoginView() {
        LoginForm loginForm = new LoginForm();
        RouterLink routerLink = new RouterLink();
        RouterLink routerLink2 = new RouterLink();
        getContent().setSpacing(false);
        getContent().addClassName(Padding.XLARGE);
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.START);
        getContent().setAlignSelf(FlexComponent.Alignment.START, loginForm);
        routerLink.setText("Custom View");
        routerLink.setRoute(LoginView.class);
        routerLink2.setText("Custom View");
        routerLink2.setRoute(LoginView.class);
        getContent().add(loginForm);
        getContent().add(routerLink);
        getContent().add(routerLink2);
    }
}
