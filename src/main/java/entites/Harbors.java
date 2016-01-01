/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angeloron
 */
@Entity
@Table(name = "Harbors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Harbors.findAll", query = "SELECT h FROM Harbors h"),
    @NamedQuery(name = "Harbors.findByHarborId", query = "SELECT h FROM Harbors h WHERE h.harborId = :harborId"),
    @NamedQuery(name = "Harbors.findByName", query = "SELECT h FROM Harbors h WHERE h.name = :name")})
public class Harbors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "harbor_id")
    private Integer harborId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;

    public Harbors() {
    }

    public Harbors(Integer harborId) {
        this.harborId = harborId;
    }

    public Harbors(Integer harborId, String name) {
        this.harborId = harborId;
        this.name = name;
    }

    public Integer getHarborId() {
        return harborId;
    }

    public void setHarborId(Integer harborId) {
        this.harborId = harborId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (harborId != null ? harborId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Harbors)) {
            return false;
        }
        Harbors other = (Harbors) object;
        if ((this.harborId == null && other.harborId != null) || (this.harborId != null && !this.harborId.equals(other.harborId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Harbors[ harborId=" + harborId + " ]";
    }
    
}
