package registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        FormContext formContext = FormContext.getContext();
        formContext.getTfName().setText("");
        formContext.getPsPassword().setText("");
        formContext.getTfEmail().setText("");
        formContext.getPsPasswordC().setText("");
    }
}
