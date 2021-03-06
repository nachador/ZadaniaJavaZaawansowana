public class Point3D extends Point2D {
//
//    pole prywatne typu  oat: z
//    konstruktor przyjmujący wartości dla pól: x , y , z
//    metodę typu getter odpowiedzialną za zwracanie wartości zmiennej z
//    metodę getXYZ zwracającą współrzędne x , y , z w postaci tablicy trzyelementowej
//    metodę typu setter odpowiedzialną za ustawianie zmiennej z

    private float z;

    public Point3D(float x, float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{x,y,z};
    }
    public void setXYZ(float x, float y, float z){
        super.x = x;
        super.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);
    }
}
