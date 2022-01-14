public class Pilot extends People {
    private RankType rankType;
    private String licenseNumber;

    public Pilot(String name, RankType rankType, String licenseNumber){
        super(name);
        this.rankType = rankType;
        this.licenseNumber = licenseNumber;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String flyPlane(){
        return "I'm flying the plane";
    }
}
