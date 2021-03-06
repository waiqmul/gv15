// Copyright 2009-2015 Information & Computational Sciences, JHI. All rights
// reserved. Use is subject to the accompanying licence terms.

package data.auxiliary;

import data.*;

public class CigarInsertEvent extends CigarEvent
{
	private String insertedBases;

	public CigarInsertEvent(Read read, String insertedBases)
	{
		super(read);
		this.insertedBases = insertedBases;
	}

	public String getInsertedBases()
		{ return insertedBases; }
}