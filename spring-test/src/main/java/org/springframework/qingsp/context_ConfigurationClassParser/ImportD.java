package org.springframework.qingsp.context_ConfigurationClassParser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author qingshanpeng
 * @date 2022/2/19 15:14
 * @since 标果工厂
 */
@Configuration
public class ImportD {

//	@Autowired
	private ImportB importB;

	public ImportB getImportB() {
		return importB;
	}

	public void setImportB(ImportB importB) {
		this.importB = importB;
	}
}
