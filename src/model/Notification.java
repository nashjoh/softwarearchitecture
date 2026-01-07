/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Notification {

    private String notificationId;
    private String recipient;
    private String message;
    private String channel; // Email / SMS
    private String sentDate;

    public Notification(String notificationId, String recipient,
                        String message, String channel, String sentDate) {
        this.notificationId = notificationId;
        this.recipient = recipient;
        this.message = message;
        this.channel = channel;
        this.sentDate = sentDate;
    }
}
