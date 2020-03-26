package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * The observer, which logs to console every moment of human's life.
 */
public class LoggingHumanLifecycleObserver implements IHumanLifecycleObserver {
    String name;
    SimpleDateFormat dateFormat = new SimpleDateFormat(" EEEE dd MMMM YYYY", Locale.ENGLISH);

    @Override
    public void onHumanWasBorn(BornParams params) {
        System.out.printf("%s was born with name %s at %s with weight %.2f",
                params.gender ? "Male" : "Female",
                this.name = params.name, dateFormat.format(params.birthday.getTime()), params.weight);
        System.out.println();
    }

    @Override
    public void humanGoesToKindergarten(KindergartenParams params) {
        System.out.printf("%s went to kindergarten at %s to %s group   ",
                name, dateFormat.format(params.goesToKindergarten.getTime()), params.group);
        System.out.println();
    }

    @Override
    public void goesToSchool(SchoolParams params) {
        System.out.printf("%s went to %s to %s class at %s",
                name, params.typeOfSchool, params.class_, dateFormat.format(params.schoolEntry.getTime()));
        System.out.println();
    }

    @Override
    public void entersUniversity(UniversityParams params) {
        System.out.printf("%s went to %s at %s for specialty %s for  %s  and %s studies",
                name, params.nameOfUniversity, dateFormat.format(params.entersUniversity.getTime()), params.specialty,
                params.freeOrConctract ? "Free" : "Contract", params.formOfStudy ? "Full-time" : "Extramural");
        System.out.println();
    }

    @Override
    public void employment(JobEmploymentParams params) {
        System.out.printf("%s got a job at a company %s for a position %s with a salary  %d $ at %s",
                name, params.nameCompany, params.position, params.salary, dateFormat.format(params.employment.getTime()));
        System.out.println();
    }

    @Override
    public void wedding(WeddingParams params) {
        System.out.printf("%s married to perfect %s %s at  %s ", name, params.gender ? "man" : "woman", params.nameOfPair, dateFormat.format(params.wedding.getTime()));
        System.out.println();
    }

    @Override
    public void birthOfChild1(BornChild1Params params) {
        System.out.printf("At %s was born a %s  with name %s at %s with weight %.2f",
                name, params.gender ? "boy" : "girl",
                params.nameChild1,
                dateFormat.format(params.birthdayChild1.getTime()), params.weight);
        System.out.println();
    }

    @Override
    public void jobChange(JobChangeParams params) {
        System.out.printf("%s got a new job at a company %s for a position %s with a salary  %d $ at %s",
                name, params.nameCompany, params.position, params.salary, dateFormat.format(params.employment.getTime()));
        System.out.println();
    }

    @Override
    public void birthOfChild2(BornChild2Params params) {
        System.out.printf("At %s was born a %s  with name %s at %s with weight %.2f",
                name, params.gender ? "boy" : "girl",
                params.nameChild2,
                dateFormat.format(params.birthdayChild2.getTime()), params.weight);
        System.out.println();
    }

    @Override
    public void retirement(RetirementParams params) {
        System.out.printf("%s retired at %s  with pension amount %d $", name, dateFormat.format(params.retirement.getTime()),params.pension_amount);
        System.out.println();
    }

    @Override
    public void death(DeathParams params) {
        System.out.printf("%s died at %s year for a reason: %s", name, dateFormat.format(params.deathday.getTime()),params.reason);
        System.out.println();
    }
}

