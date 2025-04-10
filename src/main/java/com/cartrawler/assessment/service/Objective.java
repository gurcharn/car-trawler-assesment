package com.cartrawler.assessment.service;

/*
 * The base class for all objectives in the chain of responsibility pattern.
 * Each objective processes the context and can pass it to the next objective.
 */
public abstract class Objective {

    Objective next;

    /**
     * Sets the next objective in the chain.
     * @param next The next objective to set.
     * @return The next objective.
     */
    public Objective setNext(Objective next) {
        this.next = next;
        return next;
    }

    /**
     * Handles the context by processing it and passing it to the next objective.
     * @param context The context to process.
     */
    public void handle(Context context) {
        process(context);
        if (next != null) {
            next.handle(context);
        }
    }

    /**
     * Abstract method to be implemented by subclasses to process the context.
     * @param context The context to process.
     */
    abstract void process(Context context);

}
