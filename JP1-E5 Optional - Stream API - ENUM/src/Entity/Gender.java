package Entity;

public enum Gender {
    Male("Male"), Female("Female"), Other("Other");
    private String genderLabel;
    Gender(String genderLabel) {
        this.genderLabel = genderLabel;
    }
    public String getGenderLabel() {
        return this.genderLabel;
    }
    public void setGenderLabel(String genderLabel) {
        this.genderLabel = genderLabel;
    }
}

