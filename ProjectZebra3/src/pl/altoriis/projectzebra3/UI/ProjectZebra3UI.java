package pl.altoriis.projectzebra3.UI;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import pl.altoriis.projectzebra3.datamodel.DataModel;

@SuppressWarnings("serial")
@Theme("projectzebra3")
public class ProjectZebra3UI extends UI {
	
	public static VerticalLayout mainLayout;	
	public static ZebraHeader zebraHeaderInst;
	public static ZebraBody zebraBodyInst ;

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = ProjectZebra3UI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		
		DataModel.initializeDataModel();
		
		this.setSizeFull();
		mainLayout = new VerticalLayout();
		mainLayout.setDefaultComponentAlignment(Alignment.TOP_LEFT);
				
		setContent(mainLayout);
		zebraHeaderInst = new ZebraHeader();
		zebraBodyInst = new ZebraBody();
		mainLayout.addComponent(zebraHeaderInst);
		mainLayout.addComponent(zebraBodyInst);
			
		
	}

}