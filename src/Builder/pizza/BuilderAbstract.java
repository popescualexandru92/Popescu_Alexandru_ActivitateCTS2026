package Builder.pizza;

public interface BuilderAbstract {
    Pizza build();
    BuilderAbstract setDiametru(int diametru);
    BuilderAbstract setHasCarne(boolean hasCarne);
     BuilderAbstract setHasCiuperci(boolean hasCiuperci);
     BuilderAbstract setPicanta(boolean picanta);
}
