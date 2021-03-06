/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org.elementos;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 *
 * @author JOSEEDUARDO
 */
@SpringUI
@Theme("valo")
        
public class MiUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        //Agregaremos un layout vertical y dentro de el los componentes que quedaran en orden descendente
        VerticalLayout layout=new VerticalLayout();
        Label e1=new Label("Jose Eduardo Campos Juarez !!!");
        e1.addStyleName(ValoTheme.LABEL_H1);
        
        Button b1=new Button("Guardar");
        b1.addStyleNames(ValoTheme.BUTTON_DANGER);
        
        //Vamos a programar el evento del boton 1
        // usando programacion funcional 
        
        b1.addClickListener(algo->{
        // aqui ponemos el evento
        e1.setValue("Mi primer programacion funcional");
        });
                
        //Agregamos los componentes al layout
        layout.addComponent(e1);
        layout.addComponent(b1);
        
        //Solo se agrega una vez y se agrega el layout a la pagina index 
        
        setContent(layout);
        
        
    // Have some data
        List<Mensajitos> people = Arrays.asList(
            new Mensajitos("Nicolaus Copernicus", "1543"),
            new Mensajitos("Galileo Galilei", "1564"),
            new Mensajitos("Johannes Kepler", "1571"));

    // Create a grid bound to the list
        Grid<Mensajitos> grid = new Grid<>();
        grid.setItems(people);
        grid.addColumn(Mensajitos::getTitulo).setCaption("Titulo");
        grid.addColumn(Mensajitos::getCuerpo).setCaption("Cuerpo");


   // switch to multiselect mode
        grid.setSelectionMode(SelectionMode.MULTI);

        grid.addSelectionListener(event -> {
            Set<Mensajitos> selected = event.getAllSelectedItems();
            Notification.show(selected.size() + " registros seleccionados");
        });

    layout.addComponent(grid);
    }
}
