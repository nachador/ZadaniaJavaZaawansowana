public class Point2D {
//Zaimplementuj klasę Point2D . Klasa powinna zawierać:
//dwa pola typu  oat: x , y
//konstruktor bezparametrowy ustawiający wartość pól x i y na 0
//konstruktor z dwoma parametrami: float x , float y
//metody typu getter odpowiedzialne za zwracanie wartości zmiennej: x , y
//metodę getXY zwracającą współrzędne x i y w postaci tablicy dwuelementowej
//metody typu setter odpowiedzialne za ustawianie wartości pól x , y metodę setXY ustawiającą współrzędne x i y
//metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y) ;

    public float x, y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = 0;

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {

        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }
    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}
