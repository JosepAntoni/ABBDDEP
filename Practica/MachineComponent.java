package Practica;

/*
 * This project has been developed by Josep Antoni Costa Camps
 */


import java.util.*;

/**
 *
 * @author jcc30
 */
public abstract class MachineComponent extends Observable{
    protected boolean broken = false;
    
    public abstract boolean isBroken();
}
