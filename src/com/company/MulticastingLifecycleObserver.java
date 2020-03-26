package com.company;

import java.util.Calendar;

public class MulticastingLifecycleObserver implements IHumanLifecycleObserver {
    private final IHumanLifecycleObserver[] observers;

    /**
     * Creates an instance of the class.
     */
    public MulticastingLifecycleObserver(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onHumanWasBorn(BornParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanWasBorn(params);
        }
    }

    @Override
    public void humanGoesToKindergarten(KindergartenParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.humanGoesToKindergarten(params);
        }

    }

    @Override
    public void goesToSchool(SchoolParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.goesToSchool(params);
        }
    }

    @Override
    public void entersUniversity(UniversityParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.entersUniversity(params);
        }
    }

    @Override
    public void employment(JobEmploymentParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.employment(params);
        }
    }

    @Override
    public void wedding(WeddingParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.wedding(params);
        }
    }

    @Override
    public void birthOfChild1(BornChild1Params params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.birthOfChild1(params);
        }
    }

    @Override
    public void jobChange(JobChangeParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.jobChange(params);
        }
    }

    @Override
    public void birthOfChild2(BornChild2Params params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.birthOfChild2(params);
        }
    }

    @Override
    public void retirement(RetirementParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.retirement(params);
        }
    }

    @Override
    public void death(DeathParams params) {
        for (IHumanLifecycleObserver observer : observers) {
            observer.death(params);
        }
    }
}
