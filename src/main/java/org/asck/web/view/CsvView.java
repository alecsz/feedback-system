package org.asck.web.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.asck.web.service.model.Answer;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class CsvView extends AbstractCsvView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildCsvDocument(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		response.setHeader("Content-Disposition", "attachment; filename=\"AnswersReport.csv\"");

		List<Answer> answers = (List<Answer>) model.get("answers");
		String[] header = { "questionId", "optionId", "remark", "answeredAt" };

		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

		csvWriter.writeHeader(header);

		for (Answer answer : answers) {
			csvWriter.write(answer, header);
		}
		csvWriter.close();
	}
}