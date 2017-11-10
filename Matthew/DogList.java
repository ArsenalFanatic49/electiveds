package Matthew;



public class DogList {

    private String Breed;
    private int vinnum;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getVinNum() {
        return vinnum;
    }

    public void setVinNum(int vinnum) {
        this.vinnum = vinnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogList doglist = (DogList) o;

        return vinnum == doglist.vinnum;
    }

    @Override
    public int hashCode() {
        return vinnum;
    }
}
