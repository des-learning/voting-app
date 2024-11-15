package com.example.application.views.myview;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("My View")
@Route("")
public class MyViewView extends Composite<VerticalLayout> {
    private int vote1Count = 0;
    private int vote2Count = 0;

    // components & layouts
    VerticalLayout layoutColumn2 = new VerticalLayout();
    HorizontalLayout layoutRow = new HorizontalLayout();
    Button buttonPrimary = new Button();
    H1 h1 = new H1();
    HorizontalLayout layoutRow2 = new HorizontalLayout();
    Button buttonPrimary2 = new Button();
    H1 h12 = new H1();

    public MyViewView() {
        layout();
        actions();
    }

    public int getVote1Count() {
        return vote1Count;
    }

    public int getVote2Count() {
        return vote2Count;
    }

    public void incVote1Count() {
        this.vote1Count++;
    }

    public void incVote2Count() {
        this.vote2Count++;
    }

    private void layout() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Vote 1");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        h1.setText(String.valueOf(getVote1Count()));
        h1.setWidth("max-content");
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        buttonPrimary2.setText("Vote 2");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        h12.setText(String.valueOf(getVote2Count()));
        h12.setWidth("max-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(h1);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(buttonPrimary2);
        layoutRow2.add(h12);
    }

    private void actions() {
        buttonPrimary.addClickListener((e) -> {
            this.incVote1Count();
            h1.setText(String.valueOf(this.getVote1Count()));
        });

        buttonPrimary2.addClickListener((e) -> {
            this.incVote2Count();
            h12.setText(String.valueOf(this.getVote2Count()));
        });
    }
}
