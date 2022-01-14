public class CabinCrewMember extends People {
    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType){
        super(name);
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String relayMessages(){
        return "We're coming into land";
    }

}
