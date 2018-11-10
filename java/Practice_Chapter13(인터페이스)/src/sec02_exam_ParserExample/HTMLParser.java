package sec02_exam_ParserExample;

public class HTMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		//구문 분석작업을 수행하는 코드를 적는다.
		System.out.println(fileName+"-HTML 구문 분석 완료");
	}
	
}
