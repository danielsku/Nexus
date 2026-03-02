package com.nexuschats.nexus.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="group_member")
public class GroupMember {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Complete foreign keys later for this

    private int group_id;
    private int user_id;

    // Attributes related to this relation
    @Column(name="role")
    private String role;

    @Column(name="joined_at")
    private String joinedAt;

    // Constructors

    public GroupMember() {
    }

    public GroupMember(Long id, int group_id, int user_id, String role, String joinedAt) {
        this.id = id;
        this.group_id = group_id;
        this.user_id = user_id;
        this.role = role;
        this.joinedAt = joinedAt;
    }

    // Getters

    public int getGroup_id() {
        return group_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getRole() {
        return role;
    }

    public String getJoinedAt() {
        return joinedAt;
    }

    // Setters

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    // toString()

    @Override
    public String toString() {
        return "GroupMember{" +
                "id=" + id +
                ", group_id=" + group_id +
                ", user_id=" + user_id +
                ", role='" + role + '\'' +
                ", joinedAt='" + joinedAt + '\'' +
                '}';
    }
}
