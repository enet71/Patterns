package creational.singleton;


public enum Singleton_Enum {
    INSTANCE;

    private String text = "start text";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Singleton_Enum{" +
                "text='" + text + '\'' +
                '}';
    }
}
