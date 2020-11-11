package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<>("Davide", "Cassani", "dcassani", 53);
        final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<>("Bernie", "Ecclestone", "becclestone", 83);
        final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<>("Ferdinando", "Alonso", "falonso", 34);

        falonso.addSport(Sport.Bike);
        falonso.addSport(Sport.F1);
        falonso.addSport(Sport.Soccer);
        
        System.out.println("Alonso practices F1: " + falonso.hasSport(Sport.F1));
        System.out.println("Alonso does not like volley: " + !falonso.hasSport(Sport.Volley));
        /*
         * Cassani practiced bike and loves F1 and MotoGP
         */
        dcassani.addSport(Sport.Bike);
        dcassani.addSport(Sport.F1);
        dcassani.addSport(Sport.MotoGP);
        System.out.println("Cassani has been a professional biker: "
                + dcassani.hasSport(Sport.Bike));
        System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(Sport.Soccer));
        /**
         * Ecclestone is the de-facto owner of F1 but also a fan of basket.
         */
        becclestone.addSport(Sport.F1);
        becclestone.addSport(Sport.Basket);
        System.out.println("Bernie's the boss when it comes to F1: "
                + becclestone.hasSport(Sport.F1));
        System.out.println("Bernie does love playing also basket: "
                + becclestone.hasSport(Sport.Basket));

    }
}
