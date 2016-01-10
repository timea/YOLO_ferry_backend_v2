/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DTOs.AllAboutCustomerDTO;
import DTOs.AllForBookingDTO;
import DTOs.BookingDTO;
import DTOs.CustomerDTO;
import DTOs.DiscountDTO;
import DTOs.FerryDTO;
import DTOs.HarborDTO;
import DTOs.OrderDTO;
import DTOs.RouteDTO;
import DTOs.ScheduleDTO;
import DTOs.VehicleDTO;
import ETOs.NoTransactionETO;
import ETOs.NoConnectionETO;
import ETOs.NoCustomerETO;
import ETOs.NoDiscountETO;
import ETOs.NoFerryETO;
import ETOs.NoHarborETO;
import ETOs.NoRouteETO;
import ETOs.NoScheduleETO;
import ETOs.NoVehicleETO;
import contracts.AdminContract;
import entities.*;
import java.util.Collection;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
@Stateless
//@Binding(jndiBinding="tutorialsPoint/librarySession")
public class BackendBean implements AdminContract {
    
    @PersistenceContext//(unitName = "com.awesome_YOLO_ferry_backend_v2_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
//    @Resource
//    SessionContext ctx;
    
    public BackendBean(){};

    @Override
    public Collection<FerryDTO> getAllFerries() throws NoFerryETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createFerry(FerryDTO ferry) throws NoTransactionETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editFerry(FerryDTO editedFerry, int ferryId) throws NoFerryETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createRoute(RouteDTO route) throws NoTransactionETO {
        Routes newRoute = new Routes();
        newRoute.setArrivalHarbor(route.getArrivalHarbor().getId());
        newRoute.setDepartureHarbor(route.getDepartureHarbor().getId());
        newRoute.setScheduleId(route.getSchedule().getId());
        newRoute.setFerry(route.getFerry().getId());
        newRoute.setRestrictionId(route.getRestriction().getId());
        newRoute.setPrice((int)route.getPrice());
        System.out.println("MUIE");
        try{
            em.persist(newRoute);
            System.out.println("MUIE2");
            return true;
        } catch(Exception e){
            NoTransactionETO eto = new NoTransactionETO("Invalid Transaction");
            throw eto;
        }
    }

    @Override
    public Collection<RouteDTO> getAllRoutes() throws NoRouteETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<HarborDTO> getAllHarbors() throws NoHarborETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<VehicleDTO> getAllVehicles() throws NoVehicleETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ScheduleDTO getSchedule(int scheduleId) throws NoScheduleETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<DiscountDTO> getAllDiscounts() throws NoDiscountETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AllForBookingDTO getAllForBooking() throws NoConnectionETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(BookingDTO booking) throws NoTransactionETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customer) {
       Customers cust = new Customers();
       cust.setFirstName(customer.getFirstName()); 
       cust.setLastName(customer.getLastName());
        System.out.println(cust.toString());
       em.persist(cust);
       return customer;
    }

    @Override
    public boolean editCustomer(CustomerDTO editedCustomer, int customerId) throws NoCustomerETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AllAboutCustomerDTO getAllAboutCustomer(String email) throws NoCustomerETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<OrderDTO> getCustomerHistory(int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editBooking(BookingDTO editedBooking, int bookingId) throws NoTransactionETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createHarbor(HarborDTO harbor) throws NoTransactionETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createSchedule(ScheduleDTO schedule) throws NoTransactionETO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
