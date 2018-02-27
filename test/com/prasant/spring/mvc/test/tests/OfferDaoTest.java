package com.prasant.spring.mvc.test.tests;

import static org.junit.Assert.assertEquals;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prasant.spring.mvc.dao.OfferDAO;
import com.prasant.spring.mvc.model.Offer;

@ActiveProfiles("test")
@ContextConfiguration(locations = { 
		"classpath:com/prasant/spring/mvc/config/dao-context.xml", 
		"classpath:com/prasant/spring/mvc/test/config/dataSource.xml",
		"classpath:com/prasant/spring/mvc/config/security-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OfferDaoTest {
	@Autowired
	public DataSource dataSource;
	
	@Autowired
	public OfferDAO offerDao;
	
	@Test
	public void testCreateOffer() {
		Offer actual = new Offer("Shaktimaan", "shaktimaan@gita.com", "I wanna rock with somebody");
		Offer expected = offerDao.getOfferById(5);
		assertEquals("Retrieved offer should match", expected, actual);
	}
}
