package com.nexuschats.nexus.database.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long user_id;

    @Column(name="username")
    private String username;

    @Column(name="password_hash")
    private String passwordHash;

    @Email
    @Column(name="email")
    private String email;

    @Column(name="biography")
    private String biography;

    @Column(name="created_at")
    private String createdAt;

    @Column(name="updated_at")
    private String updatedAt;

    @Column(name="last_login")
    private String lastLogin;

    @Column(name="last_login")
    private boolean is_active;

    // Constructors
    public User() {
    }

    public User(Long user_id, String username, String passwordHash, String email, String biography, String createdAt, String updatedAt, String lastLogin, boolean is_active) {
        this.user_id = user_id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
        this.biography = biography;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastLogin = lastLogin;
        this.is_active = is_active;
    }

    // Getters
    public Long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public String getBiography() {
        return biography;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public boolean isIs_active() {
        return is_active;
    }

    // Setters
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    // toString()

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", email='" + email + '\'' +
                ", biography='" + biography + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                ", is_active=" + is_active +
                '}';
    }
}
