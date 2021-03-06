/*******************************************************************************
 * Copyright (c) 2016, 2017 Iotracks, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Saeid Baghbidi
 * Kilton Hopkins
 *  Ashita Nagar
 *******************************************************************************/
package org.eclipse.iofog.process_manager;

import java.util.Comparator;

import org.eclipse.iofog.process_manager.ContainerTask.Tasks;

public class TaskComparator implements Comparator<ContainerTask> {

	@Override
	public int compare(ContainerTask o1, ContainerTask o2) {
		if (o1.action == Tasks.REMOVE)
			return -1;
		else if (o2.action == Tasks.REMOVE)
			return 1;
		else 
			return 0;
	}

}
