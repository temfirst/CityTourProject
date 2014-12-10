/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citytour.SessionBeans;

import com.citytour.entities.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Betty
 */
@Stateless
public class ScheduleFacade extends AbstractFacade<Schedule> {
    @PersistenceContext(unitName = "com.mycompany_CityTourAndTravel_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ScheduleFacade() {
        super(Schedule.class);
    }
    
}