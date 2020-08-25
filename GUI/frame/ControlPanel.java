package frame;

import common.DTAButton;
import common.DTAPanel;
import file.Localization;
import main.DTAText;

@SuppressWarnings("serial")
public class ControlPanel extends DTAPanel {
	// Associations
	private IDListPanel idListPanel = null;

	// Components
	private DTAButton btnPrevious = null;
	private DTAButton btnNext 	  = null;

	public ControlPanel() {
		// Add Components
		btnPrevious = new DTAButton(DTAText.get("previous"));
		btnPrevious.addActionListener(e -> previous());
		add(btnPrevious);

		btnNext = new DTAButton(DTAText.get("next"));
		btnNext.addActionListener(e -> next());
		add(btnNext);
	}

	// Event Method
	private void previous() {
		idListPanel.previous();
	}

	private void next() {
		idListPanel.next();
	}

	public void setAssociations(IDListPanel idListPanel) {
		this.idListPanel = idListPanel;
	}

	public void initialize(Localization localization) {

		if(localization == null) {
			return;
		}
		
		btnNext.setEnabled(true);
		btnPrevious.setEnabled(true);
	}

}
