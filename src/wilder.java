import java.lang.constant.Constable;

public class wilder {
    public String firstname;
    public boolean aware;

    public wilder(String firstname, Boolean aware) {
        this.firstname = firstname;
        this.aware = true;
    }

    public String getFirstname() {
        return  this.firstname;
    }

    public Boolean getAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(Boolean aware) {
        this.aware = aware;
    }

    public String wohAmi() {
        if (!getAware()) {
            return "Je m'appelle " + getFirstname() + "et je ne suis pas aware";
        } else {
            return  "Je m'appelle " + getFirstname() + "et je suis aware";
        }
    }

}
