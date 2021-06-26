package registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(FormContext.getContext().getTfName().getText());
        System.out.println(FormContext.getContext().getTfEmail().getText());
        System.out.println(new String(FormContext.getContext().getPsPassword().getPassword()));
        System.out.println(new String(FormContext.getContext().getPsPasswordC().getPassword()));
        new RegistrationForm();
    }
}
