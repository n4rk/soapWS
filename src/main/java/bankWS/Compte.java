package bankWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date createdAt;

    public Compte() {}

    public Compte(int code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.createdAt = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
