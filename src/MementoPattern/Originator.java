package MementoPattern;

public class Originator {
	private String article;
	
	public void set(String newArticle) { 
		System.out.println("From Originator: Current Version of Article\n"+newArticle+ "\n");
	    this.article = newArticle; 
	}
	
	// Creates a new Memento with a new article
	public Memento storeInMemento() { 
	    System.out.println("From Originator: Saving to Memento");
	    return new Memento(article); 
	}
	
	// Gets the article currently stored in memento
	public String restoreFromMemento(Memento memento) {
		article = memento.getArticle(); 
		System.out.println("From Originator: Previous Article Saved in Memento\n"+article + "\n");
		return article;
	   
	}
}
