package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

//create anonymous class
        IHumanLifecycleObserver myAbstractobserver = new IHumanLifecycleObserver() {
            @Override
            public void onHumanWasBorn(BornParams params) {
                System.out.println("Log: onHumanWasBorn ");
                System.out.println();
            }

            @Override
            public void humanGoesToKindergarten(KindergartenParams params) {
                System.out.println("Log: humanGoesToKindergarten ");
                System.out.println();
            }

            @Override
            public void goesToSchool(SchoolParams params) {
                System.out.println("Log: goesToSchool ");
                System.out.println();
            }

            @Override
            public void entersUniversity(UniversityParams params) {
                System.out.println("Log: entersUniversity ");
                System.out.println();
            }

            @Override
            public void employment(JobEmploymentParams params) {
                System.out.println("Log: employment ");
                System.out.println();
            }

            @Override
            public void wedding(WeddingParams params) {
                System.out.println("Log: wedding ");
                System.out.println();
            }

            @Override
            public void birthOfChild1(BornChild1Params params) {
                System.out.println("Log: birthOfChild1 ");
                System.out.println();
            }

            @Override
            public void jobChange(JobChangeParams params) {
                System.out.println("Log: jobChange ");
                System.out.println();
            }

            @Override
            public void birthOfChild2(BornChild2Params params) {
                System.out.println("Log: birthOfChild2 ");
                System.out.println();
            }

            @Override
            public void retirement(RetirementParams params) {
                System.out.println("Log: retirement ");
                System.out.println();
            }

            @Override
            public void death(DeathParams params) {
                System.out.println("Log: death ");
                System.out.println();
            }
        };
        // create the simulation
        HumanLifecycle lifecycleSimulator = new HumanLifecycle();
        IHumanLifecycleObserver observer = new LoggingHumanLifecycleObserver();

        // start life
        lifecycleSimulator.doLife(observer);
        System.out.println("__________________________________________________________________________________________");
        // bind multiple observers together
        IHumanLifecycleObserver[] observers = new IHumanLifecycleObserver[]{
                observer, myAbstractobserver};
        // instantiate a delegating observer
        IHumanLifecycleObserver observer2 = new MulticastingLifecycleObserver(observers);
        // start life
        lifecycleSimulator.doLife(observer2);


    }
}
