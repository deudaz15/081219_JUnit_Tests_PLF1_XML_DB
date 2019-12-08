package db_teil1;

import java.util.Objects;

public class Insurance {

    private String insName;
    private Integer piduser;
    private String pnumber;

    public Insurance(String insName, Integer piduser, String pnumber) {
        this.insName = insName;
        this.piduser = piduser;
        this.pnumber = pnumber;
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

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.insName);
        hash = 37 * hash + Objects.hashCode(this.piduser);
        hash = 37 * hash + Objects.hashCode(this.pnumber);
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
        if (!Objects.equals(this.pnumber, other.pnumber)) {
            return false;
        }
        if (!Objects.equals(this.piduser, other.piduser)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Insurance{" + "insName=" + insName + ", piduser=" + piduser + ", pnumber=" + pnumber + '}';
    }

}
