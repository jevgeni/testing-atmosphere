package my.pack;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Info {
    private String text;

    public Info(){

    }

    public Info(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Info");
        sb.append("{text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}