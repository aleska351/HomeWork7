package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * An observer, which receives events of crucial moments of human life.
 */
public interface IHumanLifecycleObserver {
    /**
     * This method is called when a human was born.
     */
    void onHumanWasBorn(BornParams params);

    /*
     *The parameters, which correspond to the 'birth' stage of the human life.
     */
    class BornParams {
        /*
         * The human's gender, where true means male, and false means female.
         */
        public boolean gender;
        /*
        The name of the little human.
         */
        public String name;
        /*
        The date of birth.
         */
        public Calendar birthday;
        /*
        The weight of human
         */
        public double weight;

        public BornParams(boolean gender, String name, Calendar birthday, double weight) {
            this.gender = gender;
            this.name = name;
            this.birthday = birthday;
            this.weight = weight;
        }
    }

    /**
     * This method is called when a human went to kindergarten.
     */
    void humanGoesToKindergarten(KindergartenParams params);

    /**
     *The parameters, which correspond to the 'go to kindergarten' stage of the human life.
     */
    class KindergartenParams {
        /**
        The group in kindergarten
         */
        public String group;
        /**
        The date when human went to kindergarten
         */
        public Calendar goesToKindergarten;

        public KindergartenParams(String group, Calendar goesToKindergartenString) {
            this.group = group;
            this.goesToKindergarten = goesToKindergartenString;
        }
    }
    /**
     * This method is called when a human went to school.
     */

    void goesToSchool(SchoolParams params);
    /**
     *The parameters, which correspond to the 'go to school' stage of the human life.
     */
    class SchoolParams {
        /**
         * The class of human in te school
         */
        public String class_;
        /**
         * The type of school
         */
        public String typeOfSchool;
        /**
         * The date when human went to school
         */
        public Calendar schoolEntry;

        public SchoolParams(String class_, String typeOfSchool, Calendar schoolEntry) {
            this.class_ = class_;
            this.typeOfSchool = typeOfSchool;
            this.schoolEntry = schoolEntry;
        }
    }

    /**
     * This method is called when a human went to school.
     */
    void entersUniversity(UniversityParams params);
    /**
     *The parameters, which correspond to the 'go to university' stage of the human life.
     */
    class UniversityParams {
        /**
         *The name of university
         */
        public String nameOfUniversity;
        /**
         *The specialty of study
         */
        public String specialty;
        /**
         *The price of study :where true means free, and false means contract.
         */
        public boolean freeOrConctract;
        /**
         *The form of study : where true means Full-time, and false means Extramural.
         */
        public boolean formOfStudy;
        /**
         *The date when human went to University
         */
        public Calendar entersUniversity;

        public UniversityParams(String nameOfUniversity, String specialty, boolean freeOrConctract, boolean formOfStudy, Calendar entersUniversity) {
            this.nameOfUniversity = nameOfUniversity;
            this.specialty = specialty;
            this.freeOrConctract = freeOrConctract;
            this.formOfStudy = formOfStudy;
            this.entersUniversity = entersUniversity;
        }
    }

    /**
     * This method is called when a human ggot a job
     */
    void employment(JobEmploymentParams params);
    /**
     *The parameters, which correspond to the 'employment' stage of the human life.
     */
    class JobEmploymentParams {
        /**
         *The name of company
         */
        public String nameCompany;
        /**
         *The position of human on company
         */
        public String position;
        /**
         *The salary
         */
        public int salary;
        /**
         *The date when human got job
         */
        public Calendar employment;

        public JobEmploymentParams(String nameCompany, String position, int salary, Calendar employment) {
            this.nameCompany = nameCompany;
            this.position = position;
            this.salary = salary;
            this.employment = employment;
        }
    }

    /**
     * This method is called when a human went to school.
     */
    void wedding(WeddingParams params);
    /**
     *The parameters, which correspond to the 'wedding' stage of the human life.
     */
    class WeddingParams {
        /**
         *The human's pair gender, where true means male, and false means female.
         */
        public boolean gender;
        /**
         *The name of human's pair
         */
        public String nameOfPair;
        /**
         *The date when human got married
         */
        public Calendar wedding;

        public WeddingParams(boolean gender, String nameOfPair, Calendar wedding) {
            this.gender = gender;
            this.nameOfPair = nameOfPair;
            this.wedding = wedding;
        }
    }

    /**
     * This method is called when a human has a baby.
     */
    void birthOfChild1(BornChild1Params params);
    /**
     *The parameters, which correspond to the 'birth first child' stage of the human life.
     */
    class BornChild1Params {
        /**
         *The human's gender, where true means male, and false means female.
         */
        public boolean gender;
        /**
         *The name of child
         */
        public String nameChild1;
        /**
         * The weight of child
         */
        public double weight;
        /**
         *The date when a person has a baby
         */
        public Calendar birthdayChild1;

        public BornChild1Params(boolean gender, String nameChild1, double weight, Calendar birthdayChild1) {
            this.gender = gender;
            this.nameChild1 = nameChild1;
            this.weight = weight;
            this.birthdayChild1 = birthdayChild1;
        }
    }

    /**
     * This method is called when a human changed job.
     */
    void jobChange(JobChangeParams params);
    /**
     *The parameters, which correspond to the 'change job' stage of the human life.
     */
    class JobChangeParams {
        /**
         *The name of company
         */
        public String nameCompany;
        /**
         *The position on company
         */
        public String position;
        /**
         *The salary
         */
        public int salary;
        /**
         *The date when human change a job
         */
        public Calendar employment;

        public JobChangeParams(String nameCompany, String position, int salary, Calendar employment) {
            this.nameCompany = nameCompany;
            this.position = position;
            this.salary = salary;
            this.employment = employment;
        }
    }

    /**
     * This method is called when a person has a baby.
     */
    void birthOfChild2(BornChild2Params params);
    /**
     *The parameters, which correspond to the 'birth second child' stage of the human life.
     */
    class BornChild2Params {
        /**
         *The child's gender, where true means male, and false means female.
         */
        public boolean gender;
        /**
         *The name of child
         */
        public String nameChild2;
        /**
         *The weight of child
         */
        public double weight;
        /**
         *The date of birth second child
         */
        public Calendar birthdayChild2;

        public BornChild2Params(boolean gender, String nameChild2, double weight, Calendar birthdayChild2) {
            this.gender = gender;
            this.nameChild2 = nameChild2;
            this.weight = weight;
            this.birthdayChild2 = birthdayChild2;
        }
    }

    /**
     * This method is called when a human retired.
     */
    void retirement(RetirementParams params);
    /**
     *The parameters, which correspond to the 'go to school' stage of the human life.
     */
    class RetirementParams {
        /**
         *The date when human retired
         */
        public Calendar retirement;
        /**
         *The pension amount
         */
        public int pension_amount;

        public RetirementParams(Calendar retirement, int pension_amount) {
            this.retirement = retirement;
            this.pension_amount = pension_amount;
        }
    }

    /**
     * This method is called when a human death.
     */
    void death(DeathParams params);
    /**
     *The parameters, which correspond to the 'death' stage of the human life.
     */
    class DeathParams {
        /**
         *The date when human died
         */
        public Calendar deathday;
        /**
         *The reason of death
         */
        public String reason;

        public DeathParams(Calendar deathday, String reason) {
            this.deathday = deathday;
            this.reason = reason;
        }
    }
}