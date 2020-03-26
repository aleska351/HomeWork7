package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import com.company.IHumanLifecycleObserver.*;
/**
 * The class emulates human lifecycle from birth to death.
 *
 * The following stages are supported:
 * - birth
 */
public class HumanLifecycle {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd mm yyyy");

    /**
     * The method starts the lifecycle.
     */
    public void doLife(IHumanLifecycleObserver observer) {
        Random random = new Random();
        Calendar calendar = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");

        // the lifecycle starts with a birth
        observer.onHumanWasBorn(new BornParams(random.nextBoolean(),"Sasha" , new GregorianCalendar(1994, 11, 10), 3.45));
        observer.humanGoesToKindergarten(new KindergartenParams("young", new GregorianCalendar(1998, 9, 10)));
        observer.goesToSchool(new SchoolParams("1A", "gymnasium", new GregorianCalendar(2001,9,1)));
        observer.entersUniversity(new UniversityParams("Kharkiv National University of Radio Electronics", "Computer Science", random.nextBoolean(), random.nextBoolean(),new GregorianCalendar(2012,1,9)));
        observer.employment(new JobEmploymentParams("Pied Piper", "Java Developer", 1000,new GregorianCalendar(2018,11,11)));
        observer.wedding(new WeddingParams(random.nextBoolean(),"Zhenya", new GregorianCalendar(2020,6,4)));
        observer.birthOfChild1(new BornChild1Params(random.nextBoolean(),"Kim",3.5,new GregorianCalendar(2021,7,22)));
        observer.jobChange(new JobChangeParams("Hooli","Team Lead", 5000,new GregorianCalendar(2026,5,17)));
        observer.birthOfChild2(new BornChild2Params(random.nextBoolean(),"Lee",4.15,new GregorianCalendar(2027,11,25)));
        observer.retirement(new RetirementParams(new GregorianCalendar(2060,10,10),30000));
        observer.death(new DeathParams(new GregorianCalendar(2075,1,15),"infarct"));
    }
}