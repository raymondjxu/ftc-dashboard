package net.raymondjxu.ftc.dashboard;

import net.raymondjxu.ftc.dashboard.message.Message;

public interface SocketHandler {
    void onOpen();

    void onClose();

    // Returns true iff the message was handled
    boolean onMessage(Message message);
}
