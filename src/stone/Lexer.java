package stone;

/**
 * 词法分析器
 * @author 郑宝林
 */
public class Lexer {

	public static String regexPat = "\\s*((//.*)|([0-9]+)|"
			+ "(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")|[A-Z_a-z][A-Z_a-z0-9]*"
			+ "|==|<=|>=|&&|\\|\\||\\p{Punct})?";
}
