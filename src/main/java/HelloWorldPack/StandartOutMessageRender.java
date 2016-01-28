package HelloWorldPack;

/**
 * Created by bionix on 28.01.2016.
 */
public class StandartOutMessageRender implements MessageRender {
    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null){
            throw  new RuntimeException("You must set  the property messageProvider of class: " + StandartOutMessageRender.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
