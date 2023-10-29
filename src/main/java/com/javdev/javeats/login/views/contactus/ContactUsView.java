package com.javdev.javeats.login.views.contactus;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Contact Us")
@Route(value = "contact-us")
@Uses(Icon.class)
public class ContactUsView extends Composite<VerticalLayout> {

    public ContactUsView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
