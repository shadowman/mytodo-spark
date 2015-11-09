package mytodo;

import spark.Spark;

public class TodoAppService {

	public static void main(String[] args) {
		Spark.staticFileLocation("/public");
		Spark.get("/hello", (req, resp) -> { return "Hello World of Spark"; });
	}

}
