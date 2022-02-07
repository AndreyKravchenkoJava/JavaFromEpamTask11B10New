package project;

public class RoadWay implements Comparable<RoadWay> {
    private String city1;
    private String city2;
    private int distance;

    public RoadWay(String city1, String city2, int distance) {
        this.city1 = city1;
        this.city2 = city2;
        this.distance = distance;
    }

    public String getCity1() {
        return city1;
    }

    public String getCity2() {
        return city2;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadWay roadWay = (RoadWay) o;
        if (getDistance() != roadWay.getDistance()) return false;
        if (getCity1() != null ? !getCity1().equals(roadWay.getCity1()) : roadWay.getCity1() != null) return false;
        return getCity2() != null ? getCity2().equals(roadWay.getCity2()) : roadWay.getCity2() == null;
    }

    @Override
    public int hashCode() {
        int result = getCity1() != null ? getCity1().hashCode() : 0;
        result = 31 * result + (getCity2() != null ? getCity2().hashCode() : 0);
        result = 31 * result + getDistance();
        return result;
    }

    @Override
    public String toString() {
        return "RoadWay: " + "city1= " + city1 + ", city2= " + city2 + ", distance= " + distance;
    }

    @Override
    public int compareTo(RoadWay r) {
        return this.getDistance() - r.getDistance();
    }
}
