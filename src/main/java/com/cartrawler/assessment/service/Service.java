package com.cartrawler.assessment.service;

/*
 * Service class that initializes the chain of objectives and runs it.
 * The chain consists of DuplicateRemover, GroupSorter, and FullFullFilter.
 */
public class Service {

    /**
     * The chain of objectives to process the car results.
     * The chain consists of DuplicateRemover, GroupSorter, and FullFullFilter.
     */
    private final Objective objective;

    /**
     * Constructor that initializes the chain of objectives.
     * The chain consists of DuplicateRemover, GroupSorter, and FullFullFilter.
     */
    public Service() {
        objective = new DuplicateRemover()
            .setNext(new GroupSorter())
            .setNext(new FullFullFilter());
    }

    /**
     * Runs the chain of objectives on the given context.
     * @param context The context to process.
     */
    public void runChainOfObjectives(Context context) {
        objective.process(context);
    }

}
