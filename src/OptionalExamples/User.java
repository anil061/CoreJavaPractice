package OptionalExamples;

import java.util.Optional;

public class User {
    private String email;
    private boolean active;
    private Profile profile;
    private Optional<Account> account;

    public User(String email, boolean active, Profile profile) {
        this(email, active, profile, Optional.empty());
    }

    public User(String email, boolean active, Profile profile, Optional<Account> account) {
        this.email = email;
        this.active = active;
        this.profile = profile;
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Optional<Account> getAccount() {
        return account;
    }

    public void setAccount(Optional<Account> account) {
        this.account = account;
    }
}
