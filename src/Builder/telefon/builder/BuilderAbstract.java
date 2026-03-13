package Builder.telefon.builder;

import Builder.telefon.telefon.Telefon;

public interface BuilderAbstract {
    Telefon build();
    BuilderAbstract setHasCamera(boolean hasCamera);
    BuilderAbstract setAndroid(boolean android);
    BuilderAbstract setMemeory(int memeory);
}
