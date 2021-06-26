package registration;

import javax.swing.*;

public class FormContext{

    //private static FormContext formContext = new FormContext();
    private FormContext(){
//        if(formContext!=null){
//            throw new RuntimeException("Already initialize");
//        }
    }
    public static FormContext getContext(){
        return new FormContext();
    }

    private JTextField tfName;
    private JTextField tfEmail;
    private JPasswordField psPassword;
    private JPasswordField psPasswordC;
    private JButton bSubmit;
    private JButton bClear;

    public JTextField getTfName() {
        return tfName;
    }

    public void setTfName(JTextField tfName) {
        this.tfName = tfName;
    }

    public JTextField getTfEmail() {
        return tfEmail;
    }

    public void setTfEmail(JTextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    public JPasswordField getPsPassword() {
        return psPassword;
    }

    public void setPsPassword(JPasswordField psPassword) {
        this.psPassword = psPassword;
    }

    public JPasswordField getPsPasswordC() {
        return psPasswordC;
    }

    public void setPsPasswordC(JPasswordField psPasswordC) {
        this.psPasswordC = psPasswordC;
    }

    public JButton getbSubmit() {
        return bSubmit;
    }

    public void setbSubmit(JButton bSubmit) {
        this.bSubmit = bSubmit;
    }

    public JButton getbClear() {
        return bClear;
    }

    public void setbClear(JButton bClear) {
        this.bClear = bClear;
    }
}
