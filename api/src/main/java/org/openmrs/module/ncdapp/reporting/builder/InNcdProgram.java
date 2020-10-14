package org.openmrs.module.ncdapp.reporting.builder;

import org.openmrs.module.kenyacore.report.CohortReportDescriptor;
import org.openmrs.module.kenyacore.report.builder.Builds;
import org.openmrs.module.kenyacore.report.builder.CalculationReportBuilder;
import org.openmrs.module.reporting.dataset.definition.PatientDataSetDefinition;
import org.springframework.stereotype.Component;

@Component
@Builds({ "ncdapp.ncd.report.inProgram" })
public class InNcdProgram extends CalculationReportBuilder {
	
	@Override
	protected void addColumns(CohortReportDescriptor report, PatientDataSetDefinition dsd) {
		addStandardColumns(report, dsd);
	}
}
