package pl.altoriis.projectzebra3.UI;

import pl.altoriis.projectzebra3.datamodel.DataModel;
import pl.altoriis.projectzebra3.ext.ZebraTable;

import com.vaadin.ui.VerticalLayout;

public class adminTab extends VerticalLayout {


	private static final long serialVersionUID = 1L;

	public adminTab() {
		this.setSizeFull();

		final ZebraTable userTable;

		userTable = new ZebraTable("The Persistent users", DataModel.users);
		userTable.setVisibleColumns((Object[]) new String[] { "id",
				"user",
				"password"
				 ,"accountOwner.name"
				, "accountOwner.lastName", "accountOwner.description",
				//"accountOwner.ownerType", "accountOwner.symbol"
				// ,"accountOwner.createdBy"
				// ,"accountOwner.creationDate"
				//, "accountOwner.id" 
				});

		userTable.setEditable(true);
		userTable.setHeightUndefined();
		userTable.setSelectable(true);
		userTable.setImmediate(true);
		userTable.setNullSelectionAllowed(false);
		//userTable.addNewComboEditedColumn(DataModel.accountOwners,"accountOwner.id", "name");
		userTable.setColumnReorderingAllowed(true);
		this.addComponent(userTable);

	}

}
