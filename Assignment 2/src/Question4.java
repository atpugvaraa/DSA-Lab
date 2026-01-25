public class Question4 {
    // Object as Argument and Return

    public static void main(String[] args) {
        Example orig = new Example();
        orig.setData(10);
        orig.displayData();

        Example newObj = orig.returnObjectByValue();
        System.out.print("Original: ");
        orig.displayData();
        System.out.print("New Object: ");
        newObj.displayData();


        orig.modifyObjectByReference(orig);
        orig.displayData();
    }
}

class Example {
    int data;

    // to set the value of data.
    public void setData(int data) {
        this.data = data;
    }

    // to display the value of data.
    public void displayData() {
        System.out.println("Data is currently: " + this.data);
    }

    // to return an object with modified data (using pass-by-value).
    Example returnObjectByValue() {
        Example temp = new Example();
        temp.data = 100;
        return temp;
    }

    // to modify an object using pass-by-reference.
    void modifyObjectByReference(Example obj) {
        obj.data = 500;
    }
}