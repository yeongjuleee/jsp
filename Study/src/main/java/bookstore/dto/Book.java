package bookstore.dto;

public class Book {
	// 필드
	private String bookId;		// 도서 아이디
	private String name;		// 도서명
	private Integer unitPrice;	// 가격
	private String author;		// 저자
	private String description;	// 설명
	private String publisher;	// 출판사
	private String category;	// 분류
	private long unitsInStock;	//재고 수
	private long totallPages;	// 페이지 수
	private String releaseDate;	// 출판일(월/년)
	private String condition;	// 신규도서 or 중고도서 or E-book
	
	// 생성자
	public Book() {
		super();
	}

	public Book(String bookId, String name, Integer unitPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public String getBookId() {
		return bookId;
	}

	// getter setter
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public long getTotallPages() {
		return totallPages;
	}

	public void setTotallPages(long totallPages) {
		this.totallPages = totallPages;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	
}
