package Grafipel;

public class Book implements Publication {
    // Attributes
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean isOpen;
    private Person reader;

    // Constructor
    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 0;
        this.isOpen = false;
        this.reader = reader;
    }

    // Getter and Setter methods
    public String getTitle() {return this.title;}
    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return this.author;}
    public void setAuthor(String author) {this.author = author;}

    public int getTotPages() {return this.totalPages;}
    public void setTotPages(int totPages) {this.totalPages = totPages;}

    public int getCurrentPage() {return this.currentPage;}
    public void setCurrentPage(int currentPage) {this.currentPage = currentPage;}

    public boolean getIsOpen() {return this.isOpen;}
    public void setIsOpen(boolean isOpen) {this.isOpen = isOpen;}

    // Methods
    public String details() {
        return "=== Book Info ===" + 
                "\nTitle = " + title + 
                "\nAuthor = " + author + 
                "\nTotal Pages = " + totalPages + 
                "\nCurrent Page = " + currentPage + 
                "\nOpen = " + isOpen + 
                "\n=== Reader Info ===" +
                "\nReader = " + reader.getName() +
                "\nAge = " + reader.getAge() +
                "\nSex = " + reader.getSex() +
                "\n=================";
    }

    // Override Methods from Implement Publication
    @Override
    public void close() {
        if(this.getIsOpen()) {
            this.setIsOpen(false);
            System.out.println("The book is now closed.");
        } else {
            System.out.println("The book is already open.");
        }
    }
    @Override
    public void flipToPage(int page) {
        if(page >= 0 | page <= this.totalPages) {
            this.currentPage = page;
        } else {
            this.currentPage = 0;
            System.out.println("Invalid page. Resetting to page 0.");
        }
    }
    @Override
    public void nextPage() {
        if (this.currentPage >= this.totalPages) {
            this.currentPage = this.totalPages;
        } else {
            this.currentPage++;
        }
    }
        @Override
        public void open() {
            if(!this.getIsOpen()) {
                this.setIsOpen(true);
                System.out.println("The book is now open.");
            } else {
                System.out.println("The book is already open.");
            }
        }
        @Override
        public void previousPage() {
            if (this.currentPage <= 0) {
                this.currentPage = 0;
            } else {
                this.currentPage--;
            }
        }
    }
