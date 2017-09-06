package lesson15;

public class Android {
    private String provider;
    private int version;

    public Android() {}

    public Android(String provider, int version) {
        this.provider = provider;
        this.version = version;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
