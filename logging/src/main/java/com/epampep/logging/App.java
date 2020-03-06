package com.epampep.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	
    	LOGGER.info( "info" );
        LOGGER.debug( "debug" );
        LOGGER.warn( "warn" );
        LOGGER.error( "error" );
        LOGGER.fatal( "fatal" );
    	
    	//Simple Interest
        LOGGER.info( "Simple Interest!" );
        SimpleInterest simpleInterest = new SimpleInterest(1000, 8, 100);
        LOGGER.info("Amount after simple interest calculation: "+simpleInterest.getSimpleInterest());
        
        //Compound Interest
        LOGGER.info( "Compound Interest!" );
        CompoundInterest compoundInterest = new CompoundInterest(1000, 8, 100);
        LOGGER.info("Amount after compound interest calculation: "+compoundInterest.getCompoundInterest());
        
        //House Construction
        LOGGER.info( "House Construction Cost Prediction!" );
        HouseConstruction house1 = new HouseConstruction(4000, "standard");
        LOGGER.info("Estimated cost for house 1: "+house1.getEstimatedCost());
        HouseConstruction house2 = new HouseConstruction(4000, "above standard");
        LOGGER.info("Estimated cost for house 2: "+house2.getEstimatedCost());
        HouseConstruction house3 = new HouseConstruction(4000, "high standard");
        LOGGER.info("Estimated cost for house 3: "+house3.getEstimatedCost());
        HouseConstruction house4 = new HouseConstruction(4000, "high standard and automated");
        LOGGER.info("Estimated cost for house 4: "+house4.getEstimatedCost());
    }
}
