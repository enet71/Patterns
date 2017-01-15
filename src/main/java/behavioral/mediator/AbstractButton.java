package behavioral.mediator;


public abstract class AbstractButton {
    private String text;
    private boolean disabled = false;
    private AbstractMediator mediator;

    public AbstractButton(AbstractMediator mediator, String text){
        this.mediator = mediator;
        this.text = text;
    }


    public void clickButton(){
        if(!isDisabled()) {
            mediator.clickButton(this);
        }else {
            System.out.println("Sorry " + text + " is disabled.");
        }
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        System.out.println(text + " disabled = " + disabled);
    }

}
