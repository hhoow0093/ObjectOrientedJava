class Shape {
    int getCorner() {
        return 0;
    }

}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }
    
    // mengambil method dari parent ketika method kena over ridding
    int getParentCorner() {
        return super.getCorner();
    }
}
