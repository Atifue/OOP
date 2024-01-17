class Book{
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    public Book(){}
    
    public Book(String title, String author, int totalPages){
        setTitle(title);
        setAuthor(author);
        setTotalPages(totalPages);
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getTotalPages(){
        return totalPages;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setTotalPages(int totalPages){
        if(totalPages < 1){
            throw new IllegalArgumentException("Pages can't be negative");
        }
        this.totalPages = totalPages;
    }
    public void nextPage(){
        currentPage = currentPage + 1;
    }
    public void previousPage(){
        currentPage = currentPage - 1;
    }
    public void goToPage(int pageNum){
        currentPage = pageNum;
    }
}