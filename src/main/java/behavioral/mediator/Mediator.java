package behavioral.mediator;


public class Mediator extends AbstractMediator{
    private Button_1 button_1;
    private Button_2 button_2;
    private Button_3 button_3;

    public void setButton_1(Button_1 button_1) {
        this.button_1 = button_1;
    }

    public void setButton_2(Button_2 button_2) {
        this.button_2 = button_2;
    }

    public void setButton_3(Button_3 button_3) {
        this.button_3 = button_3;
    }

    @Override
    public void clickButton(AbstractButton button){
        if(button.equals(button_1)){
            button_2.setDisabled(true);
            button_3.setDisabled(false);
        }else if(button.equals(button_2)){
            button_3.setDisabled(true);
            button_1.setDisabled(false);
        }else if(button.equals(button_3)){
            button_1.setDisabled(true);
            button_2.setDisabled(false);
        }
    }
}
