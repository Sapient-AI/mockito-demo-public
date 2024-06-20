package demo.mockito;

import java.io.Serializable;
import java.util.Objects;

public class User implements Comparable<User>, Serializable {

    private String id;
    private String passwordHash;
    private boolean enabled;

    public User() {
    }

    public User(String id, String passwordHash, boolean enabled) {
        this.id = id;
        this.passwordHash = passwordHash;
        this.enabled = enabled;
    }

    @Override
    public int compareTo(User user) {
        if(id != null)
            return this.id.compareTo(user.getId());
        return 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String generateRandomPassword() {return "ZZ";}

    @SuppressWarnings("unused")
    protected String concatIdAndPassword() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return enabled == user.enabled && Objects.equals(id, user.id) && Objects.equals(passwordHash,
                user.passwordHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passwordHash, enabled);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add2(int a) {
        return a + 2;
    }

    public short add3(short a) {
        return (short) (a + 2);
    }

    public short add4() {
        short a = 2;
        return 0;
    }

    public byte add5(byte a) {
        return 0;
    }

    public byte add6(byte b) {
        byte a = 7;
        return (byte) (a + b);
    }

}
