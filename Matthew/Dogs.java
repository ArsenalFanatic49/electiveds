package Matthew;

public class Dogs {

    private int dogNumber;
    private  String name;
    private int tag;


    public Dogs(Builder builder) {
        dogNumber=builder.carNumber;
        name=builder.name;
        tag=builder.manu;

    }

    public static class Builder{
        private int dogNumber;
        private  String name;
        private int tag;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder tag(int value){
            this.tag=value;
            return this;
        }


        public Builder dogNumber(int value){
            this.dogNumber=value;
            return this;
        }

        public Dogs build(){
            return new Dogs(this);
        }

    }

    public int getDogNumber() {
        return dogNumber;
    }

    public String getName() {
        return name;
    }

    public int getTag() {
        return tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dogs)) return false;

        Dogs student = (Dogs) o;

        return dogNumber == student.dogNumber;
    }

    @Override
    public int hashCode() {
        return dogNumber;
    }

}
