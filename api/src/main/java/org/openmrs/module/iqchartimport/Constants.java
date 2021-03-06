/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.iqchartimport;

import java.util.UUID;

/**
 * Module constants
 */
public class Constants {
	
	public static final String MODULE_ID = "iqchartimport";
	public static final int ADULT_START_AGE = 15;
	public static final UUID IQCHART_PROVIDER_UUID = UUID.fromString("882DA70A-546B-4641-8AE0-8EF3B30490CB");
	
	/**
	 * Global properties
	 */
	public static final String PROP_TRACNET_ID_TYPE_ID = MODULE_ID + ".tracnetIDTypeId";
	public static final String PROP_ADDRESS_COUNTRY = MODULE_ID + ".addressCountry";
	public static final String PROP_ADDRESS_PROVINCE = MODULE_ID + ".addressProvince";
	public static final String PROP_ADDRESS_ALL_PROVINCES = MODULE_ID + ".addressAllProvinces";
	public static final String PROP_HIV_PROGRAM_ID = MODULE_ID + ".hivProgramId";
	public static final String PROP_TB_PROGRAM_ID = MODULE_ID + ".tbProgramId";
	public static final String PROP_SITE_LOCATION_ID = MODULE_ID + ".encounterLocationId";
	public static final String PROP_DRUG_MAPPINGS = MODULE_ID + ".drugMappings";
}
