package Builder.telefon.telefon;

import Builder.telefon.builder.BuilderAbstract;

public class Telefon {
    private boolean hasCamera;
    private boolean isAndroid;
    private int memeory;

    public Telefon(boolean hasCamera, boolean isAndroid, int memeory) {
        this.hasCamera = hasCamera;
        this.isAndroid = isAndroid;
        this.memeory = memeory;
    }

    public static class Builder implements BuilderAbstract {
        private boolean hasCamera;
        private boolean isAndroid;
        private int memeory;

        @Override
        public Telefon build() {
            return new Telefon(hasCamera,isAndroid,memeory);
        }

        public BuilderAbstract setHasCamera(boolean hasCamera) {
            this.hasCamera = hasCamera;
            return this;
        }

        public BuilderAbstract setAndroid(boolean android) {
            isAndroid = android;
            return this;
        }

        public BuilderAbstract setMemeory(int memeory) {
            this.memeory = memeory;
            return this;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefon{");
        sb.append("hasCamera=").append(hasCamera);
        sb.append(", isAndroid=").append(isAndroid);
        sb.append(", memeory=").append(memeory);
        sb.append('}');
        return sb.toString();
    }
}
