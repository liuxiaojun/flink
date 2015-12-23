package org.apache.flink.examples.java.wordcount;

import org.apache.flink.api.common.ProgramDescription;

/**
 * Created by YMY on 15-12-16.
 */
public class WordCountMeta extends WordCount implements ProgramDescription {
	public static void main(String[] args) throws Exception {
		args = new String[]{"/root/t.txt","/root/t.out"};
		WordCount.main(args);
	}

	@Override
	public String getDescription() {
		return "Simple Word-Count Example\n"
				+ "Parameters: [<text path> <result path>]\n"
				+ "If no parameters are provided, the example will run with built-in default data.";
	}
}
