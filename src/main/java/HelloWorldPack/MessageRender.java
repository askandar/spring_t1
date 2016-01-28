package HelloWorldPack;

/**
 * Created by bionix on 28.01.2016.
 */
public interface MessageRender {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
