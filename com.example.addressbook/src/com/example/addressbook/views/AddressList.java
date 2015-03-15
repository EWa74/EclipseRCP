package com.example.addressbook.views;

import javax.swing.text.ComponentView;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddressList extends ViewPart {
	private Label lblNewLabel;

	public AddressList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		
		lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("New Label");
		
		Button btnAdressenLaden = new Button(parent, SWT.NONE);
		btnAdressenLaden.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAdressenLaden.setText("Adressen laden2");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
