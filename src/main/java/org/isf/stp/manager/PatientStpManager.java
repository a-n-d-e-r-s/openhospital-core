/*
 * Open Hospital (www.open-hospital.org)
 * Copyright © 2006-2021 Informatici Senza Frontiere (info@informaticisenzafrontiere.org)
 *
 * Open Hospital is a free and open source software for healthcare data management.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * https://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.isf.stp.manager;

import java.util.HashMap;
import java.util.List;

import org.isf.stp.model.PatientStp;
import org.isf.stp.service.PatientStpIoOperations;
import org.isf.utils.exception.OHException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientStpManager {

	@Autowired
	private PatientStpIoOperations ioOperations;

	public PatientStp getById(int patId) {
		return this.ioOperations.getById(patId);
	}

	public List<PatientStp> findAll() {
		return this.ioOperations.findAll();
	}

	public void saveOrUpdate(PatientStp patStp) {
		this.ioOperations.saveOrUpdate(patStp);
	}

	public HashMap<Integer, String> getHashMap() throws OHException {
		List<PatientStp> stpList = findAll();
		HashMap<Integer, String> stpMap = new HashMap<Integer, String>();
		for (PatientStp stp : stpList) {
			stpMap.put(stp.getId(), stp.getStp());
		}
		return stpMap;
	}

}
