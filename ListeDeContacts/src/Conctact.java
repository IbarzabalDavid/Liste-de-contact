/**
 * Created by ibada1731710 on 2018-01-22.
 */
public class Conctact {

    private String nom;
    private String nomFamille;
    private Adresse add;
    private Téléphone tel;
    private Occupation occ;



    public String getNom() {
        return nom;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public Adresse getAdd() {
        return add;
    }

    public Occupation getOcc() {
        return occ;
    }

    public Téléphone getTel() {
        return tel;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public void setAdd(Adresse add) {
        this.add = add;
    }

    public void setTel(Téléphone tel) {
        this.tel = tel;
    }

    public void setOcc(Occupation occ) {
        this.occ = occ;
    }
}
