package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class ReceiveImage extends Message {
    private String imageString;

    public ReceiveImage(String imageString) {
        super(MessageType.RECEIVE_IMAGE);

        this.imageString = imageString;
    }
}
