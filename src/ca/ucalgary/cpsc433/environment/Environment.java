package ca.ucalgary.cpsc433.environment;

import com.sun.corba.se.impl.interceptors.SlotTableStack;

import ca.ucalgary.cpsc433.schedule.Slot;

/**
 * @author Obicere
 */
public class Environment {

    private final String name;

    private final Slot[] labSlots;

    private final Slot[] lectureSlots;

    private final Lab[] labs;

    private final Lecture[] lectures;

    private final NotCompatible[] notCompatibles;

    private final Pair[] pairs;

    private final PartialAssign[] partialAssigns;

    private final Preference[] preferences;

    private final Unwanted[] unwanted;

    public Environment(final String name, final Slot[] lectureSlots, final Slot[] labSlots, final Lecture[] lectures, final Lab[] labs, final NotCompatible[] notCompatibles, final Unwanted[] unwanted, final Preference[] preferences, final Pair[] pairs, final PartialAssign[] partialAssigns) {
        this.name = name;
        this.lectureSlots = lectureSlots;
        this.labSlots = labSlots;
        this.labs = labs;
        this.lectures = lectures;
        this.notCompatibles = notCompatibles;
        this.unwanted = unwanted;
        this.preferences = preferences;
        this.pairs = pairs;
        this.partialAssigns = partialAssigns;
    }

    public String getName() {
        return name;
    }

    public Slot[] getLabSlots() {
        return labSlots.clone();
    }

    public Slot[] getLectureSlots() {
        return lectureSlots.clone();
    }
    
    public int getSlotCount() {
    	return lectureSlots.length;
    }

    public int getLabCount() {
        return labs.length;
    }

    public Lab[] getLabs() {
        return labs.clone();
    }

    public int getLectureCount() {
        return lectures.length;
    }

    public Lecture[] getLectures() {
        return lectures.clone();
    }

    public NotCompatible[] getNotCompatibles() {
        return notCompatibles.clone();
    }

    public Unwanted[] getUnwanted() {
        return unwanted.clone();
    }

    public Preference[] getPreferences() {
        return preferences.clone();
    }

    public Pair[] getPairs() {
        return pairs.clone();
    }

    public PartialAssign[] getPartialAssigns() {
        return partialAssigns.clone();
    }
}
