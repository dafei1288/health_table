package cn.dafei1288.domain;

public class Health {
    private Float weight;
    private Integer bloodPressureUp;
    private Integer bloodPressureDown;
    private String pic;

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getBloodPressureUp() {
        return bloodPressureUp;
    }

    public void setBloodPressureUp(Integer bloodPressureUp) {
        this.bloodPressureUp = bloodPressureUp;
    }

    public Integer getBloodPressureDown() {
        return bloodPressureDown;
    }

    public void setBloodPressureDown(Integer bloodPressureDown) {
        this.bloodPressureDown = bloodPressureDown;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Health(){}

    public Health(Float weight, Integer bloodPressureUp, Integer bloodPressureDown) {
        this.weight = weight;
        this.bloodPressureUp = bloodPressureUp;
        this.bloodPressureDown = bloodPressureDown;
    }



}
