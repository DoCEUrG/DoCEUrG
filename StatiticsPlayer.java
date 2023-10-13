package fr.DocEUrG.SMD.annotations.statistics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Statistics usage
 * Annotation for method who return IPlayerWW, One per Class !!!
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface StatisticsPlayer {
}
