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
import DTOs.RestrictionDTO;
import DTOs.RouteDTO;
import DTOs.ScheduleDTO;
import DTOs.VehicleDTO;
import ETOs.NoConnectionETO;
import ETOs.NoCustomerETO;
import ETOs.NoDiscountETO;
import ETOs.NoFerryETO;
import ETOs.NoHarborETO;
import ETOs.NoRouteETO;
import ETOs.NoScheduleETO;
import ETOs.NoTransactionETO;
import ETOs.NoVehicleETO;
import contracts.AdminContract;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Timea Kiss hello@timeakiss.com
 */
public class BackendBeanTest {
    
   
    private contracts.AdminContract backendBean;
    
    public BackendBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createRoute method, of class BackendBean.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreateRoute() throws Exception {
        RouteDTO route = new RouteDTO(3, new HarborDTO(1, ""), new HarborDTO(2, ""), 40, 
              new FerryDTO(1, 2, 2, 2, 2, true, false, null, 1), 
              new RestrictionDTO(1, "Muie", "bigMuie"), new ScheduleDTO(1, null, null));
        //EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        //AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
        boolean expResult = true;
        backendBean = new BackendBean();
        boolean result = backendBean.createRoute(route);
        assertEquals(expResult, result);
        //container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
    
//    /**
//     * Test of getAllFerries method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllFerries() throws Exception {
//        System.out.println("getAllFerries");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        Collection<FerryDTO> expResult = null;
//        Collection<FerryDTO> result = instance.getAllFerries();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createFerry method, of class BackendBean.
//     */
//    @Test
//    public void testCreateFerry() throws Exception {
//        System.out.println("createFerry");
//        FerryDTO ferry = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        boolean expResult = false;
//        boolean result = instance.createFerry(ferry);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editFerry method, of class BackendBean.
//     */
//    @Test
//    public void testEditFerry() throws Exception {
//        System.out.println("editFerry");
//        FerryDTO editedFerry = null;
//        int ferryId = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        boolean expResult = false;
//        boolean result = instance.editFerry(editedFerry, ferryId);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createRoute method, of class BackendBean.
//     */
//    @Test
//    public void testCreateRoute() throws Exception {
//        System.out.println("createRoute");
//        RouteDTO route = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        boolean expResult = true;
//        boolean result = instance.createRoute(route);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllRoutes method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllRoutes() throws Exception {
//        System.out.println("getAllRoutes");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        Collection<RouteDTO> expResult = null;
//        Collection<RouteDTO> result = instance.getAllRoutes();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllHarbors method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllHarbors() throws Exception {
//        System.out.println("getAllHarbors");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        Collection<HarborDTO> expResult = null;
//        Collection<HarborDTO> result = instance.getAllHarbors();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllVehicles method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllVehicles() throws Exception {
//        System.out.println("getAllVehicles");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        Collection<VehicleDTO> expResult = null;
//        Collection<VehicleDTO> result = instance.getAllVehicles();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSchedule method, of class BackendBean.
//     */
//    @Test
//    public void testGetSchedule() throws Exception {
//        System.out.println("getSchedule");
//        int scheduleId = 0;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        ScheduleDTO expResult = null;
//        ScheduleDTO result = instance.getSchedule(scheduleId);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllDiscounts method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllDiscounts() throws Exception {
//        System.out.println("getAllDiscounts");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        Collection<DiscountDTO> expResult = null;
//        Collection<DiscountDTO> result = instance.getAllDiscounts();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllForBooking method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllForBooking() throws Exception {
//        System.out.println("getAllForBooking");
//        BackendBean instance = new BackendBean();
//        AllForBookingDTO expResult = null;
//        AllForBookingDTO result = instance.getAllForBooking();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of book method, of class BackendBean.
//     */
//    @Test
//    public void testBook() throws Exception {
//        System.out.println("book");
//        BookingDTO booking = null;
//        BackendBean instance = new BackendBean();
//        boolean expResult = false;
//        boolean result = instance.book(booking);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createCustomer method, of class BackendBean.
//     */
//    @Test
//    public void testCreateCustomer() throws Exception {
//        System.out.println("createCustomer");
//        CustomerDTO customer = null;
//        BackendBean instance = new BackendBean();
//        CustomerDTO expResult = null;
//        CustomerDTO result = instance.createCustomer(customer);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editCustomer method, of class BackendBean.
//     */
//    @Test
//    public void testEditCustomer() throws Exception {
//        System.out.println("editCustomer");
//        CustomerDTO editedCustomer = null;
//        int customerId = 0;
//        BackendBean instance = new BackendBean();
//        boolean expResult = false;
//        boolean result = instance.editCustomer(editedCustomer, customerId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllAboutCustomer method, of class BackendBean.
//     */
//    @Test
//    public void testGetAllAboutCustomer() throws Exception {
//        System.out.println("getAllAboutCustomer");
//        String email = "";
//        BackendBean instance = new BackendBean();
//        AllAboutCustomerDTO expResult = null;
//        AllAboutCustomerDTO result = instance.getAllAboutCustomer(email);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCustomerHistory method, of class BackendBean.
//     */
//    @Test
//    public void testGetCustomerHistory() throws Exception {
//        System.out.println("getCustomerHistory");
//        int customerId = 0;
//        BackendBean instance = new BackendBean();
//        Collection<OrderDTO> expResult = null;
//        Collection<OrderDTO> result = instance.getCustomerHistory(customerId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editBooking method, of class BackendBean.
//     */
//    @Test
//    public void testEditBooking() throws Exception {
//        System.out.println("editBooking");
//        BookingDTO editedBooking = null;
//        int bookingId = 0;
//        BackendBean instance = new BackendBean();
//        instance.editBooking(editedBooking, bookingId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createHarbor method, of class BackendBean.
//     */
//    @Test
//    public void testCreateHarbor() throws Exception {
//        System.out.println("createHarbor");
//        HarborDTO harbor = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        boolean expResult = false;
//        boolean result = instance.createHarbor(harbor);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createSchedule method, of class BackendBean.
//     */
//    @Test
//    public void testCreateSchedule() throws Exception {
//        System.out.println("createSchedule");
//        ScheduleDTO schedule = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AdminContract instance = (AdminContract)container.getContext().lookup("java:global/classes/BackendBean");
//        boolean expResult = false;
//        boolean result = instance.createSchedule(schedule);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
