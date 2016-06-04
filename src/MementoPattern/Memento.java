package MementoPattern;

public class Memento {
	private String article;
	
	public Memento(String newArticle) {
		this.article = newArticle;
	}
	
	public String getArticle() {
		return article;
	}
}
