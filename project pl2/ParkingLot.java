package com.ucsc.ooad.system;

import java.util.ArrayList;

/**
 * @author Pratibha
 * 
 * This class has count of parking slots list of all parking slots 
 */
public class ParkingLot 
{
	private static final int numberOfSlots = 5;
	
	private ArrayList<ParkingSlot> listOfSlots = null;
	
	public ParkingLot()
	{
		listOfSlots = new ArrayList<>();
	}
	
	/**
	 * This method returns list of all the parking slots 
	 * 
	 * @return list of the slots in the parking lot
	 */
	public ArrayList<ParkingSlot> getParkingSlots()
	{
		for (int i = 1; i <= numberOfSlots; i++)
		{
			ParkingSlot slot = new ParkingSlot(i, true);
			listOfSlots.add(slot);
		}
		return listOfSlots;
	}
	
}