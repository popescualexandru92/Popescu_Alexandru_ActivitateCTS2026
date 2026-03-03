package prototype;

public interface Prototype extends Cloneable{
    Prototype copiaza() throws CloneNotSupportedException;
}
