package com.nexuschats.nexus.database.entity;

import jakarta.persistence.*;

@Entity
@Table(name="group")
public class Group {

    // Attributes
    // Maybe some validation is in order, we'll touch back on this

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="group_id")
    private int id;

    @Column(name="group_name")
    private String groupName;

    @Column(name="description")
    private String description;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="created_at")
    private String createdAt;

    @Column(name="is_private")
    private boolean isPrivate;

    // Constructors

    public Group() {
    }

    public Group(int id, String groupName, String description, String createdBy, String createdAt, boolean isPrivate) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.isPrivate = isPrivate;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    // toString()

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", isPrivate=" + isPrivate +
                '}';
    }
}
