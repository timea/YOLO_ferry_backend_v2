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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Entity
@Table(name = "Routes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Routes.findAll", query = "SELECT r FROM Routes r"),
    @NamedQuery(name = "Routes.findByRouteId", query = "SELECT r FROM Routes r WHERE r.routeId = :routeId"),
    @NamedQuery(name = "Routes.findByDepartureHarbor", query = "SELECT r FROM Routes r WHERE r.departureHarbor = :departureHarbor"),
    @NamedQuery(name = "Routes.findByArrivalHarbor", query = "SELECT r FROM Routes r WHERE r.arrivalHarbor = :arrivalHarbor"),
    @NamedQuery(name = "Routes.findByPrice", query = "SELECT r FROM Routes r WHERE r.price = :price"),
    @NamedQuery(name = "Routes.findByFerry", query = "SELECT r FROM Routes r WHERE r.ferry = :ferry"),
    @NamedQuery(name = "Routes.findByRestrictionNote", query = "SELECT r FROM Routes r WHERE r.restrictionNote = :restrictionNote"),
    @NamedQuery(name = "Routes.findByScheduleId", query = "SELECT r FROM Routes r WHERE r.scheduleId = :scheduleId")})
public class Routes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "route_id")
    private Integer routeId;
    @Column(name = "departure_harbor")
    private Integer departureHarbor;
    @Column(name = "arrival_harbor")
    private Integer arrivalHarbor;
    @Column(name = "price")
    private Integer price;
    @Column(name = "ferry")
    private Integer ferry;
    @Size(max = 200)
    @Column(name = "restriction_note")
    private String restrictionNote;
    @Column(name = "schedule_id")
    private Integer scheduleId;

    public Routes() {
    }

    public Routes(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getDepartureHarbor() {
        return departureHarbor;
    }

    public void setDepartureHarbor(Integer departureHarbor) {
        this.departureHarbor = departureHarbor;
    }

    public Integer getArrivalHarbor() {
        return arrivalHarbor;
    }

    public void setArrivalHarbor(Integer arrivalHarbor) {
        this.arrivalHarbor = arrivalHarbor;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFerry() {
        return ferry;
    }

    public void setFerry(Integer ferry) {
        this.ferry = ferry;
    }

    public String getRestrictionNote() {
        return restrictionNote;
    }

    public void setRestrictionNote(String restrictionNote) {
        this.restrictionNote = restrictionNote;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (routeId != null ? routeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Routes)) {
            return false;
        }
        Routes other = (Routes) object;
        if ((this.routeId == null && other.routeId != null) || (this.routeId != null && !this.routeId.equals(other.routeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Routes[ routeId=" + routeId + " ]";
    }
    
}
