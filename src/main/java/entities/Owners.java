/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Entity
@Table(name = "Owners")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Owners.findAll", query = "SELECT o FROM Owners o"),
    @NamedQuery(name = "Owners.findByOwnerId", query = "SELECT o FROM Owners o WHERE o.ownerId = :ownerId"),
    @NamedQuery(name = "Owners.findByName", query = "SELECT o FROM Owners o WHERE o.name = :name")})
public class Owners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "owner_id")
    private Integer ownerId;
    @Column(name = "name")
    private Integer name;

    public Owners() {
    }

    public Owners(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ownerId != null ? ownerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Owners)) {
            return false;
        }
        Owners other = (Owners) object;
        if ((this.ownerId == null && other.ownerId != null) || (this.ownerId != null && !this.ownerId.equals(other.ownerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Owners[ ownerId=" + ownerId + " ]";
    }
    
}
