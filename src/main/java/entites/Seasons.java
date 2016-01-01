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
@Table(name = "Seasons")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seasons.findAll", query = "SELECT s FROM Seasons s"),
    @NamedQuery(name = "Seasons.findBySeasonId", query = "SELECT s FROM Seasons s WHERE s.seasonId = :seasonId"),
    @NamedQuery(name = "Seasons.findByName", query = "SELECT s FROM Seasons s WHERE s.name = :name"),
    @NamedQuery(name = "Seasons.findByStartDate", query = "SELECT s FROM Seasons s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "Seasons.findByEndDate", query = "SELECT s FROM Seasons s WHERE s.endDate = :endDate")})
public class Seasons implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "season_id")
    private Integer seasonId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "start_date")
    private String startDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "end_date")
    private String endDate;

    public Seasons() {
    }

    public Seasons(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Seasons(Integer seasonId, String name, String startDate, String endDate) {
        this.seasonId = seasonId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seasonId != null ? seasonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seasons)) {
            return false;
        }
        Seasons other = (Seasons) object;
        if ((this.seasonId == null && other.seasonId != null) || (this.seasonId != null && !this.seasonId.equals(other.seasonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Seasons[ seasonId=" + seasonId + " ]";
    }
    
}
