package Builder.spital.Program;


import Builder.spital.Builder.Internare;

//Atunci când un pacient este internat in cadrul aplicației se face
// salvarea acestuia. Fiecare pacient are posibilitatea sa plătească extra
// pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
// papuci de camera, halat pentru interior. In cazul in care pacientul
// nu alege aceste facilitați extra, in cadrul aplicației sunt setate cu
// false. Să se dezvolte modulul care asigură crearea de obiecte de tipul
// pacient cu opțiuni extra.
public class Program {
    static void main() {
        Internare i1=new Internare.Builder().setPatRabatabil(true).build();
        System.out.println(i1.toString());
    }
}
