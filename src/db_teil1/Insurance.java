package db_teil1;

import java.util.Objects;

public class Insurance {

    private String insName;
    private Integer piduser;

    public Insurance(String insName, Integer piduser) {
        this.insName = insName;
        this.piduser = piduser;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public Integer getPiduser() {
        return piduser;
    }

    public void setPiduser(Integer piduser) {
        this.piduser = piduser;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.insName);
        hash = 37 * hash + Objects.hashCode(this.piduser);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Insurance other = (Insurance) obj;
        if (!Objects.equals(this.insName, other.insName)) {
            return false;
        }
        if (!Objects.equals(this.piduser, other.piduser)) {
            return false;
        }
        return true;
    }


}
