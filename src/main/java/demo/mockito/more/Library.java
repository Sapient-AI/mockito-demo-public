package demo.mockito.more;

public class Library {
    public String getName() {
        return "Central Library";
    }

    public int getTotalBooks() {
        return 5000;
    }
}

class Section {
    public String getSectionName() {
        return "Science Fiction";
    }

    public int getSectionBooksCount() {
        return 300;
    }
}

class Staff {
    public String getStaffName() {
        return "John Doe";
    }

    public String getStaffPosition() {
        return "Librarian";
    }
}

