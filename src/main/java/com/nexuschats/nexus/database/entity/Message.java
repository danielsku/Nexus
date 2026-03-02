package com.nexuschats.nexus.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name="message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="message_id")
    private int id;

    // Foreign keys
    private int group_id;
    private int user_id;

    @Column(name="content")
    private String content;

    @Column(name="sent_at")
    private String sentAt;

    @Column(name="is_deleted")
    private boolean isDeleted;

    // Constructors

    public Message() {
    }

    public Message(int id, int group_id, int user_id, String content, String sentAt, boolean isDeleted) {
        this.id = id;
        this.group_id = group_id;
        this.user_id = user_id;
        this.content = content;
        this.sentAt = sentAt;
        this.isDeleted = isDeleted;
    }

    // Getters

    public int getId() {
        return id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getContent() {
        return content;
    }

    public String getSentAt() {
        return sentAt;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    // Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    // toString()


    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", group_id=" + group_id +
                ", user_id=" + user_id +
                ", content='" + content + '\'' +
                ", sentAt='" + sentAt + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
