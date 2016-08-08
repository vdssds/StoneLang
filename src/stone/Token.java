package stone;

public abstract class Token {

	public static final Token EOF = new Token(-1){};//文件结束
	public static final String EOL = "\\n";//行结束
	private int lineNumber;
	
	protected Token(int line){
		this.lineNumber = line;
	}
	
	public int getLineNumber(){return lineNumber;}
	public boolean isIdentifier() {
		return false;
	}
	public boolean isNumber() {
		return false;
	}
	public boolean isString() {
		return false;
	}
	public int getNumber(){
		throw new StoneExpection("not number token");
	}
	public String getText(){
		return "";
	}
}
